package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class StdItemsPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StdItemsPOExample() {
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

        public Criteria andItemDescIsNull() {
            addCriterion("itemDesc is null");
            return (Criteria) this;
        }

        public Criteria andItemDescIsNotNull() {
            addCriterion("itemDesc is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescEqualTo(String value) {
            addCriterion("itemDesc =", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotEqualTo(String value) {
            addCriterion("itemDesc <>", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThan(String value) {
            addCriterion("itemDesc >", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescGreaterThanOrEqualTo(String value) {
            addCriterion("itemDesc >=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThan(String value) {
            addCriterion("itemDesc <", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLessThanOrEqualTo(String value) {
            addCriterion("itemDesc <=", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescLike(String value) {
            addCriterion("itemDesc like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotLike(String value) {
            addCriterion("itemDesc not like", value, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescIn(List<String> values) {
            addCriterion("itemDesc in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotIn(List<String> values) {
            addCriterion("itemDesc not in", values, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescBetween(String value1, String value2) {
            addCriterion("itemDesc between", value1, value2, "itemDesc");
            return (Criteria) this;
        }

        public Criteria andItemDescNotBetween(String value1, String value2) {
            addCriterion("itemDesc not between", value1, value2, "itemDesc");
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

        public Criteria andIconIsNull() {
            addCriterion("icon is null");
            return (Criteria) this;
        }

        public Criteria andIconIsNotNull() {
            addCriterion("icon is not null");
            return (Criteria) this;
        }

        public Criteria andIconEqualTo(Integer value) {
            addCriterion("icon =", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotEqualTo(Integer value) {
            addCriterion("icon <>", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThan(Integer value) {
            addCriterion("icon >", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconGreaterThanOrEqualTo(Integer value) {
            addCriterion("icon >=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThan(Integer value) {
            addCriterion("icon <", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconLessThanOrEqualTo(Integer value) {
            addCriterion("icon <=", value, "icon");
            return (Criteria) this;
        }

        public Criteria andIconIn(List<Integer> values) {
            addCriterion("icon in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotIn(List<Integer> values) {
            addCriterion("icon not in", values, "icon");
            return (Criteria) this;
        }

        public Criteria andIconBetween(Integer value1, Integer value2) {
            addCriterion("icon between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andIconNotBetween(Integer value1, Integer value2) {
            addCriterion("icon not between", value1, value2, "icon");
            return (Criteria) this;
        }

        public Criteria andShapeIsNull() {
            addCriterion("shape is null");
            return (Criteria) this;
        }

        public Criteria andShapeIsNotNull() {
            addCriterion("shape is not null");
            return (Criteria) this;
        }

        public Criteria andShapeEqualTo(Integer value) {
            addCriterion("shape =", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotEqualTo(Integer value) {
            addCriterion("shape <>", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeGreaterThan(Integer value) {
            addCriterion("shape >", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shape >=", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLessThan(Integer value) {
            addCriterion("shape <", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeLessThanOrEqualTo(Integer value) {
            addCriterion("shape <=", value, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeIn(List<Integer> values) {
            addCriterion("shape in", values, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotIn(List<Integer> values) {
            addCriterion("shape not in", values, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeBetween(Integer value1, Integer value2) {
            addCriterion("shape between", value1, value2, "shape");
            return (Criteria) this;
        }

        public Criteria andShapeNotBetween(Integer value1, Integer value2) {
            addCriterion("shape not between", value1, value2, "shape");
            return (Criteria) this;
        }

        public Criteria andBackIsNull() {
            addCriterion("back is null");
            return (Criteria) this;
        }

        public Criteria andBackIsNotNull() {
            addCriterion("back is not null");
            return (Criteria) this;
        }

        public Criteria andBackEqualTo(Integer value) {
            addCriterion("back =", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackNotEqualTo(Integer value) {
            addCriterion("back <>", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackGreaterThan(Integer value) {
            addCriterion("back >", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackGreaterThanOrEqualTo(Integer value) {
            addCriterion("back >=", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackLessThan(Integer value) {
            addCriterion("back <", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackLessThanOrEqualTo(Integer value) {
            addCriterion("back <=", value, "back");
            return (Criteria) this;
        }

        public Criteria andBackIn(List<Integer> values) {
            addCriterion("back in", values, "back");
            return (Criteria) this;
        }

        public Criteria andBackNotIn(List<Integer> values) {
            addCriterion("back not in", values, "back");
            return (Criteria) this;
        }

        public Criteria andBackBetween(Integer value1, Integer value2) {
            addCriterion("back between", value1, value2, "back");
            return (Criteria) this;
        }

        public Criteria andBackNotBetween(Integer value1, Integer value2) {
            addCriterion("back not between", value1, value2, "back");
            return (Criteria) this;
        }

        public Criteria andImgeffIsNull() {
            addCriterion("imgeff is null");
            return (Criteria) this;
        }

        public Criteria andImgeffIsNotNull() {
            addCriterion("imgeff is not null");
            return (Criteria) this;
        }

        public Criteria andImgeffEqualTo(Integer value) {
            addCriterion("imgeff =", value, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffNotEqualTo(Integer value) {
            addCriterion("imgeff <>", value, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffGreaterThan(Integer value) {
            addCriterion("imgeff >", value, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffGreaterThanOrEqualTo(Integer value) {
            addCriterion("imgeff >=", value, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffLessThan(Integer value) {
            addCriterion("imgeff <", value, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffLessThanOrEqualTo(Integer value) {
            addCriterion("imgeff <=", value, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffIn(List<Integer> values) {
            addCriterion("imgeff in", values, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffNotIn(List<Integer> values) {
            addCriterion("imgeff not in", values, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffBetween(Integer value1, Integer value2) {
            addCriterion("imgeff between", value1, value2, "imgeff");
            return (Criteria) this;
        }

        public Criteria andImgeffNotBetween(Integer value1, Integer value2) {
            addCriterion("imgeff not between", value1, value2, "imgeff");
            return (Criteria) this;
        }

        public Criteria andDupIsNull() {
            addCriterion("dup is null");
            return (Criteria) this;
        }

        public Criteria andDupIsNotNull() {
            addCriterion("dup is not null");
            return (Criteria) this;
        }

        public Criteria andDupEqualTo(Integer value) {
            addCriterion("dup =", value, "dup");
            return (Criteria) this;
        }

        public Criteria andDupNotEqualTo(Integer value) {
            addCriterion("dup <>", value, "dup");
            return (Criteria) this;
        }

        public Criteria andDupGreaterThan(Integer value) {
            addCriterion("dup >", value, "dup");
            return (Criteria) this;
        }

        public Criteria andDupGreaterThanOrEqualTo(Integer value) {
            addCriterion("dup >=", value, "dup");
            return (Criteria) this;
        }

        public Criteria andDupLessThan(Integer value) {
            addCriterion("dup <", value, "dup");
            return (Criteria) this;
        }

        public Criteria andDupLessThanOrEqualTo(Integer value) {
            addCriterion("dup <=", value, "dup");
            return (Criteria) this;
        }

        public Criteria andDupIn(List<Integer> values) {
            addCriterion("dup in", values, "dup");
            return (Criteria) this;
        }

        public Criteria andDupNotIn(List<Integer> values) {
            addCriterion("dup not in", values, "dup");
            return (Criteria) this;
        }

        public Criteria andDupBetween(Integer value1, Integer value2) {
            addCriterion("dup between", value1, value2, "dup");
            return (Criteria) this;
        }

        public Criteria andDupNotBetween(Integer value1, Integer value2) {
            addCriterion("dup not between", value1, value2, "dup");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNull() {
            addCriterion("dealType is null");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNotNull() {
            addCriterion("dealType is not null");
            return (Criteria) this;
        }

        public Criteria andDealTypeEqualTo(Integer value) {
            addCriterion("dealType =", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotEqualTo(Integer value) {
            addCriterion("dealType <>", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThan(Integer value) {
            addCriterion("dealType >", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dealType >=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThan(Integer value) {
            addCriterion("dealType <", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dealType <=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeIn(List<Integer> values) {
            addCriterion("dealType in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotIn(List<Integer> values) {
            addCriterion("dealType not in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeBetween(Integer value1, Integer value2) {
            addCriterion("dealType between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dealType not between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andSuitIdIsNull() {
            addCriterion("suitId is null");
            return (Criteria) this;
        }

        public Criteria andSuitIdIsNotNull() {
            addCriterion("suitId is not null");
            return (Criteria) this;
        }

        public Criteria andSuitIdEqualTo(Integer value) {
            addCriterion("suitId =", value, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdNotEqualTo(Integer value) {
            addCriterion("suitId <>", value, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdGreaterThan(Integer value) {
            addCriterion("suitId >", value, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("suitId >=", value, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdLessThan(Integer value) {
            addCriterion("suitId <", value, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdLessThanOrEqualTo(Integer value) {
            addCriterion("suitId <=", value, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdIn(List<Integer> values) {
            addCriterion("suitId in", values, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdNotIn(List<Integer> values) {
            addCriterion("suitId not in", values, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdBetween(Integer value1, Integer value2) {
            addCriterion("suitId between", value1, value2, "suitId");
            return (Criteria) this;
        }

        public Criteria andSuitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("suitId not between", value1, value2, "suitId");
            return (Criteria) this;
        }

        public Criteria andColGroupIsNull() {
            addCriterion("colGroup is null");
            return (Criteria) this;
        }

        public Criteria andColGroupIsNotNull() {
            addCriterion("colGroup is not null");
            return (Criteria) this;
        }

        public Criteria andColGroupEqualTo(Integer value) {
            addCriterion("colGroup =", value, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupNotEqualTo(Integer value) {
            addCriterion("colGroup <>", value, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupGreaterThan(Integer value) {
            addCriterion("colGroup >", value, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupGreaterThanOrEqualTo(Integer value) {
            addCriterion("colGroup >=", value, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupLessThan(Integer value) {
            addCriterion("colGroup <", value, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupLessThanOrEqualTo(Integer value) {
            addCriterion("colGroup <=", value, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupIn(List<Integer> values) {
            addCriterion("colGroup in", values, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupNotIn(List<Integer> values) {
            addCriterion("colGroup not in", values, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupBetween(Integer value1, Integer value2) {
            addCriterion("colGroup between", value1, value2, "colGroup");
            return (Criteria) this;
        }

        public Criteria andColGroupNotBetween(Integer value1, Integer value2) {
            addCriterion("colGroup not between", value1, value2, "colGroup");
            return (Criteria) this;
        }

        public Criteria andCdTimeIsNull() {
            addCriterion("cdTime is null");
            return (Criteria) this;
        }

        public Criteria andCdTimeIsNotNull() {
            addCriterion("cdTime is not null");
            return (Criteria) this;
        }

        public Criteria andCdTimeEqualTo(Integer value) {
            addCriterion("cdTime =", value, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeNotEqualTo(Integer value) {
            addCriterion("cdTime <>", value, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeGreaterThan(Integer value) {
            addCriterion("cdTime >", value, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cdTime >=", value, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeLessThan(Integer value) {
            addCriterion("cdTime <", value, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cdTime <=", value, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeIn(List<Integer> values) {
            addCriterion("cdTime in", values, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeNotIn(List<Integer> values) {
            addCriterion("cdTime not in", values, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeBetween(Integer value1, Integer value2) {
            addCriterion("cdTime between", value1, value2, "cdTime");
            return (Criteria) this;
        }

        public Criteria andCdTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cdTime not between", value1, value2, "cdTime");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastIsNull() {
            addCriterion("dropBroadcast is null");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastIsNotNull() {
            addCriterion("dropBroadcast is not null");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastEqualTo(Integer value) {
            addCriterion("dropBroadcast =", value, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastNotEqualTo(Integer value) {
            addCriterion("dropBroadcast <>", value, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastGreaterThan(Integer value) {
            addCriterion("dropBroadcast >", value, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastGreaterThanOrEqualTo(Integer value) {
            addCriterion("dropBroadcast >=", value, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastLessThan(Integer value) {
            addCriterion("dropBroadcast <", value, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastLessThanOrEqualTo(Integer value) {
            addCriterion("dropBroadcast <=", value, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastIn(List<Integer> values) {
            addCriterion("dropBroadcast in", values, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastNotIn(List<Integer> values) {
            addCriterion("dropBroadcast not in", values, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastBetween(Integer value1, Integer value2) {
            addCriterion("dropBroadcast between", value1, value2, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andDropBroadcastNotBetween(Integer value1, Integer value2) {
            addCriterion("dropBroadcast not between", value1, value2, "dropBroadcast");
            return (Criteria) this;
        }

        public Criteria andShowQualityIsNull() {
            addCriterion("showQuality is null");
            return (Criteria) this;
        }

        public Criteria andShowQualityIsNotNull() {
            addCriterion("showQuality is not null");
            return (Criteria) this;
        }

        public Criteria andShowQualityEqualTo(Integer value) {
            addCriterion("showQuality =", value, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityNotEqualTo(Integer value) {
            addCriterion("showQuality <>", value, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityGreaterThan(Integer value) {
            addCriterion("showQuality >", value, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityGreaterThanOrEqualTo(Integer value) {
            addCriterion("showQuality >=", value, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityLessThan(Integer value) {
            addCriterion("showQuality <", value, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityLessThanOrEqualTo(Integer value) {
            addCriterion("showQuality <=", value, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityIn(List<Integer> values) {
            addCriterion("showQuality in", values, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityNotIn(List<Integer> values) {
            addCriterion("showQuality not in", values, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityBetween(Integer value1, Integer value2) {
            addCriterion("showQuality between", value1, value2, "showQuality");
            return (Criteria) this;
        }

        public Criteria andShowQualityNotBetween(Integer value1, Integer value2) {
            addCriterion("showQuality not between", value1, value2, "showQuality");
            return (Criteria) this;
        }

        public Criteria andDropEffectIsNull() {
            addCriterion("dropEffect is null");
            return (Criteria) this;
        }

        public Criteria andDropEffectIsNotNull() {
            addCriterion("dropEffect is not null");
            return (Criteria) this;
        }

        public Criteria andDropEffectEqualTo(Integer value) {
            addCriterion("dropEffect =", value, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectNotEqualTo(Integer value) {
            addCriterion("dropEffect <>", value, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectGreaterThan(Integer value) {
            addCriterion("dropEffect >", value, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectGreaterThanOrEqualTo(Integer value) {
            addCriterion("dropEffect >=", value, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectLessThan(Integer value) {
            addCriterion("dropEffect <", value, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectLessThanOrEqualTo(Integer value) {
            addCriterion("dropEffect <=", value, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectIn(List<Integer> values) {
            addCriterion("dropEffect in", values, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectNotIn(List<Integer> values) {
            addCriterion("dropEffect not in", values, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectBetween(Integer value1, Integer value2) {
            addCriterion("dropEffect between", value1, value2, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andDropEffectNotBetween(Integer value1, Integer value2) {
            addCriterion("dropEffect not between", value1, value2, "dropEffect");
            return (Criteria) this;
        }

        public Criteria andItemEffIsNull() {
            addCriterion("itemEff is null");
            return (Criteria) this;
        }

        public Criteria andItemEffIsNotNull() {
            addCriterion("itemEff is not null");
            return (Criteria) this;
        }

        public Criteria andItemEffEqualTo(Integer value) {
            addCriterion("itemEff =", value, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffNotEqualTo(Integer value) {
            addCriterion("itemEff <>", value, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffGreaterThan(Integer value) {
            addCriterion("itemEff >", value, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemEff >=", value, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffLessThan(Integer value) {
            addCriterion("itemEff <", value, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffLessThanOrEqualTo(Integer value) {
            addCriterion("itemEff <=", value, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffIn(List<Integer> values) {
            addCriterion("itemEff in", values, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffNotIn(List<Integer> values) {
            addCriterion("itemEff not in", values, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffBetween(Integer value1, Integer value2) {
            addCriterion("itemEff between", value1, value2, "itemEff");
            return (Criteria) this;
        }

        public Criteria andItemEffNotBetween(Integer value1, Integer value2) {
            addCriterion("itemEff not between", value1, value2, "itemEff");
            return (Criteria) this;
        }

        public Criteria andExistScenesIsNull() {
            addCriterion("existScenes is null");
            return (Criteria) this;
        }

        public Criteria andExistScenesIsNotNull() {
            addCriterion("existScenes is not null");
            return (Criteria) this;
        }

        public Criteria andExistScenesEqualTo(String value) {
            addCriterion("existScenes =", value, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesNotEqualTo(String value) {
            addCriterion("existScenes <>", value, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesGreaterThan(String value) {
            addCriterion("existScenes >", value, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesGreaterThanOrEqualTo(String value) {
            addCriterion("existScenes >=", value, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesLessThan(String value) {
            addCriterion("existScenes <", value, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesLessThanOrEqualTo(String value) {
            addCriterion("existScenes <=", value, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesLike(String value) {
            addCriterion("existScenes like", value, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesNotLike(String value) {
            addCriterion("existScenes not like", value, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesIn(List<String> values) {
            addCriterion("existScenes in", values, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesNotIn(List<String> values) {
            addCriterion("existScenes not in", values, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesBetween(String value1, String value2) {
            addCriterion("existScenes between", value1, value2, "existScenes");
            return (Criteria) this;
        }

        public Criteria andExistScenesNotBetween(String value1, String value2) {
            addCriterion("existScenes not between", value1, value2, "existScenes");
            return (Criteria) this;
        }

        public Criteria andOpenUiIsNull() {
            addCriterion("openUi is null");
            return (Criteria) this;
        }

        public Criteria andOpenUiIsNotNull() {
            addCriterion("openUi is not null");
            return (Criteria) this;
        }

        public Criteria andOpenUiEqualTo(String value) {
            addCriterion("openUi =", value, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiNotEqualTo(String value) {
            addCriterion("openUi <>", value, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiGreaterThan(String value) {
            addCriterion("openUi >", value, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiGreaterThanOrEqualTo(String value) {
            addCriterion("openUi >=", value, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiLessThan(String value) {
            addCriterion("openUi <", value, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiLessThanOrEqualTo(String value) {
            addCriterion("openUi <=", value, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiLike(String value) {
            addCriterion("openUi like", value, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiNotLike(String value) {
            addCriterion("openUi not like", value, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiIn(List<String> values) {
            addCriterion("openUi in", values, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiNotIn(List<String> values) {
            addCriterion("openUi not in", values, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiBetween(String value1, String value2) {
            addCriterion("openUi between", value1, value2, "openUi");
            return (Criteria) this;
        }

        public Criteria andOpenUiNotBetween(String value1, String value2) {
            addCriterion("openUi not between", value1, value2, "openUi");
            return (Criteria) this;
        }

        public Criteria andSuggVocationIsNull() {
            addCriterion("suggVocation is null");
            return (Criteria) this;
        }

        public Criteria andSuggVocationIsNotNull() {
            addCriterion("suggVocation is not null");
            return (Criteria) this;
        }

        public Criteria andSuggVocationEqualTo(Integer value) {
            addCriterion("suggVocation =", value, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationNotEqualTo(Integer value) {
            addCriterion("suggVocation <>", value, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationGreaterThan(Integer value) {
            addCriterion("suggVocation >", value, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationGreaterThanOrEqualTo(Integer value) {
            addCriterion("suggVocation >=", value, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationLessThan(Integer value) {
            addCriterion("suggVocation <", value, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationLessThanOrEqualTo(Integer value) {
            addCriterion("suggVocation <=", value, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationIn(List<Integer> values) {
            addCriterion("suggVocation in", values, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationNotIn(List<Integer> values) {
            addCriterion("suggVocation not in", values, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationBetween(Integer value1, Integer value2) {
            addCriterion("suggVocation between", value1, value2, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andSuggVocationNotBetween(Integer value1, Integer value2) {
            addCriterion("suggVocation not between", value1, value2, "suggVocation");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Integer value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Integer value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Integer value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Integer value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Integer value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Integer> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Integer> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Integer value1, Integer value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbIsNull() {
            addCriterion("canMoveKb is null");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbIsNotNull() {
            addCriterion("canMoveKb is not null");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbEqualTo(Integer value) {
            addCriterion("canMoveKb =", value, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbNotEqualTo(Integer value) {
            addCriterion("canMoveKb <>", value, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbGreaterThan(Integer value) {
            addCriterion("canMoveKb >", value, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbGreaterThanOrEqualTo(Integer value) {
            addCriterion("canMoveKb >=", value, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbLessThan(Integer value) {
            addCriterion("canMoveKb <", value, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbLessThanOrEqualTo(Integer value) {
            addCriterion("canMoveKb <=", value, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbIn(List<Integer> values) {
            addCriterion("canMoveKb in", values, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbNotIn(List<Integer> values) {
            addCriterion("canMoveKb not in", values, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbBetween(Integer value1, Integer value2) {
            addCriterion("canMoveKb between", value1, value2, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andCanMoveKbNotBetween(Integer value1, Integer value2) {
            addCriterion("canMoveKb not between", value1, value2, "canMoveKb");
            return (Criteria) this;
        }

        public Criteria andRecordLogIsNull() {
            addCriterion("recordLog is null");
            return (Criteria) this;
        }

        public Criteria andRecordLogIsNotNull() {
            addCriterion("recordLog is not null");
            return (Criteria) this;
        }

        public Criteria andRecordLogEqualTo(Integer value) {
            addCriterion("recordLog =", value, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogNotEqualTo(Integer value) {
            addCriterion("recordLog <>", value, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogGreaterThan(Integer value) {
            addCriterion("recordLog >", value, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogGreaterThanOrEqualTo(Integer value) {
            addCriterion("recordLog >=", value, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogLessThan(Integer value) {
            addCriterion("recordLog <", value, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogLessThanOrEqualTo(Integer value) {
            addCriterion("recordLog <=", value, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogIn(List<Integer> values) {
            addCriterion("recordLog in", values, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogNotIn(List<Integer> values) {
            addCriterion("recordLog not in", values, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogBetween(Integer value1, Integer value2) {
            addCriterion("recordLog between", value1, value2, "recordLog");
            return (Criteria) this;
        }

        public Criteria andRecordLogNotBetween(Integer value1, Integer value2) {
            addCriterion("recordLog not between", value1, value2, "recordLog");
            return (Criteria) this;
        }

        public Criteria andDenyDealIsNull() {
            addCriterion("denyDeal is null");
            return (Criteria) this;
        }

        public Criteria andDenyDealIsNotNull() {
            addCriterion("denyDeal is not null");
            return (Criteria) this;
        }

        public Criteria andDenyDealEqualTo(Integer value) {
            addCriterion("denyDeal =", value, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealNotEqualTo(Integer value) {
            addCriterion("denyDeal <>", value, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealGreaterThan(Integer value) {
            addCriterion("denyDeal >", value, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealGreaterThanOrEqualTo(Integer value) {
            addCriterion("denyDeal >=", value, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealLessThan(Integer value) {
            addCriterion("denyDeal <", value, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealLessThanOrEqualTo(Integer value) {
            addCriterion("denyDeal <=", value, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealIn(List<Integer> values) {
            addCriterion("denyDeal in", values, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealNotIn(List<Integer> values) {
            addCriterion("denyDeal not in", values, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealBetween(Integer value1, Integer value2) {
            addCriterion("denyDeal between", value1, value2, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenyDealNotBetween(Integer value1, Integer value2) {
            addCriterion("denyDeal not between", value1, value2, "denyDeal");
            return (Criteria) this;
        }

        public Criteria andDenySellIsNull() {
            addCriterion("denySell is null");
            return (Criteria) this;
        }

        public Criteria andDenySellIsNotNull() {
            addCriterion("denySell is not null");
            return (Criteria) this;
        }

        public Criteria andDenySellEqualTo(Integer value) {
            addCriterion("denySell =", value, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellNotEqualTo(Integer value) {
            addCriterion("denySell <>", value, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellGreaterThan(Integer value) {
            addCriterion("denySell >", value, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellGreaterThanOrEqualTo(Integer value) {
            addCriterion("denySell >=", value, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellLessThan(Integer value) {
            addCriterion("denySell <", value, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellLessThanOrEqualTo(Integer value) {
            addCriterion("denySell <=", value, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellIn(List<Integer> values) {
            addCriterion("denySell in", values, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellNotIn(List<Integer> values) {
            addCriterion("denySell not in", values, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellBetween(Integer value1, Integer value2) {
            addCriterion("denySell between", value1, value2, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenySellNotBetween(Integer value1, Integer value2) {
            addCriterion("denySell not between", value1, value2, "denySell");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyIsNull() {
            addCriterion("denyDestroy is null");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyIsNotNull() {
            addCriterion("denyDestroy is not null");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyEqualTo(Integer value) {
            addCriterion("denyDestroy =", value, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyNotEqualTo(Integer value) {
            addCriterion("denyDestroy <>", value, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyGreaterThan(Integer value) {
            addCriterion("denyDestroy >", value, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyGreaterThanOrEqualTo(Integer value) {
            addCriterion("denyDestroy >=", value, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyLessThan(Integer value) {
            addCriterion("denyDestroy <", value, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyLessThanOrEqualTo(Integer value) {
            addCriterion("denyDestroy <=", value, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyIn(List<Integer> values) {
            addCriterion("denyDestroy in", values, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyNotIn(List<Integer> values) {
            addCriterion("denyDestroy not in", values, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyBetween(Integer value1, Integer value2) {
            addCriterion("denyDestroy between", value1, value2, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andDenyDestroyNotBetween(Integer value1, Integer value2) {
            addCriterion("denyDestroy not between", value1, value2, "denyDestroy");
            return (Criteria) this;
        }

        public Criteria andCondsIsNull() {
            addCriterion("conds is null");
            return (Criteria) this;
        }

        public Criteria andCondsIsNotNull() {
            addCriterion("conds is not null");
            return (Criteria) this;
        }

        public Criteria andCondsEqualTo(String value) {
            addCriterion("conds =", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsNotEqualTo(String value) {
            addCriterion("conds <>", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsGreaterThan(String value) {
            addCriterion("conds >", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsGreaterThanOrEqualTo(String value) {
            addCriterion("conds >=", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsLessThan(String value) {
            addCriterion("conds <", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsLessThanOrEqualTo(String value) {
            addCriterion("conds <=", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsLike(String value) {
            addCriterion("conds like", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsNotLike(String value) {
            addCriterion("conds not like", value, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsIn(List<String> values) {
            addCriterion("conds in", values, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsNotIn(List<String> values) {
            addCriterion("conds not in", values, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsBetween(String value1, String value2) {
            addCriterion("conds between", value1, value2, "conds");
            return (Criteria) this;
        }

        public Criteria andCondsNotBetween(String value1, String value2) {
            addCriterion("conds not between", value1, value2, "conds");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNull() {
            addCriterion("packageType is null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIsNotNull() {
            addCriterion("packageType is not null");
            return (Criteria) this;
        }

        public Criteria andPackageTypeEqualTo(Integer value) {
            addCriterion("packageType =", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotEqualTo(Integer value) {
            addCriterion("packageType <>", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThan(Integer value) {
            addCriterion("packageType >", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("packageType >=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThan(Integer value) {
            addCriterion("packageType <", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeLessThanOrEqualTo(Integer value) {
            addCriterion("packageType <=", value, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeIn(List<Integer> values) {
            addCriterion("packageType in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotIn(List<Integer> values) {
            addCriterion("packageType not in", values, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeBetween(Integer value1, Integer value2) {
            addCriterion("packageType between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andPackageTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("packageType not between", value1, value2, "packageType");
            return (Criteria) this;
        }

        public Criteria andDropGroupidIsNull() {
            addCriterion("dropGroupid is null");
            return (Criteria) this;
        }

        public Criteria andDropGroupidIsNotNull() {
            addCriterion("dropGroupid is not null");
            return (Criteria) this;
        }

        public Criteria andDropGroupidEqualTo(Integer value) {
            addCriterion("dropGroupid =", value, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidNotEqualTo(Integer value) {
            addCriterion("dropGroupid <>", value, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidGreaterThan(Integer value) {
            addCriterion("dropGroupid >", value, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dropGroupid >=", value, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidLessThan(Integer value) {
            addCriterion("dropGroupid <", value, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidLessThanOrEqualTo(Integer value) {
            addCriterion("dropGroupid <=", value, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidIn(List<Integer> values) {
            addCriterion("dropGroupid in", values, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidNotIn(List<Integer> values) {
            addCriterion("dropGroupid not in", values, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidBetween(Integer value1, Integer value2) {
            addCriterion("dropGroupid between", value1, value2, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andDropGroupidNotBetween(Integer value1, Integer value2) {
            addCriterion("dropGroupid not between", value1, value2, "dropGroupid");
            return (Criteria) this;
        }

        public Criteria andItemlevelIsNull() {
            addCriterion("itemlevel is null");
            return (Criteria) this;
        }

        public Criteria andItemlevelIsNotNull() {
            addCriterion("itemlevel is not null");
            return (Criteria) this;
        }

        public Criteria andItemlevelEqualTo(Integer value) {
            addCriterion("itemlevel =", value, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelNotEqualTo(Integer value) {
            addCriterion("itemlevel <>", value, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelGreaterThan(Integer value) {
            addCriterion("itemlevel >", value, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemlevel >=", value, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelLessThan(Integer value) {
            addCriterion("itemlevel <", value, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelLessThanOrEqualTo(Integer value) {
            addCriterion("itemlevel <=", value, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelIn(List<Integer> values) {
            addCriterion("itemlevel in", values, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelNotIn(List<Integer> values) {
            addCriterion("itemlevel not in", values, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelBetween(Integer value1, Integer value2) {
            addCriterion("itemlevel between", value1, value2, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andItemlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("itemlevel not between", value1, value2, "itemlevel");
            return (Criteria) this;
        }

        public Criteria andRecoveridIsNull() {
            addCriterion("recoverid is null");
            return (Criteria) this;
        }

        public Criteria andRecoveridIsNotNull() {
            addCriterion("recoverid is not null");
            return (Criteria) this;
        }

        public Criteria andRecoveridEqualTo(Integer value) {
            addCriterion("recoverid =", value, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridNotEqualTo(Integer value) {
            addCriterion("recoverid <>", value, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridGreaterThan(Integer value) {
            addCriterion("recoverid >", value, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridGreaterThanOrEqualTo(Integer value) {
            addCriterion("recoverid >=", value, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridLessThan(Integer value) {
            addCriterion("recoverid <", value, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridLessThanOrEqualTo(Integer value) {
            addCriterion("recoverid <=", value, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridIn(List<Integer> values) {
            addCriterion("recoverid in", values, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridNotIn(List<Integer> values) {
            addCriterion("recoverid not in", values, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridBetween(Integer value1, Integer value2) {
            addCriterion("recoverid between", value1, value2, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoveridNotBetween(Integer value1, Integer value2) {
            addCriterion("recoverid not between", value1, value2, "recoverid");
            return (Criteria) this;
        }

        public Criteria andRecoverViewIsNull() {
            addCriterion("recoverView is null");
            return (Criteria) this;
        }

        public Criteria andRecoverViewIsNotNull() {
            addCriterion("recoverView is not null");
            return (Criteria) this;
        }

        public Criteria andRecoverViewEqualTo(String value) {
            addCriterion("recoverView =", value, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewNotEqualTo(String value) {
            addCriterion("recoverView <>", value, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewGreaterThan(String value) {
            addCriterion("recoverView >", value, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewGreaterThanOrEqualTo(String value) {
            addCriterion("recoverView >=", value, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewLessThan(String value) {
            addCriterion("recoverView <", value, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewLessThanOrEqualTo(String value) {
            addCriterion("recoverView <=", value, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewLike(String value) {
            addCriterion("recoverView like", value, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewNotLike(String value) {
            addCriterion("recoverView not like", value, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewIn(List<String> values) {
            addCriterion("recoverView in", values, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewNotIn(List<String> values) {
            addCriterion("recoverView not in", values, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewBetween(String value1, String value2) {
            addCriterion("recoverView between", value1, value2, "recoverView");
            return (Criteria) this;
        }

        public Criteria andRecoverViewNotBetween(String value1, String value2) {
            addCriterion("recoverView not between", value1, value2, "recoverView");
            return (Criteria) this;
        }

        public Criteria andItemlvlIsNull() {
            addCriterion("itemlvl is null");
            return (Criteria) this;
        }

        public Criteria andItemlvlIsNotNull() {
            addCriterion("itemlvl is not null");
            return (Criteria) this;
        }

        public Criteria andItemlvlEqualTo(Integer value) {
            addCriterion("itemlvl =", value, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlNotEqualTo(Integer value) {
            addCriterion("itemlvl <>", value, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlGreaterThan(Integer value) {
            addCriterion("itemlvl >", value, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemlvl >=", value, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlLessThan(Integer value) {
            addCriterion("itemlvl <", value, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlLessThanOrEqualTo(Integer value) {
            addCriterion("itemlvl <=", value, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlIn(List<Integer> values) {
            addCriterion("itemlvl in", values, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlNotIn(List<Integer> values) {
            addCriterion("itemlvl not in", values, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlBetween(Integer value1, Integer value2) {
            addCriterion("itemlvl between", value1, value2, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andItemlvlNotBetween(Integer value1, Integer value2) {
            addCriterion("itemlvl not between", value1, value2, "itemlvl");
            return (Criteria) this;
        }

        public Criteria andDeathsplitIsNull() {
            addCriterion("deathsplit is null");
            return (Criteria) this;
        }

        public Criteria andDeathsplitIsNotNull() {
            addCriterion("deathsplit is not null");
            return (Criteria) this;
        }

        public Criteria andDeathsplitEqualTo(String value) {
            addCriterion("deathsplit =", value, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitNotEqualTo(String value) {
            addCriterion("deathsplit <>", value, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitGreaterThan(String value) {
            addCriterion("deathsplit >", value, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitGreaterThanOrEqualTo(String value) {
            addCriterion("deathsplit >=", value, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitLessThan(String value) {
            addCriterion("deathsplit <", value, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitLessThanOrEqualTo(String value) {
            addCriterion("deathsplit <=", value, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitLike(String value) {
            addCriterion("deathsplit like", value, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitNotLike(String value) {
            addCriterion("deathsplit not like", value, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitIn(List<String> values) {
            addCriterion("deathsplit in", values, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitNotIn(List<String> values) {
            addCriterion("deathsplit not in", values, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitBetween(String value1, String value2) {
            addCriterion("deathsplit between", value1, value2, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andDeathsplitNotBetween(String value1, String value2) {
            addCriterion("deathsplit not between", value1, value2, "deathsplit");
            return (Criteria) this;
        }

        public Criteria andTradeIsNull() {
            addCriterion("trade is null");
            return (Criteria) this;
        }

        public Criteria andTradeIsNotNull() {
            addCriterion("trade is not null");
            return (Criteria) this;
        }

        public Criteria andTradeEqualTo(Integer value) {
            addCriterion("trade =", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotEqualTo(Integer value) {
            addCriterion("trade <>", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThan(Integer value) {
            addCriterion("trade >", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("trade >=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThan(Integer value) {
            addCriterion("trade <", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeLessThanOrEqualTo(Integer value) {
            addCriterion("trade <=", value, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeIn(List<Integer> values) {
            addCriterion("trade in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotIn(List<Integer> values) {
            addCriterion("trade not in", values, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeBetween(Integer value1, Integer value2) {
            addCriterion("trade between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andTradeNotBetween(Integer value1, Integer value2) {
            addCriterion("trade not between", value1, value2, "trade");
            return (Criteria) this;
        }

        public Criteria andSelectGiftIsNull() {
            addCriterion("selectGift is null");
            return (Criteria) this;
        }

        public Criteria andSelectGiftIsNotNull() {
            addCriterion("selectGift is not null");
            return (Criteria) this;
        }

        public Criteria andSelectGiftEqualTo(String value) {
            addCriterion("selectGift =", value, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftNotEqualTo(String value) {
            addCriterion("selectGift <>", value, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftGreaterThan(String value) {
            addCriterion("selectGift >", value, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftGreaterThanOrEqualTo(String value) {
            addCriterion("selectGift >=", value, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftLessThan(String value) {
            addCriterion("selectGift <", value, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftLessThanOrEqualTo(String value) {
            addCriterion("selectGift <=", value, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftLike(String value) {
            addCriterion("selectGift like", value, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftNotLike(String value) {
            addCriterion("selectGift not like", value, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftIn(List<String> values) {
            addCriterion("selectGift in", values, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftNotIn(List<String> values) {
            addCriterion("selectGift not in", values, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftBetween(String value1, String value2) {
            addCriterion("selectGift between", value1, value2, "selectGift");
            return (Criteria) this;
        }

        public Criteria andSelectGiftNotBetween(String value1, String value2) {
            addCriterion("selectGift not between", value1, value2, "selectGift");
            return (Criteria) this;
        }

        public Criteria andForcetipsIsNull() {
            addCriterion("forcetips is null");
            return (Criteria) this;
        }

        public Criteria andForcetipsIsNotNull() {
            addCriterion("forcetips is not null");
            return (Criteria) this;
        }

        public Criteria andForcetipsEqualTo(Integer value) {
            addCriterion("forcetips =", value, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsNotEqualTo(Integer value) {
            addCriterion("forcetips <>", value, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsGreaterThan(Integer value) {
            addCriterion("forcetips >", value, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsGreaterThanOrEqualTo(Integer value) {
            addCriterion("forcetips >=", value, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsLessThan(Integer value) {
            addCriterion("forcetips <", value, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsLessThanOrEqualTo(Integer value) {
            addCriterion("forcetips <=", value, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsIn(List<Integer> values) {
            addCriterion("forcetips in", values, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsNotIn(List<Integer> values) {
            addCriterion("forcetips not in", values, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsBetween(Integer value1, Integer value2) {
            addCriterion("forcetips between", value1, value2, "forcetips");
            return (Criteria) this;
        }

        public Criteria andForcetipsNotBetween(Integer value1, Integer value2) {
            addCriterion("forcetips not between", value1, value2, "forcetips");
            return (Criteria) this;
        }

        public Criteria andJpdropIsNull() {
            addCriterion("jpdrop is null");
            return (Criteria) this;
        }

        public Criteria andJpdropIsNotNull() {
            addCriterion("jpdrop is not null");
            return (Criteria) this;
        }

        public Criteria andJpdropEqualTo(Integer value) {
            addCriterion("jpdrop =", value, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropNotEqualTo(Integer value) {
            addCriterion("jpdrop <>", value, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropGreaterThan(Integer value) {
            addCriterion("jpdrop >", value, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropGreaterThanOrEqualTo(Integer value) {
            addCriterion("jpdrop >=", value, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropLessThan(Integer value) {
            addCriterion("jpdrop <", value, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropLessThanOrEqualTo(Integer value) {
            addCriterion("jpdrop <=", value, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropIn(List<Integer> values) {
            addCriterion("jpdrop in", values, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropNotIn(List<Integer> values) {
            addCriterion("jpdrop not in", values, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropBetween(Integer value1, Integer value2) {
            addCriterion("jpdrop between", value1, value2, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andJpdropNotBetween(Integer value1, Integer value2) {
            addCriterion("jpdrop not between", value1, value2, "jpdrop");
            return (Criteria) this;
        }

        public Criteria andIseffectIsNull() {
            addCriterion("iseffect is null");
            return (Criteria) this;
        }

        public Criteria andIseffectIsNotNull() {
            addCriterion("iseffect is not null");
            return (Criteria) this;
        }

        public Criteria andIseffectEqualTo(Integer value) {
            addCriterion("iseffect =", value, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectNotEqualTo(Integer value) {
            addCriterion("iseffect <>", value, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectGreaterThan(Integer value) {
            addCriterion("iseffect >", value, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectGreaterThanOrEqualTo(Integer value) {
            addCriterion("iseffect >=", value, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectLessThan(Integer value) {
            addCriterion("iseffect <", value, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectLessThanOrEqualTo(Integer value) {
            addCriterion("iseffect <=", value, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectIn(List<Integer> values) {
            addCriterion("iseffect in", values, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectNotIn(List<Integer> values) {
            addCriterion("iseffect not in", values, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectBetween(Integer value1, Integer value2) {
            addCriterion("iseffect between", value1, value2, "iseffect");
            return (Criteria) this;
        }

        public Criteria andIseffectNotBetween(Integer value1, Integer value2) {
            addCriterion("iseffect not between", value1, value2, "iseffect");
            return (Criteria) this;
        }

        public Criteria andTipsidIsNull() {
            addCriterion("tipsid is null");
            return (Criteria) this;
        }

        public Criteria andTipsidIsNotNull() {
            addCriterion("tipsid is not null");
            return (Criteria) this;
        }

        public Criteria andTipsidEqualTo(Integer value) {
            addCriterion("tipsid =", value, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidNotEqualTo(Integer value) {
            addCriterion("tipsid <>", value, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidGreaterThan(Integer value) {
            addCriterion("tipsid >", value, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("tipsid >=", value, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidLessThan(Integer value) {
            addCriterion("tipsid <", value, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidLessThanOrEqualTo(Integer value) {
            addCriterion("tipsid <=", value, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidIn(List<Integer> values) {
            addCriterion("tipsid in", values, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidNotIn(List<Integer> values) {
            addCriterion("tipsid not in", values, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidBetween(Integer value1, Integer value2) {
            addCriterion("tipsid between", value1, value2, "tipsid");
            return (Criteria) this;
        }

        public Criteria andTipsidNotBetween(Integer value1, Integer value2) {
            addCriterion("tipsid not between", value1, value2, "tipsid");
            return (Criteria) this;
        }

        public Criteria andFashionTipsIsNull() {
            addCriterion("fashionTips is null");
            return (Criteria) this;
        }

        public Criteria andFashionTipsIsNotNull() {
            addCriterion("fashionTips is not null");
            return (Criteria) this;
        }

        public Criteria andFashionTipsEqualTo(String value) {
            addCriterion("fashionTips =", value, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsNotEqualTo(String value) {
            addCriterion("fashionTips <>", value, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsGreaterThan(String value) {
            addCriterion("fashionTips >", value, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsGreaterThanOrEqualTo(String value) {
            addCriterion("fashionTips >=", value, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsLessThan(String value) {
            addCriterion("fashionTips <", value, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsLessThanOrEqualTo(String value) {
            addCriterion("fashionTips <=", value, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsLike(String value) {
            addCriterion("fashionTips like", value, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsNotLike(String value) {
            addCriterion("fashionTips not like", value, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsIn(List<String> values) {
            addCriterion("fashionTips in", values, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsNotIn(List<String> values) {
            addCriterion("fashionTips not in", values, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsBetween(String value1, String value2) {
            addCriterion("fashionTips between", value1, value2, "fashionTips");
            return (Criteria) this;
        }

        public Criteria andFashionTipsNotBetween(String value1, String value2) {
            addCriterion("fashionTips not between", value1, value2, "fashionTips");
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