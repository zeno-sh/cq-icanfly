package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class MonsterConfigPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MonsterConfigPOExample() {
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

        public Criteria andEntityidIsNull() {
            addCriterion("entityid is null");
            return (Criteria) this;
        }

        public Criteria andEntityidIsNotNull() {
            addCriterion("entityid is not null");
            return (Criteria) this;
        }

        public Criteria andEntityidEqualTo(Integer value) {
            addCriterion("entityid =", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotEqualTo(Integer value) {
            addCriterion("entityid <>", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidGreaterThan(Integer value) {
            addCriterion("entityid >", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("entityid >=", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidLessThan(Integer value) {
            addCriterion("entityid <", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidLessThanOrEqualTo(Integer value) {
            addCriterion("entityid <=", value, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidIn(List<Integer> values) {
            addCriterion("entityid in", values, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotIn(List<Integer> values) {
            addCriterion("entityid not in", values, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidBetween(Integer value1, Integer value2) {
            addCriterion("entityid between", value1, value2, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityidNotBetween(Integer value1, Integer value2) {
            addCriterion("entityid not between", value1, value2, "entityid");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNull() {
            addCriterion("entityType is null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIsNotNull() {
            addCriterion("entityType is not null");
            return (Criteria) this;
        }

        public Criteria andEntityTypeEqualTo(Integer value) {
            addCriterion("entityType =", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotEqualTo(Integer value) {
            addCriterion("entityType <>", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThan(Integer value) {
            addCriterion("entityType >", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("entityType >=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThan(Integer value) {
            addCriterion("entityType <", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("entityType <=", value, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeIn(List<Integer> values) {
            addCriterion("entityType in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotIn(List<Integer> values) {
            addCriterion("entityType not in", values, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeBetween(Integer value1, Integer value2) {
            addCriterion("entityType between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andEntityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("entityType not between", value1, value2, "entityType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeIsNull() {
            addCriterion("monsterType is null");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeIsNotNull() {
            addCriterion("monsterType is not null");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeEqualTo(Integer value) {
            addCriterion("monsterType =", value, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeNotEqualTo(Integer value) {
            addCriterion("monsterType <>", value, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeGreaterThan(Integer value) {
            addCriterion("monsterType >", value, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("monsterType >=", value, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeLessThan(Integer value) {
            addCriterion("monsterType <", value, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeLessThanOrEqualTo(Integer value) {
            addCriterion("monsterType <=", value, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeIn(List<Integer> values) {
            addCriterion("monsterType in", values, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeNotIn(List<Integer> values) {
            addCriterion("monsterType not in", values, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeBetween(Integer value1, Integer value2) {
            addCriterion("monsterType between", value1, value2, "monsterType");
            return (Criteria) this;
        }

        public Criteria andMonsterTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("monsterType not between", value1, value2, "monsterType");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andCircleIsNull() {
            addCriterion("circle is null");
            return (Criteria) this;
        }

        public Criteria andCircleIsNotNull() {
            addCriterion("circle is not null");
            return (Criteria) this;
        }

        public Criteria andCircleEqualTo(Integer value) {
            addCriterion("circle =", value, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleNotEqualTo(Integer value) {
            addCriterion("circle <>", value, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleGreaterThan(Integer value) {
            addCriterion("circle >", value, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleGreaterThanOrEqualTo(Integer value) {
            addCriterion("circle >=", value, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleLessThan(Integer value) {
            addCriterion("circle <", value, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleLessThanOrEqualTo(Integer value) {
            addCriterion("circle <=", value, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleIn(List<Integer> values) {
            addCriterion("circle in", values, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleNotIn(List<Integer> values) {
            addCriterion("circle not in", values, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleBetween(Integer value1, Integer value2) {
            addCriterion("circle between", value1, value2, "circle");
            return (Criteria) this;
        }

        public Criteria andCircleNotBetween(Integer value1, Integer value2) {
            addCriterion("circle not between", value1, value2, "circle");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdIsNull() {
            addCriterion("aiConfigId is null");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdIsNotNull() {
            addCriterion("aiConfigId is not null");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdEqualTo(Integer value) {
            addCriterion("aiConfigId =", value, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdNotEqualTo(Integer value) {
            addCriterion("aiConfigId <>", value, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdGreaterThan(Integer value) {
            addCriterion("aiConfigId >", value, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("aiConfigId >=", value, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdLessThan(Integer value) {
            addCriterion("aiConfigId <", value, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdLessThanOrEqualTo(Integer value) {
            addCriterion("aiConfigId <=", value, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdIn(List<Integer> values) {
            addCriterion("aiConfigId in", values, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdNotIn(List<Integer> values) {
            addCriterion("aiConfigId not in", values, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdBetween(Integer value1, Integer value2) {
            addCriterion("aiConfigId between", value1, value2, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andAiConfigIdNotBetween(Integer value1, Integer value2) {
            addCriterion("aiConfigId not between", value1, value2, "aiConfigId");
            return (Criteria) this;
        }

        public Criteria andPropidIsNull() {
            addCriterion("propid is null");
            return (Criteria) this;
        }

        public Criteria andPropidIsNotNull() {
            addCriterion("propid is not null");
            return (Criteria) this;
        }

        public Criteria andPropidEqualTo(Integer value) {
            addCriterion("propid =", value, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidNotEqualTo(Integer value) {
            addCriterion("propid <>", value, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidGreaterThan(Integer value) {
            addCriterion("propid >", value, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidGreaterThanOrEqualTo(Integer value) {
            addCriterion("propid >=", value, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidLessThan(Integer value) {
            addCriterion("propid <", value, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidLessThanOrEqualTo(Integer value) {
            addCriterion("propid <=", value, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidIn(List<Integer> values) {
            addCriterion("propid in", values, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidNotIn(List<Integer> values) {
            addCriterion("propid not in", values, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidBetween(Integer value1, Integer value2) {
            addCriterion("propid between", value1, value2, "propid");
            return (Criteria) this;
        }

        public Criteria andPropidNotBetween(Integer value1, Integer value2) {
            addCriterion("propid not between", value1, value2, "propid");
            return (Criteria) this;
        }

        public Criteria andFlagidIsNull() {
            addCriterion("flagid is null");
            return (Criteria) this;
        }

        public Criteria andFlagidIsNotNull() {
            addCriterion("flagid is not null");
            return (Criteria) this;
        }

        public Criteria andFlagidEqualTo(Integer value) {
            addCriterion("flagid =", value, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidNotEqualTo(Integer value) {
            addCriterion("flagid <>", value, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidGreaterThan(Integer value) {
            addCriterion("flagid >", value, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidGreaterThanOrEqualTo(Integer value) {
            addCriterion("flagid >=", value, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidLessThan(Integer value) {
            addCriterion("flagid <", value, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidLessThanOrEqualTo(Integer value) {
            addCriterion("flagid <=", value, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidIn(List<Integer> values) {
            addCriterion("flagid in", values, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidNotIn(List<Integer> values) {
            addCriterion("flagid not in", values, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidBetween(Integer value1, Integer value2) {
            addCriterion("flagid between", value1, value2, "flagid");
            return (Criteria) this;
        }

        public Criteria andFlagidNotBetween(Integer value1, Integer value2) {
            addCriterion("flagid not between", value1, value2, "flagid");
            return (Criteria) this;
        }

        public Criteria andDropidIsNull() {
            addCriterion("dropid is null");
            return (Criteria) this;
        }

        public Criteria andDropidIsNotNull() {
            addCriterion("dropid is not null");
            return (Criteria) this;
        }

        public Criteria andDropidEqualTo(Integer value) {
            addCriterion("dropid =", value, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidNotEqualTo(Integer value) {
            addCriterion("dropid <>", value, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidGreaterThan(Integer value) {
            addCriterion("dropid >", value, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dropid >=", value, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidLessThan(Integer value) {
            addCriterion("dropid <", value, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidLessThanOrEqualTo(Integer value) {
            addCriterion("dropid <=", value, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidIn(List<Integer> values) {
            addCriterion("dropid in", values, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidNotIn(List<Integer> values) {
            addCriterion("dropid not in", values, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidBetween(Integer value1, Integer value2) {
            addCriterion("dropid between", value1, value2, "dropid");
            return (Criteria) this;
        }

        public Criteria andDropidNotBetween(Integer value1, Integer value2) {
            addCriterion("dropid not between", value1, value2, "dropid");
            return (Criteria) this;
        }

        public Criteria andExpIsNull() {
            addCriterion("exp is null");
            return (Criteria) this;
        }

        public Criteria andExpIsNotNull() {
            addCriterion("exp is not null");
            return (Criteria) this;
        }

        public Criteria andExpEqualTo(Integer value) {
            addCriterion("exp =", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotEqualTo(Integer value) {
            addCriterion("exp <>", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThan(Integer value) {
            addCriterion("exp >", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp >=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThan(Integer value) {
            addCriterion("exp <", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpLessThanOrEqualTo(Integer value) {
            addCriterion("exp <=", value, "exp");
            return (Criteria) this;
        }

        public Criteria andExpIn(List<Integer> values) {
            addCriterion("exp in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotIn(List<Integer> values) {
            addCriterion("exp not in", values, "exp");
            return (Criteria) this;
        }

        public Criteria andExpBetween(Integer value1, Integer value2) {
            addCriterion("exp between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andExpNotBetween(Integer value1, Integer value2) {
            addCriterion("exp not between", value1, value2, "exp");
            return (Criteria) this;
        }

        public Criteria andInnerExpIsNull() {
            addCriterion("InnerExp is null");
            return (Criteria) this;
        }

        public Criteria andInnerExpIsNotNull() {
            addCriterion("InnerExp is not null");
            return (Criteria) this;
        }

        public Criteria andInnerExpEqualTo(Integer value) {
            addCriterion("InnerExp =", value, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpNotEqualTo(Integer value) {
            addCriterion("InnerExp <>", value, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpGreaterThan(Integer value) {
            addCriterion("InnerExp >", value, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpGreaterThanOrEqualTo(Integer value) {
            addCriterion("InnerExp >=", value, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpLessThan(Integer value) {
            addCriterion("InnerExp <", value, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpLessThanOrEqualTo(Integer value) {
            addCriterion("InnerExp <=", value, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpIn(List<Integer> values) {
            addCriterion("InnerExp in", values, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpNotIn(List<Integer> values) {
            addCriterion("InnerExp not in", values, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpBetween(Integer value1, Integer value2) {
            addCriterion("InnerExp between", value1, value2, "innerExp");
            return (Criteria) this;
        }

        public Criteria andInnerExpNotBetween(Integer value1, Integer value2) {
            addCriterion("InnerExp not between", value1, value2, "innerExp");
            return (Criteria) this;
        }

        public Criteria andAttackLevelIsNull() {
            addCriterion("attackLevel is null");
            return (Criteria) this;
        }

        public Criteria andAttackLevelIsNotNull() {
            addCriterion("attackLevel is not null");
            return (Criteria) this;
        }

        public Criteria andAttackLevelEqualTo(Integer value) {
            addCriterion("attackLevel =", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelNotEqualTo(Integer value) {
            addCriterion("attackLevel <>", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelGreaterThan(Integer value) {
            addCriterion("attackLevel >", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("attackLevel >=", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelLessThan(Integer value) {
            addCriterion("attackLevel <", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelLessThanOrEqualTo(Integer value) {
            addCriterion("attackLevel <=", value, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelIn(List<Integer> values) {
            addCriterion("attackLevel in", values, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelNotIn(List<Integer> values) {
            addCriterion("attackLevel not in", values, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelBetween(Integer value1, Integer value2) {
            addCriterion("attackLevel between", value1, value2, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("attackLevel not between", value1, value2, "attackLevel");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalIsNull() {
            addCriterion("attackInterval is null");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalIsNotNull() {
            addCriterion("attackInterval is not null");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalEqualTo(Integer value) {
            addCriterion("attackInterval =", value, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalNotEqualTo(Integer value) {
            addCriterion("attackInterval <>", value, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalGreaterThan(Integer value) {
            addCriterion("attackInterval >", value, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("attackInterval >=", value, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalLessThan(Integer value) {
            addCriterion("attackInterval <", value, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("attackInterval <=", value, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalIn(List<Integer> values) {
            addCriterion("attackInterval in", values, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalNotIn(List<Integer> values) {
            addCriterion("attackInterval not in", values, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalBetween(Integer value1, Integer value2) {
            addCriterion("attackInterval between", value1, value2, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andAttackIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("attackInterval not between", value1, value2, "attackInterval");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpIsNull() {
            addCriterion("maxDropHp is null");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpIsNotNull() {
            addCriterion("maxDropHp is not null");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpEqualTo(Integer value) {
            addCriterion("maxDropHp =", value, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpNotEqualTo(Integer value) {
            addCriterion("maxDropHp <>", value, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpGreaterThan(Integer value) {
            addCriterion("maxDropHp >", value, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxDropHp >=", value, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpLessThan(Integer value) {
            addCriterion("maxDropHp <", value, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpLessThanOrEqualTo(Integer value) {
            addCriterion("maxDropHp <=", value, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpIn(List<Integer> values) {
            addCriterion("maxDropHp in", values, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpNotIn(List<Integer> values) {
            addCriterion("maxDropHp not in", values, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpBetween(Integer value1, Integer value2) {
            addCriterion("maxDropHp between", value1, value2, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andMaxDropHpNotBetween(Integer value1, Integer value2) {
            addCriterion("maxDropHp not between", value1, value2, "maxDropHp");
            return (Criteria) this;
        }

        public Criteria andDamageSkillIsNull() {
            addCriterion("damageSkill is null");
            return (Criteria) this;
        }

        public Criteria andDamageSkillIsNotNull() {
            addCriterion("damageSkill is not null");
            return (Criteria) this;
        }

        public Criteria andDamageSkillEqualTo(Integer value) {
            addCriterion("damageSkill =", value, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillNotEqualTo(Integer value) {
            addCriterion("damageSkill <>", value, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillGreaterThan(Integer value) {
            addCriterion("damageSkill >", value, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillGreaterThanOrEqualTo(Integer value) {
            addCriterion("damageSkill >=", value, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillLessThan(Integer value) {
            addCriterion("damageSkill <", value, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillLessThanOrEqualTo(Integer value) {
            addCriterion("damageSkill <=", value, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillIn(List<Integer> values) {
            addCriterion("damageSkill in", values, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillNotIn(List<Integer> values) {
            addCriterion("damageSkill not in", values, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillBetween(Integer value1, Integer value2) {
            addCriterion("damageSkill between", value1, value2, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andDamageSkillNotBetween(Integer value1, Integer value2) {
            addCriterion("damageSkill not between", value1, value2, "damageSkill");
            return (Criteria) this;
        }

        public Criteria andWeaponidIsNull() {
            addCriterion("weaponid is null");
            return (Criteria) this;
        }

        public Criteria andWeaponidIsNotNull() {
            addCriterion("weaponid is not null");
            return (Criteria) this;
        }

        public Criteria andWeaponidEqualTo(Integer value) {
            addCriterion("weaponid =", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidNotEqualTo(Integer value) {
            addCriterion("weaponid <>", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidGreaterThan(Integer value) {
            addCriterion("weaponid >", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidGreaterThanOrEqualTo(Integer value) {
            addCriterion("weaponid >=", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidLessThan(Integer value) {
            addCriterion("weaponid <", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidLessThanOrEqualTo(Integer value) {
            addCriterion("weaponid <=", value, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidIn(List<Integer> values) {
            addCriterion("weaponid in", values, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidNotIn(List<Integer> values) {
            addCriterion("weaponid not in", values, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidBetween(Integer value1, Integer value2) {
            addCriterion("weaponid between", value1, value2, "weaponid");
            return (Criteria) this;
        }

        public Criteria andWeaponidNotBetween(Integer value1, Integer value2) {
            addCriterion("weaponid not between", value1, value2, "weaponid");
            return (Criteria) this;
        }

        public Criteria andSwingidIsNull() {
            addCriterion("swingid is null");
            return (Criteria) this;
        }

        public Criteria andSwingidIsNotNull() {
            addCriterion("swingid is not null");
            return (Criteria) this;
        }

        public Criteria andSwingidEqualTo(Integer value) {
            addCriterion("swingid =", value, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidNotEqualTo(Integer value) {
            addCriterion("swingid <>", value, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidGreaterThan(Integer value) {
            addCriterion("swingid >", value, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidGreaterThanOrEqualTo(Integer value) {
            addCriterion("swingid >=", value, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidLessThan(Integer value) {
            addCriterion("swingid <", value, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidLessThanOrEqualTo(Integer value) {
            addCriterion("swingid <=", value, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidIn(List<Integer> values) {
            addCriterion("swingid in", values, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidNotIn(List<Integer> values) {
            addCriterion("swingid not in", values, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidBetween(Integer value1, Integer value2) {
            addCriterion("swingid between", value1, value2, "swingid");
            return (Criteria) this;
        }

        public Criteria andSwingidNotBetween(Integer value1, Integer value2) {
            addCriterion("swingid not between", value1, value2, "swingid");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNull() {
            addCriterion("skills is null");
            return (Criteria) this;
        }

        public Criteria andSkillsIsNotNull() {
            addCriterion("skills is not null");
            return (Criteria) this;
        }

        public Criteria andSkillsEqualTo(String value) {
            addCriterion("skills =", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotEqualTo(String value) {
            addCriterion("skills <>", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThan(String value) {
            addCriterion("skills >", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("skills >=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThan(String value) {
            addCriterion("skills <", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLessThanOrEqualTo(String value) {
            addCriterion("skills <=", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsLike(String value) {
            addCriterion("skills like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotLike(String value) {
            addCriterion("skills not like", value, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsIn(List<String> values) {
            addCriterion("skills in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotIn(List<String> values) {
            addCriterion("skills not in", values, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsBetween(String value1, String value2) {
            addCriterion("skills between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andSkillsNotBetween(String value1, String value2) {
            addCriterion("skills not between", value1, value2, "skills");
            return (Criteria) this;
        }

        public Criteria andModelidIsNull() {
            addCriterion("modelid is null");
            return (Criteria) this;
        }

        public Criteria andModelidIsNotNull() {
            addCriterion("modelid is not null");
            return (Criteria) this;
        }

        public Criteria andModelidEqualTo(Integer value) {
            addCriterion("modelid =", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotEqualTo(Integer value) {
            addCriterion("modelid <>", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThan(Integer value) {
            addCriterion("modelid >", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidGreaterThanOrEqualTo(Integer value) {
            addCriterion("modelid >=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThan(Integer value) {
            addCriterion("modelid <", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidLessThanOrEqualTo(Integer value) {
            addCriterion("modelid <=", value, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidIn(List<Integer> values) {
            addCriterion("modelid in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotIn(List<Integer> values) {
            addCriterion("modelid not in", values, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidBetween(Integer value1, Integer value2) {
            addCriterion("modelid between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andModelidNotBetween(Integer value1, Integer value2) {
            addCriterion("modelid not between", value1, value2, "modelid");
            return (Criteria) this;
        }

        public Criteria andDirIsNull() {
            addCriterion("dir is null");
            return (Criteria) this;
        }

        public Criteria andDirIsNotNull() {
            addCriterion("dir is not null");
            return (Criteria) this;
        }

        public Criteria andDirEqualTo(Integer value) {
            addCriterion("dir =", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotEqualTo(Integer value) {
            addCriterion("dir <>", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirGreaterThan(Integer value) {
            addCriterion("dir >", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirGreaterThanOrEqualTo(Integer value) {
            addCriterion("dir >=", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLessThan(Integer value) {
            addCriterion("dir <", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLessThanOrEqualTo(Integer value) {
            addCriterion("dir <=", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirIn(List<Integer> values) {
            addCriterion("dir in", values, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotIn(List<Integer> values) {
            addCriterion("dir not in", values, "dir");
            return (Criteria) this;
        }

        public Criteria andDirBetween(Integer value1, Integer value2) {
            addCriterion("dir between", value1, value2, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotBetween(Integer value1, Integer value2) {
            addCriterion("dir not between", value1, value2, "dir");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdIsNull() {
            addCriterion("attackMusicId is null");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdIsNotNull() {
            addCriterion("attackMusicId is not null");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdEqualTo(String value) {
            addCriterion("attackMusicId =", value, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdNotEqualTo(String value) {
            addCriterion("attackMusicId <>", value, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdGreaterThan(String value) {
            addCriterion("attackMusicId >", value, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdGreaterThanOrEqualTo(String value) {
            addCriterion("attackMusicId >=", value, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdLessThan(String value) {
            addCriterion("attackMusicId <", value, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdLessThanOrEqualTo(String value) {
            addCriterion("attackMusicId <=", value, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdLike(String value) {
            addCriterion("attackMusicId like", value, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdNotLike(String value) {
            addCriterion("attackMusicId not like", value, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdIn(List<String> values) {
            addCriterion("attackMusicId in", values, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdNotIn(List<String> values) {
            addCriterion("attackMusicId not in", values, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdBetween(String value1, String value2) {
            addCriterion("attackMusicId between", value1, value2, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicIdNotBetween(String value1, String value2) {
            addCriterion("attackMusicId not between", value1, value2, "attackMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdIsNull() {
            addCriterion("dieMusicId is null");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdIsNotNull() {
            addCriterion("dieMusicId is not null");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdEqualTo(String value) {
            addCriterion("dieMusicId =", value, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdNotEqualTo(String value) {
            addCriterion("dieMusicId <>", value, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdGreaterThan(String value) {
            addCriterion("dieMusicId >", value, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdGreaterThanOrEqualTo(String value) {
            addCriterion("dieMusicId >=", value, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdLessThan(String value) {
            addCriterion("dieMusicId <", value, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdLessThanOrEqualTo(String value) {
            addCriterion("dieMusicId <=", value, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdLike(String value) {
            addCriterion("dieMusicId like", value, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdNotLike(String value) {
            addCriterion("dieMusicId not like", value, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdIn(List<String> values) {
            addCriterion("dieMusicId in", values, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdNotIn(List<String> values) {
            addCriterion("dieMusicId not in", values, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdBetween(String value1, String value2) {
            addCriterion("dieMusicId between", value1, value2, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andDieMusicIdNotBetween(String value1, String value2) {
            addCriterion("dieMusicId not between", value1, value2, "dieMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdIsNull() {
            addCriterion("targetMusicId is null");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdIsNotNull() {
            addCriterion("targetMusicId is not null");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdEqualTo(String value) {
            addCriterion("targetMusicId =", value, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdNotEqualTo(String value) {
            addCriterion("targetMusicId <>", value, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdGreaterThan(String value) {
            addCriterion("targetMusicId >", value, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdGreaterThanOrEqualTo(String value) {
            addCriterion("targetMusicId >=", value, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdLessThan(String value) {
            addCriterion("targetMusicId <", value, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdLessThanOrEqualTo(String value) {
            addCriterion("targetMusicId <=", value, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdLike(String value) {
            addCriterion("targetMusicId like", value, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdNotLike(String value) {
            addCriterion("targetMusicId not like", value, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdIn(List<String> values) {
            addCriterion("targetMusicId in", values, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdNotIn(List<String> values) {
            addCriterion("targetMusicId not in", values, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdBetween(String value1, String value2) {
            addCriterion("targetMusicId between", value1, value2, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andTargetMusicIdNotBetween(String value1, String value2) {
            addCriterion("targetMusicId not between", value1, value2, "targetMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdIsNull() {
            addCriterion("damageMusicId is null");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdIsNotNull() {
            addCriterion("damageMusicId is not null");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdEqualTo(String value) {
            addCriterion("damageMusicId =", value, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdNotEqualTo(String value) {
            addCriterion("damageMusicId <>", value, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdGreaterThan(String value) {
            addCriterion("damageMusicId >", value, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdGreaterThanOrEqualTo(String value) {
            addCriterion("damageMusicId >=", value, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdLessThan(String value) {
            addCriterion("damageMusicId <", value, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdLessThanOrEqualTo(String value) {
            addCriterion("damageMusicId <=", value, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdLike(String value) {
            addCriterion("damageMusicId like", value, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdNotLike(String value) {
            addCriterion("damageMusicId not like", value, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdIn(List<String> values) {
            addCriterion("damageMusicId in", values, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdNotIn(List<String> values) {
            addCriterion("damageMusicId not in", values, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdBetween(String value1, String value2) {
            addCriterion("damageMusicId between", value1, value2, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andDamageMusicIdNotBetween(String value1, String value2) {
            addCriterion("damageMusicId not between", value1, value2, "damageMusicId");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateIsNull() {
            addCriterion("attackMusicRate is null");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateIsNotNull() {
            addCriterion("attackMusicRate is not null");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateEqualTo(String value) {
            addCriterion("attackMusicRate =", value, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateNotEqualTo(String value) {
            addCriterion("attackMusicRate <>", value, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateGreaterThan(String value) {
            addCriterion("attackMusicRate >", value, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateGreaterThanOrEqualTo(String value) {
            addCriterion("attackMusicRate >=", value, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateLessThan(String value) {
            addCriterion("attackMusicRate <", value, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateLessThanOrEqualTo(String value) {
            addCriterion("attackMusicRate <=", value, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateLike(String value) {
            addCriterion("attackMusicRate like", value, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateNotLike(String value) {
            addCriterion("attackMusicRate not like", value, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateIn(List<String> values) {
            addCriterion("attackMusicRate in", values, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateNotIn(List<String> values) {
            addCriterion("attackMusicRate not in", values, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateBetween(String value1, String value2) {
            addCriterion("attackMusicRate between", value1, value2, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andAttackMusicRateNotBetween(String value1, String value2) {
            addCriterion("attackMusicRate not between", value1, value2, "attackMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateIsNull() {
            addCriterion("dieMusicRate is null");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateIsNotNull() {
            addCriterion("dieMusicRate is not null");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateEqualTo(String value) {
            addCriterion("dieMusicRate =", value, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateNotEqualTo(String value) {
            addCriterion("dieMusicRate <>", value, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateGreaterThan(String value) {
            addCriterion("dieMusicRate >", value, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateGreaterThanOrEqualTo(String value) {
            addCriterion("dieMusicRate >=", value, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateLessThan(String value) {
            addCriterion("dieMusicRate <", value, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateLessThanOrEqualTo(String value) {
            addCriterion("dieMusicRate <=", value, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateLike(String value) {
            addCriterion("dieMusicRate like", value, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateNotLike(String value) {
            addCriterion("dieMusicRate not like", value, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateIn(List<String> values) {
            addCriterion("dieMusicRate in", values, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateNotIn(List<String> values) {
            addCriterion("dieMusicRate not in", values, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateBetween(String value1, String value2) {
            addCriterion("dieMusicRate between", value1, value2, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andDieMusicRateNotBetween(String value1, String value2) {
            addCriterion("dieMusicRate not between", value1, value2, "dieMusicRate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateIsNull() {
            addCriterion("targetMusicTate is null");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateIsNotNull() {
            addCriterion("targetMusicTate is not null");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateEqualTo(String value) {
            addCriterion("targetMusicTate =", value, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateNotEqualTo(String value) {
            addCriterion("targetMusicTate <>", value, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateGreaterThan(String value) {
            addCriterion("targetMusicTate >", value, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateGreaterThanOrEqualTo(String value) {
            addCriterion("targetMusicTate >=", value, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateLessThan(String value) {
            addCriterion("targetMusicTate <", value, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateLessThanOrEqualTo(String value) {
            addCriterion("targetMusicTate <=", value, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateLike(String value) {
            addCriterion("targetMusicTate like", value, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateNotLike(String value) {
            addCriterion("targetMusicTate not like", value, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateIn(List<String> values) {
            addCriterion("targetMusicTate in", values, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateNotIn(List<String> values) {
            addCriterion("targetMusicTate not in", values, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateBetween(String value1, String value2) {
            addCriterion("targetMusicTate between", value1, value2, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andTargetMusicTateNotBetween(String value1, String value2) {
            addCriterion("targetMusicTate not between", value1, value2, "targetMusicTate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateIsNull() {
            addCriterion("damageMusicRate is null");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateIsNotNull() {
            addCriterion("damageMusicRate is not null");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateEqualTo(String value) {
            addCriterion("damageMusicRate =", value, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateNotEqualTo(String value) {
            addCriterion("damageMusicRate <>", value, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateGreaterThan(String value) {
            addCriterion("damageMusicRate >", value, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateGreaterThanOrEqualTo(String value) {
            addCriterion("damageMusicRate >=", value, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateLessThan(String value) {
            addCriterion("damageMusicRate <", value, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateLessThanOrEqualTo(String value) {
            addCriterion("damageMusicRate <=", value, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateLike(String value) {
            addCriterion("damageMusicRate like", value, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateNotLike(String value) {
            addCriterion("damageMusicRate not like", value, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateIn(List<String> values) {
            addCriterion("damageMusicRate in", values, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateNotIn(List<String> values) {
            addCriterion("damageMusicRate not in", values, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateBetween(String value1, String value2) {
            addCriterion("damageMusicRate between", value1, value2, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDamageMusicRateNotBetween(String value1, String value2) {
            addCriterion("damageMusicRate not between", value1, value2, "damageMusicRate");
            return (Criteria) this;
        }

        public Criteria andDeatheffIsNull() {
            addCriterion("deatheff is null");
            return (Criteria) this;
        }

        public Criteria andDeatheffIsNotNull() {
            addCriterion("deatheff is not null");
            return (Criteria) this;
        }

        public Criteria andDeatheffEqualTo(String value) {
            addCriterion("deatheff =", value, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffNotEqualTo(String value) {
            addCriterion("deatheff <>", value, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffGreaterThan(String value) {
            addCriterion("deatheff >", value, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffGreaterThanOrEqualTo(String value) {
            addCriterion("deatheff >=", value, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffLessThan(String value) {
            addCriterion("deatheff <", value, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffLessThanOrEqualTo(String value) {
            addCriterion("deatheff <=", value, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffLike(String value) {
            addCriterion("deatheff like", value, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffNotLike(String value) {
            addCriterion("deatheff not like", value, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffIn(List<String> values) {
            addCriterion("deatheff in", values, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffNotIn(List<String> values) {
            addCriterion("deatheff not in", values, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffBetween(String value1, String value2) {
            addCriterion("deatheff between", value1, value2, "deatheff");
            return (Criteria) this;
        }

        public Criteria andDeatheffNotBetween(String value1, String value2) {
            addCriterion("deatheff not between", value1, value2, "deatheff");
            return (Criteria) this;
        }

        public Criteria andChassisIsNull() {
            addCriterion("chassis is null");
            return (Criteria) this;
        }

        public Criteria andChassisIsNotNull() {
            addCriterion("chassis is not null");
            return (Criteria) this;
        }

        public Criteria andChassisEqualTo(Integer value) {
            addCriterion("chassis =", value, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisNotEqualTo(Integer value) {
            addCriterion("chassis <>", value, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisGreaterThan(Integer value) {
            addCriterion("chassis >", value, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisGreaterThanOrEqualTo(Integer value) {
            addCriterion("chassis >=", value, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisLessThan(Integer value) {
            addCriterion("chassis <", value, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisLessThanOrEqualTo(Integer value) {
            addCriterion("chassis <=", value, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisIn(List<Integer> values) {
            addCriterion("chassis in", values, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisNotIn(List<Integer> values) {
            addCriterion("chassis not in", values, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisBetween(Integer value1, Integer value2) {
            addCriterion("chassis between", value1, value2, "chassis");
            return (Criteria) this;
        }

        public Criteria andChassisNotBetween(Integer value1, Integer value2) {
            addCriterion("chassis not between", value1, value2, "chassis");
            return (Criteria) this;
        }

        public Criteria andShadowIsNull() {
            addCriterion("shadow is null");
            return (Criteria) this;
        }

        public Criteria andShadowIsNotNull() {
            addCriterion("shadow is not null");
            return (Criteria) this;
        }

        public Criteria andShadowEqualTo(Integer value) {
            addCriterion("shadow =", value, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowNotEqualTo(Integer value) {
            addCriterion("shadow <>", value, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowGreaterThan(Integer value) {
            addCriterion("shadow >", value, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowGreaterThanOrEqualTo(Integer value) {
            addCriterion("shadow >=", value, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowLessThan(Integer value) {
            addCriterion("shadow <", value, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowLessThanOrEqualTo(Integer value) {
            addCriterion("shadow <=", value, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowIn(List<Integer> values) {
            addCriterion("shadow in", values, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowNotIn(List<Integer> values) {
            addCriterion("shadow not in", values, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowBetween(Integer value1, Integer value2) {
            addCriterion("shadow between", value1, value2, "shadow");
            return (Criteria) this;
        }

        public Criteria andShadowNotBetween(Integer value1, Integer value2) {
            addCriterion("shadow not between", value1, value2, "shadow");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("scale is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("scale is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(Integer value) {
            addCriterion("scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(Integer value) {
            addCriterion("scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(Integer value) {
            addCriterion("scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(Integer value) {
            addCriterion("scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(Integer value) {
            addCriterion("scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(Integer value) {
            addCriterion("scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<Integer> values) {
            addCriterion("scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<Integer> values) {
            addCriterion("scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(Integer value1, Integer value2) {
            addCriterion("scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(Integer value1, Integer value2) {
            addCriterion("scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andHpLabXYIsNull() {
            addCriterion("hpLabXY is null");
            return (Criteria) this;
        }

        public Criteria andHpLabXYIsNotNull() {
            addCriterion("hpLabXY is not null");
            return (Criteria) this;
        }

        public Criteria andHpLabXYEqualTo(Integer value) {
            addCriterion("hpLabXY =", value, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYNotEqualTo(Integer value) {
            addCriterion("hpLabXY <>", value, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYGreaterThan(Integer value) {
            addCriterion("hpLabXY >", value, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYGreaterThanOrEqualTo(Integer value) {
            addCriterion("hpLabXY >=", value, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYLessThan(Integer value) {
            addCriterion("hpLabXY <", value, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYLessThanOrEqualTo(Integer value) {
            addCriterion("hpLabXY <=", value, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYIn(List<Integer> values) {
            addCriterion("hpLabXY in", values, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYNotIn(List<Integer> values) {
            addCriterion("hpLabXY not in", values, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYBetween(Integer value1, Integer value2) {
            addCriterion("hpLabXY between", value1, value2, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andHpLabXYNotBetween(Integer value1, Integer value2) {
            addCriterion("hpLabXY not between", value1, value2, "hpLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYIsNull() {
            addCriterion("nameLabXY is null");
            return (Criteria) this;
        }

        public Criteria andNameLabXYIsNotNull() {
            addCriterion("nameLabXY is not null");
            return (Criteria) this;
        }

        public Criteria andNameLabXYEqualTo(Integer value) {
            addCriterion("nameLabXY =", value, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYNotEqualTo(Integer value) {
            addCriterion("nameLabXY <>", value, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYGreaterThan(Integer value) {
            addCriterion("nameLabXY >", value, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYGreaterThanOrEqualTo(Integer value) {
            addCriterion("nameLabXY >=", value, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYLessThan(Integer value) {
            addCriterion("nameLabXY <", value, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYLessThanOrEqualTo(Integer value) {
            addCriterion("nameLabXY <=", value, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYIn(List<Integer> values) {
            addCriterion("nameLabXY in", values, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYNotIn(List<Integer> values) {
            addCriterion("nameLabXY not in", values, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYBetween(Integer value1, Integer value2) {
            addCriterion("nameLabXY between", value1, value2, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andNameLabXYNotBetween(Integer value1, Integer value2) {
            addCriterion("nameLabXY not between", value1, value2, "nameLabXY");
            return (Criteria) this;
        }

        public Criteria andIsAIAckIsNull() {
            addCriterion("isAIAck is null");
            return (Criteria) this;
        }

        public Criteria andIsAIAckIsNotNull() {
            addCriterion("isAIAck is not null");
            return (Criteria) this;
        }

        public Criteria andIsAIAckEqualTo(Integer value) {
            addCriterion("isAIAck =", value, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckNotEqualTo(Integer value) {
            addCriterion("isAIAck <>", value, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckGreaterThan(Integer value) {
            addCriterion("isAIAck >", value, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckGreaterThanOrEqualTo(Integer value) {
            addCriterion("isAIAck >=", value, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckLessThan(Integer value) {
            addCriterion("isAIAck <", value, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckLessThanOrEqualTo(Integer value) {
            addCriterion("isAIAck <=", value, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckIn(List<Integer> values) {
            addCriterion("isAIAck in", values, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckNotIn(List<Integer> values) {
            addCriterion("isAIAck not in", values, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckBetween(Integer value1, Integer value2) {
            addCriterion("isAIAck between", value1, value2, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andIsAIAckNotBetween(Integer value1, Integer value2) {
            addCriterion("isAIAck not between", value1, value2, "isAIAck");
            return (Criteria) this;
        }

        public Criteria andNameQualityIsNull() {
            addCriterion("nameQuality is null");
            return (Criteria) this;
        }

        public Criteria andNameQualityIsNotNull() {
            addCriterion("nameQuality is not null");
            return (Criteria) this;
        }

        public Criteria andNameQualityEqualTo(Integer value) {
            addCriterion("nameQuality =", value, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityNotEqualTo(Integer value) {
            addCriterion("nameQuality <>", value, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityGreaterThan(Integer value) {
            addCriterion("nameQuality >", value, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("nameQuality >=", value, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityLessThan(Integer value) {
            addCriterion("nameQuality <", value, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityLessThanOrEqualTo(Integer value) {
            addCriterion("nameQuality <=", value, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityIn(List<Integer> values) {
            addCriterion("nameQuality in", values, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityNotIn(List<Integer> values) {
            addCriterion("nameQuality not in", values, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityBetween(Integer value1, Integer value2) {
            addCriterion("nameQuality between", value1, value2, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andNameQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("nameQuality not between", value1, value2, "nameQuality");
            return (Criteria) this;
        }

        public Criteria andMonLogIsNull() {
            addCriterion("monLog is null");
            return (Criteria) this;
        }

        public Criteria andMonLogIsNotNull() {
            addCriterion("monLog is not null");
            return (Criteria) this;
        }

        public Criteria andMonLogEqualTo(Integer value) {
            addCriterion("monLog =", value, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogNotEqualTo(Integer value) {
            addCriterion("monLog <>", value, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogGreaterThan(Integer value) {
            addCriterion("monLog >", value, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogGreaterThanOrEqualTo(Integer value) {
            addCriterion("monLog >=", value, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogLessThan(Integer value) {
            addCriterion("monLog <", value, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogLessThanOrEqualTo(Integer value) {
            addCriterion("monLog <=", value, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogIn(List<Integer> values) {
            addCriterion("monLog in", values, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogNotIn(List<Integer> values) {
            addCriterion("monLog not in", values, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogBetween(Integer value1, Integer value2) {
            addCriterion("monLog between", value1, value2, "monLog");
            return (Criteria) this;
        }

        public Criteria andMonLogNotBetween(Integer value1, Integer value2) {
            addCriterion("monLog not between", value1, value2, "monLog");
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