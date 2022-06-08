package com.bilin.bilin_service.controller;


import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.bilin.bilin_service.common.Result;
import com.bilin.bilin_service.common.ResultUtils;
import com.bilin.bilin_service.dto.CustomerDto;
import com.bilin.bilin_service.entity.Customer;
import com.bilin.bilin_service.query.CustomerPageQuery;
import com.bilin.bilin_service.service.CustomerService;
import com.bilin.bilin_service.vo.CustomerDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * <p>
 * 客户表 前端控制器
 * </p>
 *
 * @author wanghao
 * @since 2022-04-24
 */
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    /**
     * 查询客户列表
     * @return
     */
    @GetMapping
    @ResponseBody
    public Result<Map<String, Object>> getList(CustomerPageQuery query) {

        String realName = query.getRealName();
        String phone = query.getPhone();
        Long page = query.getPage();
        Long limit = query.getLimit();

        return ResultUtils.buildPageResult(
                customerService.lambdaQuery()
                        .like(StringUtils.isNotBlank(realName), Customer::getRealName, realName)
                        .like(StringUtils.isNotBlank(phone), Customer::getPhone, phone)
                        .orderByDesc(Customer::getCustomerId).page(new Page<>(page, limit))

        );
    }

    /**
     * 新增用户
     * @return
     */
    @PostMapping
    @ResponseBody
    public Result add(@RequestBody Customer customer) {

        return ResultUtils.buildResult(customerService.save(customer));
    }

    /**
     * 修改客户
     * @param customer
     * @return
     */
    @PutMapping
    @ResponseBody
    public Result update(@RequestBody Customer customer) {
        return ResultUtils.buildResult(customerService.updateById(customer));
    }

    /**
     * 删除客户
     * @param id 客户ID
     * @return
     */
    @DeleteMapping("/{id}")
    @ResponseBody
    public Result delete(@PathVariable Long id) {
        return ResultUtils.buildResult(customerService.removeById(id));
    }

    /**
     * 获取客户详情
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Customer getDetail(@PathVariable Long id) {

        Customer customerDetailVO = customerService.getById(id);

        return customerDetailVO;
    }

}
