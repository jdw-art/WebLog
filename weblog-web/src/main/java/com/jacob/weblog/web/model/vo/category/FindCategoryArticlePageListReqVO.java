package com.jacob.weblog.web.model.vo.category;

import com.jacob.weblog.common.model.BasePageQuery;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Author: Jacob
 * @Description: 文章分类入参封装类
 * @Date: 2024/4/21 18:49
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindCategoryArticlePageListReqVO extends BasePageQuery {

    /**
     * 分类 ID
     */
    @NotNull(message = "分类 ID 不能为空")
    private Long id;
}
