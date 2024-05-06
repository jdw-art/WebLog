package com.jacob.weblog.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: Jacob
 * @Description: 知识库目录枚举类
 * @Date: 2024/5/6 18:38
 * @Version: 1.0
 */
@Getter
@AllArgsConstructor
public enum WikiCatalogLevelEnum {
    // 一级目录
    ONE(1),
    // 二级目录
    TWO(2);

    private Integer value;
}
