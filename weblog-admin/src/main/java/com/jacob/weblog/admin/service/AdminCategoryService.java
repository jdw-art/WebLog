package com.jacob.weblog.admin.service;

import com.jacob.weblog.admin.model.vo.FindCategoryPageListReqVO;
import com.jacob.weblog.admin.model.vo.category.AddCategoryReqVO;
import com.jacob.weblog.common.utils.PageResponse;
import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 文章分类管理接口类
 * @Date: 2024/4/18 16:18
 * @Version: 1.0
 */
public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);

    /**
     * 分类分页数据查询
     * @param findCategoryPageListReqVO
     * @return
     */
    PageResponse findCategoryList(FindCategoryPageListReqVO findCategoryPageListReqVO);
}
