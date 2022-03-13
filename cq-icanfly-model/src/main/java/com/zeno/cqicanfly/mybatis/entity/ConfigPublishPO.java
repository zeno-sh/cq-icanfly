package com.zeno.cqicanfly.mybatis.entity;

import java.util.Date;

public class ConfigPublishPO {
    private Integer id;

    private Integer file_id;

    private Integer file_edit_id;

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

    public Integer getFile_id() {
        return file_id;
    }

    public void setFile_id(Integer file_id) {
        this.file_id = file_id;
    }

    public Integer getFile_edit_id() {
        return file_edit_id;
    }

    public void setFile_edit_id(Integer file_edit_id) {
        this.file_edit_id = file_edit_id;
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