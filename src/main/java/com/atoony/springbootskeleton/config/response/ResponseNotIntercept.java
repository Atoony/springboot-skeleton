package com.atoony.springbootskeleton.config.response;

import java.lang.annotation.*;

/**
 * 自定义注解。次注解注解的方法不包装返回数据
 */

@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ResponseNotIntercept {
}
