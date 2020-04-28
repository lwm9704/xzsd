package com.xzsd.app.customer.car.entity;

public class CarInfoA {
    /**
     * 购物编号
     */
    private String carId;
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 商品数量
     */
    private int num;
    /**
     * 单价
     */
    private double price;
    /**
     * 总价
     */
    private double totalPrice;

    private String userId;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
