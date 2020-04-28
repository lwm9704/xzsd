package com.xzsd.pc.rotation.entity;

import java.util.Date;

/**
 * 传递轮播图状态实现类
 */
public class RotationInfoU {

    /**
     * 轮播图编号
     */
    private String rotaId;
    /**
     * 轮播图状态0禁用1启用
     */
    private int state;
    /**
     * 更新人
     */
    private String lastModifyBy;
    /**
     * 版本号
     */
    private int version;

    public String getRotaId() {
        return rotaId;
    }

    public void setRotaId(String rotaId) {
        this.rotaId = rotaId;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}

