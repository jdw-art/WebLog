package com.jacob.weblog.admin.runner;

import com.jacob.weblog.admin.service.AdminStatisticsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Author: Jacob
 * @Description: 初始化分类下文章总数
 * @Date: 2024/4/30 21:41
 * @Version: 1.0
 */
@Component
@Slf4j
public class StatisticsCategoryArticleTotalRunner implements CommandLineRunner {
    @Autowired
    private AdminStatisticsService statisticsService;

    @Override
    @Async("threadPoolTaskExecutor")
    public void run(String... args) throws Exception {
        log.info("==> 开始统计各分类下文章数量...");
        statisticsService.statisticsCategoryArticleTotal();
        log.info("==> 结束统计各分类下文章数量...");
    }
}
