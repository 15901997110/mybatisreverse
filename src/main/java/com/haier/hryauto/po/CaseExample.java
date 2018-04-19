package com.haier.hryauto.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CaseExample() {
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

        public Criteria andCasenameIsNull() {
            addCriterion("caseName is null");
            return (Criteria) this;
        }

        public Criteria andCasenameIsNotNull() {
            addCriterion("caseName is not null");
            return (Criteria) this;
        }

        public Criteria andCasenameEqualTo(String value) {
            addCriterion("caseName =", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotEqualTo(String value) {
            addCriterion("caseName <>", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThan(String value) {
            addCriterion("caseName >", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameGreaterThanOrEqualTo(String value) {
            addCriterion("caseName >=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThan(String value) {
            addCriterion("caseName <", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLessThanOrEqualTo(String value) {
            addCriterion("caseName <=", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameLike(String value) {
            addCriterion("caseName like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotLike(String value) {
            addCriterion("caseName not like", value, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameIn(List<String> values) {
            addCriterion("caseName in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotIn(List<String> values) {
            addCriterion("caseName not in", values, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameBetween(String value1, String value2) {
            addCriterion("caseName between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andCasenameNotBetween(String value1, String value2) {
            addCriterion("caseName not between", value1, value2, "casename");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIidIsNull() {
            addCriterion("iId is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iId is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iId =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iId <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iId >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iId >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iId <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iId <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iId in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iId not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iId between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iId not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andRequestparamIsNull() {
            addCriterion("requestParam is null");
            return (Criteria) this;
        }

        public Criteria andRequestparamIsNotNull() {
            addCriterion("requestParam is not null");
            return (Criteria) this;
        }

        public Criteria andRequestparamEqualTo(String value) {
            addCriterion("requestParam =", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamNotEqualTo(String value) {
            addCriterion("requestParam <>", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamGreaterThan(String value) {
            addCriterion("requestParam >", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamGreaterThanOrEqualTo(String value) {
            addCriterion("requestParam >=", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamLessThan(String value) {
            addCriterion("requestParam <", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamLessThanOrEqualTo(String value) {
            addCriterion("requestParam <=", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamLike(String value) {
            addCriterion("requestParam like", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamNotLike(String value) {
            addCriterion("requestParam not like", value, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamIn(List<String> values) {
            addCriterion("requestParam in", values, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamNotIn(List<String> values) {
            addCriterion("requestParam not in", values, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamBetween(String value1, String value2) {
            addCriterion("requestParam between", value1, value2, "requestparam");
            return (Criteria) this;
        }

        public Criteria andRequestparamNotBetween(String value1, String value2) {
            addCriterion("requestParam not between", value1, value2, "requestparam");
            return (Criteria) this;
        }

        public Criteria andAsserttypeIsNull() {
            addCriterion("assertType is null");
            return (Criteria) this;
        }

        public Criteria andAsserttypeIsNotNull() {
            addCriterion("assertType is not null");
            return (Criteria) this;
        }

        public Criteria andAsserttypeEqualTo(String value) {
            addCriterion("assertType =", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeNotEqualTo(String value) {
            addCriterion("assertType <>", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeGreaterThan(String value) {
            addCriterion("assertType >", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeGreaterThanOrEqualTo(String value) {
            addCriterion("assertType >=", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeLessThan(String value) {
            addCriterion("assertType <", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeLessThanOrEqualTo(String value) {
            addCriterion("assertType <=", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeLike(String value) {
            addCriterion("assertType like", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeNotLike(String value) {
            addCriterion("assertType not like", value, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeIn(List<String> values) {
            addCriterion("assertType in", values, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeNotIn(List<String> values) {
            addCriterion("assertType not in", values, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeBetween(String value1, String value2) {
            addCriterion("assertType between", value1, value2, "asserttype");
            return (Criteria) this;
        }

        public Criteria andAsserttypeNotBetween(String value1, String value2) {
            addCriterion("assertType not between", value1, value2, "asserttype");
            return (Criteria) this;
        }

        public Criteria andExpectedIsNull() {
            addCriterion("expected is null");
            return (Criteria) this;
        }

        public Criteria andExpectedIsNotNull() {
            addCriterion("expected is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedEqualTo(String value) {
            addCriterion("expected =", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotEqualTo(String value) {
            addCriterion("expected <>", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedGreaterThan(String value) {
            addCriterion("expected >", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedGreaterThanOrEqualTo(String value) {
            addCriterion("expected >=", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLessThan(String value) {
            addCriterion("expected <", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLessThanOrEqualTo(String value) {
            addCriterion("expected <=", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedLike(String value) {
            addCriterion("expected like", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotLike(String value) {
            addCriterion("expected not like", value, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedIn(List<String> values) {
            addCriterion("expected in", values, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotIn(List<String> values) {
            addCriterion("expected not in", values, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedBetween(String value1, String value2) {
            addCriterion("expected between", value1, value2, "expected");
            return (Criteria) this;
        }

        public Criteria andExpectedNotBetween(String value1, String value2) {
            addCriterion("expected not between", value1, value2, "expected");
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

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
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