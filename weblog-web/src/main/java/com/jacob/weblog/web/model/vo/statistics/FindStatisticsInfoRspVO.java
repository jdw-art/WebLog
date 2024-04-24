package com.jacob.weblog.web.model.vo.statistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Jacob
 * @Description: 统计信息出参类
 * @Date: 2024/4/24 16:02
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindStatisticsInfoRspVO {
    /**
     * 文章总数
     */
    private Long articleTotalCount;

    /**
     * 分类总数
     */
    private Long categoryTotalCount;

    /**
     * 标签总数
     */
    private Long tagTotalCount;

    /**
     * 总浏览量
     */
    private Long pvTotalCount;
}
