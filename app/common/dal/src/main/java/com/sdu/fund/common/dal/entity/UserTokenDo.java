package com.sdu.fund.common.dal.entity;

import java.util.Date;

public class UserTokenDo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.token_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private Long tokenId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.user_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.app_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private String appId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.token
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.expire_time
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private Long expireTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.type
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.valid
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private Boolean valid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.gmt_create
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_token.gmt_modified
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.token_id
     *
     * @return the value of user_token.token_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public Long getTokenId() {
        return tokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.token_id
     *
     * @param tokenId the value for user_token.token_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setTokenId(Long tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.user_id
     *
     * @return the value of user_token.user_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.user_id
     *
     * @param userId the value for user_token.user_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.app_id
     *
     * @return the value of user_token.app_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public String getAppId() {
        return appId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.app_id
     *
     * @param appId the value for user_token.app_id
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.token
     *
     * @return the value of user_token.token
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.token
     *
     * @param token the value for user_token.token
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.expire_time
     *
     * @return the value of user_token.expire_time
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public Long getExpireTime() {
        return expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.expire_time
     *
     * @param expireTime the value for user_token.expire_time
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.type
     *
     * @return the value of user_token.type
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.type
     *
     * @param type the value for user_token.type
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.valid
     *
     * @return the value of user_token.valid
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public Boolean getValid() {
        return valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.valid
     *
     * @param valid the value for user_token.valid
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.gmt_create
     *
     * @return the value of user_token.gmt_create
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.gmt_create
     *
     * @param gmtCreate the value for user_token.gmt_create
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_token.gmt_modified
     *
     * @return the value of user_token.gmt_modified
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_token.gmt_modified
     *
     * @param gmtModified the value for user_token.gmt_modified
     *
     * @mbg.generated Wed Mar 04 13:17:20 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}