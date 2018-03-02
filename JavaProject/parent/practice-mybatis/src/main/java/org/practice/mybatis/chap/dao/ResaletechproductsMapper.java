package org.practice.mybatis.chap.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.practice.mybatis.chap.domain.Resaletechproducts;
import org.practice.mybatis.chap.domain.ResaletechproductsExample;
import org.practice.mybatis.chap.domain.ResaletechproductsKey;

public interface ResaletechproductsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int countByExample(ResaletechproductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int deleteByExample(ResaletechproductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int deleteByPrimaryKey(ResaletechproductsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int insert(Resaletechproducts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int insertSelective(Resaletechproducts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    List<Resaletechproducts> selectByExample(ResaletechproductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    Resaletechproducts selectByPrimaryKey(ResaletechproductsKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExampleSelective(@Param("record") Resaletechproducts record, @Param("example") ResaletechproductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByExample(@Param("record") Resaletechproducts record, @Param("example") ResaletechproductsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKeySelective(Resaletechproducts record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ReSaleTechProducts
     *
     * @mbggenerated Fri Dec 15 13:59:18 CST 2017
     */
    int updateByPrimaryKey(Resaletechproducts record);
}