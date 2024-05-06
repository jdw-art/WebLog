package com.jacob.weblog.admin.service;

import com.jacob.weblog.admin.model.vo.wiki.AddWikiReqVO;
import com.jacob.weblog.admin.model.vo.wiki.DeleteWikiReqVO;
import com.jacob.weblog.admin.model.vo.wiki.FindWikiPageListReqVO;
import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 知识库service
 * @Date: 2024/5/6 18:33
 * @Version: 1.0
 */
public interface AdminWikiService {
    /**
     * 新增知识库
     * @param addWikiReqVO
     * @return
     */
    Response addWiki(AddWikiReqVO addWikiReqVO);

    /**
     * 删除知识库
     * @param deleteWikiReqVO
     * @return
     */
    Response deleteWiki(DeleteWikiReqVO deleteWikiReqVO);

    /**
     * 知识库分页查询
     * @param findWikiPageListReqVO
     * @return
     */
    Response findWikiPageList(FindWikiPageListReqVO findWikiPageListReqVO);
}
