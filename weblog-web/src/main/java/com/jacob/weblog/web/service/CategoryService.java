package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;
import com.jacob.weblog.web.model.vo.category.FindCategoryArticlePageListReqVO;
import com.jacob.weblog.web.model.vo.category.FindCategoryListReqVO;

/**
 * @Author: Jacob
 * @Description: 文章分类service
 * @Date: 2024/4/21 14:48
 * @Version: 1.0
 */
public interface CategoryService {
    /**
     * 获取分类列表
     * @return
     */
    Response findCategoryList(FindCategoryListReqVO findCategoryListReqVO);

    /**
     * 获取分类下文章分页数据
     * @param findCategoryArticlePageListReqVO
     * @return
     */
    Response findCategoryArticlePageList(FindCategoryArticlePageListReqVO findCategoryArticlePageListReqVO);
}
