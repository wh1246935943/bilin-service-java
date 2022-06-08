package com.bilin.bilin_service.controller;

import com.bilin.bilin_service.dto.LoginDto;
import com.bilin.bilin_service.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author wanghao
 * @date Created 2022/4/25 0:24
 * @description 用户认证
 */
@RestController
@RequestMapping("auth")
public class LoginController {

    @Autowired
    private AccountService accountService;

    /**
     *
     * @param username
     * @param password
     * @return
     */
    @PostMapping("login")
    public LoginDto login(String username, String password, HttpSession session) {
        LoginDto loginDTO = accountService.login(username,password);
        String message = loginDTO.getMessage();
        if (message == null) {
            session.setAttribute("account", loginDTO.getAccount());
        }

        return loginDTO;
    }

    /**
     * 登录操作
     * @param session
     * @return
     */
    @PostMapping("logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "登出成功";
    }
}
