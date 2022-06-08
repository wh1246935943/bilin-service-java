package com.bilin.bilin_service.dao;

import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.bilin.bilin_service.dto.CustomerDto;
import com.bilin.bilin_service.entity.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 客户表 Mapper 接口
 * </p>
 *
 * @author wanghao
 * @since 2022-04-26
 */
public interface CustomerMapper extends BaseMapper<Customer> {
    /**
     * @param customer 客户信息
     * @return
     */
    CustomerDto add(@Param(Constants.WRAPPER) Customer customer);
}
