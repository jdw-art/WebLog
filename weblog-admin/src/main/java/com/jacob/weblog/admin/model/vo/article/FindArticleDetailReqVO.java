package com.jacob.weblog.admin.model.vo.article;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Author: Jacob
 * @Description: 获取文章详情入参封装类
 * @Date: 2024/4/20 21:22
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "查询文章详情入参 VO")
public class FindArticleDetailReqVO {
    /**
     * 文章 ID
     */
    @NotNull(message = "文章 ID 不能为空")
    private Long id;
}
