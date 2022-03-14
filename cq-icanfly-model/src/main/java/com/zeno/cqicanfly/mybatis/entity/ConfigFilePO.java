package com.zeno.cqicanfly.mybatis.entity;

import java.util.Date;

public class ConfigFilePO {
    private Integer id;

    private String filePath;

    private String fileName;

    private String fileLuaTableHeader;

    private Integer toPhpStatus;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String createBy;

    private String updateBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileLuaTableHeader() {
        return fileLuaTableHeader;
    }

    public void setFileLuaTableHeader(String fileLuaTableHeader) {
        this.fileLuaTableHeader = fileLuaTableHeader == null ? null : fileLuaTableHeader.trim();
    }

    public Integer getToPhpStatus() {
        return toPhpStatus;
    }

    public void setToPhpStatus(Integer toPhpStatus) {
        this.toPhpStatus = toPhpStatus;
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

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }
}