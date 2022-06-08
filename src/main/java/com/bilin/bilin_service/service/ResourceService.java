package com.bilin.bilin_service.service;

import com.bilin.bilin_service.entity.Resource;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bilin.bilin_service.vo.ResourceVO;

import java.util.List;

/**
 * <p>
 * 资源表 服务类
 * </p>
 *
 * @author wanghao
 * @since 2022-04-24
 */
public interface ResourceService extends IService<Resource> {

    /**
     * 根据用户角色查询该角色所具有的资源
     * @param roleId
     * @return
     */
    List<ResourceVO> listResourceByRoleId(Long roleId);
}
