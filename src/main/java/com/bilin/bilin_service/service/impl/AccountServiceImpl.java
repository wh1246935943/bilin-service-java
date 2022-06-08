package com.bilin.bilin_service.service.impl;

import com.bilin.bilin_service.dto.LoginDto;
import com.bilin.bilin_service.entity.Account;
import com.bilin.bilin_service.dao.AccountMapper;
import com.bilin.bilin_service.service.AccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 账号表 服务实现类
 * </p>
 *
 * @author wanghao
 * @since 2022-04-24
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    @Override
    public LoginDto login(String username, String password) {

        LoginDto loginDto = new LoginDto();

        Account account = lambdaQuery().eq(Account::getUsername, username).one();
        if (account == null) {
            loginDto.setMessage("用户名不存在");
            return loginDto;
        };

        if (!password.equals(account.getPassword())) {
            loginDto.setMessage("密码错误");
            return loginDto;
        }

        loginDto.setAccount(account);

        return loginDto;
    }
}
