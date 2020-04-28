package com.xzsd.app.customer.sort.dao;

import com.xzsd.app.customer.sort.entity.SortGoodsInfoV;
import com.xzsd.app.customer.sort.entity.SortInfoV;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author weiming
 * @date 2020-4-15
 */
@Mapper
public interface SortDao {
    /**
     * 获取一级分类信息
     */
    SortInfoV getFirstSortInfo();
    /**
     * 获取二级分类信息
     * @param firstSortId
     * @return
     */
    SortInfoV getSecondSortInfo(String firstSortId);
    /**
     * 查询商品
     * @param firstSortId
     * @param secondSortId
     * @return
     */
    List<SortGoodsInfoV> getSortGoodsList(String firstSortId,String secondSortId);
}
