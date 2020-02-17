package com.sdu.fund.common.dal.mapper;

import com.sdu.fund.common.dal.entity.FundDataDo;

public interface FundDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_data
     *
     * @mbg.generated Mon Feb 17 16:06:31 CST 2020
     */
    int deleteByPrimaryKey(String fundCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_data
     *
     * @mbg.generated Mon Feb 17 16:06:31 CST 2020
     */
    int insert(FundDataDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_data
     *
     * @mbg.generated Mon Feb 17 16:06:31 CST 2020
     */
    int insertSelective(FundDataDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_data
     *
     * @mbg.generated Mon Feb 17 16:06:31 CST 2020
     */
    FundDataDo selectByPrimaryKey(String fundCode);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_data
     *
     * @mbg.generated Mon Feb 17 16:06:31 CST 2020
     */
    int updateByPrimaryKeySelective(FundDataDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fund_data
     *
     * @mbg.generated Mon Feb 17 16:06:31 CST 2020
     */
    int updateByPrimaryKey(FundDataDo record);
}