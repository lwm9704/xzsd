package com.xzsd.pc.order.entity;

import java.util.Date;

public class OrderInfoV {
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 订单状态
     */
    private int state;
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

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

}