package com.jacob.weblog.admin.service;

import com.jacob.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 博客设置管理service
 * @Date: 2024/4/18 22:20
 * @Version: 1.0
 */
public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);
}
