package com.jacob.weblog.jwt.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @Author: Jacob
 * @Description: 用户名或者密码为空异常
 * @Date: 2024/4/16 19:53
 * @Version: 1.0
 */
public class UsernameOrPasswordNullException extends AuthenticationException {
    public UsernameOrPasswordNullException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public UsernameOrPasswordNullException(String msg) {
        super(msg);
    }
}
