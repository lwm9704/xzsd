package com.xzsd.app.customer.car.entity;

public class CarInfoV {
    /**
     * 购物车编号
     */
    private String carId;
    /**
     * 数量
     */
    private int num;
    /**
     * 总价
     */
    private double totalPirce;
    /**
     * 商品信息
     */
    private Goods goodsInfo;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getTotalPirce() {
        return totalPirce;
    }

    public void setTotalPirce(double totalPirce) {
        this.totalPirce = totalPirce;
    }

    public Goods getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(Goods goodsInfo) {
        this.goodsInfo = goodsInfo;
    }
}
