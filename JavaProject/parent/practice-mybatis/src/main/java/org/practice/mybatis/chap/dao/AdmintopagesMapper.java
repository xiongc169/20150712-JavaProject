package org.practice.mybatis.chap.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.practice.mybatis.chap.domain.Admintopages;
import org.practice.mybatis.chap.domain.AdmintopagesExample;

public interface AdmintopagesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int countByExample(AdmintopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int deleteByExample(AdmintopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int insert(Admintopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int insertSelective(Admintopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    List<Admintopages> selectByExample(AdmintopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    Admintopages selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExampleSelective(@Param("record") Admintopages record, @Param("example") AdmintopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExample(@Param("record") Admintopages record, @Param("example") AdmintopagesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKeySelective(Admintopages record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AdminToPages
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKey(Admintopages record);
}