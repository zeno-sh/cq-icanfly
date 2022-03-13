package com.zeno.cqicanfly.mybatis.entity;

import java.util.Date;

public class ConfigFilePO {
    private Integer id;

    private String file_path;

    private String file_name;

    private String file_lua_table_header;

    private Boolean to_php_status;

    private Integer status;

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

    public String getFile_path() {
        return file_path;
    }

    public void setFile_path(String file_path) {
        this.file_path = file_path == null ? null : file_path.trim();
    }

    public String getFile_name() {
        return file_name;
    }

    public void setFile_name(String file_name) {
        this.file_name = file_name == null ? null : file_name.trim();
    }

    public String getFile_lua_table_header() {
        return file_lua_table_header;
    }

    public void setFile_lua_table_header(String file_lua_table_header) {
        this.file_lua_table_header = file_lua_table_header == null ? null : file_lua_table_header.trim();
    }

    public Boolean getTo_php_status() {
        return to_php_status;
    }

    public void setTo_php_status(Boolean to_php_status) {
        this.to_php_status = to_php_status;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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