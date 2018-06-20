package com.haozz.thymeleafdemo.utils;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author haozz
 * @date 2018/6/19 18:41
 * @description
 */
//@RestControllerAdvice
public class MyAjaxExceptionHandler {

//    @ExceptionHandler(value = Exception.class)
    public CommonRspVo defaultErrorHandler(HttpServletRequest request,Exception e)throws Exception{
        e.printStackTrace();
        CommonRspVo rsp = new CommonRspVo("555",e.getMessage());
        return rsp;
    }
}
