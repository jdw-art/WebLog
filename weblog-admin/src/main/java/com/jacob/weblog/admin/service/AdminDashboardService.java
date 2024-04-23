package com.jacob.weblog.admin.service;

import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 仪表盘业务service
 * @Date: 2024/4/23 13:35
 * @Version: 1.0
 */
public interface AdminDashboardService {

    /**
     * 获取仪表盘基础统计信息
     * @return
     */
    Response findDashboardStatistics();

    /**
     * 获取文章发布热点统计信息
     * @return
     */
    Response findDashboardPublishArticleStatistics();

    /**
     * 获取文章最近一周 PV 访问量统计信息
     * @return
     */
    Response findDashboardPVStatistics();
}
