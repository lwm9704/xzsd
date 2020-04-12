package com.xzsd.pc.goods.entity;

import java.util.Date;

public class GoodsInfoV {
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
    private int saleVolume;
    /**
     * 一级分类名称
     */
    private String firstSort;
    /**
     * 二级分类名称
     */
    private String secondSort;
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
    private int goodsState;
    /**
     * 上架时间
     */
    private Date shelfTime;
    /**
     * 浏览量
     */
    private int browse;
    /**
     * 商家编码
     */
    private String businessId;
    /**
     * 商家名称
     */
    private  String businessName;
    /**
     * 库存
     */
    private int stock;
    /**
     * 书号
     */
    private String isbn;

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

    public int getSaleVolume() {
        return saleVolume;
    }

    public void setSaleVolume(int saleVolume) {
        this.saleVolume = saleVolume;
    }

    public String getFirstSort() {
        return firstSort;
    }

    public void setFirstSort(String firstSort) {
        this.firstSort = firstSort;
    }

    public String getSecondSort() {
        return secondSort;
    }

    public void setSecondSort(String secondSort) {
        this.secondSort = secondSort;
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

    public int getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(int goodsState) {
        this.goodsState = goodsState;
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

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
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
