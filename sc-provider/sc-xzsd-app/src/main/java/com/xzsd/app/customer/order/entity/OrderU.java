package com.xzsd.app.customer.order.entity;

public class OrderU {
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 商品数量
     */
    private int goodsNum;
    /**
     * 商品总价
     */
    private double totalPrice;
    /**
     * 创建人/修改人
     */
    private String userId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
