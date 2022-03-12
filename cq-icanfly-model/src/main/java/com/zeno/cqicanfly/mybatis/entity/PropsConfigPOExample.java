package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class PropsConfigPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PropsConfigPOExample() {
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

        public Criteria andAttrIdIsNull() {
            addCriterion("attrId is null");
            return (Criteria) this;
        }

        public Criteria andAttrIdIsNotNull() {
            addCriterion("attrId is not null");
            return (Criteria) this;
        }

        public Criteria andAttrIdEqualTo(Integer value) {
            addCriterion("attrId =", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotEqualTo(Integer value) {
            addCriterion("attrId <>", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThan(Integer value) {
            addCriterion("attrId >", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("attrId >=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThan(Integer value) {
            addCriterion("attrId <", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdLessThanOrEqualTo(Integer value) {
            addCriterion("attrId <=", value, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdIn(List<Integer> values) {
            addCriterion("attrId in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotIn(List<Integer> values) {
            addCriterion("attrId not in", values, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdBetween(Integer value1, Integer value2) {
            addCriterion("attrId between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andAttrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("attrId not between", value1, value2, "attrId");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddIsNull() {
            addCriterion("nMaxHpAdd is null");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddIsNotNull() {
            addCriterion("nMaxHpAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddEqualTo(Integer value) {
            addCriterion("nMaxHpAdd =", value, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddNotEqualTo(Integer value) {
            addCriterion("nMaxHpAdd <>", value, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddGreaterThan(Integer value) {
            addCriterion("nMaxHpAdd >", value, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMaxHpAdd >=", value, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddLessThan(Integer value) {
            addCriterion("nMaxHpAdd <", value, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddLessThanOrEqualTo(Integer value) {
            addCriterion("nMaxHpAdd <=", value, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddIn(List<Integer> values) {
            addCriterion("nMaxHpAdd in", values, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddNotIn(List<Integer> values) {
            addCriterion("nMaxHpAdd not in", values, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddBetween(Integer value1, Integer value2) {
            addCriterion("nMaxHpAdd between", value1, value2, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxHpAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nMaxHpAdd not between", value1, value2, "nMaxHpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddIsNull() {
            addCriterion("nMaxMpAdd is null");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddIsNotNull() {
            addCriterion("nMaxMpAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddEqualTo(Integer value) {
            addCriterion("nMaxMpAdd =", value, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddNotEqualTo(Integer value) {
            addCriterion("nMaxMpAdd <>", value, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddGreaterThan(Integer value) {
            addCriterion("nMaxMpAdd >", value, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMaxMpAdd >=", value, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddLessThan(Integer value) {
            addCriterion("nMaxMpAdd <", value, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddLessThanOrEqualTo(Integer value) {
            addCriterion("nMaxMpAdd <=", value, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddIn(List<Integer> values) {
            addCriterion("nMaxMpAdd in", values, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddNotIn(List<Integer> values) {
            addCriterion("nMaxMpAdd not in", values, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddBetween(Integer value1, Integer value2) {
            addCriterion("nMaxMpAdd between", value1, value2, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNMaxMpAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nMaxMpAdd not between", value1, value2, "nMaxMpAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddIsNull() {
            addCriterion("nPhysicalAttackMinAdd is null");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddIsNotNull() {
            addCriterion("nPhysicalAttackMinAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddEqualTo(Integer value) {
            addCriterion("nPhysicalAttackMinAdd =", value, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddNotEqualTo(Integer value) {
            addCriterion("nPhysicalAttackMinAdd <>", value, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddGreaterThan(Integer value) {
            addCriterion("nPhysicalAttackMinAdd >", value, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nPhysicalAttackMinAdd >=", value, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddLessThan(Integer value) {
            addCriterion("nPhysicalAttackMinAdd <", value, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddLessThanOrEqualTo(Integer value) {
            addCriterion("nPhysicalAttackMinAdd <=", value, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddIn(List<Integer> values) {
            addCriterion("nPhysicalAttackMinAdd in", values, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddNotIn(List<Integer> values) {
            addCriterion("nPhysicalAttackMinAdd not in", values, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddBetween(Integer value1, Integer value2) {
            addCriterion("nPhysicalAttackMinAdd between", value1, value2, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMinAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nPhysicalAttackMinAdd not between", value1, value2, "nPhysicalAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddIsNull() {
            addCriterion("nPhysicalAttackMaxAdd is null");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddIsNotNull() {
            addCriterion("nPhysicalAttackMaxAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddEqualTo(Integer value) {
            addCriterion("nPhysicalAttackMaxAdd =", value, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddNotEqualTo(Integer value) {
            addCriterion("nPhysicalAttackMaxAdd <>", value, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddGreaterThan(Integer value) {
            addCriterion("nPhysicalAttackMaxAdd >", value, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nPhysicalAttackMaxAdd >=", value, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddLessThan(Integer value) {
            addCriterion("nPhysicalAttackMaxAdd <", value, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddLessThanOrEqualTo(Integer value) {
            addCriterion("nPhysicalAttackMaxAdd <=", value, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddIn(List<Integer> values) {
            addCriterion("nPhysicalAttackMaxAdd in", values, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddNotIn(List<Integer> values) {
            addCriterion("nPhysicalAttackMaxAdd not in", values, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddBetween(Integer value1, Integer value2) {
            addCriterion("nPhysicalAttackMaxAdd between", value1, value2, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalAttackMaxAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nPhysicalAttackMaxAdd not between", value1, value2, "nPhysicalAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddIsNull() {
            addCriterion("nMagicAttackMinAdd is null");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddIsNotNull() {
            addCriterion("nMagicAttackMinAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddEqualTo(Integer value) {
            addCriterion("nMagicAttackMinAdd =", value, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddNotEqualTo(Integer value) {
            addCriterion("nMagicAttackMinAdd <>", value, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddGreaterThan(Integer value) {
            addCriterion("nMagicAttackMinAdd >", value, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMagicAttackMinAdd >=", value, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddLessThan(Integer value) {
            addCriterion("nMagicAttackMinAdd <", value, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddLessThanOrEqualTo(Integer value) {
            addCriterion("nMagicAttackMinAdd <=", value, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddIn(List<Integer> values) {
            addCriterion("nMagicAttackMinAdd in", values, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddNotIn(List<Integer> values) {
            addCriterion("nMagicAttackMinAdd not in", values, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddBetween(Integer value1, Integer value2) {
            addCriterion("nMagicAttackMinAdd between", value1, value2, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMinAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nMagicAttackMinAdd not between", value1, value2, "nMagicAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddIsNull() {
            addCriterion("nMagicAttackMaxAdd is null");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddIsNotNull() {
            addCriterion("nMagicAttackMaxAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddEqualTo(Integer value) {
            addCriterion("nMagicAttackMaxAdd =", value, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddNotEqualTo(Integer value) {
            addCriterion("nMagicAttackMaxAdd <>", value, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddGreaterThan(Integer value) {
            addCriterion("nMagicAttackMaxAdd >", value, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMagicAttackMaxAdd >=", value, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddLessThan(Integer value) {
            addCriterion("nMagicAttackMaxAdd <", value, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddLessThanOrEqualTo(Integer value) {
            addCriterion("nMagicAttackMaxAdd <=", value, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddIn(List<Integer> values) {
            addCriterion("nMagicAttackMaxAdd in", values, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddNotIn(List<Integer> values) {
            addCriterion("nMagicAttackMaxAdd not in", values, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddBetween(Integer value1, Integer value2) {
            addCriterion("nMagicAttackMaxAdd between", value1, value2, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicAttackMaxAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nMagicAttackMaxAdd not between", value1, value2, "nMagicAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddIsNull() {
            addCriterion("nWizardAttackMinAdd is null");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddIsNotNull() {
            addCriterion("nWizardAttackMinAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddEqualTo(Integer value) {
            addCriterion("nWizardAttackMinAdd =", value, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddNotEqualTo(Integer value) {
            addCriterion("nWizardAttackMinAdd <>", value, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddGreaterThan(Integer value) {
            addCriterion("nWizardAttackMinAdd >", value, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nWizardAttackMinAdd >=", value, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddLessThan(Integer value) {
            addCriterion("nWizardAttackMinAdd <", value, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddLessThanOrEqualTo(Integer value) {
            addCriterion("nWizardAttackMinAdd <=", value, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddIn(List<Integer> values) {
            addCriterion("nWizardAttackMinAdd in", values, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddNotIn(List<Integer> values) {
            addCriterion("nWizardAttackMinAdd not in", values, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddBetween(Integer value1, Integer value2) {
            addCriterion("nWizardAttackMinAdd between", value1, value2, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMinAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nWizardAttackMinAdd not between", value1, value2, "nWizardAttackMinAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddIsNull() {
            addCriterion("nWizardAttackMaxAdd is null");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddIsNotNull() {
            addCriterion("nWizardAttackMaxAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddEqualTo(Integer value) {
            addCriterion("nWizardAttackMaxAdd =", value, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddNotEqualTo(Integer value) {
            addCriterion("nWizardAttackMaxAdd <>", value, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddGreaterThan(Integer value) {
            addCriterion("nWizardAttackMaxAdd >", value, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nWizardAttackMaxAdd >=", value, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddLessThan(Integer value) {
            addCriterion("nWizardAttackMaxAdd <", value, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddLessThanOrEqualTo(Integer value) {
            addCriterion("nWizardAttackMaxAdd <=", value, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddIn(List<Integer> values) {
            addCriterion("nWizardAttackMaxAdd in", values, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddNotIn(List<Integer> values) {
            addCriterion("nWizardAttackMaxAdd not in", values, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddBetween(Integer value1, Integer value2) {
            addCriterion("nWizardAttackMaxAdd between", value1, value2, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNWizardAttackMaxAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nWizardAttackMaxAdd not between", value1, value2, "nWizardAttackMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddIsNull() {
            addCriterion("nPhysicalDefenceMinAdd is null");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddIsNotNull() {
            addCriterion("nPhysicalDefenceMinAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddEqualTo(Integer value) {
            addCriterion("nPhysicalDefenceMinAdd =", value, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddNotEqualTo(Integer value) {
            addCriterion("nPhysicalDefenceMinAdd <>", value, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddGreaterThan(Integer value) {
            addCriterion("nPhysicalDefenceMinAdd >", value, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nPhysicalDefenceMinAdd >=", value, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddLessThan(Integer value) {
            addCriterion("nPhysicalDefenceMinAdd <", value, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddLessThanOrEqualTo(Integer value) {
            addCriterion("nPhysicalDefenceMinAdd <=", value, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddIn(List<Integer> values) {
            addCriterion("nPhysicalDefenceMinAdd in", values, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddNotIn(List<Integer> values) {
            addCriterion("nPhysicalDefenceMinAdd not in", values, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddBetween(Integer value1, Integer value2) {
            addCriterion("nPhysicalDefenceMinAdd between", value1, value2, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMinAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nPhysicalDefenceMinAdd not between", value1, value2, "nPhysicalDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddIsNull() {
            addCriterion("nPhysicalDefenceMaxAdd is null");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddIsNotNull() {
            addCriterion("nPhysicalDefenceMaxAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddEqualTo(Integer value) {
            addCriterion("nPhysicalDefenceMaxAdd =", value, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddNotEqualTo(Integer value) {
            addCriterion("nPhysicalDefenceMaxAdd <>", value, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddGreaterThan(Integer value) {
            addCriterion("nPhysicalDefenceMaxAdd >", value, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nPhysicalDefenceMaxAdd >=", value, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddLessThan(Integer value) {
            addCriterion("nPhysicalDefenceMaxAdd <", value, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddLessThanOrEqualTo(Integer value) {
            addCriterion("nPhysicalDefenceMaxAdd <=", value, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddIn(List<Integer> values) {
            addCriterion("nPhysicalDefenceMaxAdd in", values, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddNotIn(List<Integer> values) {
            addCriterion("nPhysicalDefenceMaxAdd not in", values, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddBetween(Integer value1, Integer value2) {
            addCriterion("nPhysicalDefenceMaxAdd between", value1, value2, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNPhysicalDefenceMaxAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nPhysicalDefenceMaxAdd not between", value1, value2, "nPhysicalDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddIsNull() {
            addCriterion("nMagicDefenceMinAdd is null");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddIsNotNull() {
            addCriterion("nMagicDefenceMinAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddEqualTo(Integer value) {
            addCriterion("nMagicDefenceMinAdd =", value, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddNotEqualTo(Integer value) {
            addCriterion("nMagicDefenceMinAdd <>", value, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddGreaterThan(Integer value) {
            addCriterion("nMagicDefenceMinAdd >", value, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMagicDefenceMinAdd >=", value, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddLessThan(Integer value) {
            addCriterion("nMagicDefenceMinAdd <", value, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddLessThanOrEqualTo(Integer value) {
            addCriterion("nMagicDefenceMinAdd <=", value, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddIn(List<Integer> values) {
            addCriterion("nMagicDefenceMinAdd in", values, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddNotIn(List<Integer> values) {
            addCriterion("nMagicDefenceMinAdd not in", values, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddBetween(Integer value1, Integer value2) {
            addCriterion("nMagicDefenceMinAdd between", value1, value2, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMinAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nMagicDefenceMinAdd not between", value1, value2, "nMagicDefenceMinAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddIsNull() {
            addCriterion("nMagicDefenceMaxAdd is null");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddIsNotNull() {
            addCriterion("nMagicDefenceMaxAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddEqualTo(Integer value) {
            addCriterion("nMagicDefenceMaxAdd =", value, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddNotEqualTo(Integer value) {
            addCriterion("nMagicDefenceMaxAdd <>", value, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddGreaterThan(Integer value) {
            addCriterion("nMagicDefenceMaxAdd >", value, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMagicDefenceMaxAdd >=", value, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddLessThan(Integer value) {
            addCriterion("nMagicDefenceMaxAdd <", value, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddLessThanOrEqualTo(Integer value) {
            addCriterion("nMagicDefenceMaxAdd <=", value, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddIn(List<Integer> values) {
            addCriterion("nMagicDefenceMaxAdd in", values, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddNotIn(List<Integer> values) {
            addCriterion("nMagicDefenceMaxAdd not in", values, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddBetween(Integer value1, Integer value2) {
            addCriterion("nMagicDefenceMaxAdd between", value1, value2, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDefenceMaxAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nMagicDefenceMaxAdd not between", value1, value2, "nMagicDefenceMaxAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddIsNull() {
            addCriterion("nHitValueAdd is null");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddIsNotNull() {
            addCriterion("nHitValueAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddEqualTo(Integer value) {
            addCriterion("nHitValueAdd =", value, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddNotEqualTo(Integer value) {
            addCriterion("nHitValueAdd <>", value, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddGreaterThan(Integer value) {
            addCriterion("nHitValueAdd >", value, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nHitValueAdd >=", value, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddLessThan(Integer value) {
            addCriterion("nHitValueAdd <", value, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddLessThanOrEqualTo(Integer value) {
            addCriterion("nHitValueAdd <=", value, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddIn(List<Integer> values) {
            addCriterion("nHitValueAdd in", values, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddNotIn(List<Integer> values) {
            addCriterion("nHitValueAdd not in", values, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddBetween(Integer value1, Integer value2) {
            addCriterion("nHitValueAdd between", value1, value2, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNHitValueAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nHitValueAdd not between", value1, value2, "nHitValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddIsNull() {
            addCriterion("nDogValueAdd is null");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddIsNotNull() {
            addCriterion("nDogValueAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddEqualTo(Integer value) {
            addCriterion("nDogValueAdd =", value, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddNotEqualTo(Integer value) {
            addCriterion("nDogValueAdd <>", value, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddGreaterThan(Integer value) {
            addCriterion("nDogValueAdd >", value, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nDogValueAdd >=", value, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddLessThan(Integer value) {
            addCriterion("nDogValueAdd <", value, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddLessThanOrEqualTo(Integer value) {
            addCriterion("nDogValueAdd <=", value, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddIn(List<Integer> values) {
            addCriterion("nDogValueAdd in", values, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddNotIn(List<Integer> values) {
            addCriterion("nDogValueAdd not in", values, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddBetween(Integer value1, Integer value2) {
            addCriterion("nDogValueAdd between", value1, value2, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNDogValueAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nDogValueAdd not between", value1, value2, "nDogValueAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddIsNull() {
            addCriterion("nMagicHitRateAdd is null");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddIsNotNull() {
            addCriterion("nMagicHitRateAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddEqualTo(Integer value) {
            addCriterion("nMagicHitRateAdd =", value, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddNotEqualTo(Integer value) {
            addCriterion("nMagicHitRateAdd <>", value, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddGreaterThan(Integer value) {
            addCriterion("nMagicHitRateAdd >", value, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMagicHitRateAdd >=", value, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddLessThan(Integer value) {
            addCriterion("nMagicHitRateAdd <", value, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddLessThanOrEqualTo(Integer value) {
            addCriterion("nMagicHitRateAdd <=", value, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddIn(List<Integer> values) {
            addCriterion("nMagicHitRateAdd in", values, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddNotIn(List<Integer> values) {
            addCriterion("nMagicHitRateAdd not in", values, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddBetween(Integer value1, Integer value2) {
            addCriterion("nMagicHitRateAdd between", value1, value2, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicHitRateAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nMagicHitRateAdd not between", value1, value2, "nMagicHitRateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddIsNull() {
            addCriterion("nMagicDogerateAdd is null");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddIsNotNull() {
            addCriterion("nMagicDogerateAdd is not null");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddEqualTo(Integer value) {
            addCriterion("nMagicDogerateAdd =", value, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddNotEqualTo(Integer value) {
            addCriterion("nMagicDogerateAdd <>", value, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddGreaterThan(Integer value) {
            addCriterion("nMagicDogerateAdd >", value, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMagicDogerateAdd >=", value, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddLessThan(Integer value) {
            addCriterion("nMagicDogerateAdd <", value, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddLessThanOrEqualTo(Integer value) {
            addCriterion("nMagicDogerateAdd <=", value, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddIn(List<Integer> values) {
            addCriterion("nMagicDogerateAdd in", values, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddNotIn(List<Integer> values) {
            addCriterion("nMagicDogerateAdd not in", values, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddBetween(Integer value1, Integer value2) {
            addCriterion("nMagicDogerateAdd between", value1, value2, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andNMagicDogerateAddNotBetween(Integer value1, Integer value2) {
            addCriterion("nMagicDogerateAdd not between", value1, value2, "nMagicDogerateAdd");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewIsNull() {
            addCriterion("fHpRateRenew is null");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewIsNotNull() {
            addCriterion("fHpRateRenew is not null");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewEqualTo(Integer value) {
            addCriterion("fHpRateRenew =", value, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewNotEqualTo(Integer value) {
            addCriterion("fHpRateRenew <>", value, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewGreaterThan(Integer value) {
            addCriterion("fHpRateRenew >", value, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewGreaterThanOrEqualTo(Integer value) {
            addCriterion("fHpRateRenew >=", value, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewLessThan(Integer value) {
            addCriterion("fHpRateRenew <", value, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewLessThanOrEqualTo(Integer value) {
            addCriterion("fHpRateRenew <=", value, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewIn(List<Integer> values) {
            addCriterion("fHpRateRenew in", values, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewNotIn(List<Integer> values) {
            addCriterion("fHpRateRenew not in", values, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewBetween(Integer value1, Integer value2) {
            addCriterion("fHpRateRenew between", value1, value2, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFHpRateRenewNotBetween(Integer value1, Integer value2) {
            addCriterion("fHpRateRenew not between", value1, value2, "fHpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewIsNull() {
            addCriterion("fMpRateRenew is null");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewIsNotNull() {
            addCriterion("fMpRateRenew is not null");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewEqualTo(Integer value) {
            addCriterion("fMpRateRenew =", value, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewNotEqualTo(Integer value) {
            addCriterion("fMpRateRenew <>", value, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewGreaterThan(Integer value) {
            addCriterion("fMpRateRenew >", value, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewGreaterThanOrEqualTo(Integer value) {
            addCriterion("fMpRateRenew >=", value, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewLessThan(Integer value) {
            addCriterion("fMpRateRenew <", value, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewLessThanOrEqualTo(Integer value) {
            addCriterion("fMpRateRenew <=", value, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewIn(List<Integer> values) {
            addCriterion("fMpRateRenew in", values, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewNotIn(List<Integer> values) {
            addCriterion("fMpRateRenew not in", values, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewBetween(Integer value1, Integer value2) {
            addCriterion("fMpRateRenew between", value1, value2, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andFMpRateRenewNotBetween(Integer value1, Integer value2) {
            addCriterion("fMpRateRenew not between", value1, value2, "fMpRateRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewIsNull() {
            addCriterion("nHpRenew is null");
            return (Criteria) this;
        }

        public Criteria andNHpRenewIsNotNull() {
            addCriterion("nHpRenew is not null");
            return (Criteria) this;
        }

        public Criteria andNHpRenewEqualTo(Integer value) {
            addCriterion("nHpRenew =", value, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewNotEqualTo(Integer value) {
            addCriterion("nHpRenew <>", value, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewGreaterThan(Integer value) {
            addCriterion("nHpRenew >", value, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewGreaterThanOrEqualTo(Integer value) {
            addCriterion("nHpRenew >=", value, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewLessThan(Integer value) {
            addCriterion("nHpRenew <", value, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewLessThanOrEqualTo(Integer value) {
            addCriterion("nHpRenew <=", value, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewIn(List<Integer> values) {
            addCriterion("nHpRenew in", values, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewNotIn(List<Integer> values) {
            addCriterion("nHpRenew not in", values, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewBetween(Integer value1, Integer value2) {
            addCriterion("nHpRenew between", value1, value2, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNHpRenewNotBetween(Integer value1, Integer value2) {
            addCriterion("nHpRenew not between", value1, value2, "nHpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewIsNull() {
            addCriterion("nMpRenew is null");
            return (Criteria) this;
        }

        public Criteria andNMpRenewIsNotNull() {
            addCriterion("nMpRenew is not null");
            return (Criteria) this;
        }

        public Criteria andNMpRenewEqualTo(Integer value) {
            addCriterion("nMpRenew =", value, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewNotEqualTo(Integer value) {
            addCriterion("nMpRenew <>", value, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewGreaterThan(Integer value) {
            addCriterion("nMpRenew >", value, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMpRenew >=", value, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewLessThan(Integer value) {
            addCriterion("nMpRenew <", value, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewLessThanOrEqualTo(Integer value) {
            addCriterion("nMpRenew <=", value, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewIn(List<Integer> values) {
            addCriterion("nMpRenew in", values, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewNotIn(List<Integer> values) {
            addCriterion("nMpRenew not in", values, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewBetween(Integer value1, Integer value2) {
            addCriterion("nMpRenew between", value1, value2, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMpRenewNotBetween(Integer value1, Integer value2) {
            addCriterion("nMpRenew not between", value1, value2, "nMpRenew");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeIsNull() {
            addCriterion("nMoveOneSlotTime is null");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeIsNotNull() {
            addCriterion("nMoveOneSlotTime is not null");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeEqualTo(Integer value) {
            addCriterion("nMoveOneSlotTime =", value, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeNotEqualTo(Integer value) {
            addCriterion("nMoveOneSlotTime <>", value, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeGreaterThan(Integer value) {
            addCriterion("nMoveOneSlotTime >", value, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("nMoveOneSlotTime >=", value, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeLessThan(Integer value) {
            addCriterion("nMoveOneSlotTime <", value, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeLessThanOrEqualTo(Integer value) {
            addCriterion("nMoveOneSlotTime <=", value, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeIn(List<Integer> values) {
            addCriterion("nMoveOneSlotTime in", values, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeNotIn(List<Integer> values) {
            addCriterion("nMoveOneSlotTime not in", values, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeBetween(Integer value1, Integer value2) {
            addCriterion("nMoveOneSlotTime between", value1, value2, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNMoveOneSlotTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("nMoveOneSlotTime not between", value1, value2, "nMoveOneSlotTime");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedIsNull() {
            addCriterion("nAttackSpeed is null");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedIsNotNull() {
            addCriterion("nAttackSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedEqualTo(Integer value) {
            addCriterion("nAttackSpeed =", value, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedNotEqualTo(Integer value) {
            addCriterion("nAttackSpeed <>", value, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedGreaterThan(Integer value) {
            addCriterion("nAttackSpeed >", value, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("nAttackSpeed >=", value, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedLessThan(Integer value) {
            addCriterion("nAttackSpeed <", value, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("nAttackSpeed <=", value, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedIn(List<Integer> values) {
            addCriterion("nAttackSpeed in", values, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedNotIn(List<Integer> values) {
            addCriterion("nAttackSpeed not in", values, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedBetween(Integer value1, Integer value2) {
            addCriterion("nAttackSpeed between", value1, value2, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andNAttackSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("nAttackSpeed not between", value1, value2, "nAttackSpeed");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateIsNull() {
            addCriterion("aDeductDizzyRate is null");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateIsNotNull() {
            addCriterion("aDeductDizzyRate is not null");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateEqualTo(Integer value) {
            addCriterion("aDeductDizzyRate =", value, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateNotEqualTo(Integer value) {
            addCriterion("aDeductDizzyRate <>", value, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateGreaterThan(Integer value) {
            addCriterion("aDeductDizzyRate >", value, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateGreaterThanOrEqualTo(Integer value) {
            addCriterion("aDeductDizzyRate >=", value, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateLessThan(Integer value) {
            addCriterion("aDeductDizzyRate <", value, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateLessThanOrEqualTo(Integer value) {
            addCriterion("aDeductDizzyRate <=", value, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateIn(List<Integer> values) {
            addCriterion("aDeductDizzyRate in", values, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateNotIn(List<Integer> values) {
            addCriterion("aDeductDizzyRate not in", values, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateBetween(Integer value1, Integer value2) {
            addCriterion("aDeductDizzyRate between", value1, value2, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADeductDizzyRateNotBetween(Integer value1, Integer value2) {
            addCriterion("aDeductDizzyRate not between", value1, value2, "aDeductDizzyRate");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddIsNull() {
            addCriterion("aDizzyTimeAbsorbAdd is null");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddIsNotNull() {
            addCriterion("aDizzyTimeAbsorbAdd is not null");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddEqualTo(Integer value) {
            addCriterion("aDizzyTimeAbsorbAdd =", value, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddNotEqualTo(Integer value) {
            addCriterion("aDizzyTimeAbsorbAdd <>", value, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddGreaterThan(Integer value) {
            addCriterion("aDizzyTimeAbsorbAdd >", value, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddGreaterThanOrEqualTo(Integer value) {
            addCriterion("aDizzyTimeAbsorbAdd >=", value, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddLessThan(Integer value) {
            addCriterion("aDizzyTimeAbsorbAdd <", value, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddLessThanOrEqualTo(Integer value) {
            addCriterion("aDizzyTimeAbsorbAdd <=", value, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddIn(List<Integer> values) {
            addCriterion("aDizzyTimeAbsorbAdd in", values, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddNotIn(List<Integer> values) {
            addCriterion("aDizzyTimeAbsorbAdd not in", values, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddBetween(Integer value1, Integer value2) {
            addCriterion("aDizzyTimeAbsorbAdd between", value1, value2, "aDizzyTimeAbsorbAdd");
            return (Criteria) this;
        }

        public Criteria andADizzyTimeAbsorbAddNotBetween(Integer value1, Integer value2) {
            addCriterion("aDizzyTimeAbsorbAdd not between", value1, value2, "aDizzyTimeAbsorbAdd");
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