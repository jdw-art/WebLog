package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;
import com.jacob.weblog.web.model.vo.search.SearchArticlePageListReqVO;

/**
 * @Author: Jacob
 * @Description: 关键词分页搜索service
 * @Date: 2024/4/26 21:59
 * @Version: 1.0
 */
public interface SearchService {
    /**
     * 关键词分页搜索
     * @param searchArticlePageListReqVO
     * @return
     */
    Response searchArticlePageList(SearchArticlePageListReqVO searchArticlePageListReqVO);
}
