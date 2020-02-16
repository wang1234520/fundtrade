package com.sdu.fund.common.dal.mapper;

import com.sdu.fund.common.dal.entity.TradeFlowDo;

public interface TradeFlowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_flow
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int deleteByPrimaryKey(String flowId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_flow
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int insert(TradeFlowDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_flow
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int insertSelective(TradeFlowDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_flow
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    TradeFlowDo selectByPrimaryKey(String flowId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_flow
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int updateByPrimaryKeySelective(TradeFlowDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table trade_flow
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int updateByPrimaryKey(TradeFlowDo record);
}