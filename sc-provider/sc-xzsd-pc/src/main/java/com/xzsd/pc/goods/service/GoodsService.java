package com.xzsd.pc.goods.service;

import com.xzsd.pc.goods.dao.GoodsDao;
import com.xzsd.pc.goods.entity.GoodsInfoF;
import com.xzsd.pc.goods.entity.GoodsInfoU;
import com.xzsd.pc.goods.entity.GoodsInfoV;
import com.xzsd.pc.util.AppResponse;
import com.xzsd.pc.util.StringUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

import static com.neusoft.core.page.PageUtils.getPageInfo;

/**
 *  实现类
 * @author weiming
 * @date 2020-3-27
 */
@Service
public class GoodsService {
    @Resource
    private GoodsDao goodsDao;

    /**
     * 新增商品
     * @param goodsInfoU
     * @return
     * @author weiming
     * @date 2020-3-27
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse addGoods(GoodsInfoU goodsInfoU){
        String goodsId = StringUtil.getCommonCode(3);
        goodsInfoU.setGoodsId(goodsId);
        goodsInfoU.setIsDelete(0);
        //新增商品
        int count = goodsDao.addGoods(goodsInfoU);
        if(count == 0){
            return AppResponse.bizError("新增失败，请重试！");
        }
        return AppResponse.success("新增成功！",goodsId);
    }
    /**
     * 删除商品
     * @param goodsId
     * @param gUserId
     * @return
     * @author weiming
     * @date 2020-3-27
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse deleteGoods(String goodsId,String gUserId){
        List<String> listId = Arrays.asList(goodsId.split(","));
        AppResponse appResponse = AppResponse.success("删除成功");
        //删除用户
        int count = goodsDao.deleteGoods(listId,gUserId);
        if(count == 0){
            appResponse = AppResponse.bizError("删除失败，请重新输入");
        }
        return appResponse;
    }
    /**
     * 修改商品
     * @param goodsInfoU
     * @return
     * @author weiming
     * @date 2020-3-27
     */
    @Transactional(rollbackFor = Exception.class)
    public AppResponse updateGoods(GoodsInfoU goodsInfoU){
        AppResponse appResponse = AppResponse.success("修改成功");
        //校验商品是否存在
        int countGoods = goodsDao.countGoods(goodsInfoU);
        if(countGoods == 0){
            return AppResponse.bizError("商品不存在，请重新输入！");
        }
        //修改商品信息
        int count = goodsDao.updateGoods(goodsInfoU);
        if(count == 0){
            appResponse = AppResponse.versionError("数据有变，请刷新！");
            return appResponse;
        }
        return appResponse;
    }
    /**
     *查询商品信息列表
     * @param goodsInfoF
     * @return
     * @author weiming
     * @date 2020-3-27
     */
    public AppResponse listGoods(GoodsInfoF goodsInfoF){
        List<GoodsInfoV> goodsInfoVList = goodsDao.listGoodsByPage(goodsInfoF);
        return AppResponse.success("查询成功",getPageInfo(goodsInfoVList));
    }
}
