package com.jacob.weblog.common.constant;

import java.time.format.DateTimeFormatter;

/**
 * @Author: Jacob
 * @Description: 全局静态实例类
 * @Date: 2024/4/23 13:48
 * @Version: 1.0
 */
public interface Constants {
    /**
     * 月-日 格式
     */
    DateTimeFormatter MONTH_DAY_FORMATTER = DateTimeFormatter.ofPattern("MM-dd");

    /**
     * 年-月-日 小时-分钟-秒
     */
    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
}
