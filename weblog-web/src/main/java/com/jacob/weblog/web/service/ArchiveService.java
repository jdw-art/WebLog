package com.jacob.weblog.web.service;

import com.jacob.weblog.common.utils.Response;
import com.jacob.weblog.web.model.vo.archive.FindArchiveArticlePageListReqVO;

/**
 * @Author: Jacob
 * @Description: 文章归档业务接口
 * @Date: 2024/4/21 16:45
 * @Version: 1.0
 */
public interface ArchiveService {
    /**
     * 获取文章归档分页数据
     * @param findArchiveArticlePageListReqVO
     * @return
     */
    Response findArchivePageList(FindArchiveArticlePageListReqVO findArchiveArticlePageListReqVO);
}
