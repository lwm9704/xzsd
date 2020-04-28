package com.xzsd.app.customer.hotGoods.dao;

import com.xzsd.app.customer.hotGoods.entity.HotGoodsInfoV;
import com.xzsd.app.customer.hotGoods.entity.ShowNum;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author weiming
 * @date 2020-4-14
 */
@Mapper
public interface HotGoodsDao {
    /**
     * 获取热门商品信息列表
     */
    List<HotGoodsInfoV> getHotGoodsByPage(int num);
    /**
     * 获取展示数量
     */
    ShowNum getShowNum();
}
