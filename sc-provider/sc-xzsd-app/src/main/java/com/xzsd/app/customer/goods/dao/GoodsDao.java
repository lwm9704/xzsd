package com.xzsd.app.customer.goods.dao;

import com.xzsd.app.customer.goods.entity.GoodsInfoV;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author weiming
 * @date 2020-4-14
 */
@Mapper
public interface GoodsDao {
    /**
     * 获取商品详情
     * @param goodsId
     * @return goodsInfoV
     */
    GoodsInfoV getGoodsInfo(String goodsId);
}
