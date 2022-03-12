package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class DropTablePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DropTablePOExample() {
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

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andDropTableIsNull() {
            addCriterion("dropTable is null");
            return (Criteria) this;
        }

        public Criteria andDropTableIsNotNull() {
            addCriterion("dropTable is not null");
            return (Criteria) this;
        }

        public Criteria andDropTableEqualTo(String value) {
            addCriterion("dropTable =", value, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableNotEqualTo(String value) {
            addCriterion("dropTable <>", value, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableGreaterThan(String value) {
            addCriterion("dropTable >", value, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableGreaterThanOrEqualTo(String value) {
            addCriterion("dropTable >=", value, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableLessThan(String value) {
            addCriterion("dropTable <", value, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableLessThanOrEqualTo(String value) {
            addCriterion("dropTable <=", value, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableLike(String value) {
            addCriterion("dropTable like", value, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableNotLike(String value) {
            addCriterion("dropTable not like", value, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableIn(List<String> values) {
            addCriterion("dropTable in", values, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableNotIn(List<String> values) {
            addCriterion("dropTable not in", values, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableBetween(String value1, String value2) {
            addCriterion("dropTable between", value1, value2, "dropTable");
            return (Criteria) this;
        }

        public Criteria andDropTableNotBetween(String value1, String value2) {
            addCriterion("dropTable not between", value1, value2, "dropTable");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNull() {
            addCriterion("timeLimit is null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIsNotNull() {
            addCriterion("timeLimit is not null");
            return (Criteria) this;
        }

        public Criteria andTimeLimitEqualTo(String value) {
            addCriterion("timeLimit =", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotEqualTo(String value) {
            addCriterion("timeLimit <>", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThan(String value) {
            addCriterion("timeLimit >", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitGreaterThanOrEqualTo(String value) {
            addCriterion("timeLimit >=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThan(String value) {
            addCriterion("timeLimit <", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLessThanOrEqualTo(String value) {
            addCriterion("timeLimit <=", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitLike(String value) {
            addCriterion("timeLimit like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotLike(String value) {
            addCriterion("timeLimit not like", value, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitIn(List<String> values) {
            addCriterion("timeLimit in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotIn(List<String> values) {
            addCriterion("timeLimit not in", values, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitBetween(String value1, String value2) {
            addCriterion("timeLimit between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andTimeLimitNotBetween(String value1, String value2) {
            addCriterion("timeLimit not between", value1, value2, "timeLimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitIsNull() {
            addCriterion("weeklimit is null");
            return (Criteria) this;
        }

        public Criteria andWeeklimitIsNotNull() {
            addCriterion("weeklimit is not null");
            return (Criteria) this;
        }

        public Criteria andWeeklimitEqualTo(String value) {
            addCriterion("weeklimit =", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitNotEqualTo(String value) {
            addCriterion("weeklimit <>", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitGreaterThan(String value) {
            addCriterion("weeklimit >", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitGreaterThanOrEqualTo(String value) {
            addCriterion("weeklimit >=", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitLessThan(String value) {
            addCriterion("weeklimit <", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitLessThanOrEqualTo(String value) {
            addCriterion("weeklimit <=", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitLike(String value) {
            addCriterion("weeklimit like", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitNotLike(String value) {
            addCriterion("weeklimit not like", value, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitIn(List<String> values) {
            addCriterion("weeklimit in", values, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitNotIn(List<String> values) {
            addCriterion("weeklimit not in", values, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitBetween(String value1, String value2) {
            addCriterion("weeklimit between", value1, value2, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andWeeklimitNotBetween(String value1, String value2) {
            addCriterion("weeklimit not between", value1, value2, "weeklimit");
            return (Criteria) this;
        }

        public Criteria andIsDropbestIsNull() {
            addCriterion("isDropbest is null");
            return (Criteria) this;
        }

        public Criteria andIsDropbestIsNotNull() {
            addCriterion("isDropbest is not null");
            return (Criteria) this;
        }

        public Criteria andIsDropbestEqualTo(Integer value) {
            addCriterion("isDropbest =", value, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestNotEqualTo(Integer value) {
            addCriterion("isDropbest <>", value, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestGreaterThan(Integer value) {
            addCriterion("isDropbest >", value, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestGreaterThanOrEqualTo(Integer value) {
            addCriterion("isDropbest >=", value, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestLessThan(Integer value) {
            addCriterion("isDropbest <", value, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestLessThanOrEqualTo(Integer value) {
            addCriterion("isDropbest <=", value, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestIn(List<Integer> values) {
            addCriterion("isDropbest in", values, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestNotIn(List<Integer> values) {
            addCriterion("isDropbest not in", values, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestBetween(Integer value1, Integer value2) {
            addCriterion("isDropbest between", value1, value2, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andIsDropbestNotBetween(Integer value1, Integer value2) {
            addCriterion("isDropbest not between", value1, value2, "isDropbest");
            return (Criteria) this;
        }

        public Criteria andLoottypeIsNull() {
            addCriterion("loottype is null");
            return (Criteria) this;
        }

        public Criteria andLoottypeIsNotNull() {
            addCriterion("loottype is not null");
            return (Criteria) this;
        }

        public Criteria andLoottypeEqualTo(Integer value) {
            addCriterion("loottype =", value, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeNotEqualTo(Integer value) {
            addCriterion("loottype <>", value, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeGreaterThan(Integer value) {
            addCriterion("loottype >", value, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("loottype >=", value, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeLessThan(Integer value) {
            addCriterion("loottype <", value, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeLessThanOrEqualTo(Integer value) {
            addCriterion("loottype <=", value, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeIn(List<Integer> values) {
            addCriterion("loottype in", values, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeNotIn(List<Integer> values) {
            addCriterion("loottype not in", values, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeBetween(Integer value1, Integer value2) {
            addCriterion("loottype between", value1, value2, "loottype");
            return (Criteria) this;
        }

        public Criteria andLoottypeNotBetween(Integer value1, Integer value2) {
            addCriterion("loottype not between", value1, value2, "loottype");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayIsNull() {
            addCriterion("limitopenserverDay is null");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayIsNotNull() {
            addCriterion("limitopenserverDay is not null");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayEqualTo(Integer value) {
            addCriterion("limitopenserverDay =", value, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayNotEqualTo(Integer value) {
            addCriterion("limitopenserverDay <>", value, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayGreaterThan(Integer value) {
            addCriterion("limitopenserverDay >", value, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("limitopenserverDay >=", value, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayLessThan(Integer value) {
            addCriterion("limitopenserverDay <", value, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayLessThanOrEqualTo(Integer value) {
            addCriterion("limitopenserverDay <=", value, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayIn(List<Integer> values) {
            addCriterion("limitopenserverDay in", values, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayNotIn(List<Integer> values) {
            addCriterion("limitopenserverDay not in", values, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayBetween(Integer value1, Integer value2) {
            addCriterion("limitopenserverDay between", value1, value2, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andLimitopenserverDayNotBetween(Integer value1, Integer value2) {
            addCriterion("limitopenserverDay not between", value1, value2, "limitopenserverDay");
            return (Criteria) this;
        }

        public Criteria andCloseopendayIsNull() {
            addCriterion("closeopenday is null");
            return (Criteria) this;
        }

        public Criteria andCloseopendayIsNotNull() {
            addCriterion("closeopenday is not null");
            return (Criteria) this;
        }

        public Criteria andCloseopendayEqualTo(Integer value) {
            addCriterion("closeopenday =", value, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayNotEqualTo(Integer value) {
            addCriterion("closeopenday <>", value, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayGreaterThan(Integer value) {
            addCriterion("closeopenday >", value, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayGreaterThanOrEqualTo(Integer value) {
            addCriterion("closeopenday >=", value, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayLessThan(Integer value) {
            addCriterion("closeopenday <", value, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayLessThanOrEqualTo(Integer value) {
            addCriterion("closeopenday <=", value, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayIn(List<Integer> values) {
            addCriterion("closeopenday in", values, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayNotIn(List<Integer> values) {
            addCriterion("closeopenday not in", values, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayBetween(Integer value1, Integer value2) {
            addCriterion("closeopenday between", value1, value2, "closeopenday");
            return (Criteria) this;
        }

        public Criteria andCloseopendayNotBetween(Integer value1, Integer value2) {
            addCriterion("closeopenday not between", value1, value2, "closeopenday");
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