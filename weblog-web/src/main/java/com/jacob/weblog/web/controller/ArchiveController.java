package com.jacob.weblog.web.controller;

import com.jacob.weblog.common.aspect.ApiOperationLog;
import com.jacob.weblog.common.utils.Response;
import com.jacob.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;
import com.jacob.weblog.web.service.ArchiveService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jacob
 * @Description: 文章归档业务Controller
 * @Date: 2024/4/21 16:48
 * @Version: 1.0
 */
@RestController
@Api(tags = "文章归档")
public class ArchiveController {
    @Autowired
    private ArchiveService archiveService;

    @PostMapping("/archive/list")
    @ApiOperationLog(description = "获取文章归档分页数据")
    public Response findArchivePageList(@RequestBody FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO) {
        return archiveService.findArchivePageList(findArchiveArticlePageListReqVO);
    }
}
