package com.jacob.weblog.web.controller;

import com.jacob.weblog.common.aspect.ApiOperationLog;
import com.jacob.weblog.common.utils.Response;
import com.jacob.weblog.web.service.StatisticsService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jacob
 * @Description: 统计信息业务Controller
 * @Date: 2024/4/24 16:05
 * @Version: 1.0
 */
@RestController
@RequestMapping("/statistics")
@Api(tags = "统计信息")
public class StatisticsController {

    @Autowired
    private StatisticsService statisticsService;

    @PostMapping("/info")
    @ApiOperationLog(description = "前台获取统计信息")
    public Response findInfo() {
        return statisticsService.findInfo();
    }

}
