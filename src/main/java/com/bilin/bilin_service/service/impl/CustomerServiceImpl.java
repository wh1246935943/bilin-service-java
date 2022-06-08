package com.bilin.bilin_service.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bilin.bilin_service.dto.CustomerDto;
import com.bilin.bilin_service.entity.Customer;
import com.bilin.bilin_service.dao.CustomerMapper;
import com.bilin.bilin_service.service.CustomerService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bilin.bilin_service.vo.CustomerDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 客户表 服务实现类
 * </p>
 *
 * @author wanghao
 * @since 2022-04-24
 */
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer> implements CustomerService {

    @Override
    public CustomerDetailVO customerDetailById(Long id) {
        return null;
    }
}
