package com.zeno.cqicanfly.mybatis.entity;

public class DropGroupConfigPO {
    private Integer id;

    private Integer type;

    private String groupConfig;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getGroupConfig() {
        return groupConfig;
    }

    public void setGroupConfig(String groupConfig) {
        this.groupConfig = groupConfig == null ? null : groupConfig.trim();
    }
}