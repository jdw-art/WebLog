package com.jacob.weblog.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: Jacob
 * @Description: 业务异常
 * @Date: 2024/4/16 12:39
 * @Version: 1.0
 */
@Getter
@Setter
public class BizException extends RuntimeException{
    // 异常码
    private String errorCode;
    // 错误信息
    private String errorMessage;

    public BizException(BaseExceptionInterface baseExceptionInterface) {
        this.errorCode = baseExceptionInterface.getErrorCode();
        this.errorMessage = baseExceptionInterface.getErrorMessage();
    }
}
