package com.bilin.bilin_service.service;

import com.bilin.bilin_service.dto.LoginDto;
import com.bilin.bilin_service.entity.Account;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 账号表 服务类
 * </p>
 *
 * @author wanghao
 * @since 2022-04-24
 */
public interface AccountService extends IService<Account> {

    LoginDto login(String username, String password);

}
