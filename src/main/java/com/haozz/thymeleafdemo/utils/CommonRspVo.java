package com.haozz.thymeleafdemo.utils;

/**
 * @author haozz
 * @date 2018/6/20 10:41
 * @description
 */
public class CommonRspVo {

    private String code;
    private String message;
    private Object data;

    public CommonRspVo() {
        this.setCode("200");
        this.setMessage("操作成功");
    }

    public CommonRspVo(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
