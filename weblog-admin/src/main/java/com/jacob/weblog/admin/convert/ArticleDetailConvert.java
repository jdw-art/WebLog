package com.jacob.weblog.admin.convert;

import com.jacob.weblog.admin.model.vo.article.FindArticleDetailRspVO;
import com.jacob.weblog.common.domain.dos.ArticleDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author: Jacob
 * @Description: Mapstruct 转换接口
 * @Date: 2024/4/20 21:25
 * @Version: 1.0
 */
@Mapper
public interface ArticleDetailConvert {
    /**
     * 初始化 convert 实例
     */
    ArticleDetailConvert INSTANCE = Mappers.getMapper(ArticleDetailConvert.class);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindArticleDetailRspVO convertDO2VO(ArticleDO bean);
}
