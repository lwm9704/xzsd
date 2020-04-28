package com.xzsd.pc.rotation.entity;

import java.util.Date;

/**
 * 新增信息实现类
 */
public class RotationInfoA {

    /**
     * 轮播图编号
     */
    private String rotaId;
    /**
     *排序
     */
    private int rotaSort;
    /**
     * 图片KEY
     */
    private String pKey;
    /**
     * url
     */
    private String pUrl;
    /**
     * 状态0禁用1启用
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
     * 商品编码
     */
    private String goodsId;
    /**
     * 是否删除0没删除1已删除
     */
    private int isDelete;
    /**
     * 创建人
     */
    private String creatBy;
    /**
     * 更新人
     */
    private String lastModifyBy;
    /**
     * 版本号
     */
    private int version;

    /**
     * 有效期起
     */
    private Date starDate;
    /**
     *有效期止
     */
    private Date endDate;

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

    public String getpKey() {
        return pKey;
    }

    public void setpKey(String pKey) {
        this.pKey = pKey;
    }

    public String getpUrl() {
        return pUrl;
    }

    public void setpUrl(String pUrl) {
        this.pUrl = pUrl;
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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
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

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public Date getStarDate() {
        return starDate;
    }

    public void setStarDate(Date starDate) {
        this.starDate = starDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
