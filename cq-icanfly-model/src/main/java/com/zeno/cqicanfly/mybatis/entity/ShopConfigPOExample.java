package com.zeno.cqicanfly.mybatis.entity;

import java.util.ArrayList;
import java.util.List;

public class ShopConfigPOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShopConfigPOExample() {
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

        public Criteria andShopTypeIsNull() {
            addCriterion("shopType is null");
            return (Criteria) this;
        }

        public Criteria andShopTypeIsNotNull() {
            addCriterion("shopType is not null");
            return (Criteria) this;
        }

        public Criteria andShopTypeEqualTo(Integer value) {
            addCriterion("shopType =", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotEqualTo(Integer value) {
            addCriterion("shopType <>", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThan(Integer value) {
            addCriterion("shopType >", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopType >=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThan(Integer value) {
            addCriterion("shopType <", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeLessThanOrEqualTo(Integer value) {
            addCriterion("shopType <=", value, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeIn(List<Integer> values) {
            addCriterion("shopType in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotIn(List<Integer> values) {
            addCriterion("shopType not in", values, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeBetween(Integer value1, Integer value2) {
            addCriterion("shopType between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andShopTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("shopType not between", value1, value2, "shopType");
            return (Criteria) this;
        }

        public Criteria andTabShopIsNull() {
            addCriterion("tabShop is null");
            return (Criteria) this;
        }

        public Criteria andTabShopIsNotNull() {
            addCriterion("tabShop is not null");
            return (Criteria) this;
        }

        public Criteria andTabShopEqualTo(Integer value) {
            addCriterion("tabShop =", value, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopNotEqualTo(Integer value) {
            addCriterion("tabShop <>", value, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopGreaterThan(Integer value) {
            addCriterion("tabShop >", value, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopGreaterThanOrEqualTo(Integer value) {
            addCriterion("tabShop >=", value, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopLessThan(Integer value) {
            addCriterion("tabShop <", value, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopLessThanOrEqualTo(Integer value) {
            addCriterion("tabShop <=", value, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopIn(List<Integer> values) {
            addCriterion("tabShop in", values, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopNotIn(List<Integer> values) {
            addCriterion("tabShop not in", values, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopBetween(Integer value1, Integer value2) {
            addCriterion("tabShop between", value1, value2, "tabShop");
            return (Criteria) this;
        }

        public Criteria andTabShopNotBetween(Integer value1, Integer value2) {
            addCriterion("tabShop not between", value1, value2, "tabShop");
            return (Criteria) this;
        }

        public Criteria andShopidIsNull() {
            addCriterion("shopid is null");
            return (Criteria) this;
        }

        public Criteria andShopidIsNotNull() {
            addCriterion("shopid is not null");
            return (Criteria) this;
        }

        public Criteria andShopidEqualTo(Integer value) {
            addCriterion("shopid =", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotEqualTo(Integer value) {
            addCriterion("shopid <>", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThan(Integer value) {
            addCriterion("shopid >", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidGreaterThanOrEqualTo(Integer value) {
            addCriterion("shopid >=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThan(Integer value) {
            addCriterion("shopid <", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidLessThanOrEqualTo(Integer value) {
            addCriterion("shopid <=", value, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidIn(List<Integer> values) {
            addCriterion("shopid in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotIn(List<Integer> values) {
            addCriterion("shopid not in", values, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidBetween(Integer value1, Integer value2) {
            addCriterion("shopid between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopidNotBetween(Integer value1, Integer value2) {
            addCriterion("shopid not between", value1, value2, "shopid");
            return (Criteria) this;
        }

        public Criteria andShopIsNull() {
            addCriterion("shop is null");
            return (Criteria) this;
        }

        public Criteria andShopIsNotNull() {
            addCriterion("shop is not null");
            return (Criteria) this;
        }

        public Criteria andShopEqualTo(String value) {
            addCriterion("shop =", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotEqualTo(String value) {
            addCriterion("shop <>", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopGreaterThan(String value) {
            addCriterion("shop >", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopGreaterThanOrEqualTo(String value) {
            addCriterion("shop >=", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLessThan(String value) {
            addCriterion("shop <", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLessThanOrEqualTo(String value) {
            addCriterion("shop <=", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopLike(String value) {
            addCriterion("shop like", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotLike(String value) {
            addCriterion("shop not like", value, "shop");
            return (Criteria) this;
        }

        public Criteria andShopIn(List<String> values) {
            addCriterion("shop in", values, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotIn(List<String> values) {
            addCriterion("shop not in", values, "shop");
            return (Criteria) this;
        }

        public Criteria andShopBetween(String value1, String value2) {
            addCriterion("shop between", value1, value2, "shop");
            return (Criteria) this;
        }

        public Criteria andShopNotBetween(String value1, String value2) {
            addCriterion("shop not between", value1, value2, "shop");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(String value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(String value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(String value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(String value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(String value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(String value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLike(String value) {
            addCriterion("price like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotLike(String value) {
            addCriterion("price not like", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<String> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<String> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(String value1, String value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(String value1, String value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andLevellimitIsNull() {
            addCriterion("levellimit is null");
            return (Criteria) this;
        }

        public Criteria andLevellimitIsNotNull() {
            addCriterion("levellimit is not null");
            return (Criteria) this;
        }

        public Criteria andLevellimitEqualTo(Integer value) {
            addCriterion("levellimit =", value, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitNotEqualTo(Integer value) {
            addCriterion("levellimit <>", value, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitGreaterThan(Integer value) {
            addCriterion("levellimit >", value, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("levellimit >=", value, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitLessThan(Integer value) {
            addCriterion("levellimit <", value, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitLessThanOrEqualTo(Integer value) {
            addCriterion("levellimit <=", value, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitIn(List<Integer> values) {
            addCriterion("levellimit in", values, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitNotIn(List<Integer> values) {
            addCriterion("levellimit not in", values, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitBetween(Integer value1, Integer value2) {
            addCriterion("levellimit between", value1, value2, "levellimit");
            return (Criteria) this;
        }

        public Criteria andLevellimitNotBetween(Integer value1, Integer value2) {
            addCriterion("levellimit not between", value1, value2, "levellimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitIsNull() {
            addCriterion("reincarnationlimit is null");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitIsNotNull() {
            addCriterion("reincarnationlimit is not null");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitEqualTo(Integer value) {
            addCriterion("reincarnationlimit =", value, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitNotEqualTo(Integer value) {
            addCriterion("reincarnationlimit <>", value, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitGreaterThan(Integer value) {
            addCriterion("reincarnationlimit >", value, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("reincarnationlimit >=", value, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitLessThan(Integer value) {
            addCriterion("reincarnationlimit <", value, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitLessThanOrEqualTo(Integer value) {
            addCriterion("reincarnationlimit <=", value, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitIn(List<Integer> values) {
            addCriterion("reincarnationlimit in", values, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitNotIn(List<Integer> values) {
            addCriterion("reincarnationlimit not in", values, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitBetween(Integer value1, Integer value2) {
            addCriterion("reincarnationlimit between", value1, value2, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andReincarnationlimitNotBetween(Integer value1, Integer value2) {
            addCriterion("reincarnationlimit not between", value1, value2, "reincarnationlimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitIsNull() {
            addCriterion("daylimit is null");
            return (Criteria) this;
        }

        public Criteria andDaylimitIsNotNull() {
            addCriterion("daylimit is not null");
            return (Criteria) this;
        }

        public Criteria andDaylimitEqualTo(Integer value) {
            addCriterion("daylimit =", value, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitNotEqualTo(Integer value) {
            addCriterion("daylimit <>", value, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitGreaterThan(Integer value) {
            addCriterion("daylimit >", value, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("daylimit >=", value, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitLessThan(Integer value) {
            addCriterion("daylimit <", value, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitLessThanOrEqualTo(Integer value) {
            addCriterion("daylimit <=", value, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitIn(List<Integer> values) {
            addCriterion("daylimit in", values, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitNotIn(List<Integer> values) {
            addCriterion("daylimit not in", values, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitBetween(Integer value1, Integer value2) {
            addCriterion("daylimit between", value1, value2, "daylimit");
            return (Criteria) this;
        }

        public Criteria andDaylimitNotBetween(Integer value1, Integer value2) {
            addCriterion("daylimit not between", value1, value2, "daylimit");
            return (Criteria) this;
        }

        public Criteria andBuytypeIsNull() {
            addCriterion("buytype is null");
            return (Criteria) this;
        }

        public Criteria andBuytypeIsNotNull() {
            addCriterion("buytype is not null");
            return (Criteria) this;
        }

        public Criteria andBuytypeEqualTo(String value) {
            addCriterion("buytype =", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotEqualTo(String value) {
            addCriterion("buytype <>", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeGreaterThan(String value) {
            addCriterion("buytype >", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeGreaterThanOrEqualTo(String value) {
            addCriterion("buytype >=", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLessThan(String value) {
            addCriterion("buytype <", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLessThanOrEqualTo(String value) {
            addCriterion("buytype <=", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeLike(String value) {
            addCriterion("buytype like", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotLike(String value) {
            addCriterion("buytype not like", value, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeIn(List<String> values) {
            addCriterion("buytype in", values, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotIn(List<String> values) {
            addCriterion("buytype not in", values, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeBetween(String value1, String value2) {
            addCriterion("buytype between", value1, value2, "buytype");
            return (Criteria) this;
        }

        public Criteria andBuytypeNotBetween(String value1, String value2) {
            addCriterion("buytype not between", value1, value2, "buytype");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(String value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(String value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(String value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(String value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(String value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(String value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLike(String value) {
            addCriterion("flag like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotLike(String value) {
            addCriterion("flag not like", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<String> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<String> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(String value1, String value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(String value1, String value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andStatictypeIsNull() {
            addCriterion("statictype is null");
            return (Criteria) this;
        }

        public Criteria andStatictypeIsNotNull() {
            addCriterion("statictype is not null");
            return (Criteria) this;
        }

        public Criteria andStatictypeEqualTo(Integer value) {
            addCriterion("statictype =", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeNotEqualTo(Integer value) {
            addCriterion("statictype <>", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeGreaterThan(Integer value) {
            addCriterion("statictype >", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("statictype >=", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeLessThan(Integer value) {
            addCriterion("statictype <", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeLessThanOrEqualTo(Integer value) {
            addCriterion("statictype <=", value, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeIn(List<Integer> values) {
            addCriterion("statictype in", values, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeNotIn(List<Integer> values) {
            addCriterion("statictype not in", values, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeBetween(Integer value1, Integer value2) {
            addCriterion("statictype between", value1, value2, "statictype");
            return (Criteria) this;
        }

        public Criteria andStatictypeNotBetween(Integer value1, Integer value2) {
            addCriterion("statictype not between", value1, value2, "statictype");
            return (Criteria) this;
        }

        public Criteria andNpcIsNull() {
            addCriterion("npc is null");
            return (Criteria) this;
        }

        public Criteria andNpcIsNotNull() {
            addCriterion("npc is not null");
            return (Criteria) this;
        }

        public Criteria andNpcEqualTo(Integer value) {
            addCriterion("npc =", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcNotEqualTo(Integer value) {
            addCriterion("npc <>", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcGreaterThan(Integer value) {
            addCriterion("npc >", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcGreaterThanOrEqualTo(Integer value) {
            addCriterion("npc >=", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcLessThan(Integer value) {
            addCriterion("npc <", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcLessThanOrEqualTo(Integer value) {
            addCriterion("npc <=", value, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcIn(List<Integer> values) {
            addCriterion("npc in", values, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcNotIn(List<Integer> values) {
            addCriterion("npc not in", values, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcBetween(Integer value1, Integer value2) {
            addCriterion("npc between", value1, value2, "npc");
            return (Criteria) this;
        }

        public Criteria andNpcNotBetween(Integer value1, Integer value2) {
            addCriterion("npc not between", value1, value2, "npc");
            return (Criteria) this;
        }

        public Criteria andBatchbuyIsNull() {
            addCriterion("batchbuy is null");
            return (Criteria) this;
        }

        public Criteria andBatchbuyIsNotNull() {
            addCriterion("batchbuy is not null");
            return (Criteria) this;
        }

        public Criteria andBatchbuyEqualTo(Integer value) {
            addCriterion("batchbuy =", value, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyNotEqualTo(Integer value) {
            addCriterion("batchbuy <>", value, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyGreaterThan(Integer value) {
            addCriterion("batchbuy >", value, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("batchbuy >=", value, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyLessThan(Integer value) {
            addCriterion("batchbuy <", value, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyLessThanOrEqualTo(Integer value) {
            addCriterion("batchbuy <=", value, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyIn(List<Integer> values) {
            addCriterion("batchbuy in", values, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyNotIn(List<Integer> values) {
            addCriterion("batchbuy not in", values, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyBetween(Integer value1, Integer value2) {
            addCriterion("batchbuy between", value1, value2, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andBatchbuyNotBetween(Integer value1, Integer value2) {
            addCriterion("batchbuy not between", value1, value2, "batchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyIsNull() {
            addCriterion("Maxbatchbuy is null");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyIsNotNull() {
            addCriterion("Maxbatchbuy is not null");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyEqualTo(Integer value) {
            addCriterion("Maxbatchbuy =", value, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyNotEqualTo(Integer value) {
            addCriterion("Maxbatchbuy <>", value, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyGreaterThan(Integer value) {
            addCriterion("Maxbatchbuy >", value, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("Maxbatchbuy >=", value, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyLessThan(Integer value) {
            addCriterion("Maxbatchbuy <", value, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyLessThanOrEqualTo(Integer value) {
            addCriterion("Maxbatchbuy <=", value, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyIn(List<Integer> values) {
            addCriterion("Maxbatchbuy in", values, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyNotIn(List<Integer> values) {
            addCriterion("Maxbatchbuy not in", values, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyBetween(Integer value1, Integer value2) {
            addCriterion("Maxbatchbuy between", value1, value2, "maxbatchbuy");
            return (Criteria) this;
        }

        public Criteria andMaxbatchbuyNotBetween(Integer value1, Integer value2) {
            addCriterion("Maxbatchbuy not between", value1, value2, "maxbatchbuy");
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