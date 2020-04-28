package com.xzsd.pc.shop.entity;

public class ShopInfoU {
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
     * 店长ID(用户编号)
     */
    private String shoppowerId;
    /**
     * 执照编码
     */
    private String license;
    /**
     * 所在省份字段值
     */
    private String provinceValue;
    /**
     * 所在市字段值
     */
    private String cityValue;
    /**
     * 所在区字段值
     */
    private String countyValue;
    /**
     * 详细地址
     */
    private String address;
    /**
     *创建人/更新人
     */
    private String byUserId;

    /**
     * 版本
     */
    private int version;

    private String invitationCode;

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

    public String getShoppowerId() {
        return shoppowerId;
    }

    public void setShoppowerId(String shoppowerId) {
        this.shoppowerId = shoppowerId;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getByUserId() {
        return byUserId;
    }

    public void setByUserId(String byUserId) {
        this.byUserId = byUserId;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public Long getCall() {
        return call;
    }

    public void setCall(Long call) {
        this.call = call;
    }
}
