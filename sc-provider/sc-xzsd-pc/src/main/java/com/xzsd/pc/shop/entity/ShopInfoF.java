package com.xzsd.pc.shop.entity;

public class ShopInfoF {
    /**
     * 门店编号
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 店长编号
     */
    private String shoppowerId;
    /**
     * 省份字段值
     */
    private String provinceValue;
    /**
     * 市字段值
     */
    private String cityValue;
    /**
     * 区字段值
     */
    private String countyValue;

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShoppowerId() {
        return shoppowerId;
    }

    public void setShoppowerId(String shoppowerId) {
        this.shoppowerId = shoppowerId;
    }

    public String getProvinceValue() {
        return provinceValue;
    }

    public void setProvinceValue(String provinceValue) {
        this.provinceValue = provinceValue;
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }

    public String getCountyValue() {
        return countyValue;
    }

    public void setCountyValue(String countyValue) {
        this.countyValue = countyValue;
    }
}
