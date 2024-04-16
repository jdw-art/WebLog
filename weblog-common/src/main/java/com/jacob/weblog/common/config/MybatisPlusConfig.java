package com.jacob.weblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Jacob
 * @Description: Mybatis Plus 配置文件
 * @Date: 2024/4/16 19:10
 * @Version: 1.0
 */
@Configuration
@MapperScan("com.jacob.weblog.common.domain.mapper")
public class MybatisPlusConfig {
}
