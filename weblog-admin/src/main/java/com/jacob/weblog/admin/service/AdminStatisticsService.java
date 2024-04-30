package com.jacob.weblog.admin.service;

/**
 * @Author: Jacob
 * @Description: 文章分类统计接口
 * @Date: 2024/4/30 21:39
 * @Version: 1.0
 */
public interface AdminStatisticsService {
    /**
     * 统计各分类下文章总数
     */
    void statisticsCategoryArticleTotal();

    /**
     * 统计各标签下文章总数
     */
    void statisticsTagArticleTotal();
}
