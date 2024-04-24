package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 统计信息业务service
 * @Date: 2024/4/24 16:03
 * @Version: 1.0
 */
public interface StatisticsService {

    /**
     * 获取文章总数、分类总数、标签总数、总访问量统计信息
     * @return
     */
    Response findInfo();
}
