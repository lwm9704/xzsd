package com.xzsd.app.customer.evaluate.entity;

/**
 * @weiming
 * @date 2020-4-26
 */
public class EvaluateInfoAU {
    /**
     * 评价编号
     */
    private String evaluateId;
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 评价内容
     */
    private String evaluate;
    /**
     * 评价等价
     */
    private int grade;
    /**
     * 创建人/修改人
     */
    private String userId;

    public String getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(String evaluateId) {
        this.evaluateId = evaluateId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
