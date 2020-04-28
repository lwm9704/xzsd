package com.xzsd.app.customer.car.entity;

public class CarInfoU {
    /**
     * 创建人/更新人
     */
    private String userId;
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 单个商品数量
     */
    private int num;
    /**
     * 单个商品总价
     */
    private double totalPrice;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
