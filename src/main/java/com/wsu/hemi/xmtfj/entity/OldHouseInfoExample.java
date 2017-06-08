package com.wsu.hemi.xmtfj.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OldHouseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OldHouseInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andHouseRateIsNull() {
            addCriterion("house_rate is null");
            return (Criteria) this;
        }

        public Criteria andHouseRateIsNotNull() {
            addCriterion("house_rate is not null");
            return (Criteria) this;
        }

        public Criteria andHouseRateEqualTo(Float value) {
            addCriterion("house_rate =", value, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateNotEqualTo(Float value) {
            addCriterion("house_rate <>", value, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateGreaterThan(Float value) {
            addCriterion("house_rate >", value, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateGreaterThanOrEqualTo(Float value) {
            addCriterion("house_rate >=", value, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateLessThan(Float value) {
            addCriterion("house_rate <", value, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateLessThanOrEqualTo(Float value) {
            addCriterion("house_rate <=", value, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateIn(List<Float> values) {
            addCriterion("house_rate in", values, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateNotIn(List<Float> values) {
            addCriterion("house_rate not in", values, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateBetween(Float value1, Float value2) {
            addCriterion("house_rate between", value1, value2, "houseRate");
            return (Criteria) this;
        }

        public Criteria andHouseRateNotBetween(Float value1, Float value2) {
            addCriterion("house_rate not between", value1, value2, "houseRate");
            return (Criteria) this;
        }

        public Criteria andSellNumIsNull() {
            addCriterion("sell_num is null");
            return (Criteria) this;
        }

        public Criteria andSellNumIsNotNull() {
            addCriterion("sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andSellNumEqualTo(Integer value) {
            addCriterion("sell_num =", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotEqualTo(Integer value) {
            addCriterion("sell_num <>", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumGreaterThan(Integer value) {
            addCriterion("sell_num >", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sell_num >=", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumLessThan(Integer value) {
            addCriterion("sell_num <", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumLessThanOrEqualTo(Integer value) {
            addCriterion("sell_num <=", value, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumIn(List<Integer> values) {
            addCriterion("sell_num in", values, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotIn(List<Integer> values) {
            addCriterion("sell_num not in", values, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumBetween(Integer value1, Integer value2) {
            addCriterion("sell_num between", value1, value2, "sellNum");
            return (Criteria) this;
        }

        public Criteria andSellNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sell_num not between", value1, value2, "sellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumIsNull() {
            addCriterion("today_sell_num is null");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumIsNotNull() {
            addCriterion("today_sell_num is not null");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumEqualTo(Integer value) {
            addCriterion("today_sell_num =", value, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumNotEqualTo(Integer value) {
            addCriterion("today_sell_num <>", value, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumGreaterThan(Integer value) {
            addCriterion("today_sell_num >", value, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("today_sell_num >=", value, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumLessThan(Integer value) {
            addCriterion("today_sell_num <", value, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumLessThanOrEqualTo(Integer value) {
            addCriterion("today_sell_num <=", value, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumIn(List<Integer> values) {
            addCriterion("today_sell_num in", values, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumNotIn(List<Integer> values) {
            addCriterion("today_sell_num not in", values, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumBetween(Integer value1, Integer value2) {
            addCriterion("today_sell_num between", value1, value2, "todaySellNum");
            return (Criteria) this;
        }

        public Criteria andTodaySellNumNotBetween(Integer value1, Integer value2) {
            addCriterion("today_sell_num not between", value1, value2, "todaySellNum");
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

        public Criteria andTodaySellAreaIsNull() {
            addCriterion("today_sell_area is null");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaIsNotNull() {
            addCriterion("today_sell_area is not null");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaEqualTo(Float value) {
            addCriterion("today_sell_area =", value, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaNotEqualTo(Float value) {
            addCriterion("today_sell_area <>", value, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaGreaterThan(Float value) {
            addCriterion("today_sell_area >", value, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaGreaterThanOrEqualTo(Float value) {
            addCriterion("today_sell_area >=", value, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaLessThan(Float value) {
            addCriterion("today_sell_area <", value, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaLessThanOrEqualTo(Float value) {
            addCriterion("today_sell_area <=", value, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaIn(List<Float> values) {
            addCriterion("today_sell_area in", values, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaNotIn(List<Float> values) {
            addCriterion("today_sell_area not in", values, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaBetween(Float value1, Float value2) {
            addCriterion("today_sell_area between", value1, value2, "todaySellArea");
            return (Criteria) this;
        }

        public Criteria andTodaySellAreaNotBetween(Float value1, Float value2) {
            addCriterion("today_sell_area not between", value1, value2, "todaySellArea");
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
            addCriterionForJDBCDate("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Date value) {
            addCriterionForJDBCDate("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Date value) {
            addCriterionForJDBCDate("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Date> values) {
            addCriterionForJDBCDate("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("date not between", value1, value2, "date");
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