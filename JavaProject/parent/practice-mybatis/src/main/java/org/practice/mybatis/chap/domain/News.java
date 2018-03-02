package org.practice.mybatis.chap.domain;

import java.util.Date;

public class News {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.Id
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.Title
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private String title;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.Content
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.CreateTime
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private Date createtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.IsLink
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private Boolean islink;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.LinkUrl
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private String linkurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.IsHot
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private Boolean ishot;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.Definition1
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private String definition1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.Definition2
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private String definition2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column News.IsDelete
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    private Boolean isdelete;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.Id
     *
     * @return the value of News.Id
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.Id
     *
     * @param id the value for News.Id
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.Title
     *
     * @return the value of News.Title
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.Title
     *
     * @param title the value for News.Title
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.Content
     *
     * @return the value of News.Content
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.Content
     *
     * @param content the value for News.Content
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.CreateTime
     *
     * @return the value of News.CreateTime
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.CreateTime
     *
     * @param createtime the value for News.CreateTime
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.IsLink
     *
     * @return the value of News.IsLink
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public Boolean getIslink() {
        return islink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.IsLink
     *
     * @param islink the value for News.IsLink
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setIslink(Boolean islink) {
        this.islink = islink;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.LinkUrl
     *
     * @return the value of News.LinkUrl
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public String getLinkurl() {
        return linkurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.LinkUrl
     *
     * @param linkurl the value for News.LinkUrl
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl == null ? null : linkurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.IsHot
     *
     * @return the value of News.IsHot
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public Boolean getIshot() {
        return ishot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.IsHot
     *
     * @param ishot the value for News.IsHot
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setIshot(Boolean ishot) {
        this.ishot = ishot;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.Definition1
     *
     * @return the value of News.Definition1
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public String getDefinition1() {
        return definition1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.Definition1
     *
     * @param definition1 the value for News.Definition1
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setDefinition1(String definition1) {
        this.definition1 = definition1 == null ? null : definition1.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.Definition2
     *
     * @return the value of News.Definition2
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public String getDefinition2() {
        return definition2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.Definition2
     *
     * @param definition2 the value for News.Definition2
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setDefinition2(String definition2) {
        this.definition2 = definition2 == null ? null : definition2.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column News.IsDelete
     *
     * @return the value of News.IsDelete
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public Boolean getIsdelete() {
        return isdelete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column News.IsDelete
     *
     * @param isdelete the value for News.IsDelete
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    public void setIsdelete(Boolean isdelete) {
        this.isdelete = isdelete;
    }
}