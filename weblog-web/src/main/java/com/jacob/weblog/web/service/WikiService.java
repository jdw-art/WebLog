package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;
import com.jacob.weblog.web.model.vo.wiki.FindWikiArticlePreNextReqVO;
import com.jacob.weblog.web.model.vo.wiki.FindWikiCatalogListReqVO;

/**
 * @Author: Jacob
 * @Description: 知识库业务接口
 * @Date: 2024/5/7 19:39
 * @Version: 1.0
 */
public interface WikiService {

    /**
     * 获取知识库
     * @return
     */
    Response findWikiList();

    /**
     * 获取知识库目录
     * @param findWikiCatalogListReqVO
     * @return
     */
    Response findWikiCatalogList(FindWikiCatalogListReqVO findWikiCatalogListReqVO);

    /**
     * 获取上下页
     * @param findWikiArticlePreNextReqVO
     * @return
     */
    Response findArticlePreNext(FindWikiArticlePreNextReqVO findWikiArticlePreNextReqVO);
}
