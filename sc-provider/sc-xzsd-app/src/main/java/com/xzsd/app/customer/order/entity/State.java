package com.xzsd.app.customer.order.entity;

public class State {
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 订单状态
     */
    private int state;
    /**
     *修改人
     */
    private String userId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
