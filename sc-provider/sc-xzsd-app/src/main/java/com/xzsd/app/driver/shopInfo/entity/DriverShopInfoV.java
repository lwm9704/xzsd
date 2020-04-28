package com.xzsd.app.driver.shopInfo.entity;

/**
 * @author weiming
 * @date 2020-4-26
 */
public class DriverShopInfoV {
    /**
     * 门店编号
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 门店地址
     */
    private String address;
    /**
     * 店长名称
     */
    private String shoppowerName;
    /**
     * 手机
     */
    private String phone;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShoppowerName() {
        return shoppowerName;
    }

    public void setShoppowerName(String shoppowerName) {
        this.shoppowerName = shoppowerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

