package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 文章分类service
 * @Date: 2024/4/21 14:48
 * @Version: 1.0
 */
public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList();
}
