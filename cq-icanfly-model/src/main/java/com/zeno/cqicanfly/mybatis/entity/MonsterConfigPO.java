package com.zeno.cqicanfly.mybatis.entity;

public class MonsterConfigPO {
    private Integer id;

    private Integer entityid;

    private Integer entityType;

    private Integer monsterType;

    private String name;

    private Integer level;

    private Integer circle;

    private Integer aiConfigId;

    private Integer propid;

    private Integer flagid;

    private Integer dropid;

    private Integer exp;

    private Integer innerExp;

    private Integer attackLevel;

    private Integer attackInterval;

    private Integer maxDropHp;

    private Integer damageSkill;

    private Integer weaponid;

    private Integer swingid;

    private String skills;

    private Integer modelid;

    private Integer dir;

    private String attackMusicId;

    private String dieMusicId;

    private String targetMusicId;

    private String damageMusicId;

    private String attackMusicRate;

    private String dieMusicRate;

    private String targetMusicTate;

    private String damageMusicRate;

    private String deatheff;

    private Integer chassis;

    private Integer shadow;

    private Integer scale;

    private Integer hpLabXY;

    private Integer nameLabXY;

    private Integer isAIAck;

    private Integer nameQuality;

    private Integer monLog;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEntityid() {
        return entityid;
    }

    public void setEntityid(Integer entityid) {
        this.entityid = entityid;
    }

    public Integer getEntityType() {
        return entityType;
    }

    public void setEntityType(Integer entityType) {
        this.entityType = entityType;
    }

    public Integer getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(Integer monsterType) {
        this.monsterType = monsterType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getCircle() {
        return circle;
    }

    public void setCircle(Integer circle) {
        this.circle = circle;
    }

    public Integer getAiConfigId() {
        return aiConfigId;
    }

    public void setAiConfigId(Integer aiConfigId) {
        this.aiConfigId = aiConfigId;
    }

    public Integer getPropid() {
        return propid;
    }

    public void setPropid(Integer propid) {
        this.propid = propid;
    }

    public Integer getFlagid() {
        return flagid;
    }

    public void setFlagid(Integer flagid) {
        this.flagid = flagid;
    }

    public Integer getDropid() {
        return dropid;
    }

    public void setDropid(Integer dropid) {
        this.dropid = dropid;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getInnerExp() {
        return innerExp;
    }

    public void setInnerExp(Integer innerExp) {
        this.innerExp = innerExp;
    }

    public Integer getAttackLevel() {
        return attackLevel;
    }

    public void setAttackLevel(Integer attackLevel) {
        this.attackLevel = attackLevel;
    }

    public Integer getAttackInterval() {
        return attackInterval;
    }

    public void setAttackInterval(Integer attackInterval) {
        this.attackInterval = attackInterval;
    }

    public Integer getMaxDropHp() {
        return maxDropHp;
    }

    public void setMaxDropHp(Integer maxDropHp) {
        this.maxDropHp = maxDropHp;
    }

    public Integer getDamageSkill() {
        return damageSkill;
    }

    public void setDamageSkill(Integer damageSkill) {
        this.damageSkill = damageSkill;
    }

    public Integer getWeaponid() {
        return weaponid;
    }

    public void setWeaponid(Integer weaponid) {
        this.weaponid = weaponid;
    }

    public Integer getSwingid() {
        return swingid;
    }

    public void setSwingid(Integer swingid) {
        this.swingid = swingid;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills == null ? null : skills.trim();
    }

    public Integer getModelid() {
        return modelid;
    }

    public void setModelid(Integer modelid) {
        this.modelid = modelid;
    }

    public Integer getDir() {
        return dir;
    }

    public void setDir(Integer dir) {
        this.dir = dir;
    }

    public String getAttackMusicId() {
        return attackMusicId;
    }

    public void setAttackMusicId(String attackMusicId) {
        this.attackMusicId = attackMusicId == null ? null : attackMusicId.trim();
    }

    public String getDieMusicId() {
        return dieMusicId;
    }

    public void setDieMusicId(String dieMusicId) {
        this.dieMusicId = dieMusicId == null ? null : dieMusicId.trim();
    }

    public String getTargetMusicId() {
        return targetMusicId;
    }

    public void setTargetMusicId(String targetMusicId) {
        this.targetMusicId = targetMusicId == null ? null : targetMusicId.trim();
    }

    public String getDamageMusicId() {
        return damageMusicId;
    }

    public void setDamageMusicId(String damageMusicId) {
        this.damageMusicId = damageMusicId == null ? null : damageMusicId.trim();
    }

    public String getAttackMusicRate() {
        return attackMusicRate;
    }

    public void setAttackMusicRate(String attackMusicRate) {
        this.attackMusicRate = attackMusicRate == null ? null : attackMusicRate.trim();
    }

    public String getDieMusicRate() {
        return dieMusicRate;
    }

    public void setDieMusicRate(String dieMusicRate) {
        this.dieMusicRate = dieMusicRate == null ? null : dieMusicRate.trim();
    }

    public String getTargetMusicTate() {
        return targetMusicTate;
    }

    public void setTargetMusicTate(String targetMusicTate) {
        this.targetMusicTate = targetMusicTate == null ? null : targetMusicTate.trim();
    }

    public String getDamageMusicRate() {
        return damageMusicRate;
    }

    public void setDamageMusicRate(String damageMusicRate) {
        this.damageMusicRate = damageMusicRate == null ? null : damageMusicRate.trim();
    }

    public String getDeatheff() {
        return deatheff;
    }

    public void setDeatheff(String deatheff) {
        this.deatheff = deatheff == null ? null : deatheff.trim();
    }

    public Integer getChassis() {
        return chassis;
    }

    public void setChassis(Integer chassis) {
        this.chassis = chassis;
    }

    public Integer getShadow() {
        return shadow;
    }

    public void setShadow(Integer shadow) {
        this.shadow = shadow;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getHpLabXY() {
        return hpLabXY;
    }

    public void setHpLabXY(Integer hpLabXY) {
        this.hpLabXY = hpLabXY;
    }

    public Integer getNameLabXY() {
        return nameLabXY;
    }

    public void setNameLabXY(Integer nameLabXY) {
        this.nameLabXY = nameLabXY;
    }

    public Integer getIsAIAck() {
        return isAIAck;
    }

    public void setIsAIAck(Integer isAIAck) {
        this.isAIAck = isAIAck;
    }

    public Integer getNameQuality() {
        return nameQuality;
    }

    public void setNameQuality(Integer nameQuality) {
        this.nameQuality = nameQuality;
    }

    public Integer getMonLog() {
        return monLog;
    }

    public void setMonLog(Integer monLog) {
        this.monLog = monLog;
    }
}