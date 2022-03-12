package com.zeno.cqicanfly.mybatis.entity;

public class AIConfigPO {
    private Integer id;

    private Integer idx;

    private Integer aiType;

    private Integer patrolRadius;

    private Integer pursuitDistance;

    private Integer watchDistance;

    private Integer leftHomeMaxDistance;

    private Integer returnHomeRenewRate;

    private Integer stopMinTime;

    private Integer stopMaxTime;

    private Integer moveStopInterval;

    private Integer checkenemyInterval;

    private Integer transferDis;

    private Integer battleFollowDis;

    private Integer petFollowMasterTime;

    private Integer hitSetTargetRate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdx() {
        return idx;
    }

    public void setIdx(Integer idx) {
        this.idx = idx;
    }

    public Integer getAiType() {
        return aiType;
    }

    public void setAiType(Integer aiType) {
        this.aiType = aiType;
    }

    public Integer getPatrolRadius() {
        return patrolRadius;
    }

    public void setPatrolRadius(Integer patrolRadius) {
        this.patrolRadius = patrolRadius;
    }

    public Integer getPursuitDistance() {
        return pursuitDistance;
    }

    public void setPursuitDistance(Integer pursuitDistance) {
        this.pursuitDistance = pursuitDistance;
    }

    public Integer getWatchDistance() {
        return watchDistance;
    }

    public void setWatchDistance(Integer watchDistance) {
        this.watchDistance = watchDistance;
    }

    public Integer getLeftHomeMaxDistance() {
        return leftHomeMaxDistance;
    }

    public void setLeftHomeMaxDistance(Integer leftHomeMaxDistance) {
        this.leftHomeMaxDistance = leftHomeMaxDistance;
    }

    public Integer getReturnHomeRenewRate() {
        return returnHomeRenewRate;
    }

    public void setReturnHomeRenewRate(Integer returnHomeRenewRate) {
        this.returnHomeRenewRate = returnHomeRenewRate;
    }

    public Integer getStopMinTime() {
        return stopMinTime;
    }

    public void setStopMinTime(Integer stopMinTime) {
        this.stopMinTime = stopMinTime;
    }

    public Integer getStopMaxTime() {
        return stopMaxTime;
    }

    public void setStopMaxTime(Integer stopMaxTime) {
        this.stopMaxTime = stopMaxTime;
    }

    public Integer getMoveStopInterval() {
        return moveStopInterval;
    }

    public void setMoveStopInterval(Integer moveStopInterval) {
        this.moveStopInterval = moveStopInterval;
    }

    public Integer getCheckenemyInterval() {
        return checkenemyInterval;
    }

    public void setCheckenemyInterval(Integer checkenemyInterval) {
        this.checkenemyInterval = checkenemyInterval;
    }

    public Integer getTransferDis() {
        return transferDis;
    }

    public void setTransferDis(Integer transferDis) {
        this.transferDis = transferDis;
    }

    public Integer getBattleFollowDis() {
        return battleFollowDis;
    }

    public void setBattleFollowDis(Integer battleFollowDis) {
        this.battleFollowDis = battleFollowDis;
    }

    public Integer getPetFollowMasterTime() {
        return petFollowMasterTime;
    }

    public void setPetFollowMasterTime(Integer petFollowMasterTime) {
        this.petFollowMasterTime = petFollowMasterTime;
    }

    public Integer getHitSetTargetRate() {
        return hitSetTargetRate;
    }

    public void setHitSetTargetRate(Integer hitSetTargetRate) {
        this.hitSetTargetRate = hitSetTargetRate;
    }
}