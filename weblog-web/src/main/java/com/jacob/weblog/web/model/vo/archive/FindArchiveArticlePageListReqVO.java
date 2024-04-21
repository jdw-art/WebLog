package com.jacob.weblog.web.model.vo.archive;

import com.jacob.weblog.common.model.BasePageQuery;
import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

/**
 * @Author: Jacob
 * @Description: 文章归档入参封装类
 * @Date: 2024/4/21 16:42
 * @Version: 1.0
 */
@Data
@Builder
@ApiModel(value = "文章归档分页 VO")
public class FindArchiveArticlePageListReqVO extends BasePageQuery {
}
