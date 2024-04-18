package com.jacob.weblog.admin.model.vo.tag;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

/**
 * @Author: Jacob
 * @Description: 标签模糊查询参数类
 * @Date: 2024/4/18 20:10
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel(value = "标签模糊查询 VO")
public class SearchTagsReqVO {
    @NotBlank(message = "标签查询关键词不能为空")
    private String key;
}
