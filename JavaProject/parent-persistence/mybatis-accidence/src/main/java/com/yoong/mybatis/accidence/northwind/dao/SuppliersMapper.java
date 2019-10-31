package com.yoong.mybatis.accidence.northwind.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.yoong.mybatis.accidence.northwind.domain.Suppliers;
import com.yoong.mybatis.accidence.northwind.domain.SuppliersExample;

public interface SuppliersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int countByExample(SuppliersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int deleteByExample(SuppliersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int deleteByPrimaryKey(Integer supplierid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int insert(Suppliers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int insertSelective(Suppliers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    List<Suppliers> selectByExample(SuppliersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    Suppliers selectByPrimaryKey(Integer supplierid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int updateByExampleSelective(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int updateByExample(@Param("record") Suppliers record, @Param("example") SuppliersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int updateByPrimaryKeySelective(Suppliers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Suppliers
     *
     * @mbggenerated Sun Jun 03 14:25:41 CST 2018
     */
    int updateByPrimaryKey(Suppliers record);
}