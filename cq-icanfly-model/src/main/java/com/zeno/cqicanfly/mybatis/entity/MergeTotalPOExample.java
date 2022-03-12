package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class MergeTotalPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MergeTotalPOExample() {
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

        public Criteria andOpenLvIsNull() {
            addCriterion("openLv is null");
            return (Criteria) this;
        }

        public Criteria andOpenLvIsNotNull() {
            addCriterion("openLv is not null");
            return (Criteria) this;
        }

        public Criteria andOpenLvEqualTo(Integer value) {
            addCriterion("openLv =", value, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvNotEqualTo(Integer value) {
            addCriterion("openLv <>", value, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvGreaterThan(Integer value) {
            addCriterion("openLv >", value, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvGreaterThanOrEqualTo(Integer value) {
            addCriterion("openLv >=", value, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvLessThan(Integer value) {
            addCriterion("openLv <", value, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvLessThanOrEqualTo(Integer value) {
            addCriterion("openLv <=", value, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvIn(List<Integer> values) {
            addCriterion("openLv in", values, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvNotIn(List<Integer> values) {
            addCriterion("openLv not in", values, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvBetween(Integer value1, Integer value2) {
            addCriterion("openLv between", value1, value2, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenLvNotBetween(Integer value1, Integer value2) {
            addCriterion("openLv not between", value1, value2, "openLv");
            return (Criteria) this;
        }

        public Criteria andOpenZsIsNull() {
            addCriterion("openZs is null");
            return (Criteria) this;
        }

        public Criteria andOpenZsIsNotNull() {
            addCriterion("openZs is not null");
            return (Criteria) this;
        }

        public Criteria andOpenZsEqualTo(Integer value) {
            addCriterion("openZs =", value, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsNotEqualTo(Integer value) {
            addCriterion("openZs <>", value, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsGreaterThan(Integer value) {
            addCriterion("openZs >", value, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsGreaterThanOrEqualTo(Integer value) {
            addCriterion("openZs >=", value, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsLessThan(Integer value) {
            addCriterion("openZs <", value, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsLessThanOrEqualTo(Integer value) {
            addCriterion("openZs <=", value, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsIn(List<Integer> values) {
            addCriterion("openZs in", values, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsNotIn(List<Integer> values) {
            addCriterion("openZs not in", values, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsBetween(Integer value1, Integer value2) {
            addCriterion("openZs between", value1, value2, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenZsNotBetween(Integer value1, Integer value2) {
            addCriterion("openZs not between", value1, value2, "openZs");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayIsNull() {
            addCriterion("openserverDay is null");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayIsNotNull() {
            addCriterion("openserverDay is not null");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayEqualTo(Integer value) {
            addCriterion("openserverDay =", value, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayNotEqualTo(Integer value) {
            addCriterion("openserverDay <>", value, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayGreaterThan(Integer value) {
            addCriterion("openserverDay >", value, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("openserverDay >=", value, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayLessThan(Integer value) {
            addCriterion("openserverDay <", value, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayLessThanOrEqualTo(Integer value) {
            addCriterion("openserverDay <=", value, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayIn(List<Integer> values) {
            addCriterion("openserverDay in", values, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayNotIn(List<Integer> values) {
            addCriterion("openserverDay not in", values, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayBetween(Integer value1, Integer value2) {
            addCriterion("openserverDay between", value1, value2, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andOpenserverDayNotBetween(Integer value1, Integer value2) {
            addCriterion("openserverDay not between", value1, value2, "openserverDay");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceIsNull() {
            addCriterion("btn_source is null");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceIsNotNull() {
            addCriterion("btn_source is not null");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceEqualTo(String value) {
            addCriterion("btn_source =", value, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceNotEqualTo(String value) {
            addCriterion("btn_source <>", value, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceGreaterThan(String value) {
            addCriterion("btn_source >", value, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceGreaterThanOrEqualTo(String value) {
            addCriterion("btn_source >=", value, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceLessThan(String value) {
            addCriterion("btn_source <", value, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceLessThanOrEqualTo(String value) {
            addCriterion("btn_source <=", value, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceLike(String value) {
            addCriterion("btn_source like", value, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceNotLike(String value) {
            addCriterion("btn_source not like", value, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceIn(List<String> values) {
            addCriterion("btn_source in", values, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceNotIn(List<String> values) {
            addCriterion("btn_source not in", values, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceBetween(String value1, String value2) {
            addCriterion("btn_source between", value1, value2, "btn_source");
            return (Criteria) this;
        }

        public Criteria andBtn_sourceNotBetween(String value1, String value2) {
            addCriterion("btn_source not between", value1, value2, "btn_source");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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