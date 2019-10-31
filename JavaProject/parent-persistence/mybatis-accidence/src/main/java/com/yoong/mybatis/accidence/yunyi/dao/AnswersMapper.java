package com.yoong.mybatis.accidence.yunyi.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yoong.mybatis.accidence.yunyi.domain.Answers;
import com.yoong.mybatis.accidence.yunyi.domain.AnswersExample;
import com.yoong.mybatis.accidence.yunyi.domain.AnswersWithBLOBs;

public interface AnswersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int countByExample(AnswersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int deleteByExample(AnswersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int insert(AnswersWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int insertSelective(AnswersWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    List<AnswersWithBLOBs> selectByExampleWithBLOBs(AnswersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    List<Answers> selectByExample(AnswersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    AnswersWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExampleSelective(@Param("record") AnswersWithBLOBs record, @Param("example") AnswersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") AnswersWithBLOBs record, @Param("example") AnswersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExample(@Param("record") Answers record, @Param("example") AnswersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKeySelective(AnswersWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(AnswersWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Answers
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKey(Answers record);
}