package com.jacob.weblog.admin.service;

import com.jacob.weblog.common.utils.Response;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Author: Jacob
 * @Description: 文件管理service接口
 * @Date: 2024/4/18 20:53
 * @Version: 1.0
 */
public interface AdminFileService {
    /**
     * 上传文件
     * @param file
     * @return
     */
    Response uploadFile(MultipartFile file);
}
