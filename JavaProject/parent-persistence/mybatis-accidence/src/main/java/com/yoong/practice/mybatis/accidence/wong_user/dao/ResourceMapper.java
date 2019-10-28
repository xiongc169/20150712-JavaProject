package com.yoong.practice.mybatis.accidence.wong_user.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yoong.practice.mybatis.accidence.wong_user.domain.Resource;
import com.yoong.practice.mybatis.accidence.wong_user.domain.ResourceExample;

public interface ResourceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    int countByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    int deleteByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    int insert(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    int insertSelective(Resource record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    List<Resource> selectByExample(ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") Resource record, @Param("example") ResourceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource
     *
     * @mbggenerated Wed Jan 16 16:41:00 CST 2019
     */
    int updateByExample(@Param("record") Resource record, @Param("example") ResourceExample example);
}