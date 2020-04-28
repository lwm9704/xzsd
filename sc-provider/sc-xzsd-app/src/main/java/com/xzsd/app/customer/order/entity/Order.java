package com.xzsd.app.customer.order.entity;

import java.util.List;

public class Order {
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 订单总价
     */
    private double totalPrice;
    /**
     * 订单状态
     */
    private int orderState;
    /**
     * 商品个数
     */
    private int goodsNum;
    /**
     * 商品集合
     */
    List<Goods> goodsList;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(int goodsNum) {
        this.goodsNum = goodsNum;
    }

    public List<Goods> getGoodsList() {
        return goodsList;
    }

    public void setGoodsList(List<Goods> goodsList) {
        this.goodsList = goodsList;
    }
}
