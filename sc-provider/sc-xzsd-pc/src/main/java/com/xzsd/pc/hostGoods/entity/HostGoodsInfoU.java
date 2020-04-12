package com.xzsd.pc.hostGoods.entity;

import java.util.Date;

public class HostGoodsInfoU {
    /**
     * 商品编号
     */
    private String goodsId;
    /**
     * 排序
     */
    private int sort;
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
    private Date mpdifyTime;
    /**
     * 版本号
     */
    private int version;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
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

    public Date getMpdifyTime() {
        return mpdifyTime;
    }

    public void setMpdifyTime(Date mpdifyTime) {
        this.mpdifyTime = mpdifyTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }
}
