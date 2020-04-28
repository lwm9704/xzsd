package com.xzsd.pc.order.entity;

import java.util.Date;

public class OrderInfoF {
    /**
     * 订单编码
     */
    private String orderId;
    /**
     * 下单人
     */
    private String orderName;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 订单状态
     */
    private int orderState;
    /**
     * 最早付款时间
     */
    private String minTime;
    /**
     * 昨晚付款时间
     */
    private String  maxTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public String getMinTime() {
        return minTime;
    }

    public void setMinTime(String minTime) {
        this.minTime = minTime;
    }

    public String getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(String maxTime) {
        this.maxTime = maxTime;
    }
}
