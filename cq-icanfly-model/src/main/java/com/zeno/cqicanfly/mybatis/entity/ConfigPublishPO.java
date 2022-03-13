package com.zeno.cqicanfly.mybatis.entity;

import java.util.Date;

public class ConfigPublishPO {
    private Integer id;

    private Integer fileId;

    private Integer fileEditId;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String udpateBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getFileEditId() {
        return fileEditId;
    }

    public void setFileEditId(Integer fileEditId) {
        this.fileEditId = fileEditId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy == null ? null : createBy.trim();
    }

    public String getUdpateBy() {
        return udpateBy;
    }

    public void setUdpateBy(String udpateBy) {
        this.udpateBy = udpateBy == null ? null : udpateBy.trim();
    }
}