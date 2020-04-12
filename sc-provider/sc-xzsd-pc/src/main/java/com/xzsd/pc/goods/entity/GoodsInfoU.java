package com.xzsd.pc.goods.entity;

import java.util.Date;

public class GoodsInfoU {
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 一级分类编码
     */
    private String firstSortId;
    /**
     * 二级分类编号
     */
    private String SecondSortId;
    /**
     * 定价
     */
    private double setPrice;
    /**
     * 售价
     */
    private double salesPrice;
    /**
     * 书号
     */
    private String isbn;
    /**
     * 库存
     */
    private int stock;
    /**
     * 广告词
     */
    private String advert;
    /**
     * 商品介绍
     */
    private String introduce;
    /**
     * 商家编码
     */
    private String businessId;
    /**
     * 出版社
     */
    private String press;
    /**
     * 作家
     */
    private String author;
    /**
     * 是否删除 0没有删除1已删除
     */
    private int isDelete;
    /**
     * 创建人
     */
    private String creatBy;
    /**
     * 创建时间
     */
    private Date creatTime;
    /**
     * 修改人
     */
    private String lastModifyBy;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 版本号
     */
    private int version;

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

    public String getFirstSortId() {
        return firstSortId;
    }

    public void setFirstSortId(String firstSortId) {
        this.firstSortId = firstSortId;
    }

    public String getSecondSortId() {
        return SecondSortId;
    }

    public void setSecondSortId(String secondSortId) {
        SecondSortId = secondSortId;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getAdvert() {
        return advert;
    }

    public void setAdvert(String advert) {
        this.advert = advert;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(String creatBy) {
        this.creatBy = creatBy;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getPress() { return press; }

    public void setPress(String press) { this.press = press; }

    public String getIntroduce() { return introduce; }

    public void setIntroduce(String goods_introduce) { this.introduce = introduce; }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
