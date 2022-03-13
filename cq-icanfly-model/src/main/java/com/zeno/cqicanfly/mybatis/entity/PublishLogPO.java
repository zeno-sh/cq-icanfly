package com.zeno.cqicanfly.mybatis.entity;

import java.util.Date;

public class PublishLogPO {
    private Integer id;

    private Date publish_time;

    private Date rollback_time;

    private Date create_time;

    private Date update_time;

    private String create_by;

    private String udpate_by;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getPublish_time() {
        return publish_time;
    }

    public void setPublish_time(Date publish_time) {
        this.publish_time = publish_time;
    }

    public Date getRollback_time() {
        return rollback_time;
    }

    public void setRollback_time(Date rollback_time) {
        this.rollback_time = rollback_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by == null ? null : create_by.trim();
    }

    public String getUdpate_by() {
        return udpate_by;
    }

    public void setUdpate_by(String udpate_by) {
        this.udpate_by = udpate_by == null ? null : udpate_by.trim();
    }
}