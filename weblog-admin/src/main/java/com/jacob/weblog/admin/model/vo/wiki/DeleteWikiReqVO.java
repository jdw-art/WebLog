package com.jacob.weblog.admin.model.vo.wiki;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Author: Jacob
 * @Description: 删除知识库 VO
 * @Date: 2024/5/6 18:37
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "删除知识库 VO")
public class DeleteWikiReqVO {

    @NotNull(message = "知识库 ID 不能为空")
    private Long id;
}
