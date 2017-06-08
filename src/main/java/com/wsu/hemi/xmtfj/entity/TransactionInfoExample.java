package com.wsu.hemi.xmtfj.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TransactionInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransactionInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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

        public Criteria andRegionIsNull() {
            addCriterion("region is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("region is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("region =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("region <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("region >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("region >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("region <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("region <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("region like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("region not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("region in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("region not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("region between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("region not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andSellSumIsNull() {
            addCriterion("sell_sum is null");
            return (Criteria) this;
        }

        public Criteria andSellSumIsNotNull() {
            addCriterion("sell_sum is not null");
            return (Criteria) this;
        }

        public Criteria andSellSumEqualTo(Integer value) {
            addCriterion("sell_sum =", value, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumNotEqualTo(Integer value) {
            addCriterion("sell_sum <>", value, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumGreaterThan(Integer value) {
            addCriterion("sell_sum >", value, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_sum >=", value, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumLessThan(Integer value) {
            addCriterion("sell_sum <", value, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumLessThanOrEqualTo(Integer value) {
            addCriterion("sell_sum <=", value, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumIn(List<Integer> values) {
            addCriterion("sell_sum in", values, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumNotIn(List<Integer> values) {
            addCriterion("sell_sum not in", values, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumBetween(Integer value1, Integer value2) {
            addCriterion("sell_sum between", value1, value2, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellSumNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_sum not between", value1, value2, "sellSum");
            return (Criteria) this;
        }

        public Criteria andSellAreaIsNull() {
            addCriterion("sell_area is null");
            return (Criteria) this;
        }

        public Criteria andSellAreaIsNotNull() {
            addCriterion("sell_area is not null");
            return (Criteria) this;
        }

        public Criteria andSellAreaEqualTo(Float value) {
            addCriterion("sell_area =", value, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaNotEqualTo(Float value) {
            addCriterion("sell_area <>", value, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaGreaterThan(Float value) {
            addCriterion("sell_area >", value, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("sell_area >=", value, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaLessThan(Float value) {
            addCriterion("sell_area <", value, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaLessThanOrEqualTo(Float value) {
            addCriterion("sell_area <=", value, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaIn(List<Float> values) {
            addCriterion("sell_area in", values, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaNotIn(List<Float> values) {
            addCriterion("sell_area not in", values, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaBetween(Float value1, Float value2) {
            addCriterion("sell_area between", value1, value2, "sellArea");
            return (Criteria) this;
        }

        public Criteria andSellAreaNotBetween(Float value1, Float value2) {
            addCriterion("sell_area not between", value1, value2, "sellArea");
            return (Criteria) this;
        }

        public Criteria andTotalSumIsNull() {
            addCriterion("total_sum is null");
            return (Criteria) this;
        }

        public Criteria andTotalSumIsNotNull() {
            addCriterion("total_sum is not null");
            return (Criteria) this;
        }

        public Criteria andTotalSumEqualTo(Integer value) {
            addCriterion("total_sum =", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotEqualTo(Integer value) {
            addCriterion("total_sum <>", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumGreaterThan(Integer value) {
            addCriterion("total_sum >", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_sum >=", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLessThan(Integer value) {
            addCriterion("total_sum <", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumLessThanOrEqualTo(Integer value) {
            addCriterion("total_sum <=", value, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumIn(List<Integer> values) {
            addCriterion("total_sum in", values, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotIn(List<Integer> values) {
            addCriterion("total_sum not in", values, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumBetween(Integer value1, Integer value2) {
            addCriterion("total_sum between", value1, value2, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalSumNotBetween(Integer value1, Integer value2) {
            addCriterion("total_sum not between", value1, value2, "totalSum");
            return (Criteria) this;
        }

        public Criteria andTotalAreaIsNull() {
            addCriterion("total_area is null");
            return (Criteria) this;
        }

        public Criteria andTotalAreaIsNotNull() {
            addCriterion("total_area is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAreaEqualTo(Float value) {
            addCriterion("total_area =", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaNotEqualTo(Float value) {
            addCriterion("total_area <>", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaGreaterThan(Float value) {
            addCriterion("total_area >", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("total_area >=", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaLessThan(Float value) {
            addCriterion("total_area <", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaLessThanOrEqualTo(Float value) {
            addCriterion("total_area <=", value, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaIn(List<Float> values) {
            addCriterion("total_area in", values, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaNotIn(List<Float> values) {
            addCriterion("total_area not in", values, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaBetween(Float value1, Float value2) {
            addCriterion("total_area between", value1, value2, "totalArea");
            return (Criteria) this;
        }

        public Criteria andTotalAreaNotBetween(Float value1, Float value2) {
            addCriterion("total_area not between", value1, value2, "totalArea");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Date value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterion("date not between", value1, value2, "date");
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