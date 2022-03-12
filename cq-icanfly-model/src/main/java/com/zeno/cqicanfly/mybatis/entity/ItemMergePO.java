package com.zeno.cqicanfly.mybatis.entity;

public class ItemMergePO {
    private Integer id;

    private Integer firstIndex;

    private Integer secondIndex;

    private Integer eid;

    private String compose;

    private Integer level;

    private String mergeTable;

    private Integer circle;

    private Integer openserverday;

    private String mergelimit;

    private String limitTips;

    private Integer area;

    private String text;

    private Integer redpoint;

    private String redpointlimit;

    private String buttontxt10;

    private Integer mergebutton10;

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

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getCompose() {
        return compose;
    }

    public void setCompose(String compose) {
        this.compose = compose == null ? null : compose.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getMergeTable() {
        return mergeTable;
    }

    public void setMergeTable(String mergeTable) {
        this.mergeTable = mergeTable == null ? null : mergeTable.trim();
    }

    public Integer getCircle() {
        return circle;
    }

    public void setCircle(Integer circle) {
        this.circle = circle;
    }

    public Integer getOpenserverday() {
        return openserverday;
    }

    public void setOpenserverday(Integer openserverday) {
        this.openserverday = openserverday;
    }

    public String getMergelimit() {
        return mergelimit;
    }

    public void setMergelimit(String mergelimit) {
        this.mergelimit = mergelimit == null ? null : mergelimit.trim();
    }

    public String getLimitTips() {
        return limitTips;
    }

    public void setLimitTips(String limitTips) {
        this.limitTips = limitTips == null ? null : limitTips.trim();
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text == null ? null : text.trim();
    }

    public Integer getRedpoint() {
        return redpoint;
    }

    public void setRedpoint(Integer redpoint) {
        this.redpoint = redpoint;
    }

    public String getRedpointlimit() {
        return redpointlimit;
    }

    public void setRedpointlimit(String redpointlimit) {
        this.redpointlimit = redpointlimit == null ? null : redpointlimit.trim();
    }

    public String getButtontxt10() {
        return buttontxt10;
    }

    public void setButtontxt10(String buttontxt10) {
        this.buttontxt10 = buttontxt10 == null ? null : buttontxt10.trim();
    }

    public Integer getMergebutton10() {
        return mergebutton10;
    }

    public void setMergebutton10(Integer mergebutton10) {
        this.mergebutton10 = mergebutton10;
    }
}