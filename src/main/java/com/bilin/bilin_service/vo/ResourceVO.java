package com.bilin.bilin_service.vo;

import lombok.Data;

import java.util.List;

/**
 * @author wanghao
 * @date Created 2022/4/26 0:29
 * @description 资源vo
 */
@Data
public class ResourceVO {

    /**
     * 主键
     */
    private Long resourceId;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 请求地址
     */
    private String url;

    /**
     * 下级资源
     */
    private List<ResourceVO> subs;
}
