package com.xzsd.app.customer.evaluate.dao;

import com.xzsd.app.customer.evaluate.entity.EvaluateInfoAU;
import com.xzsd.app.customer.evaluate.entity.EvaluateInfoV;
import com.xzsd.app.customer.evaluate.entity.EvaluateList;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author weiming
 * @date 2020-4-26
 */
@Mapper
public interface EvaluateDao {
    /**
     * 查询商品评价列表
     */
    EvaluateList listEvaluate(String goodsId);
    /**
     * 新增评价
     */
    int creatEvaluate(EvaluateInfoAU evaluateInfoAU);
}
