package com.jacob.weblog.web.service.impl;

import com.jacob.weblog.common.domain.dos.BlogSettingsDO;
import com.jacob.weblog.common.domain.mapper.BlogSettingsMapper;
import com.jacob.weblog.common.utils.Response;
import com.jacob.weblog.web.convert.BlogSettingsConvert;
import com.jacob.weblog.web.model.vo.blogsettings.FindBlogSettingsDetailRspVO;
import com.jacob.weblog.web.service.BlogSettingsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Jacob
 * @Description: 博客设置信息service实现类
 * @Date: 2024/4/21 14:59
 * @Version: 1.0
 */
@Service
@Slf4j
public class BlogSettingsServiceImpl implements BlogSettingsService {

    @Autowired
    private BlogSettingsMapper blogSettingsMapper;

    /**
     * 获取博客设置信息
     *
     * @return
     */
    @Override
    public Response findDetail() {
        // 查询博客设置信息（约定的 ID 为 1）
        BlogSettingsDO blogSettingsDO = blogSettingsMapper.selectById(1L);
        // DO 转 VO
        FindBlogSettingsDetailRspVO vo = BlogSettingsConvert.INSTANCE.convertDO2VO(blogSettingsDO);

        return Response.success(vo);
    }
}
