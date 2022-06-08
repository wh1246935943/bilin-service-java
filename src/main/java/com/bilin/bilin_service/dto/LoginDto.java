package com.bilin.bilin_service.dto;

import com.bilin.bilin_service.entity.Account;
import lombok.Data;

/**
 * @author wanghao
 * @date Created 2022/4/25 0:52
 * @description 用户认证dto
 */
@Data
public class LoginDto {

    /**
     * 用户登录成功后的sessionId
     */
    private String session;

    /**
     * 登录错误提示信息
     */
    private String message;

    /**
     * 当前登录人的信息
     */
    private Account account;
}
