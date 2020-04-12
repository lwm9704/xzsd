package com.xzsd.pc.driver.entity;

public class DriverInfoF {
    /**
     * 司机姓名
     */
    private String driverName;
    /**
     * 司机编号
     */
    private String driverId;
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

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
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
