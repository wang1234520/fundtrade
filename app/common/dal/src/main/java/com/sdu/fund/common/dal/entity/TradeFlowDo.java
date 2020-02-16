package com.sdu.fund.common.dal.entity;

import java.util.Date;

public class TradeFlowDo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String flowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.pay_order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String payOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.user_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.type
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.Initiator
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String initiator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.flow_time
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private Date flowTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.gmt_create
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column trade_flow.gmt_modified
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.flow_id
     *
     * @return the value of trade_flow.flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.flow_id
     *
     * @param flowId the value for trade_flow.flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.order_id
     *
     * @return the value of trade_flow.order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.order_id
     *
     * @param orderId the value for trade_flow.order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.pay_order_id
     *
     * @return the value of trade_flow.pay_order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getPayOrderId() {
        return payOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.pay_order_id
     *
     * @param payOrderId the value for trade_flow.pay_order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId == null ? null : payOrderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.user_id
     *
     * @return the value of trade_flow.user_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.user_id
     *
     * @param userId the value for trade_flow.user_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.type
     *
     * @return the value of trade_flow.type
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.type
     *
     * @param type the value for trade_flow.type
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.Initiator
     *
     * @return the value of trade_flow.Initiator
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getInitiator() {
        return initiator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.Initiator
     *
     * @param initiator the value for trade_flow.Initiator
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setInitiator(String initiator) {
        this.initiator = initiator == null ? null : initiator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.flow_time
     *
     * @return the value of trade_flow.flow_time
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public Date getFlowTime() {
        return flowTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.flow_time
     *
     * @param flowTime the value for trade_flow.flow_time
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setFlowTime(Date flowTime) {
        this.flowTime = flowTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.gmt_create
     *
     * @return the value of trade_flow.gmt_create
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.gmt_create
     *
     * @param gmtCreate the value for trade_flow.gmt_create
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column trade_flow.gmt_modified
     *
     * @return the value of trade_flow.gmt_modified
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column trade_flow.gmt_modified
     *
     * @param gmtModified the value for trade_flow.gmt_modified
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}