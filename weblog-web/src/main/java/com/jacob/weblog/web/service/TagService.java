package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 文章标签service
 * @Date: 2024/4/21 14:52
 * @Version: 1.0
 */
public interface TagService {

    /**
     * 获取标签列表
     * @return
     */
    Response findTagList();
}
