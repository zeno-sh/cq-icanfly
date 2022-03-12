package com.zeno.cqicanfly.mybatis.entity;

public class DropTablePO {
    private Integer id;

    private Integer type;

    private String dropTable;

    private String timeLimit;

    private String weeklimit;

    private Integer isDropbest;

    private Integer loottype;

    private Integer limitopenserverDay;

    private Integer closeopenday;

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

    public String getDropTable() {
        return dropTable;
    }

    public void setDropTable(String dropTable) {
        this.dropTable = dropTable == null ? null : dropTable.trim();
    }

    public String getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(String timeLimit) {
        this.timeLimit = timeLimit == null ? null : timeLimit.trim();
    }

    public String getWeeklimit() {
        return weeklimit;
    }

    public void setWeeklimit(String weeklimit) {
        this.weeklimit = weeklimit == null ? null : weeklimit.trim();
    }

    public Integer getIsDropbest() {
        return isDropbest;
    }

    public void setIsDropbest(Integer isDropbest) {
        this.isDropbest = isDropbest;
    }

    public Integer getLoottype() {
        return loottype;
    }

    public void setLoottype(Integer loottype) {
        this.loottype = loottype;
    }

    public Integer getLimitopenserverDay() {
        return limitopenserverDay;
    }

    public void setLimitopenserverDay(Integer limitopenserverDay) {
        this.limitopenserverDay = limitopenserverDay;
    }

    public Integer getCloseopenday() {
        return closeopenday;
    }

    public void setCloseopenday(Integer closeopenday) {
        this.closeopenday = closeopenday;
    }
}