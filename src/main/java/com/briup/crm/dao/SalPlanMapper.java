package com.briup.crm.dao;

import com.briup.crm.bean.SalPlan;
import com.briup.crm.bean.SalPlanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalPlanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    long countByExample(SalPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    int deleteByExample(SalPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    int deleteByPrimaryKey(Long plaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    int insert(SalPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    int insertSelective(SalPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    List<SalPlan> selectByExample(SalPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    SalPlan selectByPrimaryKey(Long plaId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    int updateByExampleSelective(@Param("record") SalPlan record, @Param("example") SalPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    int updateByExample(@Param("record") SalPlan record, @Param("example") SalPlanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    int updateByPrimaryKeySelective(SalPlan record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sal_plan
     *
     * @mbg.generated Thu Jan 02 09:35:24 GMT+08:00 2020
     */
    int updateByPrimaryKey(SalPlan record);
}