package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;
import com.jacob.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;

/**
 * @Author: Jacob
 * @Description: 前台文章数据service
 * @Date: 2024/4/21 14:09
 * @Version: 1.0
 */
public interface ArticleService {
    /**
     * 获取首页文章分页数据
     * @param findIndexArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);
}
