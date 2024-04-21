package com.jacob.weblog.web.model.vo.article;

import com.jacob.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: Jacob
 * @Description: 查询文章入参封装类
 * @Date: 2024/4/21 14:04
 * @Version: 1.0
 */
@Data
@Builder
@ApiModel(value = "首页查询文章分页 VO")
public class FindIndexArticlePageListReqVO extends BasePageQuery {
}
