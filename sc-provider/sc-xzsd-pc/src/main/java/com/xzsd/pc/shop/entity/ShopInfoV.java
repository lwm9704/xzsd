package com.xzsd.pc.shop.entity;

public class ShopInfoV {
    /**
     * 门店编号
     */
    private String shopId;
    /**
     * 门店名称
     */
    private String shopName;
    /**
     * 电话
     */
    private String phone;
    /**
     * 地址
     */
    private String address;
    /**
     * 店长
     */
    private String shoppowerId;
    /**
     * 店长名称
     */
    private String shoppowerName;
    /**
     * 邀请码
     */
    private String invitationCode;
    /**
     * 账号
     */
    private String userAcct;

    private String provinceValue;

    private String cityValue;

    private String countyValue;

    private String license;

    private Long call;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShoppowerId() {
        return shoppowerId;
    }

    public void setShoppowerId(String shoppowerId) {
        this.shoppowerId = shoppowerId;
    }

    public String getShoppowerName() {
        return shoppowerName;
    }

    public void setShoppowerName(String shoppowerName) {
        this.shoppowerName = shoppowerName;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public String getUserAcct() {
        return userAcct;
    }

    public void setUserAcct(String userAcct) {
        this.userAcct = userAcct;
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

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Long getCall() {
        return call;
    }

    public void setCall(Long call) {
        this.call = call;
    }
}
