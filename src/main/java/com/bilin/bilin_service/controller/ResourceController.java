package com.bilin.bilin_service.controller;

import com.bilin.bilin_service.service.ResourceService;
import com.bilin.bilin_service.vo.ResourceVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 资源表 前端控制器
 * </p>
 *
 * @author wanghao
 * @since 2022-04-24
 */
@RestController
@RequestMapping("resource")
public class ResourceController {

    @Autowired
    private ResourceService resourceService;

    @GetMapping("list1")
    @ResponseBody
    public List<ResourceVO> listResourceByRoleId(@RequestParam(value="roleId") Long roleId) {
        List<ResourceVO> resourceVOS = resourceService.listResourceByRoleId(roleId);

        return resourceVOS;
    }
}
