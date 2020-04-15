package com.xzsd.pc.cos.entity;

public class MgInfo {
    /**
     *图片key
     */
    private String pKey;
    /**
     * url
     */
    private String pUrl;
    /**
     * 要修改的表
     */
    private String tableName;
    /**
     * 表主键
     */
    private String tableId;
    /**
     *主键
     */
    private String mainId;
    /**
     *标记0商品表1轮播图表
     */
    private int flag;
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

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getMainId() {
        return mainId;
    }

    public void setMainId(String mainId) {
        this.mainId = mainId;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }
}
