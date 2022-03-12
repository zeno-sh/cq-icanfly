package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class FlagsConfigPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlagsConfigPOExample() {
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

        public Criteria andLagIdIsNull() {
            addCriterion("lagId is null");
            return (Criteria) this;
        }

        public Criteria andLagIdIsNotNull() {
            addCriterion("lagId is not null");
            return (Criteria) this;
        }

        public Criteria andLagIdEqualTo(Boolean value) {
            addCriterion("lagId =", value, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdNotEqualTo(Boolean value) {
            addCriterion("lagId <>", value, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdGreaterThan(Boolean value) {
            addCriterion("lagId >", value, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdGreaterThanOrEqualTo(Boolean value) {
            addCriterion("lagId >=", value, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdLessThan(Boolean value) {
            addCriterion("lagId <", value, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdLessThanOrEqualTo(Boolean value) {
            addCriterion("lagId <=", value, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdIn(List<Boolean> values) {
            addCriterion("lagId in", values, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdNotIn(List<Boolean> values) {
            addCriterion("lagId not in", values, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdBetween(Boolean value1, Boolean value2) {
            addCriterion("lagId between", value1, value2, "lagId");
            return (Criteria) this;
        }

        public Criteria andLagIdNotBetween(Boolean value1, Boolean value2) {
            addCriterion("lagId not between", value1, value2, "lagId");
            return (Criteria) this;
        }

        public Criteria andDenyMoveIsNull() {
            addCriterion("DenyMove is null");
            return (Criteria) this;
        }

        public Criteria andDenyMoveIsNotNull() {
            addCriterion("DenyMove is not null");
            return (Criteria) this;
        }

        public Criteria andDenyMoveEqualTo(Boolean value) {
            addCriterion("DenyMove =", value, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveNotEqualTo(Boolean value) {
            addCriterion("DenyMove <>", value, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveGreaterThan(Boolean value) {
            addCriterion("DenyMove >", value, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyMove >=", value, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveLessThan(Boolean value) {
            addCriterion("DenyMove <", value, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyMove <=", value, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveIn(List<Boolean> values) {
            addCriterion("DenyMove in", values, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveNotIn(List<Boolean> values) {
            addCriterion("DenyMove not in", values, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyMove between", value1, value2, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyMoveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyMove not between", value1, value2, "denyMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveIsNull() {
            addCriterion("DenyBeMove is null");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveIsNotNull() {
            addCriterion("DenyBeMove is not null");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveEqualTo(Boolean value) {
            addCriterion("DenyBeMove =", value, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveNotEqualTo(Boolean value) {
            addCriterion("DenyBeMove <>", value, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveGreaterThan(Boolean value) {
            addCriterion("DenyBeMove >", value, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyBeMove >=", value, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveLessThan(Boolean value) {
            addCriterion("DenyBeMove <", value, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyBeMove <=", value, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveIn(List<Boolean> values) {
            addCriterion("DenyBeMove in", values, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveNotIn(List<Boolean> values) {
            addCriterion("DenyBeMove not in", values, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyBeMove between", value1, value2, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyBeMoveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyBeMove not between", value1, value2, "denyBeMove");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorIsNull() {
            addCriterion("DenyAttackActor is null");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorIsNotNull() {
            addCriterion("DenyAttackActor is not null");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorEqualTo(Boolean value) {
            addCriterion("DenyAttackActor =", value, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorNotEqualTo(Boolean value) {
            addCriterion("DenyAttackActor <>", value, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorGreaterThan(Boolean value) {
            addCriterion("DenyAttackActor >", value, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyAttackActor >=", value, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorLessThan(Boolean value) {
            addCriterion("DenyAttackActor <", value, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyAttackActor <=", value, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorIn(List<Boolean> values) {
            addCriterion("DenyAttackActor in", values, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorNotIn(List<Boolean> values) {
            addCriterion("DenyAttackActor not in", values, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAttackActor between", value1, value2, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackActorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAttackActor not between", value1, value2, "denyAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackIsNull() {
            addCriterion("DenyBeAttack is null");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackIsNotNull() {
            addCriterion("DenyBeAttack is not null");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackEqualTo(Boolean value) {
            addCriterion("DenyBeAttack =", value, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackNotEqualTo(Boolean value) {
            addCriterion("DenyBeAttack <>", value, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackGreaterThan(Boolean value) {
            addCriterion("DenyBeAttack >", value, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyBeAttack >=", value, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackLessThan(Boolean value) {
            addCriterion("DenyBeAttack <", value, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyBeAttack <=", value, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackIn(List<Boolean> values) {
            addCriterion("DenyBeAttack in", values, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackNotIn(List<Boolean> values) {
            addCriterion("DenyBeAttack not in", values, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyBeAttack between", value1, value2, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyBeAttackNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyBeAttack not between", value1, value2, "denyBeAttack");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorIsNull() {
            addCriterion("DenyAttackedByActor is null");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorIsNotNull() {
            addCriterion("DenyAttackedByActor is not null");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorEqualTo(Boolean value) {
            addCriterion("DenyAttackedByActor =", value, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorNotEqualTo(Boolean value) {
            addCriterion("DenyAttackedByActor <>", value, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorGreaterThan(Boolean value) {
            addCriterion("DenyAttackedByActor >", value, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyAttackedByActor >=", value, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorLessThan(Boolean value) {
            addCriterion("DenyAttackedByActor <", value, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyAttackedByActor <=", value, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorIn(List<Boolean> values) {
            addCriterion("DenyAttackedByActor in", values, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorNotIn(List<Boolean> values) {
            addCriterion("DenyAttackedByActor not in", values, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAttackedByActor between", value1, value2, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andDenyAttackedByActorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAttackedByActor not between", value1, value2, "denyAttackedByActor");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterIsNull() {
            addCriterion("CanAttackMonster is null");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterIsNotNull() {
            addCriterion("CanAttackMonster is not null");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterEqualTo(Boolean value) {
            addCriterion("CanAttackMonster =", value, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterNotEqualTo(Boolean value) {
            addCriterion("CanAttackMonster <>", value, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterGreaterThan(Boolean value) {
            addCriterion("CanAttackMonster >", value, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CanAttackMonster >=", value, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterLessThan(Boolean value) {
            addCriterion("CanAttackMonster <", value, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterLessThanOrEqualTo(Boolean value) {
            addCriterion("CanAttackMonster <=", value, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterIn(List<Boolean> values) {
            addCriterion("CanAttackMonster in", values, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterNotIn(List<Boolean> values) {
            addCriterion("CanAttackMonster not in", values, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterBetween(Boolean value1, Boolean value2) {
            addCriterion("CanAttackMonster between", value1, value2, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andCanAttackMonsterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CanAttackMonster not between", value1, value2, "canAttackMonster");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpIsNull() {
            addCriterion("DenyAutoAddMp is null");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpIsNotNull() {
            addCriterion("DenyAutoAddMp is not null");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpEqualTo(Boolean value) {
            addCriterion("DenyAutoAddMp =", value, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpNotEqualTo(Boolean value) {
            addCriterion("DenyAutoAddMp <>", value, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpGreaterThan(Boolean value) {
            addCriterion("DenyAutoAddMp >", value, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyAutoAddMp >=", value, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpLessThan(Boolean value) {
            addCriterion("DenyAutoAddMp <", value, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyAutoAddMp <=", value, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpIn(List<Boolean> values) {
            addCriterion("DenyAutoAddMp in", values, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpNotIn(List<Boolean> values) {
            addCriterion("DenyAutoAddMp not in", values, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAutoAddMp between", value1, value2, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddMpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAutoAddMp not between", value1, value2, "denyAutoAddMp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpIsNull() {
            addCriterion("DenyAutoAddHp is null");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpIsNotNull() {
            addCriterion("DenyAutoAddHp is not null");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpEqualTo(Boolean value) {
            addCriterion("DenyAutoAddHp =", value, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpNotEqualTo(Boolean value) {
            addCriterion("DenyAutoAddHp <>", value, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpGreaterThan(Boolean value) {
            addCriterion("DenyAutoAddHp >", value, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyAutoAddHp >=", value, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpLessThan(Boolean value) {
            addCriterion("DenyAutoAddHp <", value, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyAutoAddHp <=", value, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpIn(List<Boolean> values) {
            addCriterion("DenyAutoAddHp in", values, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpNotIn(List<Boolean> values) {
            addCriterion("DenyAutoAddHp not in", values, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAutoAddHp between", value1, value2, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andDenyAutoAddHpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAutoAddHp not between", value1, value2, "denyAutoAddHp");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportIsNull() {
            addCriterion("CanSceneTelport is null");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportIsNotNull() {
            addCriterion("CanSceneTelport is not null");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportEqualTo(Boolean value) {
            addCriterion("CanSceneTelport =", value, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportNotEqualTo(Boolean value) {
            addCriterion("CanSceneTelport <>", value, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportGreaterThan(Boolean value) {
            addCriterion("CanSceneTelport >", value, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CanSceneTelport >=", value, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportLessThan(Boolean value) {
            addCriterion("CanSceneTelport <", value, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportLessThanOrEqualTo(Boolean value) {
            addCriterion("CanSceneTelport <=", value, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportIn(List<Boolean> values) {
            addCriterion("CanSceneTelport in", values, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportNotIn(List<Boolean> values) {
            addCriterion("CanSceneTelport not in", values, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportBetween(Boolean value1, Boolean value2) {
            addCriterion("CanSceneTelport between", value1, value2, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSceneTelportNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CanSceneTelport not between", value1, value2, "canSceneTelport");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorIsNull() {
            addCriterion("CanSeeHideActor is null");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorIsNotNull() {
            addCriterion("CanSeeHideActor is not null");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorEqualTo(Boolean value) {
            addCriterion("CanSeeHideActor =", value, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorNotEqualTo(Boolean value) {
            addCriterion("CanSeeHideActor <>", value, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorGreaterThan(Boolean value) {
            addCriterion("CanSeeHideActor >", value, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CanSeeHideActor >=", value, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorLessThan(Boolean value) {
            addCriterion("CanSeeHideActor <", value, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorLessThanOrEqualTo(Boolean value) {
            addCriterion("CanSeeHideActor <=", value, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorIn(List<Boolean> values) {
            addCriterion("CanSeeHideActor in", values, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorNotIn(List<Boolean> values) {
            addCriterion("CanSeeHideActor not in", values, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorBetween(Boolean value1, Boolean value2) {
            addCriterion("CanSeeHideActor between", value1, value2, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andCanSeeHideActorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CanSeeHideActor not between", value1, value2, "canSeeHideActor");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpIsNull() {
            addCriterion("DenyDieSubExp is null");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpIsNotNull() {
            addCriterion("DenyDieSubExp is not null");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpEqualTo(Boolean value) {
            addCriterion("DenyDieSubExp =", value, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpNotEqualTo(Boolean value) {
            addCriterion("DenyDieSubExp <>", value, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpGreaterThan(Boolean value) {
            addCriterion("DenyDieSubExp >", value, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyDieSubExp >=", value, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpLessThan(Boolean value) {
            addCriterion("DenyDieSubExp <", value, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyDieSubExp <=", value, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpIn(List<Boolean> values) {
            addCriterion("DenyDieSubExp in", values, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpNotIn(List<Boolean> values) {
            addCriterion("DenyDieSubExp not in", values, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyDieSubExp between", value1, value2, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyDieSubExpNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyDieSubExp not between", value1, value2, "denyDieSubExp");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackIsNull() {
            addCriterion("DenyUseNearAttack is null");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackIsNotNull() {
            addCriterion("DenyUseNearAttack is not null");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackEqualTo(Boolean value) {
            addCriterion("DenyUseNearAttack =", value, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackNotEqualTo(Boolean value) {
            addCriterion("DenyUseNearAttack <>", value, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackGreaterThan(Boolean value) {
            addCriterion("DenyUseNearAttack >", value, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyUseNearAttack >=", value, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackLessThan(Boolean value) {
            addCriterion("DenyUseNearAttack <", value, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyUseNearAttack <=", value, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackIn(List<Boolean> values) {
            addCriterion("DenyUseNearAttack in", values, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackNotIn(List<Boolean> values) {
            addCriterion("DenyUseNearAttack not in", values, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyUseNearAttack between", value1, value2, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyUseNearAttackNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyUseNearAttack not between", value1, value2, "denyUseNearAttack");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffIsNull() {
            addCriterion("DenyMoveForbidBuff is null");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffIsNotNull() {
            addCriterion("DenyMoveForbidBuff is not null");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffEqualTo(Boolean value) {
            addCriterion("DenyMoveForbidBuff =", value, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffNotEqualTo(Boolean value) {
            addCriterion("DenyMoveForbidBuff <>", value, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffGreaterThan(Boolean value) {
            addCriterion("DenyMoveForbidBuff >", value, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyMoveForbidBuff >=", value, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffLessThan(Boolean value) {
            addCriterion("DenyMoveForbidBuff <", value, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyMoveForbidBuff <=", value, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffIn(List<Boolean> values) {
            addCriterion("DenyMoveForbidBuff in", values, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffNotIn(List<Boolean> values) {
            addCriterion("DenyMoveForbidBuff not in", values, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyMoveForbidBuff between", value1, value2, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveForbidBuffNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyMoveForbidBuff not between", value1, value2, "denyMoveForbidBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffIsNull() {
            addCriterion("DenyMoveSpeedSlowBuff is null");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffIsNotNull() {
            addCriterion("DenyMoveSpeedSlowBuff is not null");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffEqualTo(Boolean value) {
            addCriterion("DenyMoveSpeedSlowBuff =", value, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffNotEqualTo(Boolean value) {
            addCriterion("DenyMoveSpeedSlowBuff <>", value, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffGreaterThan(Boolean value) {
            addCriterion("DenyMoveSpeedSlowBuff >", value, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyMoveSpeedSlowBuff >=", value, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffLessThan(Boolean value) {
            addCriterion("DenyMoveSpeedSlowBuff <", value, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyMoveSpeedSlowBuff <=", value, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffIn(List<Boolean> values) {
            addCriterion("DenyMoveSpeedSlowBuff in", values, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffNotIn(List<Boolean> values) {
            addCriterion("DenyMoveSpeedSlowBuff not in", values, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyMoveSpeedSlowBuff between", value1, value2, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenyMoveSpeedSlowBuffNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyMoveSpeedSlowBuff not between", value1, value2, "denyMoveSpeedSlowBuff");
            return (Criteria) this;
        }

        public Criteria andDenySeeIsNull() {
            addCriterion("DenySee is null");
            return (Criteria) this;
        }

        public Criteria andDenySeeIsNotNull() {
            addCriterion("DenySee is not null");
            return (Criteria) this;
        }

        public Criteria andDenySeeEqualTo(Boolean value) {
            addCriterion("DenySee =", value, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeNotEqualTo(Boolean value) {
            addCriterion("DenySee <>", value, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeGreaterThan(Boolean value) {
            addCriterion("DenySee >", value, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenySee >=", value, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeLessThan(Boolean value) {
            addCriterion("DenySee <", value, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeLessThanOrEqualTo(Boolean value) {
            addCriterion("DenySee <=", value, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeIn(List<Boolean> values) {
            addCriterion("DenySee in", values, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeNotIn(List<Boolean> values) {
            addCriterion("DenySee not in", values, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeBetween(Boolean value1, Boolean value2) {
            addCriterion("DenySee between", value1, value2, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenySeeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenySee not between", value1, value2, "denySee");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorIsNull() {
            addCriterion("DenyInitiativeAttackActor is null");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorIsNotNull() {
            addCriterion("DenyInitiativeAttackActor is not null");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorEqualTo(Boolean value) {
            addCriterion("DenyInitiativeAttackActor =", value, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorNotEqualTo(Boolean value) {
            addCriterion("DenyInitiativeAttackActor <>", value, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorGreaterThan(Boolean value) {
            addCriterion("DenyInitiativeAttackActor >", value, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyInitiativeAttackActor >=", value, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorLessThan(Boolean value) {
            addCriterion("DenyInitiativeAttackActor <", value, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyInitiativeAttackActor <=", value, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorIn(List<Boolean> values) {
            addCriterion("DenyInitiativeAttackActor in", values, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorNotIn(List<Boolean> values) {
            addCriterion("DenyInitiativeAttackActor not in", values, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyInitiativeAttackActor between", value1, value2, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyInitiativeAttackActorNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyInitiativeAttackActor not between", value1, value2, "denyInitiativeAttackActor");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameIsNull() {
            addCriterion("DenyShowMasterName is null");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameIsNotNull() {
            addCriterion("DenyShowMasterName is not null");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameEqualTo(Boolean value) {
            addCriterion("DenyShowMasterName =", value, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameNotEqualTo(Boolean value) {
            addCriterion("DenyShowMasterName <>", value, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameGreaterThan(Boolean value) {
            addCriterion("DenyShowMasterName >", value, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyShowMasterName >=", value, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameLessThan(Boolean value) {
            addCriterion("DenyShowMasterName <", value, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyShowMasterName <=", value, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameIn(List<Boolean> values) {
            addCriterion("DenyShowMasterName in", values, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameNotIn(List<Boolean> values) {
            addCriterion("DenyShowMasterName not in", values, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyShowMasterName between", value1, value2, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowMasterNameNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyShowMasterName not between", value1, value2, "denyShowMasterName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameIsNull() {
            addCriterion("DenyShowName is null");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameIsNotNull() {
            addCriterion("DenyShowName is not null");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameEqualTo(Boolean value) {
            addCriterion("DenyShowName =", value, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameNotEqualTo(Boolean value) {
            addCriterion("DenyShowName <>", value, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameGreaterThan(Boolean value) {
            addCriterion("DenyShowName >", value, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyShowName >=", value, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameLessThan(Boolean value) {
            addCriterion("DenyShowName <", value, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyShowName <=", value, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameIn(List<Boolean> values) {
            addCriterion("DenyShowName in", values, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameNotIn(List<Boolean> values) {
            addCriterion("DenyShowName not in", values, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyShowName between", value1, value2, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andDenyShowNameNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyShowName not between", value1, value2, "denyShowName");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillIsNull() {
            addCriterion("AttackSeeKill is null");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillIsNotNull() {
            addCriterion("AttackSeeKill is not null");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillEqualTo(Boolean value) {
            addCriterion("AttackSeeKill =", value, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillNotEqualTo(Boolean value) {
            addCriterion("AttackSeeKill <>", value, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillGreaterThan(Boolean value) {
            addCriterion("AttackSeeKill >", value, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AttackSeeKill >=", value, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillLessThan(Boolean value) {
            addCriterion("AttackSeeKill <", value, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillLessThanOrEqualTo(Boolean value) {
            addCriterion("AttackSeeKill <=", value, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillIn(List<Boolean> values) {
            addCriterion("AttackSeeKill in", values, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillNotIn(List<Boolean> values) {
            addCriterion("AttackSeeKill not in", values, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillBetween(Boolean value1, Boolean value2) {
            addCriterion("AttackSeeKill between", value1, value2, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andAttackSeeKillNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AttackSeeKill not between", value1, value2, "attackSeeKill");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedIsNull() {
            addCriterion("noBeCrossed is null");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedIsNotNull() {
            addCriterion("noBeCrossed is not null");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedEqualTo(Boolean value) {
            addCriterion("noBeCrossed =", value, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedNotEqualTo(Boolean value) {
            addCriterion("noBeCrossed <>", value, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedGreaterThan(Boolean value) {
            addCriterion("noBeCrossed >", value, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("noBeCrossed >=", value, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedLessThan(Boolean value) {
            addCriterion("noBeCrossed <", value, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedLessThanOrEqualTo(Boolean value) {
            addCriterion("noBeCrossed <=", value, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedIn(List<Boolean> values) {
            addCriterion("noBeCrossed in", values, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedNotIn(List<Boolean> values) {
            addCriterion("noBeCrossed not in", values, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedBetween(Boolean value1, Boolean value2) {
            addCriterion("noBeCrossed between", value1, value2, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andNoBeCrossedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("noBeCrossed not between", value1, value2, "noBeCrossed");
            return (Criteria) this;
        }

        public Criteria andAttackKillerIsNull() {
            addCriterion("AttackKiller is null");
            return (Criteria) this;
        }

        public Criteria andAttackKillerIsNotNull() {
            addCriterion("AttackKiller is not null");
            return (Criteria) this;
        }

        public Criteria andAttackKillerEqualTo(Boolean value) {
            addCriterion("AttackKiller =", value, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerNotEqualTo(Boolean value) {
            addCriterion("AttackKiller <>", value, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerGreaterThan(Boolean value) {
            addCriterion("AttackKiller >", value, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AttackKiller >=", value, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerLessThan(Boolean value) {
            addCriterion("AttackKiller <", value, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerLessThanOrEqualTo(Boolean value) {
            addCriterion("AttackKiller <=", value, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerIn(List<Boolean> values) {
            addCriterion("AttackKiller in", values, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerNotIn(List<Boolean> values) {
            addCriterion("AttackKiller not in", values, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerBetween(Boolean value1, Boolean value2) {
            addCriterion("AttackKiller between", value1, value2, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andAttackKillerNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AttackKiller not between", value1, value2, "attackKiller");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberIsNull() {
            addCriterion("ShowNameByNumber is null");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberIsNotNull() {
            addCriterion("ShowNameByNumber is not null");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberEqualTo(Boolean value) {
            addCriterion("ShowNameByNumber =", value, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberNotEqualTo(Boolean value) {
            addCriterion("ShowNameByNumber <>", value, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberGreaterThan(Boolean value) {
            addCriterion("ShowNameByNumber >", value, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ShowNameByNumber >=", value, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberLessThan(Boolean value) {
            addCriterion("ShowNameByNumber <", value, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberLessThanOrEqualTo(Boolean value) {
            addCriterion("ShowNameByNumber <=", value, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberIn(List<Boolean> values) {
            addCriterion("ShowNameByNumber in", values, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberNotIn(List<Boolean> values) {
            addCriterion("ShowNameByNumber not in", values, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberBetween(Boolean value1, Boolean value2) {
            addCriterion("ShowNameByNumber between", value1, value2, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andShowNameByNumberNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ShowNameByNumber not between", value1, value2, "showNameByNumber");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchIsNull() {
            addCriterion("DenyBeCatch is null");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchIsNotNull() {
            addCriterion("DenyBeCatch is not null");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchEqualTo(Boolean value) {
            addCriterion("DenyBeCatch =", value, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchNotEqualTo(Boolean value) {
            addCriterion("DenyBeCatch <>", value, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchGreaterThan(Boolean value) {
            addCriterion("DenyBeCatch >", value, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyBeCatch >=", value, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchLessThan(Boolean value) {
            addCriterion("DenyBeCatch <", value, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyBeCatch <=", value, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchIn(List<Boolean> values) {
            addCriterion("DenyBeCatch in", values, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchNotIn(List<Boolean> values) {
            addCriterion("DenyBeCatch not in", values, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyBeCatch between", value1, value2, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andDenyBeCatchNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyBeCatch not between", value1, value2, "denyBeCatch");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterIsNull() {
            addCriterion("CanAlwaysEnter is null");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterIsNotNull() {
            addCriterion("CanAlwaysEnter is not null");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterEqualTo(Boolean value) {
            addCriterion("CanAlwaysEnter =", value, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterNotEqualTo(Boolean value) {
            addCriterion("CanAlwaysEnter <>", value, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterGreaterThan(Boolean value) {
            addCriterion("CanAlwaysEnter >", value, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterGreaterThanOrEqualTo(Boolean value) {
            addCriterion("CanAlwaysEnter >=", value, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterLessThan(Boolean value) {
            addCriterion("CanAlwaysEnter <", value, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterLessThanOrEqualTo(Boolean value) {
            addCriterion("CanAlwaysEnter <=", value, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterIn(List<Boolean> values) {
            addCriterion("CanAlwaysEnter in", values, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterNotIn(List<Boolean> values) {
            addCriterion("CanAlwaysEnter not in", values, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterBetween(Boolean value1, Boolean value2) {
            addCriterion("CanAlwaysEnter between", value1, value2, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andCanAlwaysEnterNotBetween(Boolean value1, Boolean value2) {
            addCriterion("CanAlwaysEnter not between", value1, value2, "canAlwaysEnter");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillIsNull() {
            addCriterion("BeAttackNeedUseSkill is null");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillIsNotNull() {
            addCriterion("BeAttackNeedUseSkill is not null");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillEqualTo(Boolean value) {
            addCriterion("BeAttackNeedUseSkill =", value, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillNotEqualTo(Boolean value) {
            addCriterion("BeAttackNeedUseSkill <>", value, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillGreaterThan(Boolean value) {
            addCriterion("BeAttackNeedUseSkill >", value, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillGreaterThanOrEqualTo(Boolean value) {
            addCriterion("BeAttackNeedUseSkill >=", value, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillLessThan(Boolean value) {
            addCriterion("BeAttackNeedUseSkill <", value, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillLessThanOrEqualTo(Boolean value) {
            addCriterion("BeAttackNeedUseSkill <=", value, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillIn(List<Boolean> values) {
            addCriterion("BeAttackNeedUseSkill in", values, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillNotIn(List<Boolean> values) {
            addCriterion("BeAttackNeedUseSkill not in", values, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillBetween(Boolean value1, Boolean value2) {
            addCriterion("BeAttackNeedUseSkill between", value1, value2, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andBeAttackNeedUseSkillNotBetween(Boolean value1, Boolean value2) {
            addCriterion("BeAttackNeedUseSkill not between", value1, value2, "beAttackNeedUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillIsNull() {
            addCriterion("IdleUseSkill is null");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillIsNotNull() {
            addCriterion("IdleUseSkill is not null");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillEqualTo(Boolean value) {
            addCriterion("IdleUseSkill =", value, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillNotEqualTo(Boolean value) {
            addCriterion("IdleUseSkill <>", value, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillGreaterThan(Boolean value) {
            addCriterion("IdleUseSkill >", value, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IdleUseSkill >=", value, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillLessThan(Boolean value) {
            addCriterion("IdleUseSkill <", value, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillLessThanOrEqualTo(Boolean value) {
            addCriterion("IdleUseSkill <=", value, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillIn(List<Boolean> values) {
            addCriterion("IdleUseSkill in", values, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillNotIn(List<Boolean> values) {
            addCriterion("IdleUseSkill not in", values, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillBetween(Boolean value1, Boolean value2) {
            addCriterion("IdleUseSkill between", value1, value2, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andIdleUseSkillNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IdleUseSkill not between", value1, value2, "idleUseSkill");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactIsNull() {
            addCriterion("PetNoAttact is null");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactIsNotNull() {
            addCriterion("PetNoAttact is not null");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactEqualTo(Boolean value) {
            addCriterion("PetNoAttact =", value, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactNotEqualTo(Boolean value) {
            addCriterion("PetNoAttact <>", value, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactGreaterThan(Boolean value) {
            addCriterion("PetNoAttact >", value, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactGreaterThanOrEqualTo(Boolean value) {
            addCriterion("PetNoAttact >=", value, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactLessThan(Boolean value) {
            addCriterion("PetNoAttact <", value, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactLessThanOrEqualTo(Boolean value) {
            addCriterion("PetNoAttact <=", value, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactIn(List<Boolean> values) {
            addCriterion("PetNoAttact in", values, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactNotIn(List<Boolean> values) {
            addCriterion("PetNoAttact not in", values, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactBetween(Boolean value1, Boolean value2) {
            addCriterion("PetNoAttact between", value1, value2, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andPetNoAttactNotBetween(Boolean value1, Boolean value2) {
            addCriterion("PetNoAttact not between", value1, value2, "petNoAttact");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberIsNull() {
            addCriterion("DenyAddNumber is null");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberIsNotNull() {
            addCriterion("DenyAddNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberEqualTo(Boolean value) {
            addCriterion("DenyAddNumber =", value, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberNotEqualTo(Boolean value) {
            addCriterion("DenyAddNumber <>", value, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberGreaterThan(Boolean value) {
            addCriterion("DenyAddNumber >", value, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenyAddNumber >=", value, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberLessThan(Boolean value) {
            addCriterion("DenyAddNumber <", value, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberLessThanOrEqualTo(Boolean value) {
            addCriterion("DenyAddNumber <=", value, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberIn(List<Boolean> values) {
            addCriterion("DenyAddNumber in", values, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberNotIn(List<Boolean> values) {
            addCriterion("DenyAddNumber not in", values, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAddNumber between", value1, value2, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andDenyAddNumberNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenyAddNumber not between", value1, value2, "denyAddNumber");
            return (Criteria) this;
        }

        public Criteria andAttackPetIsNull() {
            addCriterion("AttackPet is null");
            return (Criteria) this;
        }

        public Criteria andAttackPetIsNotNull() {
            addCriterion("AttackPet is not null");
            return (Criteria) this;
        }

        public Criteria andAttackPetEqualTo(Boolean value) {
            addCriterion("AttackPet =", value, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetNotEqualTo(Boolean value) {
            addCriterion("AttackPet <>", value, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetGreaterThan(Boolean value) {
            addCriterion("AttackPet >", value, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AttackPet >=", value, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetLessThan(Boolean value) {
            addCriterion("AttackPet <", value, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetLessThanOrEqualTo(Boolean value) {
            addCriterion("AttackPet <=", value, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetIn(List<Boolean> values) {
            addCriterion("AttackPet in", values, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetNotIn(List<Boolean> values) {
            addCriterion("AttackPet not in", values, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetBetween(Boolean value1, Boolean value2) {
            addCriterion("AttackPet between", value1, value2, "attackPet");
            return (Criteria) this;
        }

        public Criteria andAttackPetNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AttackPet not between", value1, value2, "attackPet");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarIsNull() {
            addCriterion("noUseAStar is null");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarIsNotNull() {
            addCriterion("noUseAStar is not null");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarEqualTo(Boolean value) {
            addCriterion("noUseAStar =", value, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarNotEqualTo(Boolean value) {
            addCriterion("noUseAStar <>", value, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarGreaterThan(Boolean value) {
            addCriterion("noUseAStar >", value, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarGreaterThanOrEqualTo(Boolean value) {
            addCriterion("noUseAStar >=", value, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarLessThan(Boolean value) {
            addCriterion("noUseAStar <", value, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarLessThanOrEqualTo(Boolean value) {
            addCriterion("noUseAStar <=", value, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarIn(List<Boolean> values) {
            addCriterion("noUseAStar in", values, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarNotIn(List<Boolean> values) {
            addCriterion("noUseAStar not in", values, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarBetween(Boolean value1, Boolean value2) {
            addCriterion("noUseAStar between", value1, value2, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andNoUseAStarNotBetween(Boolean value1, Boolean value2) {
            addCriterion("noUseAStar not between", value1, value2, "noUseAStar");
            return (Criteria) this;
        }

        public Criteria andMoveTelportIsNull() {
            addCriterion("moveTelport is null");
            return (Criteria) this;
        }

        public Criteria andMoveTelportIsNotNull() {
            addCriterion("moveTelport is not null");
            return (Criteria) this;
        }

        public Criteria andMoveTelportEqualTo(Boolean value) {
            addCriterion("moveTelport =", value, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportNotEqualTo(Boolean value) {
            addCriterion("moveTelport <>", value, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportGreaterThan(Boolean value) {
            addCriterion("moveTelport >", value, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportGreaterThanOrEqualTo(Boolean value) {
            addCriterion("moveTelport >=", value, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportLessThan(Boolean value) {
            addCriterion("moveTelport <", value, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportLessThanOrEqualTo(Boolean value) {
            addCriterion("moveTelport <=", value, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportIn(List<Boolean> values) {
            addCriterion("moveTelport in", values, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportNotIn(List<Boolean> values) {
            addCriterion("moveTelport not in", values, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportBetween(Boolean value1, Boolean value2) {
            addCriterion("moveTelport between", value1, value2, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andMoveTelportNotBetween(Boolean value1, Boolean value2) {
            addCriterion("moveTelport not between", value1, value2, "moveTelport");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackIsNull() {
            addCriterion("NoAttactBack is null");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackIsNotNull() {
            addCriterion("NoAttactBack is not null");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackEqualTo(Boolean value) {
            addCriterion("NoAttactBack =", value, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackNotEqualTo(Boolean value) {
            addCriterion("NoAttactBack <>", value, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackGreaterThan(Boolean value) {
            addCriterion("NoAttactBack >", value, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackGreaterThanOrEqualTo(Boolean value) {
            addCriterion("NoAttactBack >=", value, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackLessThan(Boolean value) {
            addCriterion("NoAttactBack <", value, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackLessThanOrEqualTo(Boolean value) {
            addCriterion("NoAttactBack <=", value, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackIn(List<Boolean> values) {
            addCriterion("NoAttactBack in", values, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackNotIn(List<Boolean> values) {
            addCriterion("NoAttactBack not in", values, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackBetween(Boolean value1, Boolean value2) {
            addCriterion("NoAttactBack between", value1, value2, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoAttactBackNotBetween(Boolean value1, Boolean value2) {
            addCriterion("NoAttactBack not between", value1, value2, "noAttactBack");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeIsNull() {
            addCriterion("noReturnHome is null");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeIsNotNull() {
            addCriterion("noReturnHome is not null");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeEqualTo(Boolean value) {
            addCriterion("noReturnHome =", value, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeNotEqualTo(Boolean value) {
            addCriterion("noReturnHome <>", value, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeGreaterThan(Boolean value) {
            addCriterion("noReturnHome >", value, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("noReturnHome >=", value, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeLessThan(Boolean value) {
            addCriterion("noReturnHome <", value, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeLessThanOrEqualTo(Boolean value) {
            addCriterion("noReturnHome <=", value, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeIn(List<Boolean> values) {
            addCriterion("noReturnHome in", values, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeNotIn(List<Boolean> values) {
            addCriterion("noReturnHome not in", values, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeBetween(Boolean value1, Boolean value2) {
            addCriterion("noReturnHome between", value1, value2, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andNoReturnHomeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("noReturnHome not between", value1, value2, "noReturnHome");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptIsNull() {
            addCriterion("attackToScript is null");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptIsNotNull() {
            addCriterion("attackToScript is not null");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptEqualTo(Boolean value) {
            addCriterion("attackToScript =", value, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptNotEqualTo(Boolean value) {
            addCriterion("attackToScript <>", value, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptGreaterThan(Boolean value) {
            addCriterion("attackToScript >", value, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptGreaterThanOrEqualTo(Boolean value) {
            addCriterion("attackToScript >=", value, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptLessThan(Boolean value) {
            addCriterion("attackToScript <", value, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptLessThanOrEqualTo(Boolean value) {
            addCriterion("attackToScript <=", value, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptIn(List<Boolean> values) {
            addCriterion("attackToScript in", values, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptNotIn(List<Boolean> values) {
            addCriterion("attackToScript not in", values, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptBetween(Boolean value1, Boolean value2) {
            addCriterion("attackToScript between", value1, value2, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andAttackToScriptNotBetween(Boolean value1, Boolean value2) {
            addCriterion("attackToScript not between", value1, value2, "attackToScript");
            return (Criteria) this;
        }

        public Criteria andDenySetDirIsNull() {
            addCriterion("DenySetDir is null");
            return (Criteria) this;
        }

        public Criteria andDenySetDirIsNotNull() {
            addCriterion("DenySetDir is not null");
            return (Criteria) this;
        }

        public Criteria andDenySetDirEqualTo(Boolean value) {
            addCriterion("DenySetDir =", value, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirNotEqualTo(Boolean value) {
            addCriterion("DenySetDir <>", value, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirGreaterThan(Boolean value) {
            addCriterion("DenySetDir >", value, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirGreaterThanOrEqualTo(Boolean value) {
            addCriterion("DenySetDir >=", value, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirLessThan(Boolean value) {
            addCriterion("DenySetDir <", value, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirLessThanOrEqualTo(Boolean value) {
            addCriterion("DenySetDir <=", value, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirIn(List<Boolean> values) {
            addCriterion("DenySetDir in", values, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirNotIn(List<Boolean> values) {
            addCriterion("DenySetDir not in", values, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirBetween(Boolean value1, Boolean value2) {
            addCriterion("DenySetDir between", value1, value2, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andDenySetDirNotBetween(Boolean value1, Boolean value2) {
            addCriterion("DenySetDir not between", value1, value2, "denySetDir");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptIsNull() {
            addCriterion("bDeathTriggerScript is null");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptIsNotNull() {
            addCriterion("bDeathTriggerScript is not null");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptEqualTo(Boolean value) {
            addCriterion("bDeathTriggerScript =", value, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptNotEqualTo(Boolean value) {
            addCriterion("bDeathTriggerScript <>", value, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptGreaterThan(Boolean value) {
            addCriterion("bDeathTriggerScript >", value, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bDeathTriggerScript >=", value, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptLessThan(Boolean value) {
            addCriterion("bDeathTriggerScript <", value, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptLessThanOrEqualTo(Boolean value) {
            addCriterion("bDeathTriggerScript <=", value, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptIn(List<Boolean> values) {
            addCriterion("bDeathTriggerScript in", values, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptNotIn(List<Boolean> values) {
            addCriterion("bDeathTriggerScript not in", values, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptBetween(Boolean value1, Boolean value2) {
            addCriterion("bDeathTriggerScript between", value1, value2, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBDeathTriggerScriptNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bDeathTriggerScript not between", value1, value2, "bDeathTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptIsNull() {
            addCriterion("bMobTriggerScript is null");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptIsNotNull() {
            addCriterion("bMobTriggerScript is not null");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptEqualTo(Boolean value) {
            addCriterion("bMobTriggerScript =", value, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptNotEqualTo(Boolean value) {
            addCriterion("bMobTriggerScript <>", value, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptGreaterThan(Boolean value) {
            addCriterion("bMobTriggerScript >", value, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bMobTriggerScript >=", value, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptLessThan(Boolean value) {
            addCriterion("bMobTriggerScript <", value, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptLessThanOrEqualTo(Boolean value) {
            addCriterion("bMobTriggerScript <=", value, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptIn(List<Boolean> values) {
            addCriterion("bMobTriggerScript in", values, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptNotIn(List<Boolean> values) {
            addCriterion("bMobTriggerScript not in", values, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptBetween(Boolean value1, Boolean value2) {
            addCriterion("bMobTriggerScript between", value1, value2, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBMobTriggerScriptNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bMobTriggerScript not between", value1, value2, "bMobTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptIsNull() {
            addCriterion("bLiveTimeOutTriggerScript is null");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptIsNotNull() {
            addCriterion("bLiveTimeOutTriggerScript is not null");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptEqualTo(Boolean value) {
            addCriterion("bLiveTimeOutTriggerScript =", value, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptNotEqualTo(Boolean value) {
            addCriterion("bLiveTimeOutTriggerScript <>", value, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptGreaterThan(Boolean value) {
            addCriterion("bLiveTimeOutTriggerScript >", value, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bLiveTimeOutTriggerScript >=", value, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptLessThan(Boolean value) {
            addCriterion("bLiveTimeOutTriggerScript <", value, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptLessThanOrEqualTo(Boolean value) {
            addCriterion("bLiveTimeOutTriggerScript <=", value, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptIn(List<Boolean> values) {
            addCriterion("bLiveTimeOutTriggerScript in", values, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptNotIn(List<Boolean> values) {
            addCriterion("bLiveTimeOutTriggerScript not in", values, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptBetween(Boolean value1, Boolean value2) {
            addCriterion("bLiveTimeOutTriggerScript between", value1, value2, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andBLiveTimeOutTriggerScriptNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bLiveTimeOutTriggerScript not between", value1, value2, "bLiveTimeOutTriggerScript");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameIsNull() {
            addCriterion("showVestEntityName is null");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameIsNotNull() {
            addCriterion("showVestEntityName is not null");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameEqualTo(Boolean value) {
            addCriterion("showVestEntityName =", value, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameNotEqualTo(Boolean value) {
            addCriterion("showVestEntityName <>", value, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameGreaterThan(Boolean value) {
            addCriterion("showVestEntityName >", value, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameGreaterThanOrEqualTo(Boolean value) {
            addCriterion("showVestEntityName >=", value, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameLessThan(Boolean value) {
            addCriterion("showVestEntityName <", value, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameLessThanOrEqualTo(Boolean value) {
            addCriterion("showVestEntityName <=", value, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameIn(List<Boolean> values) {
            addCriterion("showVestEntityName in", values, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameNotIn(List<Boolean> values) {
            addCriterion("showVestEntityName not in", values, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameBetween(Boolean value1, Boolean value2) {
            addCriterion("showVestEntityName between", value1, value2, "showVestEntityName");
            return (Criteria) this;
        }

        public Criteria andShowVestEntityNameNotBetween(Boolean value1, Boolean value2) {
            addCriterion("showVestEntityName not between", value1, value2, "showVestEntityName");
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