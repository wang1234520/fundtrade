package com.sdu.fund.common.dal.mapper;

import com.sdu.fund.common.dal.entity.UserAccountDo;

public interface UserAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int deleteByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int insert(UserAccountDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int insertSelective(UserAccountDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    UserAccountDo selectByPrimaryKey(Long userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int updateByPrimaryKeySelective(UserAccountDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_account
     *
     * @mbg.generated Sun Feb 16 21:18:34 CST 2020
     */
    int updateByPrimaryKey(UserAccountDo record);
}