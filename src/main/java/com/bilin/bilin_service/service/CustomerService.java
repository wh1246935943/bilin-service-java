package com.bilin.bilin_service.service;

import com.bilin.bilin_service.dto.CustomerDto;
import com.bilin.bilin_service.entity.Customer;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bilin.bilin_service.vo.CustomerDetailVO;

/**
 * <p>
 * 客户表 服务类
 * </p>
 *
 * @author wanghao
 * @since 2022-04-24
 */
public interface CustomerService extends IService<Customer> {

    CustomerDetailVO customerDetailById(Long id);
}
