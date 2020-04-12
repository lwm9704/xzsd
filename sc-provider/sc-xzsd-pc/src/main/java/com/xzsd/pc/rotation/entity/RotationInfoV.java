package com.xzsd.pc.rotation.entity;

import java.util.Date;

/**
 * 轮播图信息展示实现类
 */
public class RotationInfoV {
    /**
     * 轮播图id
     */
    private String rotationId;
    /**
     * 排序
     */
    private int sort;
    /**
     * 状态
     */
    private int state;
    /**
     * 有效期起
     */
    private Date starTime;
    /**
     * 有效期止
     */
    private Date endTime;
    /**
     * url
     */
    private String url;

    public String getRotationId() {
        return rotationId;
    }

    public void setRotationId(String rotationId) {
        this.rotationId = rotationId;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getStarTime() {
        return starTime;
    }

    public void setStarTime(Date starTime) {
        this.starTime = starTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
