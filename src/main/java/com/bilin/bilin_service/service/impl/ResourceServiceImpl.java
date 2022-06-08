package com.bilin.bilin_service.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.bilin.bilin_service.entity.Resource;
import com.bilin.bilin_service.dao.ResourceMapper;
import com.bilin.bilin_service.service.ResourceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bilin.bilin_service.vo.ResourceVO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author wanghao
 * @since 2022-04-24
 */
@Service
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements ResourceService {

    @Override
    public List<ResourceVO> listResourceByRoleId(Long roleId) {

        QueryWrapper<Resource> query = Wrappers.<Resource>query()
            .eq("rr.role_id", roleId).isNull("re.parent_id");
        List<ResourceVO> resourceVOS = baseMapper.listResource(query);

        return resourceVOS;
    }
}
