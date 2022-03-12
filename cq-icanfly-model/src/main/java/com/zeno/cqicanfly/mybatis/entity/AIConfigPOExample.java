package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class AIConfigPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AIConfigPOExample() {
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

        public Criteria andIdxIsNull() {
            addCriterion("idx is null");
            return (Criteria) this;
        }

        public Criteria andIdxIsNotNull() {
            addCriterion("idx is not null");
            return (Criteria) this;
        }

        public Criteria andIdxEqualTo(Integer value) {
            addCriterion("idx =", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotEqualTo(Integer value) {
            addCriterion("idx <>", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThan(Integer value) {
            addCriterion("idx >", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxGreaterThanOrEqualTo(Integer value) {
            addCriterion("idx >=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThan(Integer value) {
            addCriterion("idx <", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxLessThanOrEqualTo(Integer value) {
            addCriterion("idx <=", value, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxIn(List<Integer> values) {
            addCriterion("idx in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotIn(List<Integer> values) {
            addCriterion("idx not in", values, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxBetween(Integer value1, Integer value2) {
            addCriterion("idx between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andIdxNotBetween(Integer value1, Integer value2) {
            addCriterion("idx not between", value1, value2, "idx");
            return (Criteria) this;
        }

        public Criteria andAiTypeIsNull() {
            addCriterion("aiType is null");
            return (Criteria) this;
        }

        public Criteria andAiTypeIsNotNull() {
            addCriterion("aiType is not null");
            return (Criteria) this;
        }

        public Criteria andAiTypeEqualTo(Integer value) {
            addCriterion("aiType =", value, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeNotEqualTo(Integer value) {
            addCriterion("aiType <>", value, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeGreaterThan(Integer value) {
            addCriterion("aiType >", value, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("aiType >=", value, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeLessThan(Integer value) {
            addCriterion("aiType <", value, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeLessThanOrEqualTo(Integer value) {
            addCriterion("aiType <=", value, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeIn(List<Integer> values) {
            addCriterion("aiType in", values, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeNotIn(List<Integer> values) {
            addCriterion("aiType not in", values, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeBetween(Integer value1, Integer value2) {
            addCriterion("aiType between", value1, value2, "aiType");
            return (Criteria) this;
        }

        public Criteria andAiTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("aiType not between", value1, value2, "aiType");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusIsNull() {
            addCriterion("patrolRadius is null");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusIsNotNull() {
            addCriterion("patrolRadius is not null");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusEqualTo(Integer value) {
            addCriterion("patrolRadius =", value, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusNotEqualTo(Integer value) {
            addCriterion("patrolRadius <>", value, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusGreaterThan(Integer value) {
            addCriterion("patrolRadius >", value, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusGreaterThanOrEqualTo(Integer value) {
            addCriterion("patrolRadius >=", value, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusLessThan(Integer value) {
            addCriterion("patrolRadius <", value, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusLessThanOrEqualTo(Integer value) {
            addCriterion("patrolRadius <=", value, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusIn(List<Integer> values) {
            addCriterion("patrolRadius in", values, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusNotIn(List<Integer> values) {
            addCriterion("patrolRadius not in", values, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusBetween(Integer value1, Integer value2) {
            addCriterion("patrolRadius between", value1, value2, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPatrolRadiusNotBetween(Integer value1, Integer value2) {
            addCriterion("patrolRadius not between", value1, value2, "patrolRadius");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceIsNull() {
            addCriterion("pursuitDistance is null");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceIsNotNull() {
            addCriterion("pursuitDistance is not null");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceEqualTo(Integer value) {
            addCriterion("pursuitDistance =", value, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceNotEqualTo(Integer value) {
            addCriterion("pursuitDistance <>", value, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceGreaterThan(Integer value) {
            addCriterion("pursuitDistance >", value, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("pursuitDistance >=", value, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceLessThan(Integer value) {
            addCriterion("pursuitDistance <", value, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("pursuitDistance <=", value, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceIn(List<Integer> values) {
            addCriterion("pursuitDistance in", values, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceNotIn(List<Integer> values) {
            addCriterion("pursuitDistance not in", values, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceBetween(Integer value1, Integer value2) {
            addCriterion("pursuitDistance between", value1, value2, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andPursuitDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("pursuitDistance not between", value1, value2, "pursuitDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceIsNull() {
            addCriterion("watchDistance is null");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceIsNotNull() {
            addCriterion("watchDistance is not null");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceEqualTo(Integer value) {
            addCriterion("watchDistance =", value, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceNotEqualTo(Integer value) {
            addCriterion("watchDistance <>", value, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceGreaterThan(Integer value) {
            addCriterion("watchDistance >", value, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("watchDistance >=", value, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceLessThan(Integer value) {
            addCriterion("watchDistance <", value, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("watchDistance <=", value, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceIn(List<Integer> values) {
            addCriterion("watchDistance in", values, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceNotIn(List<Integer> values) {
            addCriterion("watchDistance not in", values, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceBetween(Integer value1, Integer value2) {
            addCriterion("watchDistance between", value1, value2, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andWatchDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("watchDistance not between", value1, value2, "watchDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceIsNull() {
            addCriterion("leftHomeMaxDistance is null");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceIsNotNull() {
            addCriterion("leftHomeMaxDistance is not null");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceEqualTo(Integer value) {
            addCriterion("leftHomeMaxDistance =", value, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceNotEqualTo(Integer value) {
            addCriterion("leftHomeMaxDistance <>", value, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceGreaterThan(Integer value) {
            addCriterion("leftHomeMaxDistance >", value, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceGreaterThanOrEqualTo(Integer value) {
            addCriterion("leftHomeMaxDistance >=", value, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceLessThan(Integer value) {
            addCriterion("leftHomeMaxDistance <", value, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceLessThanOrEqualTo(Integer value) {
            addCriterion("leftHomeMaxDistance <=", value, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceIn(List<Integer> values) {
            addCriterion("leftHomeMaxDistance in", values, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceNotIn(List<Integer> values) {
            addCriterion("leftHomeMaxDistance not in", values, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceBetween(Integer value1, Integer value2) {
            addCriterion("leftHomeMaxDistance between", value1, value2, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andLeftHomeMaxDistanceNotBetween(Integer value1, Integer value2) {
            addCriterion("leftHomeMaxDistance not between", value1, value2, "leftHomeMaxDistance");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateIsNull() {
            addCriterion("returnHomeRenewRate is null");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateIsNotNull() {
            addCriterion("returnHomeRenewRate is not null");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateEqualTo(Integer value) {
            addCriterion("returnHomeRenewRate =", value, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateNotEqualTo(Integer value) {
            addCriterion("returnHomeRenewRate <>", value, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateGreaterThan(Integer value) {
            addCriterion("returnHomeRenewRate >", value, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("returnHomeRenewRate >=", value, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateLessThan(Integer value) {
            addCriterion("returnHomeRenewRate <", value, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateLessThanOrEqualTo(Integer value) {
            addCriterion("returnHomeRenewRate <=", value, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateIn(List<Integer> values) {
            addCriterion("returnHomeRenewRate in", values, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateNotIn(List<Integer> values) {
            addCriterion("returnHomeRenewRate not in", values, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateBetween(Integer value1, Integer value2) {
            addCriterion("returnHomeRenewRate between", value1, value2, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andReturnHomeRenewRateNotBetween(Integer value1, Integer value2) {
            addCriterion("returnHomeRenewRate not between", value1, value2, "returnHomeRenewRate");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeIsNull() {
            addCriterion("stopMinTime is null");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeIsNotNull() {
            addCriterion("stopMinTime is not null");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeEqualTo(Integer value) {
            addCriterion("stopMinTime =", value, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeNotEqualTo(Integer value) {
            addCriterion("stopMinTime <>", value, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeGreaterThan(Integer value) {
            addCriterion("stopMinTime >", value, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stopMinTime >=", value, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeLessThan(Integer value) {
            addCriterion("stopMinTime <", value, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeLessThanOrEqualTo(Integer value) {
            addCriterion("stopMinTime <=", value, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeIn(List<Integer> values) {
            addCriterion("stopMinTime in", values, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeNotIn(List<Integer> values) {
            addCriterion("stopMinTime not in", values, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeBetween(Integer value1, Integer value2) {
            addCriterion("stopMinTime between", value1, value2, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMinTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("stopMinTime not between", value1, value2, "stopMinTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeIsNull() {
            addCriterion("stopMaxTime is null");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeIsNotNull() {
            addCriterion("stopMaxTime is not null");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeEqualTo(Integer value) {
            addCriterion("stopMaxTime =", value, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeNotEqualTo(Integer value) {
            addCriterion("stopMaxTime <>", value, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeGreaterThan(Integer value) {
            addCriterion("stopMaxTime >", value, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("stopMaxTime >=", value, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeLessThan(Integer value) {
            addCriterion("stopMaxTime <", value, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeLessThanOrEqualTo(Integer value) {
            addCriterion("stopMaxTime <=", value, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeIn(List<Integer> values) {
            addCriterion("stopMaxTime in", values, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeNotIn(List<Integer> values) {
            addCriterion("stopMaxTime not in", values, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeBetween(Integer value1, Integer value2) {
            addCriterion("stopMaxTime between", value1, value2, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andStopMaxTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("stopMaxTime not between", value1, value2, "stopMaxTime");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalIsNull() {
            addCriterion("moveStopInterval is null");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalIsNotNull() {
            addCriterion("moveStopInterval is not null");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalEqualTo(Integer value) {
            addCriterion("moveStopInterval =", value, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalNotEqualTo(Integer value) {
            addCriterion("moveStopInterval <>", value, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalGreaterThan(Integer value) {
            addCriterion("moveStopInterval >", value, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("moveStopInterval >=", value, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalLessThan(Integer value) {
            addCriterion("moveStopInterval <", value, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("moveStopInterval <=", value, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalIn(List<Integer> values) {
            addCriterion("moveStopInterval in", values, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalNotIn(List<Integer> values) {
            addCriterion("moveStopInterval not in", values, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalBetween(Integer value1, Integer value2) {
            addCriterion("moveStopInterval between", value1, value2, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andMoveStopIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("moveStopInterval not between", value1, value2, "moveStopInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalIsNull() {
            addCriterion("checkenemyInterval is null");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalIsNotNull() {
            addCriterion("checkenemyInterval is not null");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalEqualTo(Integer value) {
            addCriterion("checkenemyInterval =", value, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalNotEqualTo(Integer value) {
            addCriterion("checkenemyInterval <>", value, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalGreaterThan(Integer value) {
            addCriterion("checkenemyInterval >", value, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkenemyInterval >=", value, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalLessThan(Integer value) {
            addCriterion("checkenemyInterval <", value, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalLessThanOrEqualTo(Integer value) {
            addCriterion("checkenemyInterval <=", value, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalIn(List<Integer> values) {
            addCriterion("checkenemyInterval in", values, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalNotIn(List<Integer> values) {
            addCriterion("checkenemyInterval not in", values, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalBetween(Integer value1, Integer value2) {
            addCriterion("checkenemyInterval between", value1, value2, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andCheckenemyIntervalNotBetween(Integer value1, Integer value2) {
            addCriterion("checkenemyInterval not between", value1, value2, "checkenemyInterval");
            return (Criteria) this;
        }

        public Criteria andTransferDisIsNull() {
            addCriterion("transferDis is null");
            return (Criteria) this;
        }

        public Criteria andTransferDisIsNotNull() {
            addCriterion("transferDis is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDisEqualTo(Integer value) {
            addCriterion("transferDis =", value, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisNotEqualTo(Integer value) {
            addCriterion("transferDis <>", value, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisGreaterThan(Integer value) {
            addCriterion("transferDis >", value, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisGreaterThanOrEqualTo(Integer value) {
            addCriterion("transferDis >=", value, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisLessThan(Integer value) {
            addCriterion("transferDis <", value, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisLessThanOrEqualTo(Integer value) {
            addCriterion("transferDis <=", value, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisIn(List<Integer> values) {
            addCriterion("transferDis in", values, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisNotIn(List<Integer> values) {
            addCriterion("transferDis not in", values, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisBetween(Integer value1, Integer value2) {
            addCriterion("transferDis between", value1, value2, "transferDis");
            return (Criteria) this;
        }

        public Criteria andTransferDisNotBetween(Integer value1, Integer value2) {
            addCriterion("transferDis not between", value1, value2, "transferDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisIsNull() {
            addCriterion("battleFollowDis is null");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisIsNotNull() {
            addCriterion("battleFollowDis is not null");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisEqualTo(Integer value) {
            addCriterion("battleFollowDis =", value, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisNotEqualTo(Integer value) {
            addCriterion("battleFollowDis <>", value, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisGreaterThan(Integer value) {
            addCriterion("battleFollowDis >", value, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisGreaterThanOrEqualTo(Integer value) {
            addCriterion("battleFollowDis >=", value, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisLessThan(Integer value) {
            addCriterion("battleFollowDis <", value, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisLessThanOrEqualTo(Integer value) {
            addCriterion("battleFollowDis <=", value, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisIn(List<Integer> values) {
            addCriterion("battleFollowDis in", values, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisNotIn(List<Integer> values) {
            addCriterion("battleFollowDis not in", values, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisBetween(Integer value1, Integer value2) {
            addCriterion("battleFollowDis between", value1, value2, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andBattleFollowDisNotBetween(Integer value1, Integer value2) {
            addCriterion("battleFollowDis not between", value1, value2, "battleFollowDis");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeIsNull() {
            addCriterion("petFollowMasterTime is null");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeIsNotNull() {
            addCriterion("petFollowMasterTime is not null");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeEqualTo(Integer value) {
            addCriterion("petFollowMasterTime =", value, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeNotEqualTo(Integer value) {
            addCriterion("petFollowMasterTime <>", value, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeGreaterThan(Integer value) {
            addCriterion("petFollowMasterTime >", value, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("petFollowMasterTime >=", value, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeLessThan(Integer value) {
            addCriterion("petFollowMasterTime <", value, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeLessThanOrEqualTo(Integer value) {
            addCriterion("petFollowMasterTime <=", value, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeIn(List<Integer> values) {
            addCriterion("petFollowMasterTime in", values, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeNotIn(List<Integer> values) {
            addCriterion("petFollowMasterTime not in", values, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeBetween(Integer value1, Integer value2) {
            addCriterion("petFollowMasterTime between", value1, value2, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andPetFollowMasterTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("petFollowMasterTime not between", value1, value2, "petFollowMasterTime");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateIsNull() {
            addCriterion("hitSetTargetRate is null");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateIsNotNull() {
            addCriterion("hitSetTargetRate is not null");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateEqualTo(Integer value) {
            addCriterion("hitSetTargetRate =", value, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateNotEqualTo(Integer value) {
            addCriterion("hitSetTargetRate <>", value, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateGreaterThan(Integer value) {
            addCriterion("hitSetTargetRate >", value, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hitSetTargetRate >=", value, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateLessThan(Integer value) {
            addCriterion("hitSetTargetRate <", value, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateLessThanOrEqualTo(Integer value) {
            addCriterion("hitSetTargetRate <=", value, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateIn(List<Integer> values) {
            addCriterion("hitSetTargetRate in", values, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateNotIn(List<Integer> values) {
            addCriterion("hitSetTargetRate not in", values, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateBetween(Integer value1, Integer value2) {
            addCriterion("hitSetTargetRate between", value1, value2, "hitSetTargetRate");
            return (Criteria) this;
        }

        public Criteria andHitSetTargetRateNotBetween(Integer value1, Integer value2) {
            addCriterion("hitSetTargetRate not between", value1, value2, "hitSetTargetRate");
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