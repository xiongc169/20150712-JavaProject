package org.practice.mybatis.chap.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.practice.mybatis.chap.domain.Customereventinsertparams;
import org.practice.mybatis.chap.domain.CustomereventinsertparamsExample;
import org.practice.mybatis.chap.domain.CustomereventinsertparamsWithBLOBs;

public interface CustomereventinsertparamsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int countByExample(CustomereventinsertparamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int deleteByExample(CustomereventinsertparamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int insert(CustomereventinsertparamsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int insertSelective(CustomereventinsertparamsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    List<CustomereventinsertparamsWithBLOBs> selectByExampleWithBLOBs(CustomereventinsertparamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    List<Customereventinsertparams> selectByExample(CustomereventinsertparamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    CustomereventinsertparamsWithBLOBs selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExampleSelective(@Param("record") CustomereventinsertparamsWithBLOBs record, @Param("example") CustomereventinsertparamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExampleWithBLOBs(@Param("record") CustomereventinsertparamsWithBLOBs record, @Param("example") CustomereventinsertparamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExample(@Param("record") Customereventinsertparams record, @Param("example") CustomereventinsertparamsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKeySelective(CustomereventinsertparamsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKeyWithBLOBs(CustomereventinsertparamsWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CustomerEventInsertParams
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKey(Customereventinsertparams record);
}