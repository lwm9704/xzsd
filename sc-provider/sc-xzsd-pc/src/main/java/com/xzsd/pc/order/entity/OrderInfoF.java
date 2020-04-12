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
    private String userId;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 订单状态
     */
    private int state;
    /**
     * 最早付款时间
     */
    private Date minTime;
    /**
     * 昨晚付款时间
     */
    private Date maxTime;

    /**
     *页数
     */
    private int pageSize;

    /**
     *页码
     */
    private int pageNum;

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getMinTime() {
        return minTime;
    }

    public void setMinTime(Date minTime) {
        this.minTime = minTime;
    }

    public Date getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(Date maxTime) {
        this.maxTime = maxTime;
    }
}
