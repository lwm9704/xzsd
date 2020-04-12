package com.xzsd.pc.driver.entity;

public class DriverInfoU {
    /**
     * 标记id
     */
    private String id;
    /**
     * 司机编码
     */
    private String driverId;
    /**
     * 司机姓名
     */
    private String driverName;
    /**
     * 电话
     */
    private String phone;
    /**
     * 司机账号
     */
    private String driverAcct;
    /**
     * 密码
     */
    private String password;
    /**
     * 身份证
     */
    private String idCard;
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
    /**
     * 绑定门店编号
     */
    private String bShopId;
    /**
     * 创建人
     */
    private String creatBy;
    /**
     * 更新人
     */
    private String lastModifyBy;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getbShopId() {
        return bShopId;
    }

    public void setbShopId(String bShopId) {
        this.bShopId = bShopId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDriverAcct() {
        return driverAcct;
    }

    public void setDriverAcct(String driverAcct) {
        this.driverAcct = driverAcct;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
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

    public String getCreatBy() {
        return creatBy;
    }

    public void setCreatBy(String creatBy) {
        this.creatBy = creatBy;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }
}
