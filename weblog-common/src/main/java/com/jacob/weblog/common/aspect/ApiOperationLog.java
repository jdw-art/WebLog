package com.jacob.weblog.common.aspect;

import java.lang.annotation.*;

/**
 * @Author: Jacob
 * @Description: API 请求日志切面
 * @Date: 2024/4/15 22:10
 * @Version: 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface ApiOperationLog {
    /**
     * API 功能描述
     *
     * @return
     */
    String description() default "";
}
