package com.xzsd.app.customer.rota.entity;

public class RotaInfoV {
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 商品轮播图图片url
     */
    private String rotaUrl;
    /**
     * 轮播图排序
     */
    private int rotaSort;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getRotaUrl() {
        return rotaUrl;
    }

    public void setRotaUrl(String rotaUrl) {
        this.rotaUrl = rotaUrl;
    }

    public int getRotaSort() {
        return rotaSort;
    }

    public void setRotaSort(int rotaSort) {
        this.rotaSort = rotaSort;
    }
}
