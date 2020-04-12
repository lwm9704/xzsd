package com.xzsd.pc.address.entity;

public class CityInfo {
    /**
     * 市编号
     */
    private String cityValue;
    /**
     * 市名称
     */
    private String cityName;

    /**
     * 从属省编号
     */
    private String provinceValue;

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvinceValue() {
        return provinceValue;
    }

    public void setProvinceValue(String provinceValue) {
        this.provinceValue = provinceValue;
    }
}
