package org.practice.mybatis.chap.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdminoperationsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public AdminoperationsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
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
     * This method corresponds to the database table AdminOperations
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
     * This method corresponds to the database table AdminOperations
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminOperations
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
     * This class corresponds to the database table AdminOperations
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

        public Criteria andIdIsNull() {
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andAuthoryidIsNull() {
            addCriterion("AuthoryId is null");
            return (Criteria) this;
        }

        public Criteria andAuthoryidIsNotNull() {
            addCriterion("AuthoryId is not null");
            return (Criteria) this;
        }

        public Criteria andAuthoryidEqualTo(Integer value) {
            addCriterion("AuthoryId =", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidNotEqualTo(Integer value) {
            addCriterion("AuthoryId <>", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidGreaterThan(Integer value) {
            addCriterion("AuthoryId >", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AuthoryId >=", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidLessThan(Integer value) {
            addCriterion("AuthoryId <", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidLessThanOrEqualTo(Integer value) {
            addCriterion("AuthoryId <=", value, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidIn(List<Integer> values) {
            addCriterion("AuthoryId in", values, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidNotIn(List<Integer> values) {
            addCriterion("AuthoryId not in", values, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidBetween(Integer value1, Integer value2) {
            addCriterion("AuthoryId between", value1, value2, "authoryid");
            return (Criteria) this;
        }

        public Criteria andAuthoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("AuthoryId not between", value1, value2, "authoryid");
            return (Criteria) this;
        }

        public Criteria andActionIsNull() {
            addCriterion("Action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("Action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(Integer value) {
            addCriterion("Action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(Integer value) {
            addCriterion("Action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(Integer value) {
            addCriterion("Action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(Integer value) {
            addCriterion("Action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(Integer value) {
            addCriterion("Action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(Integer value) {
            addCriterion("Action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<Integer> values) {
            addCriterion("Action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<Integer> values) {
            addCriterion("Action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(Integer value1, Integer value2) {
            addCriterion("Action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(Integer value1, Integer value2) {
            addCriterion("Action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andOperateipIsNull() {
            addCriterion("OperateIP is null");
            return (Criteria) this;
        }

        public Criteria andOperateipIsNotNull() {
            addCriterion("OperateIP is not null");
            return (Criteria) this;
        }

        public Criteria andOperateipEqualTo(String value) {
            addCriterion("OperateIP =", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipNotEqualTo(String value) {
            addCriterion("OperateIP <>", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipGreaterThan(String value) {
            addCriterion("OperateIP >", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipGreaterThanOrEqualTo(String value) {
            addCriterion("OperateIP >=", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipLessThan(String value) {
            addCriterion("OperateIP <", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipLessThanOrEqualTo(String value) {
            addCriterion("OperateIP <=", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipLike(String value) {
            addCriterion("OperateIP like", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipNotLike(String value) {
            addCriterion("OperateIP not like", value, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipIn(List<String> values) {
            addCriterion("OperateIP in", values, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipNotIn(List<String> values) {
            addCriterion("OperateIP not in", values, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipBetween(String value1, String value2) {
            addCriterion("OperateIP between", value1, value2, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateipNotBetween(String value1, String value2) {
            addCriterion("OperateIP not between", value1, value2, "operateip");
            return (Criteria) this;
        }

        public Criteria andOperateaddressIsNull() {
            addCriterion("OperateAddress is null");
            return (Criteria) this;
        }

        public Criteria andOperateaddressIsNotNull() {
            addCriterion("OperateAddress is not null");
            return (Criteria) this;
        }

        public Criteria andOperateaddressEqualTo(String value) {
            addCriterion("OperateAddress =", value, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressNotEqualTo(String value) {
            addCriterion("OperateAddress <>", value, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressGreaterThan(String value) {
            addCriterion("OperateAddress >", value, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressGreaterThanOrEqualTo(String value) {
            addCriterion("OperateAddress >=", value, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressLessThan(String value) {
            addCriterion("OperateAddress <", value, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressLessThanOrEqualTo(String value) {
            addCriterion("OperateAddress <=", value, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressLike(String value) {
            addCriterion("OperateAddress like", value, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressNotLike(String value) {
            addCriterion("OperateAddress not like", value, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressIn(List<String> values) {
            addCriterion("OperateAddress in", values, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressNotIn(List<String> values) {
            addCriterion("OperateAddress not in", values, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressBetween(String value1, String value2) {
            addCriterion("OperateAddress between", value1, value2, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateaddressNotBetween(String value1, String value2) {
            addCriterion("OperateAddress not between", value1, value2, "operateaddress");
            return (Criteria) this;
        }

        public Criteria andOperateinfoIsNull() {
            addCriterion("OperateInfo is null");
            return (Criteria) this;
        }

        public Criteria andOperateinfoIsNotNull() {
            addCriterion("OperateInfo is not null");
            return (Criteria) this;
        }

        public Criteria andOperateinfoEqualTo(String value) {
            addCriterion("OperateInfo =", value, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoNotEqualTo(String value) {
            addCriterion("OperateInfo <>", value, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoGreaterThan(String value) {
            addCriterion("OperateInfo >", value, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoGreaterThanOrEqualTo(String value) {
            addCriterion("OperateInfo >=", value, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoLessThan(String value) {
            addCriterion("OperateInfo <", value, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoLessThanOrEqualTo(String value) {
            addCriterion("OperateInfo <=", value, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoLike(String value) {
            addCriterion("OperateInfo like", value, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoNotLike(String value) {
            addCriterion("OperateInfo not like", value, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoIn(List<String> values) {
            addCriterion("OperateInfo in", values, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoNotIn(List<String> values) {
            addCriterion("OperateInfo not in", values, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoBetween(String value1, String value2) {
            addCriterion("OperateInfo between", value1, value2, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andOperateinfoNotBetween(String value1, String value2) {
            addCriterion("OperateInfo not between", value1, value2, "operateinfo");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CreateTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CreateTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CreateTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CreateTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CreateTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CreateTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CreateTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CreateTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CreateTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CreateTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CreateTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andIssuperadminIsNull() {
            addCriterion("IsSuperAdmin is null");
            return (Criteria) this;
        }

        public Criteria andIssuperadminIsNotNull() {
            addCriterion("IsSuperAdmin is not null");
            return (Criteria) this;
        }

        public Criteria andIssuperadminEqualTo(Byte value) {
            addCriterion("IsSuperAdmin =", value, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminNotEqualTo(Byte value) {
            addCriterion("IsSuperAdmin <>", value, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminGreaterThan(Byte value) {
            addCriterion("IsSuperAdmin >", value, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminGreaterThanOrEqualTo(Byte value) {
            addCriterion("IsSuperAdmin >=", value, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminLessThan(Byte value) {
            addCriterion("IsSuperAdmin <", value, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminLessThanOrEqualTo(Byte value) {
            addCriterion("IsSuperAdmin <=", value, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminIn(List<Byte> values) {
            addCriterion("IsSuperAdmin in", values, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminNotIn(List<Byte> values) {
            addCriterion("IsSuperAdmin not in", values, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminBetween(Byte value1, Byte value2) {
            addCriterion("IsSuperAdmin between", value1, value2, "issuperadmin");
            return (Criteria) this;
        }

        public Criteria andIssuperadminNotBetween(Byte value1, Byte value2) {
            addCriterion("IsSuperAdmin not between", value1, value2, "issuperadmin");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table AdminOperations
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
     * This class corresponds to the database table AdminOperations
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