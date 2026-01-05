package com.zh.heima.user.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zh.heima.model.common.dtos.ResponseResult;
import com.zh.heima.model.user.dtos.LoginDto;
import com.zh.heima.model.user.pojos.ApUser;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/5 17:01
 */

public interface ApUserService extends IService<ApUser> {
    /**
     * app端登录功能
     * @param dto
     * @return
     */
    public ResponseResult login(LoginDto dto);
}
