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
    private String pictureKey;
    /**
     * url
     */
    private String url;
    /**
     * 状态0禁用1启用
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
     * 创建时间
     */
    private Date creatTime;
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

    public String getPictureKey() {
        return pictureKey;
    }

    public void setPictureKey(String pictureKey) {
        this.pictureKey = pictureKey;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
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
