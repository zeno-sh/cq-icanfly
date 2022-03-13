package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileEditPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileEditPOExample() {
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

        public Criteria andFile_idIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFile_idIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFile_idEqualTo(Integer value) {
            addCriterion("file_id =", value, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idNotEqualTo(Integer value) {
            addCriterion("file_id <>", value, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idGreaterThan(Integer value) {
            addCriterion("file_id >", value, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_id >=", value, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idLessThan(Integer value) {
            addCriterion("file_id <", value, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idLessThanOrEqualTo(Integer value) {
            addCriterion("file_id <=", value, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idIn(List<Integer> values) {
            addCriterion("file_id in", values, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idNotIn(List<Integer> values) {
            addCriterion("file_id not in", values, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idBetween(Integer value1, Integer value2) {
            addCriterion("file_id between", value1, value2, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_idNotBetween(Integer value1, Integer value2) {
            addCriterion("file_id not between", value1, value2, "file_id");
            return (Criteria) this;
        }

        public Criteria andFile_configIsNull() {
            addCriterion("file_config is null");
            return (Criteria) this;
        }

        public Criteria andFile_configIsNotNull() {
            addCriterion("file_config is not null");
            return (Criteria) this;
        }

        public Criteria andFile_configEqualTo(String value) {
            addCriterion("file_config =", value, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configNotEqualTo(String value) {
            addCriterion("file_config <>", value, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configGreaterThan(String value) {
            addCriterion("file_config >", value, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configGreaterThanOrEqualTo(String value) {
            addCriterion("file_config >=", value, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configLessThan(String value) {
            addCriterion("file_config <", value, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configLessThanOrEqualTo(String value) {
            addCriterion("file_config <=", value, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configLike(String value) {
            addCriterion("file_config like", value, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configNotLike(String value) {
            addCriterion("file_config not like", value, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configIn(List<String> values) {
            addCriterion("file_config in", values, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configNotIn(List<String> values) {
            addCriterion("file_config not in", values, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configBetween(String value1, String value2) {
            addCriterion("file_config between", value1, value2, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_configNotBetween(String value1, String value2) {
            addCriterion("file_config not between", value1, value2, "file_config");
            return (Criteria) this;
        }

        public Criteria andFile_jsonIsNull() {
            addCriterion("file_json is null");
            return (Criteria) this;
        }

        public Criteria andFile_jsonIsNotNull() {
            addCriterion("file_json is not null");
            return (Criteria) this;
        }

        public Criteria andFile_jsonEqualTo(String value) {
            addCriterion("file_json =", value, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonNotEqualTo(String value) {
            addCriterion("file_json <>", value, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonGreaterThan(String value) {
            addCriterion("file_json >", value, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonGreaterThanOrEqualTo(String value) {
            addCriterion("file_json >=", value, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonLessThan(String value) {
            addCriterion("file_json <", value, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonLessThanOrEqualTo(String value) {
            addCriterion("file_json <=", value, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonLike(String value) {
            addCriterion("file_json like", value, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonNotLike(String value) {
            addCriterion("file_json not like", value, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonIn(List<String> values) {
            addCriterion("file_json in", values, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonNotIn(List<String> values) {
            addCriterion("file_json not in", values, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonBetween(String value1, String value2) {
            addCriterion("file_json between", value1, value2, "file_json");
            return (Criteria) this;
        }

        public Criteria andFile_jsonNotBetween(String value1, String value2) {
            addCriterion("file_json not between", value1, value2, "file_json");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andCreate_byIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreate_byIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_byEqualTo(String value) {
            addCriterion("create_by =", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotEqualTo(String value) {
            addCriterion("create_by <>", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byGreaterThan(String value) {
            addCriterion("create_by >", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLessThan(String value) {
            addCriterion("create_by <", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byLike(String value) {
            addCriterion("create_by like", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotLike(String value) {
            addCriterion("create_by not like", value, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byIn(List<String> values) {
            addCriterion("create_by in", values, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotIn(List<String> values) {
            addCriterion("create_by not in", values, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "create_by");
            return (Criteria) this;
        }

        public Criteria andCreate_byNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "create_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byIsNull() {
            addCriterion("udpate_by is null");
            return (Criteria) this;
        }

        public Criteria andUdpate_byIsNotNull() {
            addCriterion("udpate_by is not null");
            return (Criteria) this;
        }

        public Criteria andUdpate_byEqualTo(String value) {
            addCriterion("udpate_by =", value, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byNotEqualTo(String value) {
            addCriterion("udpate_by <>", value, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byGreaterThan(String value) {
            addCriterion("udpate_by >", value, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byGreaterThanOrEqualTo(String value) {
            addCriterion("udpate_by >=", value, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byLessThan(String value) {
            addCriterion("udpate_by <", value, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byLessThanOrEqualTo(String value) {
            addCriterion("udpate_by <=", value, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byLike(String value) {
            addCriterion("udpate_by like", value, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byNotLike(String value) {
            addCriterion("udpate_by not like", value, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byIn(List<String> values) {
            addCriterion("udpate_by in", values, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byNotIn(List<String> values) {
            addCriterion("udpate_by not in", values, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byBetween(String value1, String value2) {
            addCriterion("udpate_by between", value1, value2, "udpate_by");
            return (Criteria) this;
        }

        public Criteria andUdpate_byNotBetween(String value1, String value2) {
            addCriterion("udpate_by not between", value1, value2, "udpate_by");
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