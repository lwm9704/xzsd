package com.xzsd.app.customer.car.entity;

public class Order {
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 商品个数
     */
    private int num;
    /**
     * 商品总价
     */
    private double totalPrice;
    /**
     *创建人/修改人
     */
    private String userId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
