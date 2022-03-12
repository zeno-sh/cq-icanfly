package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class ScenesConfigPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScenesConfigPOExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSceneidIsNull() {
            addCriterion("sceneid is null");
            return (Criteria) this;
        }

        public Criteria andSceneidIsNotNull() {
            addCriterion("sceneid is not null");
            return (Criteria) this;
        }

        public Criteria andSceneidEqualTo(Integer value) {
            addCriterion("sceneid =", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotEqualTo(Integer value) {
            addCriterion("sceneid <>", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThan(Integer value) {
            addCriterion("sceneid >", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidGreaterThanOrEqualTo(Integer value) {
            addCriterion("sceneid >=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThan(Integer value) {
            addCriterion("sceneid <", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidLessThanOrEqualTo(Integer value) {
            addCriterion("sceneid <=", value, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidIn(List<Integer> values) {
            addCriterion("sceneid in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotIn(List<Integer> values) {
            addCriterion("sceneid not in", values, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidBetween(Integer value1, Integer value2) {
            addCriterion("sceneid between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneidNotBetween(Integer value1, Integer value2) {
            addCriterion("sceneid not between", value1, value2, "sceneid");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIsNull() {
            addCriterion("sceneType is null");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIsNotNull() {
            addCriterion("sceneType is not null");
            return (Criteria) this;
        }

        public Criteria andSceneTypeEqualTo(Integer value) {
            addCriterion("sceneType =", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotEqualTo(Integer value) {
            addCriterion("sceneType <>", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeGreaterThan(Integer value) {
            addCriterion("sceneType >", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("sceneType >=", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLessThan(Integer value) {
            addCriterion("sceneType <", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeLessThanOrEqualTo(Integer value) {
            addCriterion("sceneType <=", value, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeIn(List<Integer> values) {
            addCriterion("sceneType in", values, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotIn(List<Integer> values) {
            addCriterion("sceneType not in", values, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeBetween(Integer value1, Integer value2) {
            addCriterion("sceneType between", value1, value2, "sceneType");
            return (Criteria) this;
        }

        public Criteria andSceneTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("sceneType not between", value1, value2, "sceneType");
            return (Criteria) this;
        }

        public Criteria andScencenameIsNull() {
            addCriterion("scencename is null");
            return (Criteria) this;
        }

        public Criteria andScencenameIsNotNull() {
            addCriterion("scencename is not null");
            return (Criteria) this;
        }

        public Criteria andScencenameEqualTo(String value) {
            addCriterion("scencename =", value, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameNotEqualTo(String value) {
            addCriterion("scencename <>", value, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameGreaterThan(String value) {
            addCriterion("scencename >", value, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameGreaterThanOrEqualTo(String value) {
            addCriterion("scencename >=", value, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameLessThan(String value) {
            addCriterion("scencename <", value, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameLessThanOrEqualTo(String value) {
            addCriterion("scencename <=", value, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameLike(String value) {
            addCriterion("scencename like", value, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameNotLike(String value) {
            addCriterion("scencename not like", value, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameIn(List<String> values) {
            addCriterion("scencename in", values, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameNotIn(List<String> values) {
            addCriterion("scencename not in", values, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameBetween(String value1, String value2) {
            addCriterion("scencename between", value1, value2, "scencename");
            return (Criteria) this;
        }

        public Criteria andScencenameNotBetween(String value1, String value2) {
            addCriterion("scencename not between", value1, value2, "scencename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameIsNull() {
            addCriterion("mapfilename is null");
            return (Criteria) this;
        }

        public Criteria andMapfilenameIsNotNull() {
            addCriterion("mapfilename is not null");
            return (Criteria) this;
        }

        public Criteria andMapfilenameEqualTo(String value) {
            addCriterion("mapfilename =", value, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameNotEqualTo(String value) {
            addCriterion("mapfilename <>", value, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameGreaterThan(String value) {
            addCriterion("mapfilename >", value, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameGreaterThanOrEqualTo(String value) {
            addCriterion("mapfilename >=", value, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameLessThan(String value) {
            addCriterion("mapfilename <", value, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameLessThanOrEqualTo(String value) {
            addCriterion("mapfilename <=", value, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameLike(String value) {
            addCriterion("mapfilename like", value, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameNotLike(String value) {
            addCriterion("mapfilename not like", value, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameIn(List<String> values) {
            addCriterion("mapfilename in", values, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameNotIn(List<String> values) {
            addCriterion("mapfilename not in", values, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameBetween(String value1, String value2) {
            addCriterion("mapfilename between", value1, value2, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andMapfilenameNotBetween(String value1, String value2) {
            addCriterion("mapfilename not between", value1, value2, "mapfilename");
            return (Criteria) this;
        }

        public Criteria andDefaultXIsNull() {
            addCriterion("defaultX is null");
            return (Criteria) this;
        }

        public Criteria andDefaultXIsNotNull() {
            addCriterion("defaultX is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultXEqualTo(Integer value) {
            addCriterion("defaultX =", value, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXNotEqualTo(Integer value) {
            addCriterion("defaultX <>", value, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXGreaterThan(Integer value) {
            addCriterion("defaultX >", value, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXGreaterThanOrEqualTo(Integer value) {
            addCriterion("defaultX >=", value, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXLessThan(Integer value) {
            addCriterion("defaultX <", value, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXLessThanOrEqualTo(Integer value) {
            addCriterion("defaultX <=", value, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXIn(List<Integer> values) {
            addCriterion("defaultX in", values, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXNotIn(List<Integer> values) {
            addCriterion("defaultX not in", values, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXBetween(Integer value1, Integer value2) {
            addCriterion("defaultX between", value1, value2, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultXNotBetween(Integer value1, Integer value2) {
            addCriterion("defaultX not between", value1, value2, "defaultX");
            return (Criteria) this;
        }

        public Criteria andDefaultYIsNull() {
            addCriterion("defaultY is null");
            return (Criteria) this;
        }

        public Criteria andDefaultYIsNotNull() {
            addCriterion("defaultY is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultYEqualTo(Integer value) {
            addCriterion("defaultY =", value, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYNotEqualTo(Integer value) {
            addCriterion("defaultY <>", value, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYGreaterThan(Integer value) {
            addCriterion("defaultY >", value, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYGreaterThanOrEqualTo(Integer value) {
            addCriterion("defaultY >=", value, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYLessThan(Integer value) {
            addCriterion("defaultY <", value, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYLessThanOrEqualTo(Integer value) {
            addCriterion("defaultY <=", value, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYIn(List<Integer> values) {
            addCriterion("defaultY in", values, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYNotIn(List<Integer> values) {
            addCriterion("defaultY not in", values, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYBetween(Integer value1, Integer value2) {
            addCriterion("defaultY between", value1, value2, "defaultY");
            return (Criteria) this;
        }

        public Criteria andDefaultYNotBetween(Integer value1, Integer value2) {
            addCriterion("defaultY not between", value1, value2, "defaultY");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andRefreshIsNull() {
            addCriterion("refresh is null");
            return (Criteria) this;
        }

        public Criteria andRefreshIsNotNull() {
            addCriterion("refresh is not null");
            return (Criteria) this;
        }

        public Criteria andRefreshEqualTo(String value) {
            addCriterion("refresh =", value, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshNotEqualTo(String value) {
            addCriterion("refresh <>", value, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshGreaterThan(String value) {
            addCriterion("refresh >", value, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshGreaterThanOrEqualTo(String value) {
            addCriterion("refresh >=", value, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshLessThan(String value) {
            addCriterion("refresh <", value, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshLessThanOrEqualTo(String value) {
            addCriterion("refresh <=", value, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshLike(String value) {
            addCriterion("refresh like", value, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshNotLike(String value) {
            addCriterion("refresh not like", value, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshIn(List<String> values) {
            addCriterion("refresh in", values, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshNotIn(List<String> values) {
            addCriterion("refresh not in", values, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshBetween(String value1, String value2) {
            addCriterion("refresh between", value1, value2, "refresh");
            return (Criteria) this;
        }

        public Criteria andRefreshNotBetween(String value1, String value2) {
            addCriterion("refresh not between", value1, value2, "refresh");
            return (Criteria) this;
        }

        public Criteria andNpcIsNull() {
            addCriterion("npc is null");
            return (Criteria) this;
        }

        public Criteria andNpcIsNotNull() {
            addCriterion("npc is not null");
            return (Criteria) this;
        }

        public Criteria andNpcEqualTo(String value) {
            addCriterion("npc =", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcNotEqualTo(String value) {
            addCriterion("npc <>", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcGreaterThan(String value) {
            addCriterion("npc >", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcGreaterThanOrEqualTo(String value) {
            addCriterion("npc >=", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcLessThan(String value) {
            addCriterion("npc <", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcLessThanOrEqualTo(String value) {
            addCriterion("npc <=", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcLike(String value) {
            addCriterion("npc like", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcNotLike(String value) {
            addCriterion("npc not like", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcIn(List<String> values) {
            addCriterion("npc in", values, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcNotIn(List<String> values) {
            addCriterion("npc not in", values, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcBetween(String value1, String value2) {
            addCriterion("npc between", value1, value2, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcNotBetween(String value1, String value2) {
            addCriterion("npc not between", value1, value2, "npc");
            return (Criteria) this;
        }

        public Criteria andTeleportIsNull() {
            addCriterion("teleport is null");
            return (Criteria) this;
        }

        public Criteria andTeleportIsNotNull() {
            addCriterion("teleport is not null");
            return (Criteria) this;
        }

        public Criteria andTeleportEqualTo(String value) {
            addCriterion("teleport =", value, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportNotEqualTo(String value) {
            addCriterion("teleport <>", value, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportGreaterThan(String value) {
            addCriterion("teleport >", value, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportGreaterThanOrEqualTo(String value) {
            addCriterion("teleport >=", value, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportLessThan(String value) {
            addCriterion("teleport <", value, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportLessThanOrEqualTo(String value) {
            addCriterion("teleport <=", value, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportLike(String value) {
            addCriterion("teleport like", value, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportNotLike(String value) {
            addCriterion("teleport not like", value, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportIn(List<String> values) {
            addCriterion("teleport in", values, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportNotIn(List<String> values) {
            addCriterion("teleport not in", values, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportBetween(String value1, String value2) {
            addCriterion("teleport between", value1, value2, "teleport");
            return (Criteria) this;
        }

        public Criteria andTeleportNotBetween(String value1, String value2) {
            addCriterion("teleport not between", value1, value2, "teleport");
            return (Criteria) this;
        }

        public Criteria andMusicIsNull() {
            addCriterion("music is null");
            return (Criteria) this;
        }

        public Criteria andMusicIsNotNull() {
            addCriterion("music is not null");
            return (Criteria) this;
        }

        public Criteria andMusicEqualTo(String value) {
            addCriterion("music =", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicNotEqualTo(String value) {
            addCriterion("music <>", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicGreaterThan(String value) {
            addCriterion("music >", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicGreaterThanOrEqualTo(String value) {
            addCriterion("music >=", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicLessThan(String value) {
            addCriterion("music <", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicLessThanOrEqualTo(String value) {
            addCriterion("music <=", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicLike(String value) {
            addCriterion("music like", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicNotLike(String value) {
            addCriterion("music not like", value, "music");
            return (Criteria) this;
        }

        public Criteria andMusicIn(List<String> values) {
            addCriterion("music in", values, "music");
            return (Criteria) this;
        }

        public Criteria andMusicNotIn(List<String> values) {
            addCriterion("music not in", values, "music");
            return (Criteria) this;
        }

        public Criteria andMusicBetween(String value1, String value2) {
            addCriterion("music between", value1, value2, "music");
            return (Criteria) this;
        }

        public Criteria andMusicNotBetween(String value1, String value2) {
            addCriterion("music not between", value1, value2, "music");
            return (Criteria) this;
        }

        public Criteria andIsminiIsNull() {
            addCriterion("ismini is null");
            return (Criteria) this;
        }

        public Criteria andIsminiIsNotNull() {
            addCriterion("ismini is not null");
            return (Criteria) this;
        }

        public Criteria andIsminiEqualTo(Integer value) {
            addCriterion("ismini =", value, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiNotEqualTo(Integer value) {
            addCriterion("ismini <>", value, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiGreaterThan(Integer value) {
            addCriterion("ismini >", value, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismini >=", value, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiLessThan(Integer value) {
            addCriterion("ismini <", value, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiLessThanOrEqualTo(Integer value) {
            addCriterion("ismini <=", value, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiIn(List<Integer> values) {
            addCriterion("ismini in", values, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiNotIn(List<Integer> values) {
            addCriterion("ismini not in", values, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiBetween(Integer value1, Integer value2) {
            addCriterion("ismini between", value1, value2, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsminiNotBetween(Integer value1, Integer value2) {
            addCriterion("ismini not between", value1, value2, "ismini");
            return (Criteria) this;
        }

        public Criteria andIsHookIsNull() {
            addCriterion("isHook is null");
            return (Criteria) this;
        }

        public Criteria andIsHookIsNotNull() {
            addCriterion("isHook is not null");
            return (Criteria) this;
        }

        public Criteria andIsHookEqualTo(Integer value) {
            addCriterion("isHook =", value, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookNotEqualTo(Integer value) {
            addCriterion("isHook <>", value, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookGreaterThan(Integer value) {
            addCriterion("isHook >", value, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookGreaterThanOrEqualTo(Integer value) {
            addCriterion("isHook >=", value, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookLessThan(Integer value) {
            addCriterion("isHook <", value, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookLessThanOrEqualTo(Integer value) {
            addCriterion("isHook <=", value, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookIn(List<Integer> values) {
            addCriterion("isHook in", values, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookNotIn(List<Integer> values) {
            addCriterion("isHook not in", values, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookBetween(Integer value1, Integer value2) {
            addCriterion("isHook between", value1, value2, "isHook");
            return (Criteria) this;
        }

        public Criteria andIsHookNotBetween(Integer value1, Integer value2) {
            addCriterion("isHook not between", value1, value2, "isHook");
            return (Criteria) this;
        }

        public Criteria andHookIsNull() {
            addCriterion("hook is null");
            return (Criteria) this;
        }

        public Criteria andHookIsNotNull() {
            addCriterion("hook is not null");
            return (Criteria) this;
        }

        public Criteria andHookEqualTo(String value) {
            addCriterion("hook =", value, "hook");
            return (Criteria) this;
        }

        public Criteria andHookNotEqualTo(String value) {
            addCriterion("hook <>", value, "hook");
            return (Criteria) this;
        }

        public Criteria andHookGreaterThan(String value) {
            addCriterion("hook >", value, "hook");
            return (Criteria) this;
        }

        public Criteria andHookGreaterThanOrEqualTo(String value) {
            addCriterion("hook >=", value, "hook");
            return (Criteria) this;
        }

        public Criteria andHookLessThan(String value) {
            addCriterion("hook <", value, "hook");
            return (Criteria) this;
        }

        public Criteria andHookLessThanOrEqualTo(String value) {
            addCriterion("hook <=", value, "hook");
            return (Criteria) this;
        }

        public Criteria andHookLike(String value) {
            addCriterion("hook like", value, "hook");
            return (Criteria) this;
        }

        public Criteria andHookNotLike(String value) {
            addCriterion("hook not like", value, "hook");
            return (Criteria) this;
        }

        public Criteria andHookIn(List<String> values) {
            addCriterion("hook in", values, "hook");
            return (Criteria) this;
        }

        public Criteria andHookNotIn(List<String> values) {
            addCriterion("hook not in", values, "hook");
            return (Criteria) this;
        }

        public Criteria andHookBetween(String value1, String value2) {
            addCriterion("hook between", value1, value2, "hook");
            return (Criteria) this;
        }

        public Criteria andHookNotBetween(String value1, String value2) {
            addCriterion("hook not between", value1, value2, "hook");
            return (Criteria) this;
        }

        public Criteria andSafeIsNull() {
            addCriterion("safe is null");
            return (Criteria) this;
        }

        public Criteria andSafeIsNotNull() {
            addCriterion("safe is not null");
            return (Criteria) this;
        }

        public Criteria andSafeEqualTo(String value) {
            addCriterion("safe =", value, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeNotEqualTo(String value) {
            addCriterion("safe <>", value, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeGreaterThan(String value) {
            addCriterion("safe >", value, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeGreaterThanOrEqualTo(String value) {
            addCriterion("safe >=", value, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeLessThan(String value) {
            addCriterion("safe <", value, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeLessThanOrEqualTo(String value) {
            addCriterion("safe <=", value, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeLike(String value) {
            addCriterion("safe like", value, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeNotLike(String value) {
            addCriterion("safe not like", value, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeIn(List<String> values) {
            addCriterion("safe in", values, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeNotIn(List<String> values) {
            addCriterion("safe not in", values, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeBetween(String value1, String value2) {
            addCriterion("safe between", value1, value2, "safe");
            return (Criteria) this;
        }

        public Criteria andSafeNotBetween(String value1, String value2) {
            addCriterion("safe not between", value1, value2, "safe");
            return (Criteria) this;
        }

        public Criteria andMapGgroupIsNull() {
            addCriterion("mapGgroup is null");
            return (Criteria) this;
        }

        public Criteria andMapGgroupIsNotNull() {
            addCriterion("mapGgroup is not null");
            return (Criteria) this;
        }

        public Criteria andMapGgroupEqualTo(Integer value) {
            addCriterion("mapGgroup =", value, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupNotEqualTo(Integer value) {
            addCriterion("mapGgroup <>", value, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupGreaterThan(Integer value) {
            addCriterion("mapGgroup >", value, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("mapGgroup >=", value, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupLessThan(Integer value) {
            addCriterion("mapGgroup <", value, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupLessThanOrEqualTo(Integer value) {
            addCriterion("mapGgroup <=", value, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupIn(List<Integer> values) {
            addCriterion("mapGgroup in", values, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupNotIn(List<Integer> values) {
            addCriterion("mapGgroup not in", values, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupBetween(Integer value1, Integer value2) {
            addCriterion("mapGgroup between", value1, value2, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andMapGgroupNotBetween(Integer value1, Integer value2) {
            addCriterion("mapGgroup not between", value1, value2, "mapGgroup");
            return (Criteria) this;
        }

        public Criteria andIscallIsNull() {
            addCriterion("iscall is null");
            return (Criteria) this;
        }

        public Criteria andIscallIsNotNull() {
            addCriterion("iscall is not null");
            return (Criteria) this;
        }

        public Criteria andIscallEqualTo(Integer value) {
            addCriterion("iscall =", value, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallNotEqualTo(Integer value) {
            addCriterion("iscall <>", value, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallGreaterThan(Integer value) {
            addCriterion("iscall >", value, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallGreaterThanOrEqualTo(Integer value) {
            addCriterion("iscall >=", value, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallLessThan(Integer value) {
            addCriterion("iscall <", value, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallLessThanOrEqualTo(Integer value) {
            addCriterion("iscall <=", value, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallIn(List<Integer> values) {
            addCriterion("iscall in", values, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallNotIn(List<Integer> values) {
            addCriterion("iscall not in", values, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallBetween(Integer value1, Integer value2) {
            addCriterion("iscall between", value1, value2, "iscall");
            return (Criteria) this;
        }

        public Criteria andIscallNotBetween(Integer value1, Integer value2) {
            addCriterion("iscall not between", value1, value2, "iscall");
            return (Criteria) this;
        }

        public Criteria andParticleIdIsNull() {
            addCriterion("particleId is null");
            return (Criteria) this;
        }

        public Criteria andParticleIdIsNotNull() {
            addCriterion("particleId is not null");
            return (Criteria) this;
        }

        public Criteria andParticleIdEqualTo(Integer value) {
            addCriterion("particleId =", value, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdNotEqualTo(Integer value) {
            addCriterion("particleId <>", value, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdGreaterThan(Integer value) {
            addCriterion("particleId >", value, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("particleId >=", value, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdLessThan(Integer value) {
            addCriterion("particleId <", value, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdLessThanOrEqualTo(Integer value) {
            addCriterion("particleId <=", value, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdIn(List<Integer> values) {
            addCriterion("particleId in", values, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdNotIn(List<Integer> values) {
            addCriterion("particleId not in", values, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdBetween(Integer value1, Integer value2) {
            addCriterion("particleId between", value1, value2, "particleId");
            return (Criteria) this;
        }

        public Criteria andParticleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("particleId not between", value1, value2, "particleId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}