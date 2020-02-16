package com.sdu.fund.common.dal.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserAccountFlowDo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String flowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.user_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.related_order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String relatedOrderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.related_flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String relatedFlowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.chang_direction
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String changDirection;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.type
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.pre_totol_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private BigDecimal preTotolAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.pre_avail_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private BigDecimal preAvailAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.pre_freeze_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private BigDecimal preFreezeAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.post_totol_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private BigDecimal postTotolAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.post_avail_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private BigDecimal postAvailAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.post_freeze_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private BigDecimal postFreezeAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.gmt_create
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_account_flow.gmt_modified
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.flow_id
     *
     * @return the value of user_account_flow.flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getFlowId() {
        return flowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.flow_id
     *
     * @param flowId the value for user_account_flow.flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.user_id
     *
     * @return the value of user_account_flow.user_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.user_id
     *
     * @param userId the value for user_account_flow.user_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.related_order_id
     *
     * @return the value of user_account_flow.related_order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getRelatedOrderId() {
        return relatedOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.related_order_id
     *
     * @param relatedOrderId the value for user_account_flow.related_order_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setRelatedOrderId(String relatedOrderId) {
        this.relatedOrderId = relatedOrderId == null ? null : relatedOrderId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.related_flow_id
     *
     * @return the value of user_account_flow.related_flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getRelatedFlowId() {
        return relatedFlowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.related_flow_id
     *
     * @param relatedFlowId the value for user_account_flow.related_flow_id
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setRelatedFlowId(String relatedFlowId) {
        this.relatedFlowId = relatedFlowId == null ? null : relatedFlowId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.chang_direction
     *
     * @return the value of user_account_flow.chang_direction
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getChangDirection() {
        return changDirection;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.chang_direction
     *
     * @param changDirection the value for user_account_flow.chang_direction
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setChangDirection(String changDirection) {
        this.changDirection = changDirection == null ? null : changDirection.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.type
     *
     * @return the value of user_account_flow.type
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.type
     *
     * @param type the value for user_account_flow.type
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.pre_totol_amount
     *
     * @return the value of user_account_flow.pre_totol_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public BigDecimal getPreTotolAmount() {
        return preTotolAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.pre_totol_amount
     *
     * @param preTotolAmount the value for user_account_flow.pre_totol_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setPreTotolAmount(BigDecimal preTotolAmount) {
        this.preTotolAmount = preTotolAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.pre_avail_amount
     *
     * @return the value of user_account_flow.pre_avail_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public BigDecimal getPreAvailAmount() {
        return preAvailAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.pre_avail_amount
     *
     * @param preAvailAmount the value for user_account_flow.pre_avail_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setPreAvailAmount(BigDecimal preAvailAmount) {
        this.preAvailAmount = preAvailAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.pre_freeze_amount
     *
     * @return the value of user_account_flow.pre_freeze_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public BigDecimal getPreFreezeAmount() {
        return preFreezeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.pre_freeze_amount
     *
     * @param preFreezeAmount the value for user_account_flow.pre_freeze_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setPreFreezeAmount(BigDecimal preFreezeAmount) {
        this.preFreezeAmount = preFreezeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.post_totol_amount
     *
     * @return the value of user_account_flow.post_totol_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public BigDecimal getPostTotolAmount() {
        return postTotolAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.post_totol_amount
     *
     * @param postTotolAmount the value for user_account_flow.post_totol_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setPostTotolAmount(BigDecimal postTotolAmount) {
        this.postTotolAmount = postTotolAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.post_avail_amount
     *
     * @return the value of user_account_flow.post_avail_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public BigDecimal getPostAvailAmount() {
        return postAvailAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.post_avail_amount
     *
     * @param postAvailAmount the value for user_account_flow.post_avail_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setPostAvailAmount(BigDecimal postAvailAmount) {
        this.postAvailAmount = postAvailAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.post_freeze_amount
     *
     * @return the value of user_account_flow.post_freeze_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public BigDecimal getPostFreezeAmount() {
        return postFreezeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.post_freeze_amount
     *
     * @param postFreezeAmount the value for user_account_flow.post_freeze_amount
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setPostFreezeAmount(BigDecimal postFreezeAmount) {
        this.postFreezeAmount = postFreezeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.gmt_create
     *
     * @return the value of user_account_flow.gmt_create
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.gmt_create
     *
     * @param gmtCreate the value for user_account_flow.gmt_create
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_account_flow.gmt_modified
     *
     * @return the value of user_account_flow.gmt_modified
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_account_flow.gmt_modified
     *
     * @param gmtModified the value for user_account_flow.gmt_modified
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}