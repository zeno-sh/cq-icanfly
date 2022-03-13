package com.zeno.cqicanfly.mybatis.entity;

import java.util.Date;

public class FileEditPO {
    private Integer id;

    private Integer fileId;

    private String fileConfig;

    private String fileJson;

    private Integer status;

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

    public String getFileConfig() {
        return fileConfig;
    }

    public void setFileConfig(String fileConfig) {
        this.fileConfig = fileConfig == null ? null : fileConfig.trim();
    }

    public String getFileJson() {
        return fileJson;
    }

    public void setFileJson(String fileJson) {
        this.fileJson = fileJson == null ? null : fileJson.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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