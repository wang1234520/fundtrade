/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sdu.fund.controller;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.sdu.fund.biz.shared.service.UserService;
import com.sdu.fund.biz.shared.vo.UserLoginVO;
import com.sdu.fund.core.model.account.bo.User;
import com.sdu.fund.core.model.account.enums.GenderEnum;
import com.sdu.fund.biz.shared.request.WeChatLoginRequest;
import com.sdu.fund.vo.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author qilong.zql
 * @since 2.5.8
 */
@RestController
@RequestMapping("/fundTrade/userAccount")
public class UserAccountController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAccountController.class);

    @SofaReference
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Response<UserLoginVO> weChatLogin(@RequestBody WeChatLoginRequest weChatLoginRequest) {
        try {
            User user = new User();
            user.setNickName(weChatLoginRequest.getNickName());
            user.setGender(GenderEnum.getEnumByCode(weChatLoginRequest.getGender()));
            user.setCity(weChatLoginRequest.getCity());
            user.setProvince(weChatLoginRequest.getProvince());
            user.setCountry(weChatLoginRequest.getCountry());

            UserLoginVO userLoginVo = userService.weChatLogin(weChatLoginRequest.getCode(),user);
            return Response.buildSuccessResponse(userLoginVo);
        } catch (Exception e) {
            LOGGER.error("微信登录失败，nickName={},msg={}", weChatLoginRequest.getNickName(),
                    e.getMessage());
            return Response.buildErrorResponse();
        }
    }
}