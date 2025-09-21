package com.jacob.weblog.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"com.jacob.weblog.*"}) // 多模块项目中，必需手动指定扫描 com.jacob.weblog 包下面的所有类
@EnableScheduling       // 启用定时任务
@MapperScan("com.jacob.weblog.common.domain.mapper")
public class WeblogWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeblogWebApplication.class, args);
    }

}
