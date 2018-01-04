package com.htouhui.loan.large.order;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNull() {
            addCriterion("request_amount is null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIsNotNull() {
            addCriterion("request_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRequestAmountEqualTo(BigDecimal value) {
            addCriterion("request_amount =", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotEqualTo(BigDecimal value) {
            addCriterion("request_amount <>", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThan(BigDecimal value) {
            addCriterion("request_amount >", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("request_amount >=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThan(BigDecimal value) {
            addCriterion("request_amount <", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("request_amount <=", value, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountIn(List<BigDecimal> values) {
            addCriterion("request_amount in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotIn(List<BigDecimal> values) {
            addCriterion("request_amount not in", values, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_amount between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_amount not between", value1, value2, "requestAmount");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodIsNull() {
            addCriterion("request_period is null");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodIsNotNull() {
            addCriterion("request_period is not null");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodEqualTo(Integer value) {
            addCriterion("request_period =", value, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodNotEqualTo(Integer value) {
            addCriterion("request_period <>", value, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodGreaterThan(Integer value) {
            addCriterion("request_period >", value, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("request_period >=", value, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodLessThan(Integer value) {
            addCriterion("request_period <", value, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("request_period <=", value, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodIn(List<Integer> values) {
            addCriterion("request_period in", values, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodNotIn(List<Integer> values) {
            addCriterion("request_period not in", values, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodBetween(Integer value1, Integer value2) {
            addCriterion("request_period between", value1, value2, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("request_period not between", value1, value2, "requestPeriod");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitIsNull() {
            addCriterion("request_period_unit is null");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitIsNotNull() {
            addCriterion("request_period_unit is not null");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitEqualTo(Integer value) {
            addCriterion("request_period_unit =", value, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitNotEqualTo(Integer value) {
            addCriterion("request_period_unit <>", value, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitGreaterThan(Integer value) {
            addCriterion("request_period_unit >", value, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("request_period_unit >=", value, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitLessThan(Integer value) {
            addCriterion("request_period_unit <", value, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitLessThanOrEqualTo(Integer value) {
            addCriterion("request_period_unit <=", value, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitIn(List<Integer> values) {
            addCriterion("request_period_unit in", values, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitNotIn(List<Integer> values) {
            addCriterion("request_period_unit not in", values, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitBetween(Integer value1, Integer value2) {
            addCriterion("request_period_unit between", value1, value2, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestPeriodUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("request_period_unit not between", value1, value2, "requestPeriodUnit");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNull() {
            addCriterion("request_no is null");
            return (Criteria) this;
        }

        public Criteria andRequestNoIsNotNull() {
            addCriterion("request_no is not null");
            return (Criteria) this;
        }

        public Criteria andRequestNoEqualTo(Integer value) {
            addCriterion("request_no =", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotEqualTo(Integer value) {
            addCriterion("request_no <>", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThan(Integer value) {
            addCriterion("request_no >", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("request_no >=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThan(Integer value) {
            addCriterion("request_no <", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoLessThanOrEqualTo(Integer value) {
            addCriterion("request_no <=", value, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoIn(List<Integer> values) {
            addCriterion("request_no in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotIn(List<Integer> values) {
            addCriterion("request_no not in", values, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoBetween(Integer value1, Integer value2) {
            addCriterion("request_no between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestNoNotBetween(Integer value1, Integer value2) {
            addCriterion("request_no not between", value1, value2, "requestNo");
            return (Criteria) this;
        }

        public Criteria andRequestRateIsNull() {
            addCriterion("request_rate is null");
            return (Criteria) this;
        }

        public Criteria andRequestRateIsNotNull() {
            addCriterion("request_rate is not null");
            return (Criteria) this;
        }

        public Criteria andRequestRateEqualTo(BigDecimal value) {
            addCriterion("request_rate =", value, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateNotEqualTo(BigDecimal value) {
            addCriterion("request_rate <>", value, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateGreaterThan(BigDecimal value) {
            addCriterion("request_rate >", value, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("request_rate >=", value, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateLessThan(BigDecimal value) {
            addCriterion("request_rate <", value, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("request_rate <=", value, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateIn(List<BigDecimal> values) {
            addCriterion("request_rate in", values, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateNotIn(List<BigDecimal> values) {
            addCriterion("request_rate not in", values, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_rate between", value1, value2, "requestRate");
            return (Criteria) this;
        }

        public Criteria andRequestRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("request_rate not between", value1, value2, "requestRate");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(Integer value) {
            addCriterion("period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(Integer value) {
            addCriterion("period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(Integer value) {
            addCriterion("period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(Integer value) {
            addCriterion("period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<Integer> values) {
            addCriterion("period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<Integer> values) {
            addCriterion("period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(Integer value1, Integer value2) {
            addCriterion("period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitIsNull() {
            addCriterion("period_unit is null");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitIsNotNull() {
            addCriterion("period_unit is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitEqualTo(Integer value) {
            addCriterion("period_unit =", value, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitNotEqualTo(Integer value) {
            addCriterion("period_unit <>", value, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitGreaterThan(Integer value) {
            addCriterion("period_unit >", value, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_unit >=", value, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitLessThan(Integer value) {
            addCriterion("period_unit <", value, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitLessThanOrEqualTo(Integer value) {
            addCriterion("period_unit <=", value, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitIn(List<Integer> values) {
            addCriterion("period_unit in", values, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitNotIn(List<Integer> values) {
            addCriterion("period_unit not in", values, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitBetween(Integer value1, Integer value2) {
            addCriterion("period_unit between", value1, value2, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andPeriodUnitNotBetween(Integer value1, Integer value2) {
            addCriterion("period_unit not between", value1, value2, "periodUnit");
            return (Criteria) this;
        }

        public Criteria andNoIsNull() {
            addCriterion("no is null");
            return (Criteria) this;
        }

        public Criteria andNoIsNotNull() {
            addCriterion("no is not null");
            return (Criteria) this;
        }

        public Criteria andNoEqualTo(Integer value) {
            addCriterion("no =", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotEqualTo(Integer value) {
            addCriterion("no <>", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThan(Integer value) {
            addCriterion("no >", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("no >=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThan(Integer value) {
            addCriterion("no <", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoLessThanOrEqualTo(Integer value) {
            addCriterion("no <=", value, "no");
            return (Criteria) this;
        }

        public Criteria andNoIn(List<Integer> values) {
            addCriterion("no in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotIn(List<Integer> values) {
            addCriterion("no not in", values, "no");
            return (Criteria) this;
        }

        public Criteria andNoBetween(Integer value1, Integer value2) {
            addCriterion("no between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andNoNotBetween(Integer value1, Integer value2) {
            addCriterion("no not between", value1, value2, "no");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(BigDecimal value) {
            addCriterion("rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(BigDecimal value) {
            addCriterion("rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(BigDecimal value) {
            addCriterion("rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(BigDecimal value) {
            addCriterion("rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<BigDecimal> values) {
            addCriterion("rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<BigDecimal> values) {
            addCriterion("rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rate not between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNull() {
            addCriterion("loan_date is null");
            return (Criteria) this;
        }

        public Criteria andLoanDateIsNotNull() {
            addCriterion("loan_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoanDateEqualTo(Date value) {
            addCriterion("loan_date =", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotEqualTo(Date value) {
            addCriterion("loan_date <>", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThan(Date value) {
            addCriterion("loan_date >", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateGreaterThanOrEqualTo(Date value) {
            addCriterion("loan_date >=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThan(Date value) {
            addCriterion("loan_date <", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateLessThanOrEqualTo(Date value) {
            addCriterion("loan_date <=", value, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateIn(List<Date> values) {
            addCriterion("loan_date in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotIn(List<Date> values) {
            addCriterion("loan_date not in", values, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateBetween(Date value1, Date value2) {
            addCriterion("loan_date between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andLoanDateNotBetween(Date value1, Date value2) {
            addCriterion("loan_date not between", value1, value2, "loanDate");
            return (Criteria) this;
        }

        public Criteria andDueIsNull() {
            addCriterion("due is null");
            return (Criteria) this;
        }

        public Criteria andDueIsNotNull() {
            addCriterion("due is not null");
            return (Criteria) this;
        }

        public Criteria andDueEqualTo(Byte value) {
            addCriterion("due =", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotEqualTo(Byte value) {
            addCriterion("due <>", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueGreaterThan(Byte value) {
            addCriterion("due >", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueGreaterThanOrEqualTo(Byte value) {
            addCriterion("due >=", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueLessThan(Byte value) {
            addCriterion("due <", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueLessThanOrEqualTo(Byte value) {
            addCriterion("due <=", value, "due");
            return (Criteria) this;
        }

        public Criteria andDueIn(List<Byte> values) {
            addCriterion("due in", values, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotIn(List<Byte> values) {
            addCriterion("due not in", values, "due");
            return (Criteria) this;
        }

        public Criteria andDueBetween(Byte value1, Byte value2) {
            addCriterion("due between", value1, value2, "due");
            return (Criteria) this;
        }

        public Criteria andDueNotBetween(Byte value1, Byte value2) {
            addCriterion("due not between", value1, value2, "due");
            return (Criteria) this;
        }

        public Criteria andIsReloanIsNull() {
            addCriterion("is_reloan is null");
            return (Criteria) this;
        }

        public Criteria andIsReloanIsNotNull() {
            addCriterion("is_reloan is not null");
            return (Criteria) this;
        }

        public Criteria andIsReloanEqualTo(Integer value) {
            addCriterion("is_reloan =", value, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanNotEqualTo(Integer value) {
            addCriterion("is_reloan <>", value, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanGreaterThan(Integer value) {
            addCriterion("is_reloan >", value, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_reloan >=", value, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanLessThan(Integer value) {
            addCriterion("is_reloan <", value, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanLessThanOrEqualTo(Integer value) {
            addCriterion("is_reloan <=", value, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanIn(List<Integer> values) {
            addCriterion("is_reloan in", values, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanNotIn(List<Integer> values) {
            addCriterion("is_reloan not in", values, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanBetween(Integer value1, Integer value2) {
            addCriterion("is_reloan between", value1, value2, "isReloan");
            return (Criteria) this;
        }

        public Criteria andIsReloanNotBetween(Integer value1, Integer value2) {
            addCriterion("is_reloan not between", value1, value2, "isReloan");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoIsNull() {
            addCriterion("repayment_no is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoIsNotNull() {
            addCriterion("repayment_no is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoEqualTo(Integer value) {
            addCriterion("repayment_no =", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoNotEqualTo(Integer value) {
            addCriterion("repayment_no <>", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoGreaterThan(Integer value) {
            addCriterion("repayment_no >", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("repayment_no >=", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoLessThan(Integer value) {
            addCriterion("repayment_no <", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoLessThanOrEqualTo(Integer value) {
            addCriterion("repayment_no <=", value, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoIn(List<Integer> values) {
            addCriterion("repayment_no in", values, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoNotIn(List<Integer> values) {
            addCriterion("repayment_no not in", values, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoBetween(Integer value1, Integer value2) {
            addCriterion("repayment_no between", value1, value2, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andRepaymentNoNotBetween(Integer value1, Integer value2) {
            addCriterion("repayment_no not between", value1, value2, "repaymentNo");
            return (Criteria) this;
        }

        public Criteria andClerkIsNull() {
            addCriterion("clerk is null");
            return (Criteria) this;
        }

        public Criteria andClerkIsNotNull() {
            addCriterion("clerk is not null");
            return (Criteria) this;
        }

        public Criteria andClerkEqualTo(String value) {
            addCriterion("clerk =", value, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkNotEqualTo(String value) {
            addCriterion("clerk <>", value, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkGreaterThan(String value) {
            addCriterion("clerk >", value, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkGreaterThanOrEqualTo(String value) {
            addCriterion("clerk >=", value, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkLessThan(String value) {
            addCriterion("clerk <", value, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkLessThanOrEqualTo(String value) {
            addCriterion("clerk <=", value, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkLike(String value) {
            addCriterion("clerk like", value, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkNotLike(String value) {
            addCriterion("clerk not like", value, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkIn(List<String> values) {
            addCriterion("clerk in", values, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkNotIn(List<String> values) {
            addCriterion("clerk not in", values, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkBetween(String value1, String value2) {
            addCriterion("clerk between", value1, value2, "clerk");
            return (Criteria) this;
        }

        public Criteria andClerkNotBetween(String value1, String value2) {
            addCriterion("clerk not between", value1, value2, "clerk");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
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