package com.xzsd.app.customer.sort.entity;

import com.neusoft.security.client.template.customizer.ScRibbonUserInfoRestTemplateCustomizer;

/**
 * @author weiming
 * @date 2020-4-15
 */
public class SortGoodsInfoV {
    /**
     * 一级分类编号
     */
    private String firstSortId;
    /**
     * 二级分类编号
     */
    private String secondSortId;
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品定价
     */
    private double setPrice;
    /**
     * 商品售价
     */
    private double salesPrice;
    /**
     * 商品图片
     */
    private String pUrl;

    public String getFirstSortId() {
        return firstSortId;
    }

    public void setFirstSortId(String firstSortId) {
        this.firstSortId = firstSortId;
    }

    public String getSecondSortId() {
        return secondSortId;
    }

    public void setSecondSortId(String secondSortId) {
        this.secondSortId = secondSortId;
    }

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

    public double getSetPrice() {
        return setPrice;
    }

    public void setSetPrice(double setPrice) {
        this.setPrice = setPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }
}
