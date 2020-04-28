package com.xzsd.pc.order.entity;

import java.util.Date;

public class OrderInfoState {
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 订单状态
     */
    private int OrderState;
    /**
     * 更新人
     */
    private String lastModifyBy;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getOrderState() {
        return OrderState;
    }

    public void setOrderState(int orderState) {
        OrderState = orderState;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }
}