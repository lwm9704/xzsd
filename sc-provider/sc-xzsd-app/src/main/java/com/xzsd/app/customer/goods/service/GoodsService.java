package com.xzsd.app.customer.goods.service;

import com.xzsd.app.customer.goods.dao.GoodsDao;
import com.xzsd.app.customer.goods.entity.GoodsInfoV;
import com.xzsd.app.util.AppResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author weiming
 * @date 2020-4-14
 */
@Service
public class GoodsService {
    @Resource
    private GoodsDao goodsDao;

    /**
     * 获取商品详情
     * @param goodsId
     * @return AppResponse
     */
    public AppResponse getGoodsInfo(String goodsId){
        GoodsInfoV goodsInfoV = goodsDao.getGoodsInfo(goodsId);
        return AppResponse.success("查询成功",goodsInfoV);
    }
}
