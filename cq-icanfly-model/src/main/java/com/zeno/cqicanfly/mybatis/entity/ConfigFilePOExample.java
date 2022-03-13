package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConfigFilePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConfigFilePOExample() {
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

        public Criteria andFile_pathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFile_pathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFile_pathEqualTo(String value) {
            addCriterion("file_path =", value, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathGreaterThan(String value) {
            addCriterion("file_path >", value, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathLessThan(String value) {
            addCriterion("file_path <", value, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathLike(String value) {
            addCriterion("file_path like", value, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathNotLike(String value) {
            addCriterion("file_path not like", value, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathIn(List<String> values) {
            addCriterion("file_path in", values, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_pathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "file_path");
            return (Criteria) this;
        }

        public Criteria andFile_nameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFile_nameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFile_nameEqualTo(String value) {
            addCriterion("file_name =", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameGreaterThan(String value) {
            addCriterion("file_name >", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameLessThan(String value) {
            addCriterion("file_name <", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameLike(String value) {
            addCriterion("file_name like", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameNotLike(String value) {
            addCriterion("file_name not like", value, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameIn(List<String> values) {
            addCriterion("file_name in", values, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_nameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "file_name");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerIsNull() {
            addCriterion("file_lua_table_header is null");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerIsNotNull() {
            addCriterion("file_lua_table_header is not null");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerEqualTo(String value) {
            addCriterion("file_lua_table_header =", value, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerNotEqualTo(String value) {
            addCriterion("file_lua_table_header <>", value, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerGreaterThan(String value) {
            addCriterion("file_lua_table_header >", value, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerGreaterThanOrEqualTo(String value) {
            addCriterion("file_lua_table_header >=", value, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerLessThan(String value) {
            addCriterion("file_lua_table_header <", value, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerLessThanOrEqualTo(String value) {
            addCriterion("file_lua_table_header <=", value, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerLike(String value) {
            addCriterion("file_lua_table_header like", value, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerNotLike(String value) {
            addCriterion("file_lua_table_header not like", value, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerIn(List<String> values) {
            addCriterion("file_lua_table_header in", values, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerNotIn(List<String> values) {
            addCriterion("file_lua_table_header not in", values, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerBetween(String value1, String value2) {
            addCriterion("file_lua_table_header between", value1, value2, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andFile_lua_table_headerNotBetween(String value1, String value2) {
            addCriterion("file_lua_table_header not between", value1, value2, "file_lua_table_header");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusIsNull() {
            addCriterion("to_php_status is null");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusIsNotNull() {
            addCriterion("to_php_status is not null");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusEqualTo(Boolean value) {
            addCriterion("to_php_status =", value, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusNotEqualTo(Boolean value) {
            addCriterion("to_php_status <>", value, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusGreaterThan(Boolean value) {
            addCriterion("to_php_status >", value, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("to_php_status >=", value, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusLessThan(Boolean value) {
            addCriterion("to_php_status <", value, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusLessThanOrEqualTo(Boolean value) {
            addCriterion("to_php_status <=", value, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusIn(List<Boolean> values) {
            addCriterion("to_php_status in", values, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusNotIn(List<Boolean> values) {
            addCriterion("to_php_status not in", values, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusBetween(Boolean value1, Boolean value2) {
            addCriterion("to_php_status between", value1, value2, "to_php_status");
            return (Criteria) this;
        }

        public Criteria andTo_php_statusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("to_php_status not between", value1, value2, "to_php_status");
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