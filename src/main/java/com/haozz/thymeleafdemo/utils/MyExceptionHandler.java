package com.haozz.thymeleafdemo.utils;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author haozz
 * @date 2018/6/19 17:16
 * @description
 */
@RestControllerAdvice
public class MyExceptionHandler {

    public static final String ERROR_VIEW = "my_error";

//    @ExceptionHandler(value = ArithmeticException.class)//指定拦截的异常
//    public Object errorHandler(HttpServletRequest request, HttpServletResponse response,Exception e) throws Exception{
//        e.printStackTrace();//打印异常信息
//        ModelAndView mv = new ModelAndView();
//        mv.addObject("exception",e);
//        mv.addObject("url",request.getRequestURL());//发生异常的路径
//        mv.setViewName(ERROR_VIEW);//指定发生异常之后跳转页面
//        return mv;
//    }

    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,HttpServletResponse response,Exception e)throws Exception{
        e.printStackTrace();
        if(isAjax(request)){//是ajax请求
            CommonRspVo rsp = new CommonRspVo("555",e.getMessage());
            return rsp;
        }else{//不是ajax请求
            ModelAndView mv = new ModelAndView();
            mv.addObject("exception",e);
            mv.addObject("url",request.getRequestURL());//发生异常的路径
            mv.setViewName(ERROR_VIEW);//指定发生异常之后跳转页面
            return mv;
        }
    }

    private boolean isAjax(HttpServletRequest request){//判断request是否是ajax请求
        return (request.getHeader("X-Requested-With") != null
                    && "XMLHttpRequest"
                        .equals( request.getHeader("X-Requested-With").toString()) );
    }
}
