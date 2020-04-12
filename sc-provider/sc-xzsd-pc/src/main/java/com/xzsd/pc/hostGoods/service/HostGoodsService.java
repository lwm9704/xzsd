package com.xzsd.pc.hostGoods.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.util.StringUtil;
import com.xzsd.pc.hostGoods.dao.HostGoodsDao;
import com.xzsd.pc.hostGoods.entity.HostGoodsInfoF;
import com.xzsd.pc.hostGoods.entity.HostGoodsInfoU;
import com.xzsd.pc.hostGoods.entity.HostGoodsInfoV;
import com.xzsd.pc.util.AppResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 * 实现类
 * @author weiming
 * @date 2020-4-6
 */
@Service
public class HostGoodsService {

    @Resource
    private HostGoodsDao hostGoodsDao;

    /**
     * 新增热门位商品
     * @param hostGoodsInfoU
     * @return
     * @author weiming
     * @date 2020-4-6
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addHostGoods(HostGoodsInfoU hostGoodsInfoU){
        //校验该商品是否已经在热门位
        int countHost = hostGoodsDao.countHostGoods(hostGoodsInfoU.getGoodsId());
        if(countHost != 0){
            return AppResponse.bizError("该商品已经存在,请重新输入");
        }
        hostGoodsInfoU.setCreatBy(StringUtil.getCommonCode(2));
        //新增商品到热门位
        int count = hostGoodsDao.addHostGoods(hostGoodsInfoU);
        if(count == 0){
            return AppResponse.bizError("新增失败，请重试");
        }
        return AppResponse.success("新增成功");
    }
    /**
     * 查询热门位列表
     * @param hostGoodsInfoF
     * @return
     * @author weiming
     * @date 2020-4-6
     */
    public AppResponse listHostGoods(HostGoodsInfoF hostGoodsInfoF){
        List<HostGoodsInfoV> hostGoodsInfoVList = hostGoodsDao.listHostGoodsByPage(hostGoodsInfoF);
        return AppResponse.success("查询成功",getPageInfo(hostGoodsInfoVList));
    }
    /**
     * 删除热门位商品
     * @param hostId
     * @return
     * @author weiming
     * @date 2020-4-6
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteHostGoods(String hostId,String userId){
        List<String> listHostId = Arrays.asList(hostId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功");
        //删除热门位商品
        int count = hostGoodsDao.deleteHost(hostId,userId);
        if(count == 0){
            appResponse = AppResponse.bizError("删除失败，请重试");
        }
        return appResponse;
    }
    /**
     * 修改热门位商品
     * @param hostGoodsInfoU
     * @return
     * @author weiming
     * @date 2020-4-6
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateHostGoods(HostGoodsInfoU hostGoodsInfoU){
        AppResponse appResponse = AppResponse.success("修改成功");
        //校验该商品是否在热门位
        int countHost = hostGoodsDao.countHostGoods(hostGoodsInfoU.getGoodsId());
        if(countHost != 0) {
            appResponse = AppResponse.bizError("该商品已经存在热门位，请重新输入");
            return appResponse;
        }
        //修改热门位商品信息
        int count = hostGoodsDao.updateHostGoods(hostGoodsInfoU);
        if(count == 0){
            appResponse = AppResponse.versionError("数据有变化，请刷新");
            return appResponse;
        }
        return appResponse;
    }
    /**
     * 设置展示数量
     * @param
     */
}
