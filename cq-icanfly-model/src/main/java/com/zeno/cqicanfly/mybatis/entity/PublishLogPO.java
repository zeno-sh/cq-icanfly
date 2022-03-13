package com.zeno.cqicanfly.mybatis.entity;

import java.util.Date;

public class PublishLogPO {
    private Integer id;

    private Date publishTime;

    private Date rollbackTime;

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

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getRollbackTime() {
        return rollbackTime;
    }

    public void setRollbackTime(Date rollbackTime) {
        this.rollbackTime = rollbackTime;
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