package com.haozz.thymeleafdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author haozz
 * @date 2018/6/19 16:57
 * @description
 */
@Controller
@RequestMapping(value = "/err")
public class ErrorCtrl {

    @RequestMapping(value = "/error")
    public String error(){
        int a = 1/0;
        return "abcdefg";
    }

    //跳转到发生ajax异常页面
    @RequestMapping("/ajaxerror")
    public String ajaxerror(){
        return "thymeleaf/ajaxerror";
    }

    //发生ajax异常
    @RequestMapping("/getAjaxerror")
    public int getAjaxerror(){
        int a = 1/0;
        return a;
    }
}
