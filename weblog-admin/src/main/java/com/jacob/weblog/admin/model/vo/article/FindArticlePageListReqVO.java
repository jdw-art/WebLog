package com.jacob.weblog.admin.model.vo.article;

import com.jacob.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @Author: Jacob
 * @Description: 分页获取文章入参封装类
 * @Date: 2024/4/20 21:17
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "查询文章分页数据入参 VO")
public class FindArticlePageListReqVO extends BasePageQuery {

    /**
     * 文章标题
     */
    private String title;

    /**
     * 发布的起始日期
     */
    private LocalDate startDate;

    /**
     * 发布的结束日期
     */
    private LocalDate endDate;
}
