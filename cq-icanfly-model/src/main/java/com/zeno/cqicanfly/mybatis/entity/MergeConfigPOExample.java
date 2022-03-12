package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class MergeConfigPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MergeConfigPOExample() {
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

        public Criteria andFirstIndexIsNull() {
            addCriterion("firstIndex is null");
            return (Criteria) this;
        }

        public Criteria andFirstIndexIsNotNull() {
            addCriterion("firstIndex is not null");
            return (Criteria) this;
        }

        public Criteria andFirstIndexEqualTo(Integer value) {
            addCriterion("firstIndex =", value, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexNotEqualTo(Integer value) {
            addCriterion("firstIndex <>", value, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexGreaterThan(Integer value) {
            addCriterion("firstIndex >", value, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("firstIndex >=", value, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexLessThan(Integer value) {
            addCriterion("firstIndex <", value, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexLessThanOrEqualTo(Integer value) {
            addCriterion("firstIndex <=", value, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexIn(List<Integer> values) {
            addCriterion("firstIndex in", values, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexNotIn(List<Integer> values) {
            addCriterion("firstIndex not in", values, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexBetween(Integer value1, Integer value2) {
            addCriterion("firstIndex between", value1, value2, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andFirstIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("firstIndex not between", value1, value2, "firstIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexIsNull() {
            addCriterion("secondIndex is null");
            return (Criteria) this;
        }

        public Criteria andSecondIndexIsNotNull() {
            addCriterion("secondIndex is not null");
            return (Criteria) this;
        }

        public Criteria andSecondIndexEqualTo(Integer value) {
            addCriterion("secondIndex =", value, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexNotEqualTo(Integer value) {
            addCriterion("secondIndex <>", value, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexGreaterThan(Integer value) {
            addCriterion("secondIndex >", value, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("secondIndex >=", value, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexLessThan(Integer value) {
            addCriterion("secondIndex <", value, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexLessThanOrEqualTo(Integer value) {
            addCriterion("secondIndex <=", value, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexIn(List<Integer> values) {
            addCriterion("secondIndex in", values, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexNotIn(List<Integer> values) {
            addCriterion("secondIndex not in", values, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexBetween(Integer value1, Integer value2) {
            addCriterion("secondIndex between", value1, value2, "secondIndex");
            return (Criteria) this;
        }

        public Criteria andSecondIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("secondIndex not between", value1, value2, "secondIndex");
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

        public Criteria andLevelcondsIsNull() {
            addCriterion("levelconds is null");
            return (Criteria) this;
        }

        public Criteria andLevelcondsIsNotNull() {
            addCriterion("levelconds is not null");
            return (Criteria) this;
        }

        public Criteria andLevelcondsEqualTo(Integer value) {
            addCriterion("levelconds =", value, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsNotEqualTo(Integer value) {
            addCriterion("levelconds <>", value, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsGreaterThan(Integer value) {
            addCriterion("levelconds >", value, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("levelconds >=", value, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsLessThan(Integer value) {
            addCriterion("levelconds <", value, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsLessThanOrEqualTo(Integer value) {
            addCriterion("levelconds <=", value, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsIn(List<Integer> values) {
            addCriterion("levelconds in", values, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsNotIn(List<Integer> values) {
            addCriterion("levelconds not in", values, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsBetween(Integer value1, Integer value2) {
            addCriterion("levelconds between", value1, value2, "levelconds");
            return (Criteria) this;
        }

        public Criteria andLevelcondsNotBetween(Integer value1, Integer value2) {
            addCriterion("levelconds not between", value1, value2, "levelconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsIsNull() {
            addCriterion("rebornconds is null");
            return (Criteria) this;
        }

        public Criteria andReborncondsIsNotNull() {
            addCriterion("rebornconds is not null");
            return (Criteria) this;
        }

        public Criteria andReborncondsEqualTo(Integer value) {
            addCriterion("rebornconds =", value, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsNotEqualTo(Integer value) {
            addCriterion("rebornconds <>", value, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsGreaterThan(Integer value) {
            addCriterion("rebornconds >", value, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("rebornconds >=", value, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsLessThan(Integer value) {
            addCriterion("rebornconds <", value, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsLessThanOrEqualTo(Integer value) {
            addCriterion("rebornconds <=", value, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsIn(List<Integer> values) {
            addCriterion("rebornconds in", values, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsNotIn(List<Integer> values) {
            addCriterion("rebornconds not in", values, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsBetween(Integer value1, Integer value2) {
            addCriterion("rebornconds between", value1, value2, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andReborncondsNotBetween(Integer value1, Integer value2) {
            addCriterion("rebornconds not between", value1, value2, "rebornconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsIsNull() {
            addCriterion("dayconds is null");
            return (Criteria) this;
        }

        public Criteria andDaycondsIsNotNull() {
            addCriterion("dayconds is not null");
            return (Criteria) this;
        }

        public Criteria andDaycondsEqualTo(Integer value) {
            addCriterion("dayconds =", value, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsNotEqualTo(Integer value) {
            addCriterion("dayconds <>", value, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsGreaterThan(Integer value) {
            addCriterion("dayconds >", value, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsGreaterThanOrEqualTo(Integer value) {
            addCriterion("dayconds >=", value, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsLessThan(Integer value) {
            addCriterion("dayconds <", value, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsLessThanOrEqualTo(Integer value) {
            addCriterion("dayconds <=", value, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsIn(List<Integer> values) {
            addCriterion("dayconds in", values, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsNotIn(List<Integer> values) {
            addCriterion("dayconds not in", values, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsBetween(Integer value1, Integer value2) {
            addCriterion("dayconds between", value1, value2, "dayconds");
            return (Criteria) this;
        }

        public Criteria andDaycondsNotBetween(Integer value1, Integer value2) {
            addCriterion("dayconds not between", value1, value2, "dayconds");
            return (Criteria) this;
        }

        public Criteria andUitypeIsNull() {
            addCriterion("Uitype is null");
            return (Criteria) this;
        }

        public Criteria andUitypeIsNotNull() {
            addCriterion("Uitype is not null");
            return (Criteria) this;
        }

        public Criteria andUitypeEqualTo(Integer value) {
            addCriterion("Uitype =", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeNotEqualTo(Integer value) {
            addCriterion("Uitype <>", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeGreaterThan(Integer value) {
            addCriterion("Uitype >", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Uitype >=", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeLessThan(Integer value) {
            addCriterion("Uitype <", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeLessThanOrEqualTo(Integer value) {
            addCriterion("Uitype <=", value, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeIn(List<Integer> values) {
            addCriterion("Uitype in", values, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeNotIn(List<Integer> values) {
            addCriterion("Uitype not in", values, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeBetween(Integer value1, Integer value2) {
            addCriterion("Uitype between", value1, value2, "uitype");
            return (Criteria) this;
        }

        public Criteria andUitypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Uitype not between", value1, value2, "uitype");
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