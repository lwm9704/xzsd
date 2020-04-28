package com.xzsd.pc.rotation.entity;


/**
 * 轮播图信息展示实现类
 */
public class RotationInfoV {
    /**
     * 轮播图id
     */
    private String rotaId;
    /**
     * 排序
     */
    private int rotaSort;
    /**
     * 状态
     */
    private int state;
    /**
     * 有效期起
     */
    private String starTime;
    /**
     * 有效期止
     */
    private String endTime;
    /**
     * url
     */
    private String pUrl;
    /**
     *版本
     */
    private int version;

    public String getRotaId() {
        return rotaId;
    }

    public void setRotaId(String rotaId) {
        this.rotaId = rotaId;
    }

    public int getRotaSort() {
        return rotaSort;
    }

    public void setRotaSort(int rotaSort) {
        this.rotaSort = rotaSort;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
