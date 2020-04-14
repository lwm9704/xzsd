package com.xzsd.app.customer.hotGoods.entity;

public class HotGoodsInfoV {
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品价格（售价）
     */
    private double salesPrice;
    /**
     * 商品图片
     */
    private String p_Url;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getP_Url() {
        return p_Url;
    }

    public void setP_Url(String p_Url) {
        this.p_Url = p_Url;
    }
}
