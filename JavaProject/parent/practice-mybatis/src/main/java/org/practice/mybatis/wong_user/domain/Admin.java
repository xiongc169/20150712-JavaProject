package org.practice.mybatis.wong_user.domain;

import java.util.Date;

public class Admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.id
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.admin_name
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private String adminName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.mobile
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private String mobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.email
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.password
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.salt
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.create_time
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.modify_time
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private Date modifyTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.note1
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private String note1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.note2
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private String note2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.is_delete
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    private Integer isDelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.id
     *
     * @return the value of admin.id
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.id
     *
     * @param id the value for admin.id
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.admin_name
     *
     * @return the value of admin.admin_name
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.admin_name
     *
     * @param adminName the value for admin.admin_name
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.mobile
     *
     * @return the value of admin.mobile
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.mobile
     *
     * @param mobile the value for admin.mobile
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.email
     *
     * @return the value of admin.email
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.email
     *
     * @param email the value for admin.email
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.password
     *
     * @return the value of admin.password
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.password
     *
     * @param password the value for admin.password
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.salt
     *
     * @return the value of admin.salt
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.salt
     *
     * @param salt the value for admin.salt
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.create_time
     *
     * @return the value of admin.create_time
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.create_time
     *
     * @param createTime the value for admin.create_time
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.modify_time
     *
     * @return the value of admin.modify_time
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.modify_time
     *
     * @param modifyTime the value for admin.modify_time
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.note1
     *
     * @return the value of admin.note1
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public String getNote1() {
        return note1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.note1
     *
     * @param note1 the value for admin.note1
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setNote1(String note1) {
        this.note1 = note1 == null ? null : note1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.note2
     *
     * @return the value of admin.note2
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public String getNote2() {
        return note2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.note2
     *
     * @param note2 the value for admin.note2
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setNote2(String note2) {
        this.note2 = note2 == null ? null : note2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.is_delete
     *
     * @return the value of admin.is_delete
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.is_delete
     *
     * @param isDelete the value for admin.is_delete
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}