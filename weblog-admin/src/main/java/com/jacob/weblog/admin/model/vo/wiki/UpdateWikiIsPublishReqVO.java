package com.jacob.weblog.admin.model.vo.wiki;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Author: Jacob
 * @Description: 更新知识库发布状态入参类
 * @Date: 2024/5/7 19:15
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "更新知识库发布状态 VO")
public class UpdateWikiIsPublishReqVO {

    @NotNull(message = "知识库 ID 不能为空")
    private Long id;

    @NotNull(message = "知识库发布状态不能为空")
    private Boolean isPublish;
}
