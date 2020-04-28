package com.xzsd.pc.order.entity;

import java.util.Date;

public class OrderDetails {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 订单编码
     */
    private String orderId;
    /**
     * 商品编码
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 购买数量
     */
    private int goodsNum;
    /**
     * 总金额
     */
    private double totalPrice;
    /**
     * 售价
     */
    private double salesPrice;
    /**
     * 定价
     */
    private double setPrice;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
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

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getSetPrice() {
        return setPrice;
    }

    public void setSetPrice(double setPrice) {
        this.setPrice = setPrice;
    }
}
