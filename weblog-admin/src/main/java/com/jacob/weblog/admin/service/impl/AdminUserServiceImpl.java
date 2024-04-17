package com.jacob.weblog.admin.service.impl;

import com.jacob.weblog.admin.model.vo.UpdateAdminUserPasswordReqVO;
import com.jacob.weblog.admin.service.AdminUserService;
import com.jacob.weblog.common.domain.mapper.UserMapper;
import com.jacob.weblog.common.enums.ResponseCodeEnum;
import com.jacob.weblog.common.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Author: Jacob
 * @Description: 用户业务实现类
 * @Date: 2024/4/17 21:52
 * @Version: 1.0
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    @Override
    public Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO) {
        // 拿到用户名、密码
        String username = updateAdminUserPasswordReqVO.getUsername();
        String password = updateAdminUserPasswordReqVO.getPassword();

        // 加密密码
        String encodePassword = passwordEncoder.encode(password);

        // 更新到数据库
        int count = userMapper.updatePasswordByUsername(username, encodePassword);

        return count == 1 ? Response.success() : Response.fail(ResponseCodeEnum.USERNAME_NOT_FOUND);
    }
}
