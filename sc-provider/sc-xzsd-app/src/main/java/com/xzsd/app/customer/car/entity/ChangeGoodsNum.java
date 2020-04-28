package com.xzsd.app.customer.car.entity;

public class ChangeGoodsNum {
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 商品数量
     */
    private int num;

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
}
