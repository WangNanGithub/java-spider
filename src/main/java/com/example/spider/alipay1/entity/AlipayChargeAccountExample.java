package com.example.spider.alipay1.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlipayChargeAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlipayChargeAccountExample() {
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

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andChargeItemIsNull() {
            addCriterion("charge_item is null");
            return (Criteria) this;
        }

        public Criteria andChargeItemIsNotNull() {
            addCriterion("charge_item is not null");
            return (Criteria) this;
        }

        public Criteria andChargeItemEqualTo(String value) {
            addCriterion("charge_item =", value, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemNotEqualTo(String value) {
            addCriterion("charge_item <>", value, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemGreaterThan(String value) {
            addCriterion("charge_item >", value, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemGreaterThanOrEqualTo(String value) {
            addCriterion("charge_item >=", value, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemLessThan(String value) {
            addCriterion("charge_item <", value, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemLessThanOrEqualTo(String value) {
            addCriterion("charge_item <=", value, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemLike(String value) {
            addCriterion("charge_item like", value, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemNotLike(String value) {
            addCriterion("charge_item not like", value, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemIn(List<String> values) {
            addCriterion("charge_item in", values, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemNotIn(List<String> values) {
            addCriterion("charge_item not in", values, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemBetween(String value1, String value2) {
            addCriterion("charge_item between", value1, value2, "chargeItem");
            return (Criteria) this;
        }

        public Criteria andChargeItemNotBetween(String value1, String value2) {
            addCriterion("charge_item not between", value1, value2, "chargeItem");
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

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andChargeUnitIsNull() {
            addCriterion("charge_unit is null");
            return (Criteria) this;
        }

        public Criteria andChargeUnitIsNotNull() {
            addCriterion("charge_unit is not null");
            return (Criteria) this;
        }

        public Criteria andChargeUnitEqualTo(String value) {
            addCriterion("charge_unit =", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitNotEqualTo(String value) {
            addCriterion("charge_unit <>", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitGreaterThan(String value) {
            addCriterion("charge_unit >", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitGreaterThanOrEqualTo(String value) {
            addCriterion("charge_unit >=", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitLessThan(String value) {
            addCriterion("charge_unit <", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitLessThanOrEqualTo(String value) {
            addCriterion("charge_unit <=", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitLike(String value) {
            addCriterion("charge_unit like", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitNotLike(String value) {
            addCriterion("charge_unit not like", value, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitIn(List<String> values) {
            addCriterion("charge_unit in", values, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitNotIn(List<String> values) {
            addCriterion("charge_unit not in", values, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitBetween(String value1, String value2) {
            addCriterion("charge_unit between", value1, value2, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeUnitNotBetween(String value1, String value2) {
            addCriterion("charge_unit not between", value1, value2, "chargeUnit");
            return (Criteria) this;
        }

        public Criteria andChargeAccountIsNull() {
            addCriterion("charge_account is null");
            return (Criteria) this;
        }

        public Criteria andChargeAccountIsNotNull() {
            addCriterion("charge_account is not null");
            return (Criteria) this;
        }

        public Criteria andChargeAccountEqualTo(String value) {
            addCriterion("charge_account =", value, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNotEqualTo(String value) {
            addCriterion("charge_account <>", value, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountGreaterThan(String value) {
            addCriterion("charge_account >", value, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountGreaterThanOrEqualTo(String value) {
            addCriterion("charge_account >=", value, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountLessThan(String value) {
            addCriterion("charge_account <", value, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountLessThanOrEqualTo(String value) {
            addCriterion("charge_account <=", value, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountLike(String value) {
            addCriterion("charge_account like", value, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNotLike(String value) {
            addCriterion("charge_account not like", value, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountIn(List<String> values) {
            addCriterion("charge_account in", values, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNotIn(List<String> values) {
            addCriterion("charge_account not in", values, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountBetween(String value1, String value2) {
            addCriterion("charge_account between", value1, value2, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNotBetween(String value1, String value2) {
            addCriterion("charge_account not between", value1, value2, "chargeAccount");
            return (Criteria) this;
        }

        public Criteria andChargeNumberIsNull() {
            addCriterion("charge_number is null");
            return (Criteria) this;
        }

        public Criteria andChargeNumberIsNotNull() {
            addCriterion("charge_number is not null");
            return (Criteria) this;
        }

        public Criteria andChargeNumberEqualTo(String value) {
            addCriterion("charge_number =", value, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberNotEqualTo(String value) {
            addCriterion("charge_number <>", value, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberGreaterThan(String value) {
            addCriterion("charge_number >", value, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("charge_number >=", value, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberLessThan(String value) {
            addCriterion("charge_number <", value, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberLessThanOrEqualTo(String value) {
            addCriterion("charge_number <=", value, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberLike(String value) {
            addCriterion("charge_number like", value, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberNotLike(String value) {
            addCriterion("charge_number not like", value, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberIn(List<String> values) {
            addCriterion("charge_number in", values, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberNotIn(List<String> values) {
            addCriterion("charge_number not in", values, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberBetween(String value1, String value2) {
            addCriterion("charge_number between", value1, value2, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeNumberNotBetween(String value1, String value2) {
            addCriterion("charge_number not between", value1, value2, "chargeNumber");
            return (Criteria) this;
        }

        public Criteria andChargeReminderIsNull() {
            addCriterion("charge_reminder is null");
            return (Criteria) this;
        }

        public Criteria andChargeReminderIsNotNull() {
            addCriterion("charge_reminder is not null");
            return (Criteria) this;
        }

        public Criteria andChargeReminderEqualTo(String value) {
            addCriterion("charge_reminder =", value, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderNotEqualTo(String value) {
            addCriterion("charge_reminder <>", value, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderGreaterThan(String value) {
            addCriterion("charge_reminder >", value, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderGreaterThanOrEqualTo(String value) {
            addCriterion("charge_reminder >=", value, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderLessThan(String value) {
            addCriterion("charge_reminder <", value, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderLessThanOrEqualTo(String value) {
            addCriterion("charge_reminder <=", value, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderLike(String value) {
            addCriterion("charge_reminder like", value, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderNotLike(String value) {
            addCriterion("charge_reminder not like", value, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderIn(List<String> values) {
            addCriterion("charge_reminder in", values, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderNotIn(List<String> values) {
            addCriterion("charge_reminder not in", values, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderBetween(String value1, String value2) {
            addCriterion("charge_reminder between", value1, value2, "chargeReminder");
            return (Criteria) this;
        }

        public Criteria andChargeReminderNotBetween(String value1, String value2) {
            addCriterion("charge_reminder not between", value1, value2, "chargeReminder");
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