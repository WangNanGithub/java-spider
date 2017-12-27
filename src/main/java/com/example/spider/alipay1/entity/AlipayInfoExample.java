package com.example.spider.alipay1.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlipayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AlipayInfoExample() {
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

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameIsNull() {
            addCriterion("taobao_name is null");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameIsNotNull() {
            addCriterion("taobao_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameEqualTo(String value) {
            addCriterion("taobao_name =", value, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameNotEqualTo(String value) {
            addCriterion("taobao_name <>", value, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameGreaterThan(String value) {
            addCriterion("taobao_name >", value, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameGreaterThanOrEqualTo(String value) {
            addCriterion("taobao_name >=", value, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameLessThan(String value) {
            addCriterion("taobao_name <", value, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameLessThanOrEqualTo(String value) {
            addCriterion("taobao_name <=", value, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameLike(String value) {
            addCriterion("taobao_name like", value, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameNotLike(String value) {
            addCriterion("taobao_name not like", value, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameIn(List<String> values) {
            addCriterion("taobao_name in", values, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameNotIn(List<String> values) {
            addCriterion("taobao_name not in", values, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameBetween(String value1, String value2) {
            addCriterion("taobao_name between", value1, value2, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andTaobaoNameNotBetween(String value1, String value2) {
            addCriterion("taobao_name not between", value1, value2, "taobaoName");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNull() {
            addCriterion("register_date is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIsNotNull() {
            addCriterion("register_date is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDateEqualTo(String value) {
            addCriterion("register_date =", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotEqualTo(String value) {
            addCriterion("register_date <>", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThan(String value) {
            addCriterion("register_date >", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateGreaterThanOrEqualTo(String value) {
            addCriterion("register_date >=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThan(String value) {
            addCriterion("register_date <", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLessThanOrEqualTo(String value) {
            addCriterion("register_date <=", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateLike(String value) {
            addCriterion("register_date like", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotLike(String value) {
            addCriterion("register_date not like", value, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateIn(List<String> values) {
            addCriterion("register_date in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotIn(List<String> values) {
            addCriterion("register_date not in", values, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateBetween(String value1, String value2) {
            addCriterion("register_date between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andRegisterDateNotBetween(String value1, String value2) {
            addCriterion("register_date not between", value1, value2, "registerDate");
            return (Criteria) this;
        }

        public Criteria andIsRealNameIsNull() {
            addCriterion("is_real_name is null");
            return (Criteria) this;
        }

        public Criteria andIsRealNameIsNotNull() {
            addCriterion("is_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andIsRealNameEqualTo(String value) {
            addCriterion("is_real_name =", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotEqualTo(String value) {
            addCriterion("is_real_name <>", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameGreaterThan(String value) {
            addCriterion("is_real_name >", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("is_real_name >=", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameLessThan(String value) {
            addCriterion("is_real_name <", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameLessThanOrEqualTo(String value) {
            addCriterion("is_real_name <=", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameLike(String value) {
            addCriterion("is_real_name like", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotLike(String value) {
            addCriterion("is_real_name not like", value, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameIn(List<String> values) {
            addCriterion("is_real_name in", values, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotIn(List<String> values) {
            addCriterion("is_real_name not in", values, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameBetween(String value1, String value2) {
            addCriterion("is_real_name between", value1, value2, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsRealNameNotBetween(String value1, String value2) {
            addCriterion("is_real_name not between", value1, value2, "isRealName");
            return (Criteria) this;
        }

        public Criteria andIsProtectedIsNull() {
            addCriterion("is_protected is null");
            return (Criteria) this;
        }

        public Criteria andIsProtectedIsNotNull() {
            addCriterion("is_protected is not null");
            return (Criteria) this;
        }

        public Criteria andIsProtectedEqualTo(String value) {
            addCriterion("is_protected =", value, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedNotEqualTo(String value) {
            addCriterion("is_protected <>", value, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedGreaterThan(String value) {
            addCriterion("is_protected >", value, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedGreaterThanOrEqualTo(String value) {
            addCriterion("is_protected >=", value, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedLessThan(String value) {
            addCriterion("is_protected <", value, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedLessThanOrEqualTo(String value) {
            addCriterion("is_protected <=", value, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedLike(String value) {
            addCriterion("is_protected like", value, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedNotLike(String value) {
            addCriterion("is_protected not like", value, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedIn(List<String> values) {
            addCriterion("is_protected in", values, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedNotIn(List<String> values) {
            addCriterion("is_protected not in", values, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedBetween(String value1, String value2) {
            addCriterion("is_protected between", value1, value2, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsProtectedNotBetween(String value1, String value2) {
            addCriterion("is_protected not between", value1, value2, "isProtected");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIsNull() {
            addCriterion("is_phone is null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIsNotNull() {
            addCriterion("is_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneEqualTo(String value) {
            addCriterion("is_phone =", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotEqualTo(String value) {
            addCriterion("is_phone <>", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneGreaterThan(String value) {
            addCriterion("is_phone >", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("is_phone >=", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneLessThan(String value) {
            addCriterion("is_phone <", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneLessThanOrEqualTo(String value) {
            addCriterion("is_phone <=", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneLike(String value) {
            addCriterion("is_phone like", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotLike(String value) {
            addCriterion("is_phone not like", value, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneIn(List<String> values) {
            addCriterion("is_phone in", values, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotIn(List<String> values) {
            addCriterion("is_phone not in", values, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneBetween(String value1, String value2) {
            addCriterion("is_phone between", value1, value2, "isPhone");
            return (Criteria) this;
        }

        public Criteria andIsPhoneNotBetween(String value1, String value2) {
            addCriterion("is_phone not between", value1, value2, "isPhone");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIsNull() {
            addCriterion("secret_level is null");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIsNotNull() {
            addCriterion("secret_level is not null");
            return (Criteria) this;
        }

        public Criteria andSecretLevelEqualTo(String value) {
            addCriterion("secret_level =", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotEqualTo(String value) {
            addCriterion("secret_level <>", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelGreaterThan(String value) {
            addCriterion("secret_level >", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelGreaterThanOrEqualTo(String value) {
            addCriterion("secret_level >=", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLessThan(String value) {
            addCriterion("secret_level <", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLessThanOrEqualTo(String value) {
            addCriterion("secret_level <=", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelLike(String value) {
            addCriterion("secret_level like", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotLike(String value) {
            addCriterion("secret_level not like", value, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelIn(List<String> values) {
            addCriterion("secret_level in", values, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotIn(List<String> values) {
            addCriterion("secret_level not in", values, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelBetween(String value1, String value2) {
            addCriterion("secret_level between", value1, value2, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andSecretLevelNotBetween(String value1, String value2) {
            addCriterion("secret_level not between", value1, value2, "secretLevel");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNull() {
            addCriterion("income is null");
            return (Criteria) this;
        }

        public Criteria andIncomeIsNotNull() {
            addCriterion("income is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeEqualTo(BigDecimal value) {
            addCriterion("income =", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotEqualTo(BigDecimal value) {
            addCriterion("income <>", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThan(BigDecimal value) {
            addCriterion("income >", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("income >=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThan(BigDecimal value) {
            addCriterion("income <", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("income <=", value, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeIn(List<BigDecimal> values) {
            addCriterion("income in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotIn(List<BigDecimal> values) {
            addCriterion("income not in", values, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIncomeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("income not between", value1, value2, "income");
            return (Criteria) this;
        }

        public Criteria andIsIdcardIsNull() {
            addCriterion("is_idcard is null");
            return (Criteria) this;
        }

        public Criteria andIsIdcardIsNotNull() {
            addCriterion("is_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andIsIdcardEqualTo(String value) {
            addCriterion("is_idcard =", value, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardNotEqualTo(String value) {
            addCriterion("is_idcard <>", value, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardGreaterThan(String value) {
            addCriterion("is_idcard >", value, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("is_idcard >=", value, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardLessThan(String value) {
            addCriterion("is_idcard <", value, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardLessThanOrEqualTo(String value) {
            addCriterion("is_idcard <=", value, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardLike(String value) {
            addCriterion("is_idcard like", value, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardNotLike(String value) {
            addCriterion("is_idcard not like", value, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardIn(List<String> values) {
            addCriterion("is_idcard in", values, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardNotIn(List<String> values) {
            addCriterion("is_idcard not in", values, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardBetween(String value1, String value2) {
            addCriterion("is_idcard between", value1, value2, "isIdcard");
            return (Criteria) this;
        }

        public Criteria andIsIdcardNotBetween(String value1, String value2) {
            addCriterion("is_idcard not between", value1, value2, "isIdcard");
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

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIsNull() {
            addCriterion("available_amount is null");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIsNotNull() {
            addCriterion("available_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountEqualTo(BigDecimal value) {
            addCriterion("available_amount =", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotEqualTo(BigDecimal value) {
            addCriterion("available_amount <>", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountGreaterThan(BigDecimal value) {
            addCriterion("available_amount >", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("available_amount >=", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountLessThan(BigDecimal value) {
            addCriterion("available_amount <", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("available_amount <=", value, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountIn(List<BigDecimal> values) {
            addCriterion("available_amount in", values, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotIn(List<BigDecimal> values) {
            addCriterion("available_amount not in", values, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_amount between", value1, value2, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andAvailableAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("available_amount not between", value1, value2, "availableAmount");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthIsNull() {
            addCriterion("need_to_pay_next_mouth is null");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthIsNotNull() {
            addCriterion("need_to_pay_next_mouth is not null");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthEqualTo(BigDecimal value) {
            addCriterion("need_to_pay_next_mouth =", value, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthNotEqualTo(BigDecimal value) {
            addCriterion("need_to_pay_next_mouth <>", value, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthGreaterThan(BigDecimal value) {
            addCriterion("need_to_pay_next_mouth >", value, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("need_to_pay_next_mouth >=", value, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthLessThan(BigDecimal value) {
            addCriterion("need_to_pay_next_mouth <", value, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthLessThanOrEqualTo(BigDecimal value) {
            addCriterion("need_to_pay_next_mouth <=", value, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthIn(List<BigDecimal> values) {
            addCriterion("need_to_pay_next_mouth in", values, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthNotIn(List<BigDecimal> values) {
            addCriterion("need_to_pay_next_mouth not in", values, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("need_to_pay_next_mouth between", value1, value2, "needToPayNextMouth");
            return (Criteria) this;
        }

        public Criteria andNeedToPayNextMouthNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("need_to_pay_next_mouth not between", value1, value2, "needToPayNextMouth");
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