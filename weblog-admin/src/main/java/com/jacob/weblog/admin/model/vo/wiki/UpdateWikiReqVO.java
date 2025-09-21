package com.jacob.weblog.admin.model.vo.wiki;

import io.swagger.annotations.ApiModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

/**
 * @Author: Jacob
 * @Description: 更新知识库入参请求类
 * @Date: 2024/5/7 19:16
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "更新知识库 VO")
public class UpdateWikiReqVO {

    @NotNull(message = "ID 不能为空")
    private Long id;

    @NotBlank(message = "知识库标题不能为空")
    @Length(min = 1, max = 20, message = "知识库标题字数需大于 1 小于 20")
    private String title;

    @NotBlank(message = "知识库摘要不能为空")
    private String summary;

    @NotBlank(message = "知识库封面不能为空")
    private String cover;
}
