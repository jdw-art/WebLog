package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 博客设置信息service
 * @Date: 2024/4/21 14:58
 * @Version: 1.0
 */
public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
