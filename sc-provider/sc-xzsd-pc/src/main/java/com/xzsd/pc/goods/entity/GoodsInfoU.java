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
    private String secondSortId;
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
    private String pKey;
    /**
     * 商品图片
     */
    private String pUrl;
    /**
     * 商家名称
     */
    private String businessName;
    /**
     * 商品销量
     */
    private int salesVolume;
    /**
     * 出版社
     */
    private String press;
    /**
     * 作家
     */
    private String author;
    /**
     * 浏览量
     */
    private int browse;
    /**
     * 状态
     */
    private int state;
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
        return secondSortId;
    }

    public void setSecondSortId(String secondSortId) {
        this.secondSortId = secondSortId;
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

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getpKey() {
        return pKey;
    }

    public void setpKey(String pKey) {
        this.pKey = pKey;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getSalesVolume() {
        return salesVolume;
    }

    public void setSalesVolume(int salesVolume) {
        this.salesVolume = salesVolume;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBrowse() {
        return browse;
    }

    public void setBrowse(int browse) {
        this.browse = browse;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
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
}
