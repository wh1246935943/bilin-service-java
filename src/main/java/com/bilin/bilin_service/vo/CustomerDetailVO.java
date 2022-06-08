package com.bilin.bilin_service.vo;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author wanghao
 * @date Created 2022/4/29 2:17
 * @description
 */
@Accessors(chain = true)
@Data
public class CustomerDetailVO {
    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 修改时间
     */
    private LocalDateTime modifiedTime;

    /**
     * 创建人的姓名
     */
    private String createAccountName;
    /**
     * 修改人的姓名
     */
    private String modifiedAccountName;
}
