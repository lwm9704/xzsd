package com.xzsd.app.customer.order.entity;

public class OrderDetails {
    /**
     * 商品信息
     */
    private Goods goods;
    /**
     * 收货地址
     */
    private Address address;
    /**
     * 订单编号
     */
    private String orderId;
    /**
     * 订单状态
     */
    private int orderState;

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }
}
