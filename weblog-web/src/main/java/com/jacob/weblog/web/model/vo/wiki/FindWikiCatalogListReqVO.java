package com.jacob.weblog.web.model.vo.wiki;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Jacob
 * @Description: 知识库获取目录入参实体类
 * @Date: 2024/5/7 19:42
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindWikiCatalogListReqVO {

    @NotNull(message = "知识库 ID 不能为空")
    private Long id;

}