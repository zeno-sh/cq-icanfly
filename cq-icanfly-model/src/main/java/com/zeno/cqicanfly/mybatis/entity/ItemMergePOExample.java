package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class ItemMergePOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemMergePOExample() {
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

        public Criteria andEidIsNull() {
            addCriterion("Eid is null");
            return (Criteria) this;
        }

        public Criteria andEidIsNotNull() {
            addCriterion("Eid is not null");
            return (Criteria) this;
        }

        public Criteria andEidEqualTo(Integer value) {
            addCriterion("Eid =", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotEqualTo(Integer value) {
            addCriterion("Eid <>", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThan(Integer value) {
            addCriterion("Eid >", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Eid >=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThan(Integer value) {
            addCriterion("Eid <", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidLessThanOrEqualTo(Integer value) {
            addCriterion("Eid <=", value, "eid");
            return (Criteria) this;
        }

        public Criteria andEidIn(List<Integer> values) {
            addCriterion("Eid in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotIn(List<Integer> values) {
            addCriterion("Eid not in", values, "eid");
            return (Criteria) this;
        }

        public Criteria andEidBetween(Integer value1, Integer value2) {
            addCriterion("Eid between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andEidNotBetween(Integer value1, Integer value2) {
            addCriterion("Eid not between", value1, value2, "eid");
            return (Criteria) this;
        }

        public Criteria andComposeIsNull() {
            addCriterion("compose is null");
            return (Criteria) this;
        }

        public Criteria andComposeIsNotNull() {
            addCriterion("compose is not null");
            return (Criteria) this;
        }

        public Criteria andComposeEqualTo(String value) {
            addCriterion("compose =", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotEqualTo(String value) {
            addCriterion("compose <>", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeGreaterThan(String value) {
            addCriterion("compose >", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeGreaterThanOrEqualTo(String value) {
            addCriterion("compose >=", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLessThan(String value) {
            addCriterion("compose <", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLessThanOrEqualTo(String value) {
            addCriterion("compose <=", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeLike(String value) {
            addCriterion("compose like", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotLike(String value) {
            addCriterion("compose not like", value, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeIn(List<String> values) {
            addCriterion("compose in", values, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotIn(List<String> values) {
            addCriterion("compose not in", values, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeBetween(String value1, String value2) {
            addCriterion("compose between", value1, value2, "compose");
            return (Criteria) this;
        }

        public Criteria andComposeNotBetween(String value1, String value2) {
            addCriterion("compose not between", value1, value2, "compose");
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

        public Criteria andMergeTableIsNull() {
            addCriterion("mergeTable is null");
            return (Criteria) this;
        }

        public Criteria andMergeTableIsNotNull() {
            addCriterion("mergeTable is not null");
            return (Criteria) this;
        }

        public Criteria andMergeTableEqualTo(String value) {
            addCriterion("mergeTable =", value, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableNotEqualTo(String value) {
            addCriterion("mergeTable <>", value, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableGreaterThan(String value) {
            addCriterion("mergeTable >", value, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableGreaterThanOrEqualTo(String value) {
            addCriterion("mergeTable >=", value, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableLessThan(String value) {
            addCriterion("mergeTable <", value, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableLessThanOrEqualTo(String value) {
            addCriterion("mergeTable <=", value, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableLike(String value) {
            addCriterion("mergeTable like", value, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableNotLike(String value) {
            addCriterion("mergeTable not like", value, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableIn(List<String> values) {
            addCriterion("mergeTable in", values, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableNotIn(List<String> values) {
            addCriterion("mergeTable not in", values, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableBetween(String value1, String value2) {
            addCriterion("mergeTable between", value1, value2, "mergeTable");
            return (Criteria) this;
        }

        public Criteria andMergeTableNotBetween(String value1, String value2) {
            addCriterion("mergeTable not between", value1, value2, "mergeTable");
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

        public Criteria andOpenserverdayIsNull() {
            addCriterion("openserverday is null");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayIsNotNull() {
            addCriterion("openserverday is not null");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayEqualTo(Integer value) {
            addCriterion("openserverday =", value, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayNotEqualTo(Integer value) {
            addCriterion("openserverday <>", value, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayGreaterThan(Integer value) {
            addCriterion("openserverday >", value, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("openserverday >=", value, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayLessThan(Integer value) {
            addCriterion("openserverday <", value, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayLessThanOrEqualTo(Integer value) {
            addCriterion("openserverday <=", value, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayIn(List<Integer> values) {
            addCriterion("openserverday in", values, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayNotIn(List<Integer> values) {
            addCriterion("openserverday not in", values, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayBetween(Integer value1, Integer value2) {
            addCriterion("openserverday between", value1, value2, "openserverday");
            return (Criteria) this;
        }

        public Criteria andOpenserverdayNotBetween(Integer value1, Integer value2) {
            addCriterion("openserverday not between", value1, value2, "openserverday");
            return (Criteria) this;
        }

        public Criteria andMergelimitIsNull() {
            addCriterion("mergelimit is null");
            return (Criteria) this;
        }

        public Criteria andMergelimitIsNotNull() {
            addCriterion("mergelimit is not null");
            return (Criteria) this;
        }

        public Criteria andMergelimitEqualTo(String value) {
            addCriterion("mergelimit =", value, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitNotEqualTo(String value) {
            addCriterion("mergelimit <>", value, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitGreaterThan(String value) {
            addCriterion("mergelimit >", value, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitGreaterThanOrEqualTo(String value) {
            addCriterion("mergelimit >=", value, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitLessThan(String value) {
            addCriterion("mergelimit <", value, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitLessThanOrEqualTo(String value) {
            addCriterion("mergelimit <=", value, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitLike(String value) {
            addCriterion("mergelimit like", value, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitNotLike(String value) {
            addCriterion("mergelimit not like", value, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitIn(List<String> values) {
            addCriterion("mergelimit in", values, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitNotIn(List<String> values) {
            addCriterion("mergelimit not in", values, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitBetween(String value1, String value2) {
            addCriterion("mergelimit between", value1, value2, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andMergelimitNotBetween(String value1, String value2) {
            addCriterion("mergelimit not between", value1, value2, "mergelimit");
            return (Criteria) this;
        }

        public Criteria andLimitTipsIsNull() {
            addCriterion("limitTips is null");
            return (Criteria) this;
        }

        public Criteria andLimitTipsIsNotNull() {
            addCriterion("limitTips is not null");
            return (Criteria) this;
        }

        public Criteria andLimitTipsEqualTo(String value) {
            addCriterion("limitTips =", value, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsNotEqualTo(String value) {
            addCriterion("limitTips <>", value, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsGreaterThan(String value) {
            addCriterion("limitTips >", value, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsGreaterThanOrEqualTo(String value) {
            addCriterion("limitTips >=", value, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsLessThan(String value) {
            addCriterion("limitTips <", value, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsLessThanOrEqualTo(String value) {
            addCriterion("limitTips <=", value, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsLike(String value) {
            addCriterion("limitTips like", value, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsNotLike(String value) {
            addCriterion("limitTips not like", value, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsIn(List<String> values) {
            addCriterion("limitTips in", values, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsNotIn(List<String> values) {
            addCriterion("limitTips not in", values, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsBetween(String value1, String value2) {
            addCriterion("limitTips between", value1, value2, "limitTips");
            return (Criteria) this;
        }

        public Criteria andLimitTipsNotBetween(String value1, String value2) {
            addCriterion("limitTips not between", value1, value2, "limitTips");
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

        public Criteria andAreaEqualTo(Integer value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(Integer value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(Integer value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(Integer value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(Integer value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<Integer> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<Integer> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(Integer value1, Integer value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("text not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andRedpointIsNull() {
            addCriterion("redpoint is null");
            return (Criteria) this;
        }

        public Criteria andRedpointIsNotNull() {
            addCriterion("redpoint is not null");
            return (Criteria) this;
        }

        public Criteria andRedpointEqualTo(Integer value) {
            addCriterion("redpoint =", value, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointNotEqualTo(Integer value) {
            addCriterion("redpoint <>", value, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointGreaterThan(Integer value) {
            addCriterion("redpoint >", value, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointGreaterThanOrEqualTo(Integer value) {
            addCriterion("redpoint >=", value, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointLessThan(Integer value) {
            addCriterion("redpoint <", value, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointLessThanOrEqualTo(Integer value) {
            addCriterion("redpoint <=", value, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointIn(List<Integer> values) {
            addCriterion("redpoint in", values, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointNotIn(List<Integer> values) {
            addCriterion("redpoint not in", values, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointBetween(Integer value1, Integer value2) {
            addCriterion("redpoint between", value1, value2, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointNotBetween(Integer value1, Integer value2) {
            addCriterion("redpoint not between", value1, value2, "redpoint");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitIsNull() {
            addCriterion("redpointlimit is null");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitIsNotNull() {
            addCriterion("redpointlimit is not null");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitEqualTo(String value) {
            addCriterion("redpointlimit =", value, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitNotEqualTo(String value) {
            addCriterion("redpointlimit <>", value, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitGreaterThan(String value) {
            addCriterion("redpointlimit >", value, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitGreaterThanOrEqualTo(String value) {
            addCriterion("redpointlimit >=", value, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitLessThan(String value) {
            addCriterion("redpointlimit <", value, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitLessThanOrEqualTo(String value) {
            addCriterion("redpointlimit <=", value, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitLike(String value) {
            addCriterion("redpointlimit like", value, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitNotLike(String value) {
            addCriterion("redpointlimit not like", value, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitIn(List<String> values) {
            addCriterion("redpointlimit in", values, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitNotIn(List<String> values) {
            addCriterion("redpointlimit not in", values, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitBetween(String value1, String value2) {
            addCriterion("redpointlimit between", value1, value2, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andRedpointlimitNotBetween(String value1, String value2) {
            addCriterion("redpointlimit not between", value1, value2, "redpointlimit");
            return (Criteria) this;
        }

        public Criteria andButtontxt10IsNull() {
            addCriterion("buttontxt10 is null");
            return (Criteria) this;
        }

        public Criteria andButtontxt10IsNotNull() {
            addCriterion("buttontxt10 is not null");
            return (Criteria) this;
        }

        public Criteria andButtontxt10EqualTo(String value) {
            addCriterion("buttontxt10 =", value, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10NotEqualTo(String value) {
            addCriterion("buttontxt10 <>", value, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10GreaterThan(String value) {
            addCriterion("buttontxt10 >", value, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10GreaterThanOrEqualTo(String value) {
            addCriterion("buttontxt10 >=", value, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10LessThan(String value) {
            addCriterion("buttontxt10 <", value, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10LessThanOrEqualTo(String value) {
            addCriterion("buttontxt10 <=", value, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10Like(String value) {
            addCriterion("buttontxt10 like", value, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10NotLike(String value) {
            addCriterion("buttontxt10 not like", value, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10In(List<String> values) {
            addCriterion("buttontxt10 in", values, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10NotIn(List<String> values) {
            addCriterion("buttontxt10 not in", values, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10Between(String value1, String value2) {
            addCriterion("buttontxt10 between", value1, value2, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andButtontxt10NotBetween(String value1, String value2) {
            addCriterion("buttontxt10 not between", value1, value2, "buttontxt10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10IsNull() {
            addCriterion("mergebutton10 is null");
            return (Criteria) this;
        }

        public Criteria andMergebutton10IsNotNull() {
            addCriterion("mergebutton10 is not null");
            return (Criteria) this;
        }

        public Criteria andMergebutton10EqualTo(Integer value) {
            addCriterion("mergebutton10 =", value, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10NotEqualTo(Integer value) {
            addCriterion("mergebutton10 <>", value, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10GreaterThan(Integer value) {
            addCriterion("mergebutton10 >", value, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10GreaterThanOrEqualTo(Integer value) {
            addCriterion("mergebutton10 >=", value, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10LessThan(Integer value) {
            addCriterion("mergebutton10 <", value, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10LessThanOrEqualTo(Integer value) {
            addCriterion("mergebutton10 <=", value, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10In(List<Integer> values) {
            addCriterion("mergebutton10 in", values, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10NotIn(List<Integer> values) {
            addCriterion("mergebutton10 not in", values, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10Between(Integer value1, Integer value2) {
            addCriterion("mergebutton10 between", value1, value2, "mergebutton10");
            return (Criteria) this;
        }

        public Criteria andMergebutton10NotBetween(Integer value1, Integer value2) {
            addCriterion("mergebutton10 not between", value1, value2, "mergebutton10");
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