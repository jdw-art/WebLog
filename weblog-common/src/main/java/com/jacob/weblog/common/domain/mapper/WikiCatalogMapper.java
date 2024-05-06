package com.jacob.weblog.common.domain.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.jacob.weblog.common.domain.dos.WikiCatalogDO;

import java.util.List;

/**
 * @Author: Jacob
 * @Description: 知识库目录Mapper接口
 * @Date: 2024/5/6 18:31
 * @Version: 1.0
 */
public interface WikiCatalogMapper extends BaseMapper<WikiCatalogDO> {

    /**
     * 根据某个知识库下所有目录
     * @param wikiId
     * @return
     */
    default List<WikiCatalogDO> selectByWikiId(Long wikiId) {
        return selectList(Wrappers.<WikiCatalogDO>lambdaQuery()
                .eq(WikiCatalogDO::getWikiId, wikiId)
        );
    }

    /**
     * 删除知识库
     * @param wikiId
     * @return
     */
    default int deleteByWikiId(Long wikiId) {
        return delete(Wrappers.<WikiCatalogDO>lambdaQuery()
                .eq(WikiCatalogDO::getWikiId, wikiId));
    }
}
