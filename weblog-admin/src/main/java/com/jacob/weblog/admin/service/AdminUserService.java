package com.jacob.weblog.admin.service;

import com.jacob.weblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.jacob.weblog.common.utils.Response;

/**
 * @Author: Jacob
 * @Description: 用户业务接口
 * @Date: 2024/4/17 21:51
 * @Version: 1.0
 */
public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);

    /**
     * 获取当前登录用户信息
     * @return
     */
    Response findUserInfo();
}
