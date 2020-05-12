package com.atoony.springbootskeleton.config.handler;

import com.atoony.springbootskeleton.config.exception.APIException;
import com.atoony.springbootskeleton.config.response.CommonResult;
import com.atoony.springbootskeleton.config.response.ResultCode;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author Atoony
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(APIException.class)
    public CommonResult APIExceptionHandler(APIException e) {
        return new CommonResult<>(ResultCode.FAILED, e.getMsg());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public CommonResult MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        // 从异常对象中拿到ObjectError对象
        ObjectError objectError = e.getBindingResult().getAllErrors().get(0);
        // 然后提取错误提示信息进行返回
        return new CommonResult<>(ResultCode.VALIDATE_FAILED, objectError.getDefaultMessage());
    }

}
