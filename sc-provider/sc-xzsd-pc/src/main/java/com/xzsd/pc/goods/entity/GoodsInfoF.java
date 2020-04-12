package com.xzsd.pc.goods.entity;

public class GoodsInfoF {
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品状态
     */
    private int goodsState;
    /**
     * 广告词
     */
    private String advert;
    /**
     * 出版社
     */
    private String press;
    /**
     *作者
     */
    private String author;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(int goodsState) {
        this.goodsState = goodsState;
    }

    public String getAdvert() {
        return advert;
    }

    public void setAdvert(String advert) {
        this.advert = advert;
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
}
