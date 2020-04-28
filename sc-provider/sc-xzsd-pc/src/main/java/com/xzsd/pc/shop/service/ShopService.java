package com.xzsd.pc.shop.service;

import com.xzsd.pc.shop.dao.ShopDao;
import com.xzsd.pc.shop.entity.AcctRole;
import com.xzsd.pc.shop.entity.ShopInfoF;
import com.xzsd.pc.shop.entity.ShopInfoU;
import com.xzsd.pc.shop.entity.ShopInfoV;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * 实现类
 * @author weiming
 * @date 2020-4-7
 */
@Service
public class ShopService {

    @Resource
    private ShopDao shopDao;

    /**
     * 新增门店
     * @param shopInfoU
     * @return
     * @author weiming
     * @date 2020-4-7
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addShopInfo(ShopInfoU shopInfoU){
        //校验该门店是否已经存在
        int countShop = shopDao.countShop(shopInfoU);
        if(countShop != 0){
            return AppResponse.bizError("该门店信息已存在，请重新输入");
        }
        String phone = String.valueOf(shopInfoU.getCall());
        shopInfoU.setPhone(phone);
        AcctRole role = shopDao.countRole(shopInfoU);
        if(role.getRole() != 1){
            return AppResponse.bizError("输入该编号不是店长角色，请重新输入");
        }
        //获取商店id
        shopInfoU.setShopId(StringUtil.getCommonCode(3));
        //新增门店
        int count = shopDao.addShop(shopInfoU);
        if(count == 0){
            return AppResponse.bizError("新增失败，请重试");
        }
        return AppResponse.success("新增成功");
    }
    /**
     * 删除门店信息
     * @param shopId
     * @param userId
     * @return
     * @author weiming
     * @date 2020-4-7
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteShop(String shopId,String userId){
        List<String> lsitId = Arrays.asList(shopId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功");
        //删除门店信息
        int count = shopDao.deleteShopId(lsitId,userId);
        if(count == 0){
            appResponse = AppResponse.bizError("删除失败，请重试");
        }
        return appResponse;
    }
    /**
     * 修改门店信息
     * @param shopInfoU
     * @return
     * @author weiming
     * @date 2020-4-7
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateShop(ShopInfoU shopInfoU){
        AppResponse appResponse = AppResponse.success("修改成功");
        String phone = String.valueOf(shopInfoU.getCall());
        shopInfoU.setPhone(phone);
        int count = shopDao.updateShopInfo(shopInfoU);
        if(count == 0){
            appResponse = AppResponse.versionError("数据有变化，请刷新");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * 查询门店详情
     * @param shopId
     * @return
     * @author weiming
     * @date 2020-4-7
     */
    public AppResponse getShopInfoById(String shopId){
        ShopInfoV shopInfoV = shopDao.getShopInfo(shopId);
        String str = shopInfoV.getPhone();
        Long call = Long.parseLong(str);
        shopInfoV.setCall(call);
        return AppResponse.success("查询成功",shopInfoV);
    }
    /**
     * demo 查询用户列表（分页）
     * @param shopInfoF
     * @return
     * @Author weiming
     * @Date 2020-4-7
     */
    public AppResponse listShop(ShopInfoF shopInfoF) {
        List<ShopInfoV> shopInfoVList = shopDao.listShopInfoByPage(shopInfoF);
        return AppResponse.success("查询成功！",getPageInfo(shopInfoVList));
    }
}
