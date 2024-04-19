package com.jacob.weblog.admin.convert;

import com.jacob.weblog.admin.model.vo.blogsettings.FindBlogSettingsRspVO;
import com.jacob.weblog.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.jacob.weblog.common.domain.dos.BlogSettingsDO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @Author: Jacob
 * @Description: 转换接口
 * @Date: 2024/4/19 12:18
 * @Version: 1.0
 */
@Mapper
public interface BlogSettingsConvert {
    /**
     * 初始化 convert 实例
     */
    BlogSettingsConvert INSTANCE = Mappers.getMapper(BlogSettingsConvert.class);

    /**
     * 将 VO 转化为 DO
     * @param bean
     * @return
     */
    BlogSettingsDO convertVO2DO(UpdateBlogSettingsReqVO bean);

    /**
     * 将 DO 转化为 VO
     * @param bean
     * @return
     */
    FindBlogSettingsRspVO convertDO2VO(BlogSettingsDO bean);
}
