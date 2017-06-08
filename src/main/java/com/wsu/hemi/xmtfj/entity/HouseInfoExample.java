package com.wsu.hemi.xmtfj.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HouseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HouseInfoExample() {
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

        public Criteria andOnSellNumIsNull() {
            addCriterion("on_sell_num is null");
            return (Criteria) this;
        }

        public Criteria andOnSellNumIsNotNull() {
            addCriterion("on_sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andOnSellNumEqualTo(Integer value) {
            addCriterion("on_sell_num =", value, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumNotEqualTo(Integer value) {
            addCriterion("on_sell_num <>", value, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumGreaterThan(Integer value) {
            addCriterion("on_sell_num >", value, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("on_sell_num >=", value, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumLessThan(Integer value) {
            addCriterion("on_sell_num <", value, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumLessThanOrEqualTo(Integer value) {
            addCriterion("on_sell_num <=", value, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumIn(List<Integer> values) {
            addCriterion("on_sell_num in", values, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumNotIn(List<Integer> values) {
            addCriterion("on_sell_num not in", values, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumBetween(Integer value1, Integer value2) {
            addCriterion("on_sell_num between", value1, value2, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andOnSellNumNotBetween(Integer value1, Integer value2) {
            addCriterion("on_sell_num not between", value1, value2, "onSellNum");
            return (Criteria) this;
        }

        public Criteria andAllNumIsNull() {
            addCriterion("all_num is null");
            return (Criteria) this;
        }

        public Criteria andAllNumIsNotNull() {
            addCriterion("all_num is not null");
            return (Criteria) this;
        }

        public Criteria andAllNumEqualTo(Integer value) {
            addCriterion("all_num =", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotEqualTo(Integer value) {
            addCriterion("all_num <>", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumGreaterThan(Integer value) {
            addCriterion("all_num >", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("all_num >=", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumLessThan(Integer value) {
            addCriterion("all_num <", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumLessThanOrEqualTo(Integer value) {
            addCriterion("all_num <=", value, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumIn(List<Integer> values) {
            addCriterion("all_num in", values, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotIn(List<Integer> values) {
            addCriterion("all_num not in", values, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumBetween(Integer value1, Integer value2) {
            addCriterion("all_num between", value1, value2, "allNum");
            return (Criteria) this;
        }

        public Criteria andAllNumNotBetween(Integer value1, Integer value2) {
            addCriterion("all_num not between", value1, value2, "allNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumIsNull() {
            addCriterion("can_sell_num is null");
            return (Criteria) this;
        }

        public Criteria andCanSellNumIsNotNull() {
            addCriterion("can_sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andCanSellNumEqualTo(Integer value) {
            addCriterion("can_sell_num =", value, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumNotEqualTo(Integer value) {
            addCriterion("can_sell_num <>", value, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumGreaterThan(Integer value) {
            addCriterion("can_sell_num >", value, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("can_sell_num >=", value, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumLessThan(Integer value) {
            addCriterion("can_sell_num <", value, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumLessThanOrEqualTo(Integer value) {
            addCriterion("can_sell_num <=", value, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumIn(List<Integer> values) {
            addCriterion("can_sell_num in", values, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumNotIn(List<Integer> values) {
            addCriterion("can_sell_num not in", values, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumBetween(Integer value1, Integer value2) {
            addCriterion("can_sell_num between", value1, value2, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andCanSellNumNotBetween(Integer value1, Integer value2) {
            addCriterion("can_sell_num not between", value1, value2, "canSellNum");
            return (Criteria) this;
        }

        public Criteria andAllAreaIsNull() {
            addCriterion("all_area is null");
            return (Criteria) this;
        }

        public Criteria andAllAreaIsNotNull() {
            addCriterion("all_area is not null");
            return (Criteria) this;
        }

        public Criteria andAllAreaEqualTo(Long value) {
            addCriterion("all_area =", value, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaNotEqualTo(Long value) {
            addCriterion("all_area <>", value, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaGreaterThan(Long value) {
            addCriterion("all_area >", value, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("all_area >=", value, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaLessThan(Long value) {
            addCriterion("all_area <", value, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaLessThanOrEqualTo(Long value) {
            addCriterion("all_area <=", value, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaIn(List<Long> values) {
            addCriterion("all_area in", values, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaNotIn(List<Long> values) {
            addCriterion("all_area not in", values, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaBetween(Long value1, Long value2) {
            addCriterion("all_area between", value1, value2, "allArea");
            return (Criteria) this;
        }

        public Criteria andAllAreaNotBetween(Long value1, Long value2) {
            addCriterion("all_area not between", value1, value2, "allArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaIsNull() {
            addCriterion("can_sell_area is null");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaIsNotNull() {
            addCriterion("can_sell_area is not null");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaEqualTo(Long value) {
            addCriterion("can_sell_area =", value, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaNotEqualTo(Long value) {
            addCriterion("can_sell_area <>", value, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaGreaterThan(Long value) {
            addCriterion("can_sell_area >", value, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("can_sell_area >=", value, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaLessThan(Long value) {
            addCriterion("can_sell_area <", value, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaLessThanOrEqualTo(Long value) {
            addCriterion("can_sell_area <=", value, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaIn(List<Long> values) {
            addCriterion("can_sell_area in", values, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaNotIn(List<Long> values) {
            addCriterion("can_sell_area not in", values, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaBetween(Long value1, Long value2) {
            addCriterion("can_sell_area between", value1, value2, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andCanSellAreaNotBetween(Long value1, Long value2) {
            addCriterion("can_sell_area not between", value1, value2, "canSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellNumIsNull() {
            addCriterion("is_sell_num is null");
            return (Criteria) this;
        }

        public Criteria andIsSellNumIsNotNull() {
            addCriterion("is_sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andIsSellNumEqualTo(Integer value) {
            addCriterion("is_sell_num =", value, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumNotEqualTo(Integer value) {
            addCriterion("is_sell_num <>", value, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumGreaterThan(Integer value) {
            addCriterion("is_sell_num >", value, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_sell_num >=", value, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumLessThan(Integer value) {
            addCriterion("is_sell_num <", value, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumLessThanOrEqualTo(Integer value) {
            addCriterion("is_sell_num <=", value, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumIn(List<Integer> values) {
            addCriterion("is_sell_num in", values, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumNotIn(List<Integer> values) {
            addCriterion("is_sell_num not in", values, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumBetween(Integer value1, Integer value2) {
            addCriterion("is_sell_num between", value1, value2, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellNumNotBetween(Integer value1, Integer value2) {
            addCriterion("is_sell_num not between", value1, value2, "isSellNum");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaIsNull() {
            addCriterion("is_sell_area is null");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaIsNotNull() {
            addCriterion("is_sell_area is not null");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaEqualTo(Long value) {
            addCriterion("is_sell_area =", value, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaNotEqualTo(Long value) {
            addCriterion("is_sell_area <>", value, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaGreaterThan(Long value) {
            addCriterion("is_sell_area >", value, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaGreaterThanOrEqualTo(Long value) {
            addCriterion("is_sell_area >=", value, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaLessThan(Long value) {
            addCriterion("is_sell_area <", value, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaLessThanOrEqualTo(Long value) {
            addCriterion("is_sell_area <=", value, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaIn(List<Long> values) {
            addCriterion("is_sell_area in", values, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaNotIn(List<Long> values) {
            addCriterion("is_sell_area not in", values, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaBetween(Long value1, Long value2) {
            addCriterion("is_sell_area between", value1, value2, "isSellArea");
            return (Criteria) this;
        }

        public Criteria andIsSellAreaNotBetween(Long value1, Long value2) {
            addCriterion("is_sell_area not between", value1, value2, "isSellArea");
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