package org.practice.mybatis.chap.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminloginlogsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public AdminloginlogsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
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

        public Criteria andAdminloginlogidIsNull() {
            addCriterion("AdminLoginLogId is null");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidIsNotNull() {
            addCriterion("AdminLoginLogId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidEqualTo(Integer value) {
            addCriterion("AdminLoginLogId =", value, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidNotEqualTo(Integer value) {
            addCriterion("AdminLoginLogId <>", value, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidGreaterThan(Integer value) {
            addCriterion("AdminLoginLogId >", value, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminLoginLogId >=", value, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidLessThan(Integer value) {
            addCriterion("AdminLoginLogId <", value, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidLessThanOrEqualTo(Integer value) {
            addCriterion("AdminLoginLogId <=", value, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidIn(List<Integer> values) {
            addCriterion("AdminLoginLogId in", values, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidNotIn(List<Integer> values) {
            addCriterion("AdminLoginLogId not in", values, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidBetween(Integer value1, Integer value2) {
            addCriterion("AdminLoginLogId between", value1, value2, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminloginlogidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminLoginLogId not between", value1, value2, "adminloginlogid");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNull() {
            addCriterion("AdminId is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("AdminId is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("AdminId =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("AdminId <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("AdminId >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AdminId >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("AdminId <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("AdminId <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("AdminId in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("AdminId not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("AdminId between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("AdminId not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressIsNull() {
            addCriterion("AdminLoginAddress is null");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressIsNotNull() {
            addCriterion("AdminLoginAddress is not null");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressEqualTo(String value) {
            addCriterion("AdminLoginAddress =", value, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressNotEqualTo(String value) {
            addCriterion("AdminLoginAddress <>", value, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressGreaterThan(String value) {
            addCriterion("AdminLoginAddress >", value, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressGreaterThanOrEqualTo(String value) {
            addCriterion("AdminLoginAddress >=", value, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressLessThan(String value) {
            addCriterion("AdminLoginAddress <", value, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressLessThanOrEqualTo(String value) {
            addCriterion("AdminLoginAddress <=", value, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressLike(String value) {
            addCriterion("AdminLoginAddress like", value, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressNotLike(String value) {
            addCriterion("AdminLoginAddress not like", value, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressIn(List<String> values) {
            addCriterion("AdminLoginAddress in", values, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressNotIn(List<String> values) {
            addCriterion("AdminLoginAddress not in", values, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressBetween(String value1, String value2) {
            addCriterion("AdminLoginAddress between", value1, value2, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginaddressNotBetween(String value1, String value2) {
            addCriterion("AdminLoginAddress not between", value1, value2, "adminloginaddress");
            return (Criteria) this;
        }

        public Criteria andAdminloginipIsNull() {
            addCriterion("AdminLoginIP is null");
            return (Criteria) this;
        }

        public Criteria andAdminloginipIsNotNull() {
            addCriterion("AdminLoginIP is not null");
            return (Criteria) this;
        }

        public Criteria andAdminloginipEqualTo(String value) {
            addCriterion("AdminLoginIP =", value, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipNotEqualTo(String value) {
            addCriterion("AdminLoginIP <>", value, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipGreaterThan(String value) {
            addCriterion("AdminLoginIP >", value, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipGreaterThanOrEqualTo(String value) {
            addCriterion("AdminLoginIP >=", value, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipLessThan(String value) {
            addCriterion("AdminLoginIP <", value, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipLessThanOrEqualTo(String value) {
            addCriterion("AdminLoginIP <=", value, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipLike(String value) {
            addCriterion("AdminLoginIP like", value, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipNotLike(String value) {
            addCriterion("AdminLoginIP not like", value, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipIn(List<String> values) {
            addCriterion("AdminLoginIP in", values, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipNotIn(List<String> values) {
            addCriterion("AdminLoginIP not in", values, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipBetween(String value1, String value2) {
            addCriterion("AdminLoginIP between", value1, value2, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminloginipNotBetween(String value1, String value2) {
            addCriterion("AdminLoginIP not between", value1, value2, "adminloginip");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeIsNull() {
            addCriterion("AdminLoginTime is null");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeIsNotNull() {
            addCriterion("AdminLoginTime is not null");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeEqualTo(Date value) {
            addCriterion("AdminLoginTime =", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeNotEqualTo(Date value) {
            addCriterion("AdminLoginTime <>", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeGreaterThan(Date value) {
            addCriterion("AdminLoginTime >", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AdminLoginTime >=", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeLessThan(Date value) {
            addCriterion("AdminLoginTime <", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeLessThanOrEqualTo(Date value) {
            addCriterion("AdminLoginTime <=", value, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeIn(List<Date> values) {
            addCriterion("AdminLoginTime in", values, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeNotIn(List<Date> values) {
            addCriterion("AdminLoginTime not in", values, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeBetween(Date value1, Date value2) {
            addCriterion("AdminLoginTime between", value1, value2, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogintimeNotBetween(Date value1, Date value2) {
            addCriterion("AdminLoginTime not between", value1, value2, "adminlogintime");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoIsNull() {
            addCriterion("AdminLoginInfo is null");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoIsNotNull() {
            addCriterion("AdminLoginInfo is not null");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoEqualTo(String value) {
            addCriterion("AdminLoginInfo =", value, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoNotEqualTo(String value) {
            addCriterion("AdminLoginInfo <>", value, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoGreaterThan(String value) {
            addCriterion("AdminLoginInfo >", value, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoGreaterThanOrEqualTo(String value) {
            addCriterion("AdminLoginInfo >=", value, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoLessThan(String value) {
            addCriterion("AdminLoginInfo <", value, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoLessThanOrEqualTo(String value) {
            addCriterion("AdminLoginInfo <=", value, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoLike(String value) {
            addCriterion("AdminLoginInfo like", value, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoNotLike(String value) {
            addCriterion("AdminLoginInfo not like", value, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoIn(List<String> values) {
            addCriterion("AdminLoginInfo in", values, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoNotIn(List<String> values) {
            addCriterion("AdminLoginInfo not in", values, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoBetween(String value1, String value2) {
            addCriterion("AdminLoginInfo between", value1, value2, "adminlogininfo");
            return (Criteria) this;
        }

        public Criteria andAdminlogininfoNotBetween(String value1, String value2) {
            addCriterion("AdminLoginInfo not between", value1, value2, "adminlogininfo");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated do_not_delete_during_merge Fri Dec 15 13:59:18 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AdminLoginLogs
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
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