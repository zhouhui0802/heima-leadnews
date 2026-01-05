package com.zh.heima.common.exception;


import com.zh.heima.model.common.enums.AppHttpCodeEnum;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/4 8:01
 */
public class CustomException extends RuntimeException{

    private AppHttpCodeEnum appHttpCodeEnum;

    public CustomException(AppHttpCodeEnum appHttpCodeEnum){
        this.appHttpCodeEnum = appHttpCodeEnum;
    }

    public AppHttpCodeEnum getAppHttpCodeEnum() {
        return appHttpCodeEnum;
    }
}
