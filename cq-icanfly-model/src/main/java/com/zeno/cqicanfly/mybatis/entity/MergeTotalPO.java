package com.zeno.cqicanfly.mybatis.entity;

public class MergeTotalPO {
    private Integer id;

    private Integer openLv;

    private Integer openZs;

    private Integer openserverDay;

    private String btn_source;

    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOpenLv() {
        return openLv;
    }

    public void setOpenLv(Integer openLv) {
        this.openLv = openLv;
    }

    public Integer getOpenZs() {
        return openZs;
    }

    public void setOpenZs(Integer openZs) {
        this.openZs = openZs;
    }

    public Integer getOpenserverDay() {
        return openserverDay;
    }

    public void setOpenserverDay(Integer openserverDay) {
        this.openserverDay = openserverDay;
    }

    public String getBtn_source() {
        return btn_source;
    }

    public void setBtn_source(String btn_source) {
        this.btn_source = btn_source == null ? null : btn_source.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}