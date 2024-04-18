package com.jacob.weblog.admin.controller;

import com.jacob.weblog.admin.model.vo.FindCategoryPageListReqVO;
import com.jacob.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.jacob.weblog.admin.service.AdminCategoryService;
import com.jacob.weblog.common.aspect.ApiOperationLog;
import com.jacob.weblog.common.utils.PageResponse;
import com.jacob.weblog.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jacob
 * @Description: 文章分类管理
 * @Date: 2024/4/18 16:20
 * @Version: 1.0
 */
@RestController
@RequestMapping("/admin")
@Api(tags = "Admin 分类模块")
public class AdminCategoryController {
    @Autowired
    private AdminCategoryService categoryService;

    @PostMapping("/category/add")
    @ApiOperation(value = "添加分类")
    @ApiOperationLog(description = "添加分类")
    public Response addCategory(@RequestBody @Validated AddCategoryReqVO addCategoryReqVO) {
        return categoryService.addCategory(addCategoryReqVO);
    }

    @PostMapping("/category/list")
    @ApiOperation(value = "分类分页数据获取")
    @ApiOperationLog(description = "分类分页数据获取")
    public PageResponse findCategoryList(@RequestBody @Validated FindCategoryPageListReqVO findCategoryPageListReqVO) {
        return categoryService.findCategoryList(findCategoryPageListReqVO);
    }
}
