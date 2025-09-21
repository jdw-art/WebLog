package com.jacob.weblog.admin.controller;

import com.jacob.weblog.admin.service.AdminDashboardService;
import com.jacob.weblog.common.aspect.ApiOperationLog;
import com.jacob.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jacob
 * @Description: 仪表盘业务Controller
 * @Date: 2024/4/23 13:37
 * @Version: 1.0
 */
@RestController
@RequestMapping("/admin/dashboard")
@Api(tags = "Admin 仪表盘")
public class AdminDashboardController {

    @Autowired
    private AdminDashboardService dashboardService;

    @PostMapping("/statistics")
    @ApiOperationLog(description = "获取后台仪表盘基础统计信息")
    public Response findDashboardStatistics() {
        return dashboardService.findDashboardStatistics();
    }

    @PostMapping("/publishArticle/statistics")
    @ApiOperationLog(description = "获取后台仪表盘文章发布热点统计信息")
    public Response findDashboardPublishArticleStatistics() {
        return dashboardService.findDashboardPublishArticleStatistics();
    }

    @PostMapping("/pv/statistics")
    @ApiOperationLog(description = "获取后台仪表盘最近一周 PV 访问量信息")
    public Response findDashboardPVStatistics() {
        return dashboardService.findDashboardPVStatistics();
    }
}
