package com.xzsd.pc.goods.entity;

import java.util.Date;

public class GoodsInfoV {
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 定价
     */
    private double setPrice;
    /**
     * 售价
     */
    private double salesPrice;
    /**
     * 销售量
     */
    private int salesVolume;
    /**
     * 一级分类编号
     */
    private String firstSortId;
    /**
     * 一级分类名称
     */
    private String firstSortName;
    /**
     * 二级分类编号
     */
    private String secondSortId;
    /**
     * 二级分类名称
     */
    private String secondSortName;
    /**
     * 广告词
     */
    private String advert;
    /**
     * 商品介绍
     */
    private String introduce;
    /**
     * 商品状态 1上架0下架
     */
    private int state;
    /**
     * 上架时间
     */
    private Date shelfTime;
    /**
     * 浏览量
     */
    private int browse;
    /**
     * 商家名称
     */
    private String businessName;
    /**
     * 库存
     */
    private int stock;
    /**
     * 书号
     */
    private String isbn;

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

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getFirstSortId() {
        return firstSortId;
    }

    public void setFirstSortId(String firstSortId) {
        this.firstSortId = firstSortId;
    }

    public String getFirstSortName() {
        return firstSortName;
    }

    public void setFirstSortName(String firstSortName) {
        this.firstSortName = firstSortName;
    }

    public String getSecondSortId() {
        return secondSortId;
    }

    public void setSecondSortId(String secondSortId) {
        this.secondSortId = secondSortId;
    }

    public String getSecondSortName() {
        return secondSortName;
    }

    public void setSecondSortName(String secondSortName) {
        this.secondSortName = secondSortName;
    }

    public String getAdvert() {
        return advert;
    }

    public void setAdvert(String advert) {
        this.advert = advert;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Date shelfTime) {
        this.shelfTime = shelfTime;
    }

    public int getBrowse() {
        return browse;
    }

    public void setBrowse(int browse) {
        this.browse = browse;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
