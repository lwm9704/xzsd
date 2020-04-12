package com.xzsd.pc.driver.entity;

public class DriverInfoV {
    /**
     * 司机编号
     */
    private String driverId;
    /**
     * 姓名
     */
    private String driverName;
    /**
     * 手机
     */
    private String phone;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 账号
     */
    private String driverAcct;

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getDriverAcct() {
        return driverAcct;
    }

    public void setDriverAcct(String driverAcct) {
        this.driverAcct = driverAcct;
    }
}
