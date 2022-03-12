package com.zeno.cqicanfly.mybatis.entity;

public class ScenesConfigPO {
    private Integer id;

    private Integer sceneid;

    private Integer sceneType;

    private String scencename;

    private String mapfilename;

    private Integer defaultX;

    private Integer defaultY;

    private String area;

    private String refresh;

    private String npc;

    private String teleport;

    private String music;

    private Integer ismini;

    private Integer isHook;

    private String hook;

    private String safe;

    private Integer mapGgroup;

    private Integer iscall;

    private Integer particleId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSceneid() {
        return sceneid;
    }

    public void setSceneid(Integer sceneid) {
        this.sceneid = sceneid;
    }

    public Integer getSceneType() {
        return sceneType;
    }

    public void setSceneType(Integer sceneType) {
        this.sceneType = sceneType;
    }

    public String getScencename() {
        return scencename;
    }

    public void setScencename(String scencename) {
        this.scencename = scencename == null ? null : scencename.trim();
    }

    public String getMapfilename() {
        return mapfilename;
    }

    public void setMapfilename(String mapfilename) {
        this.mapfilename = mapfilename == null ? null : mapfilename.trim();
    }

    public Integer getDefaultX() {
        return defaultX;
    }

    public void setDefaultX(Integer defaultX) {
        this.defaultX = defaultX;
    }

    public Integer getDefaultY() {
        return defaultY;
    }

    public void setDefaultY(Integer defaultY) {
        this.defaultY = defaultY;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRefresh() {
        return refresh;
    }

    public void setRefresh(String refresh) {
        this.refresh = refresh == null ? null : refresh.trim();
    }

    public String getNpc() {
        return npc;
    }

    public void setNpc(String npc) {
        this.npc = npc == null ? null : npc.trim();
    }

    public String getTeleport() {
        return teleport;
    }

    public void setTeleport(String teleport) {
        this.teleport = teleport == null ? null : teleport.trim();
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music == null ? null : music.trim();
    }

    public Integer getIsmini() {
        return ismini;
    }

    public void setIsmini(Integer ismini) {
        this.ismini = ismini;
    }

    public Integer getIsHook() {
        return isHook;
    }

    public void setIsHook(Integer isHook) {
        this.isHook = isHook;
    }

    public String getHook() {
        return hook;
    }

    public void setHook(String hook) {
        this.hook = hook == null ? null : hook.trim();
    }

    public String getSafe() {
        return safe;
    }

    public void setSafe(String safe) {
        this.safe = safe == null ? null : safe.trim();
    }

    public Integer getMapGgroup() {
        return mapGgroup;
    }

    public void setMapGgroup(Integer mapGgroup) {
        this.mapGgroup = mapGgroup;
    }

    public Integer getIscall() {
        return iscall;
    }

    public void setIscall(Integer iscall) {
        this.iscall = iscall;
    }

    public Integer getParticleId() {
        return particleId;
    }

    public void setParticleId(Integer particleId) {
        this.particleId = particleId;
    }
}