package com.jacob.weblog.admin.service;

import com.jacob.weblog.admin.model.vo.article.DeleteArticleReqVO;
import com.jacob.weblog.admin.model.vo.article.FindArticleDetailReqVO;
import com.jacob.weblog.admin.model.vo.article.FindArticlePageListReqVO;
import com.jacob.weblog.admin.model.vo.article.PublishArticleReqVO;
import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 文章管理service接口
 * @Date: 2024/4/20 20:57
 * @Version: 1.0
 */
public interface AdminArticleService {
    /**
     * 发布文章
     * @param publishArticleReqVO
     * @return
     */
    Response publishArticle(PublishArticleReqVO publishArticleReqVO);

    /**
     * 删除文章
     * @param deleteArticleReqVO
     * @return
     */
    Response deleteArticle(DeleteArticleReqVO deleteArticleReqVO);

    /**
     * 查询文章分页数据
     * @param findArticlePageListReqVO
     * @return
     */
    Response findArticlePageList(FindArticlePageListReqVO findArticlePageListReqVO);

    /**
     * 查询文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}
