package com.haier.hryauto.po;

import java.util.ArrayList;
import java.util.List;

public class EnvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EnvExample() {
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

        public Criteria andServiceidIsNull() {
            addCriterion("serviceId is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("serviceId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(Integer value) {
            addCriterion("serviceId =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(Integer value) {
            addCriterion("serviceId <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(Integer value) {
            addCriterion("serviceId >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(Integer value) {
            addCriterion("serviceId >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(Integer value) {
            addCriterion("serviceId <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(Integer value) {
            addCriterion("serviceId <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<Integer> values) {
            addCriterion("serviceId in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<Integer> values) {
            addCriterion("serviceId not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(Integer value1, Integer value2) {
            addCriterion("serviceId between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(Integer value1, Integer value2) {
            addCriterion("serviceId not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andEnv1hostIsNull() {
            addCriterion("env1host is null");
            return (Criteria) this;
        }

        public Criteria andEnv1hostIsNotNull() {
            addCriterion("env1host is not null");
            return (Criteria) this;
        }

        public Criteria andEnv1hostEqualTo(String value) {
            addCriterion("env1host =", value, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostNotEqualTo(String value) {
            addCriterion("env1host <>", value, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostGreaterThan(String value) {
            addCriterion("env1host >", value, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostGreaterThanOrEqualTo(String value) {
            addCriterion("env1host >=", value, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostLessThan(String value) {
            addCriterion("env1host <", value, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostLessThanOrEqualTo(String value) {
            addCriterion("env1host <=", value, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostLike(String value) {
            addCriterion("env1host like", value, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostNotLike(String value) {
            addCriterion("env1host not like", value, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostIn(List<String> values) {
            addCriterion("env1host in", values, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostNotIn(List<String> values) {
            addCriterion("env1host not in", values, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostBetween(String value1, String value2) {
            addCriterion("env1host between", value1, value2, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1hostNotBetween(String value1, String value2) {
            addCriterion("env1host not between", value1, value2, "env1host");
            return (Criteria) this;
        }

        public Criteria andEnv1dbIsNull() {
            addCriterion("env1db is null");
            return (Criteria) this;
        }

        public Criteria andEnv1dbIsNotNull() {
            addCriterion("env1db is not null");
            return (Criteria) this;
        }

        public Criteria andEnv1dbEqualTo(String value) {
            addCriterion("env1db =", value, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbNotEqualTo(String value) {
            addCriterion("env1db <>", value, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbGreaterThan(String value) {
            addCriterion("env1db >", value, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbGreaterThanOrEqualTo(String value) {
            addCriterion("env1db >=", value, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbLessThan(String value) {
            addCriterion("env1db <", value, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbLessThanOrEqualTo(String value) {
            addCriterion("env1db <=", value, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbLike(String value) {
            addCriterion("env1db like", value, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbNotLike(String value) {
            addCriterion("env1db not like", value, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbIn(List<String> values) {
            addCriterion("env1db in", values, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbNotIn(List<String> values) {
            addCriterion("env1db not in", values, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbBetween(String value1, String value2) {
            addCriterion("env1db between", value1, value2, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv1dbNotBetween(String value1, String value2) {
            addCriterion("env1db not between", value1, value2, "env1db");
            return (Criteria) this;
        }

        public Criteria andEnv2hostIsNull() {
            addCriterion("env2host is null");
            return (Criteria) this;
        }

        public Criteria andEnv2hostIsNotNull() {
            addCriterion("env2host is not null");
            return (Criteria) this;
        }

        public Criteria andEnv2hostEqualTo(String value) {
            addCriterion("env2host =", value, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostNotEqualTo(String value) {
            addCriterion("env2host <>", value, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostGreaterThan(String value) {
            addCriterion("env2host >", value, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostGreaterThanOrEqualTo(String value) {
            addCriterion("env2host >=", value, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostLessThan(String value) {
            addCriterion("env2host <", value, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostLessThanOrEqualTo(String value) {
            addCriterion("env2host <=", value, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostLike(String value) {
            addCriterion("env2host like", value, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostNotLike(String value) {
            addCriterion("env2host not like", value, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostIn(List<String> values) {
            addCriterion("env2host in", values, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostNotIn(List<String> values) {
            addCriterion("env2host not in", values, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostBetween(String value1, String value2) {
            addCriterion("env2host between", value1, value2, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2hostNotBetween(String value1, String value2) {
            addCriterion("env2host not between", value1, value2, "env2host");
            return (Criteria) this;
        }

        public Criteria andEnv2dbIsNull() {
            addCriterion("env2db is null");
            return (Criteria) this;
        }

        public Criteria andEnv2dbIsNotNull() {
            addCriterion("env2db is not null");
            return (Criteria) this;
        }

        public Criteria andEnv2dbEqualTo(String value) {
            addCriterion("env2db =", value, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbNotEqualTo(String value) {
            addCriterion("env2db <>", value, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbGreaterThan(String value) {
            addCriterion("env2db >", value, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbGreaterThanOrEqualTo(String value) {
            addCriterion("env2db >=", value, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbLessThan(String value) {
            addCriterion("env2db <", value, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbLessThanOrEqualTo(String value) {
            addCriterion("env2db <=", value, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbLike(String value) {
            addCriterion("env2db like", value, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbNotLike(String value) {
            addCriterion("env2db not like", value, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbIn(List<String> values) {
            addCriterion("env2db in", values, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbNotIn(List<String> values) {
            addCriterion("env2db not in", values, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbBetween(String value1, String value2) {
            addCriterion("env2db between", value1, value2, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv2dbNotBetween(String value1, String value2) {
            addCriterion("env2db not between", value1, value2, "env2db");
            return (Criteria) this;
        }

        public Criteria andEnv3hostIsNull() {
            addCriterion("env3host is null");
            return (Criteria) this;
        }

        public Criteria andEnv3hostIsNotNull() {
            addCriterion("env3host is not null");
            return (Criteria) this;
        }

        public Criteria andEnv3hostEqualTo(String value) {
            addCriterion("env3host =", value, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostNotEqualTo(String value) {
            addCriterion("env3host <>", value, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostGreaterThan(String value) {
            addCriterion("env3host >", value, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostGreaterThanOrEqualTo(String value) {
            addCriterion("env3host >=", value, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostLessThan(String value) {
            addCriterion("env3host <", value, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostLessThanOrEqualTo(String value) {
            addCriterion("env3host <=", value, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostLike(String value) {
            addCriterion("env3host like", value, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostNotLike(String value) {
            addCriterion("env3host not like", value, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostIn(List<String> values) {
            addCriterion("env3host in", values, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostNotIn(List<String> values) {
            addCriterion("env3host not in", values, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostBetween(String value1, String value2) {
            addCriterion("env3host between", value1, value2, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3hostNotBetween(String value1, String value2) {
            addCriterion("env3host not between", value1, value2, "env3host");
            return (Criteria) this;
        }

        public Criteria andEnv3dbIsNull() {
            addCriterion("env3db is null");
            return (Criteria) this;
        }

        public Criteria andEnv3dbIsNotNull() {
            addCriterion("env3db is not null");
            return (Criteria) this;
        }

        public Criteria andEnv3dbEqualTo(String value) {
            addCriterion("env3db =", value, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbNotEqualTo(String value) {
            addCriterion("env3db <>", value, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbGreaterThan(String value) {
            addCriterion("env3db >", value, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbGreaterThanOrEqualTo(String value) {
            addCriterion("env3db >=", value, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbLessThan(String value) {
            addCriterion("env3db <", value, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbLessThanOrEqualTo(String value) {
            addCriterion("env3db <=", value, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbLike(String value) {
            addCriterion("env3db like", value, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbNotLike(String value) {
            addCriterion("env3db not like", value, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbIn(List<String> values) {
            addCriterion("env3db in", values, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbNotIn(List<String> values) {
            addCriterion("env3db not in", values, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbBetween(String value1, String value2) {
            addCriterion("env3db between", value1, value2, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv3dbNotBetween(String value1, String value2) {
            addCriterion("env3db not between", value1, value2, "env3db");
            return (Criteria) this;
        }

        public Criteria andEnv4hostIsNull() {
            addCriterion("env4host is null");
            return (Criteria) this;
        }

        public Criteria andEnv4hostIsNotNull() {
            addCriterion("env4host is not null");
            return (Criteria) this;
        }

        public Criteria andEnv4hostEqualTo(String value) {
            addCriterion("env4host =", value, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostNotEqualTo(String value) {
            addCriterion("env4host <>", value, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostGreaterThan(String value) {
            addCriterion("env4host >", value, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostGreaterThanOrEqualTo(String value) {
            addCriterion("env4host >=", value, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostLessThan(String value) {
            addCriterion("env4host <", value, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostLessThanOrEqualTo(String value) {
            addCriterion("env4host <=", value, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostLike(String value) {
            addCriterion("env4host like", value, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostNotLike(String value) {
            addCriterion("env4host not like", value, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostIn(List<String> values) {
            addCriterion("env4host in", values, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostNotIn(List<String> values) {
            addCriterion("env4host not in", values, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostBetween(String value1, String value2) {
            addCriterion("env4host between", value1, value2, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4hostNotBetween(String value1, String value2) {
            addCriterion("env4host not between", value1, value2, "env4host");
            return (Criteria) this;
        }

        public Criteria andEnv4dbIsNull() {
            addCriterion("env4db is null");
            return (Criteria) this;
        }

        public Criteria andEnv4dbIsNotNull() {
            addCriterion("env4db is not null");
            return (Criteria) this;
        }

        public Criteria andEnv4dbEqualTo(String value) {
            addCriterion("env4db =", value, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbNotEqualTo(String value) {
            addCriterion("env4db <>", value, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbGreaterThan(String value) {
            addCriterion("env4db >", value, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbGreaterThanOrEqualTo(String value) {
            addCriterion("env4db >=", value, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbLessThan(String value) {
            addCriterion("env4db <", value, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbLessThanOrEqualTo(String value) {
            addCriterion("env4db <=", value, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbLike(String value) {
            addCriterion("env4db like", value, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbNotLike(String value) {
            addCriterion("env4db not like", value, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbIn(List<String> values) {
            addCriterion("env4db in", values, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbNotIn(List<String> values) {
            addCriterion("env4db not in", values, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbBetween(String value1, String value2) {
            addCriterion("env4db between", value1, value2, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv4dbNotBetween(String value1, String value2) {
            addCriterion("env4db not between", value1, value2, "env4db");
            return (Criteria) this;
        }

        public Criteria andEnv5hostIsNull() {
            addCriterion("env5host is null");
            return (Criteria) this;
        }

        public Criteria andEnv5hostIsNotNull() {
            addCriterion("env5host is not null");
            return (Criteria) this;
        }

        public Criteria andEnv5hostEqualTo(String value) {
            addCriterion("env5host =", value, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostNotEqualTo(String value) {
            addCriterion("env5host <>", value, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostGreaterThan(String value) {
            addCriterion("env5host >", value, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostGreaterThanOrEqualTo(String value) {
            addCriterion("env5host >=", value, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostLessThan(String value) {
            addCriterion("env5host <", value, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostLessThanOrEqualTo(String value) {
            addCriterion("env5host <=", value, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostLike(String value) {
            addCriterion("env5host like", value, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostNotLike(String value) {
            addCriterion("env5host not like", value, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostIn(List<String> values) {
            addCriterion("env5host in", values, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostNotIn(List<String> values) {
            addCriterion("env5host not in", values, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostBetween(String value1, String value2) {
            addCriterion("env5host between", value1, value2, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5hostNotBetween(String value1, String value2) {
            addCriterion("env5host not between", value1, value2, "env5host");
            return (Criteria) this;
        }

        public Criteria andEnv5dbIsNull() {
            addCriterion("env5db is null");
            return (Criteria) this;
        }

        public Criteria andEnv5dbIsNotNull() {
            addCriterion("env5db is not null");
            return (Criteria) this;
        }

        public Criteria andEnv5dbEqualTo(String value) {
            addCriterion("env5db =", value, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbNotEqualTo(String value) {
            addCriterion("env5db <>", value, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbGreaterThan(String value) {
            addCriterion("env5db >", value, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbGreaterThanOrEqualTo(String value) {
            addCriterion("env5db >=", value, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbLessThan(String value) {
            addCriterion("env5db <", value, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbLessThanOrEqualTo(String value) {
            addCriterion("env5db <=", value, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbLike(String value) {
            addCriterion("env5db like", value, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbNotLike(String value) {
            addCriterion("env5db not like", value, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbIn(List<String> values) {
            addCriterion("env5db in", values, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbNotIn(List<String> values) {
            addCriterion("env5db not in", values, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbBetween(String value1, String value2) {
            addCriterion("env5db between", value1, value2, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv5dbNotBetween(String value1, String value2) {
            addCriterion("env5db not between", value1, value2, "env5db");
            return (Criteria) this;
        }

        public Criteria andEnv6hostIsNull() {
            addCriterion("env6host is null");
            return (Criteria) this;
        }

        public Criteria andEnv6hostIsNotNull() {
            addCriterion("env6host is not null");
            return (Criteria) this;
        }

        public Criteria andEnv6hostEqualTo(String value) {
            addCriterion("env6host =", value, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostNotEqualTo(String value) {
            addCriterion("env6host <>", value, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostGreaterThan(String value) {
            addCriterion("env6host >", value, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostGreaterThanOrEqualTo(String value) {
            addCriterion("env6host >=", value, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostLessThan(String value) {
            addCriterion("env6host <", value, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostLessThanOrEqualTo(String value) {
            addCriterion("env6host <=", value, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostLike(String value) {
            addCriterion("env6host like", value, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostNotLike(String value) {
            addCriterion("env6host not like", value, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostIn(List<String> values) {
            addCriterion("env6host in", values, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostNotIn(List<String> values) {
            addCriterion("env6host not in", values, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostBetween(String value1, String value2) {
            addCriterion("env6host between", value1, value2, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6hostNotBetween(String value1, String value2) {
            addCriterion("env6host not between", value1, value2, "env6host");
            return (Criteria) this;
        }

        public Criteria andEnv6dbIsNull() {
            addCriterion("env6db is null");
            return (Criteria) this;
        }

        public Criteria andEnv6dbIsNotNull() {
            addCriterion("env6db is not null");
            return (Criteria) this;
        }

        public Criteria andEnv6dbEqualTo(String value) {
            addCriterion("env6db =", value, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbNotEqualTo(String value) {
            addCriterion("env6db <>", value, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbGreaterThan(String value) {
            addCriterion("env6db >", value, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbGreaterThanOrEqualTo(String value) {
            addCriterion("env6db >=", value, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbLessThan(String value) {
            addCriterion("env6db <", value, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbLessThanOrEqualTo(String value) {
            addCriterion("env6db <=", value, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbLike(String value) {
            addCriterion("env6db like", value, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbNotLike(String value) {
            addCriterion("env6db not like", value, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbIn(List<String> values) {
            addCriterion("env6db in", values, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbNotIn(List<String> values) {
            addCriterion("env6db not in", values, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbBetween(String value1, String value2) {
            addCriterion("env6db between", value1, value2, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv6dbNotBetween(String value1, String value2) {
            addCriterion("env6db not between", value1, value2, "env6db");
            return (Criteria) this;
        }

        public Criteria andEnv7hostIsNull() {
            addCriterion("env7host is null");
            return (Criteria) this;
        }

        public Criteria andEnv7hostIsNotNull() {
            addCriterion("env7host is not null");
            return (Criteria) this;
        }

        public Criteria andEnv7hostEqualTo(String value) {
            addCriterion("env7host =", value, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostNotEqualTo(String value) {
            addCriterion("env7host <>", value, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostGreaterThan(String value) {
            addCriterion("env7host >", value, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostGreaterThanOrEqualTo(String value) {
            addCriterion("env7host >=", value, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostLessThan(String value) {
            addCriterion("env7host <", value, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostLessThanOrEqualTo(String value) {
            addCriterion("env7host <=", value, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostLike(String value) {
            addCriterion("env7host like", value, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostNotLike(String value) {
            addCriterion("env7host not like", value, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostIn(List<String> values) {
            addCriterion("env7host in", values, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostNotIn(List<String> values) {
            addCriterion("env7host not in", values, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostBetween(String value1, String value2) {
            addCriterion("env7host between", value1, value2, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7hostNotBetween(String value1, String value2) {
            addCriterion("env7host not between", value1, value2, "env7host");
            return (Criteria) this;
        }

        public Criteria andEnv7dbIsNull() {
            addCriterion("env7db is null");
            return (Criteria) this;
        }

        public Criteria andEnv7dbIsNotNull() {
            addCriterion("env7db is not null");
            return (Criteria) this;
        }

        public Criteria andEnv7dbEqualTo(String value) {
            addCriterion("env7db =", value, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbNotEqualTo(String value) {
            addCriterion("env7db <>", value, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbGreaterThan(String value) {
            addCriterion("env7db >", value, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbGreaterThanOrEqualTo(String value) {
            addCriterion("env7db >=", value, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbLessThan(String value) {
            addCriterion("env7db <", value, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbLessThanOrEqualTo(String value) {
            addCriterion("env7db <=", value, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbLike(String value) {
            addCriterion("env7db like", value, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbNotLike(String value) {
            addCriterion("env7db not like", value, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbIn(List<String> values) {
            addCriterion("env7db in", values, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbNotIn(List<String> values) {
            addCriterion("env7db not in", values, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbBetween(String value1, String value2) {
            addCriterion("env7db between", value1, value2, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv7dbNotBetween(String value1, String value2) {
            addCriterion("env7db not between", value1, value2, "env7db");
            return (Criteria) this;
        }

        public Criteria andEnv8hostIsNull() {
            addCriterion("env8host is null");
            return (Criteria) this;
        }

        public Criteria andEnv8hostIsNotNull() {
            addCriterion("env8host is not null");
            return (Criteria) this;
        }

        public Criteria andEnv8hostEqualTo(String value) {
            addCriterion("env8host =", value, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostNotEqualTo(String value) {
            addCriterion("env8host <>", value, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostGreaterThan(String value) {
            addCriterion("env8host >", value, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostGreaterThanOrEqualTo(String value) {
            addCriterion("env8host >=", value, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostLessThan(String value) {
            addCriterion("env8host <", value, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostLessThanOrEqualTo(String value) {
            addCriterion("env8host <=", value, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostLike(String value) {
            addCriterion("env8host like", value, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostNotLike(String value) {
            addCriterion("env8host not like", value, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostIn(List<String> values) {
            addCriterion("env8host in", values, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostNotIn(List<String> values) {
            addCriterion("env8host not in", values, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostBetween(String value1, String value2) {
            addCriterion("env8host between", value1, value2, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8hostNotBetween(String value1, String value2) {
            addCriterion("env8host not between", value1, value2, "env8host");
            return (Criteria) this;
        }

        public Criteria andEnv8dbIsNull() {
            addCriterion("env8db is null");
            return (Criteria) this;
        }

        public Criteria andEnv8dbIsNotNull() {
            addCriterion("env8db is not null");
            return (Criteria) this;
        }

        public Criteria andEnv8dbEqualTo(String value) {
            addCriterion("env8db =", value, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbNotEqualTo(String value) {
            addCriterion("env8db <>", value, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbGreaterThan(String value) {
            addCriterion("env8db >", value, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbGreaterThanOrEqualTo(String value) {
            addCriterion("env8db >=", value, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbLessThan(String value) {
            addCriterion("env8db <", value, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbLessThanOrEqualTo(String value) {
            addCriterion("env8db <=", value, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbLike(String value) {
            addCriterion("env8db like", value, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbNotLike(String value) {
            addCriterion("env8db not like", value, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbIn(List<String> values) {
            addCriterion("env8db in", values, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbNotIn(List<String> values) {
            addCriterion("env8db not in", values, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbBetween(String value1, String value2) {
            addCriterion("env8db between", value1, value2, "env8db");
            return (Criteria) this;
        }

        public Criteria andEnv8dbNotBetween(String value1, String value2) {
            addCriterion("env8db not between", value1, value2, "env8db");
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