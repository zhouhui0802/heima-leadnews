package com.zh.heima.model.user.dtos;


import lombok.Data;
import io.swagger.annotations.ApiModelProperty;
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/5 14:55
 */
@Data
public class LoginDto {

    /**
     * 手机号
     */
    @ApiModelProperty(value = "手机号",required = true)
    private String phone;

    /**
     * 密码
     */
    @ApiModelProperty(value = "密码",required = true)
    private String password;
}
