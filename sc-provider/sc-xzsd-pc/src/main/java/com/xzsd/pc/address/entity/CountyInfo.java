package com.xzsd.pc.address.entity;

public class CountyInfo {
    /**
     * 区编号
     */
    private String countyValue;
    /**
     * 区名称
     */
    private String countyName;
    /**
     * 从属市编号
     */
    private String cityValue;

    public String getCountyValue() {
        return countyValue;
    }

    public void setCountyValue(String countyValue) {
        this.countyValue = countyValue;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }
}
