package com.zeno.cqicanfly.mybatis.entity;

public class MergeConfigPO {
    private Integer id;

    private Integer firstIndex;

    private Integer secondIndex;

    private String name;

    private Integer levelconds;

    private Integer rebornconds;

    private Integer dayconds;

    private Integer uitype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFirstIndex() {
        return firstIndex;
    }

    public void setFirstIndex(Integer firstIndex) {
        this.firstIndex = firstIndex;
    }

    public Integer getSecondIndex() {
        return secondIndex;
    }

    public void setSecondIndex(Integer secondIndex) {
        this.secondIndex = secondIndex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevelconds() {
        return levelconds;
    }

    public void setLevelconds(Integer levelconds) {
        this.levelconds = levelconds;
    }

    public Integer getRebornconds() {
        return rebornconds;
    }

    public void setRebornconds(Integer rebornconds) {
        this.rebornconds = rebornconds;
    }

    public Integer getDayconds() {
        return dayconds;
    }

    public void setDayconds(Integer dayconds) {
        this.dayconds = dayconds;
    }

    public Integer getUitype() {
        return uitype;
    }

    public void setUitype(Integer uitype) {
        this.uitype = uitype;
    }
}