package com.xzsd.pc.sort.entity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 实体类
 * @author weiming
 * @date 2020-3-28
 */
public class SecondSortInfo {

    /**
     * 二级分类编码
     */
    private String secondSortId;

    /**
     * 二级分类名称
     */
    private String secondSortName;

    /**
     * 父类编码
     */
    private String fatherSortId;

    /**
     *备注
     */
    private String remark;

    /**
     * 是否删除 0没有删除1已删除
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
     * 修改人
     */
    private String lastModifyBy;
    /**
     * 修改时间
     */
    private Date modifyTime;
    /**
     * 版本号
     */
    private int version;

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

    public String getSecondSortId() {
        return secondSortId;
    }

    public void setSecondSortId(String secondSortId) {
        this.secondSortId = secondSortId;
    }

    public String getSecondSortName() {
        return secondSortName;
    }

    public void setSecondSortName(String secondSortName) {
        this.secondSortName = secondSortName;
    }

    public String getFatherSortId() {
        return fatherSortId;
    }

    public void setFatherSortId(String fatherSortId) {
        this.fatherSortId = fatherSortId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
