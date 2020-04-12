package com.xzsd.pc.rotation.entity;

import java.util.Date;

/**
 * 传递轮播图状态实现类
 */
public class RotationInfoU {

    /**
     * 轮播图编号
     */
    private String rotationId;
    /**
     * 轮播图状态0禁用1启用
     */
    private int state;
    /**
     * 更新人
     */
    private String lastModifyBy;
    /**
     * 更新时间
     */
    private Date modifyTime;
    /**
     * 版本号
     */
    private int version;

    public String getRotationId() {
        return rotationId;
    }

    public void setRotationId(String rotationId) {
        this.rotationId = rotationId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(String lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

