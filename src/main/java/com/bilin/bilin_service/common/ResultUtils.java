package com.bilin.bilin_service.common;

import com.baomidou.mybatisplus.core.metadata.IPage;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanghao
 * @date Created 2022/4/29 1:19
 * @description
 */
public class ResultUtils {
    /**
     * 分页查询的返回结果
     */
    public static Result<Map<String, Object>> buildPageResult(IPage<?> page) {
        Map<String, Object> data = new HashMap<>();
        data.put("total", page.getTotal());
        data.put("body", page.getRecords());
        return Result.success(data);
    }

    /**
     * 相应信息
     */
    public static Result<String> buildResult(boolean isSuccess) {
        if (isSuccess) {
            return Result.success(null);
        }

        return Result.failed("操作失败");
    }
}
