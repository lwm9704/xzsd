package com.xzsd.app.customer.evaluate.entity;

import java.util.List;

/**
 * @author weiming
 * @date
 */
public class EvaluateList {
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 评价列表
     */
    List<EvaluateInfoV> EvaluateList;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public List<EvaluateInfoV> getEvaluateList() {
        return EvaluateList;
    }

    public void setEvaluateList(List<EvaluateInfoV> evaluateList) {
        EvaluateList = evaluateList;
    }
}
