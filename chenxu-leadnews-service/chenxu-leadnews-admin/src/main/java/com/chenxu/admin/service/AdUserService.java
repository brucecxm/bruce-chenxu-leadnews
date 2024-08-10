package com.chenxu.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenxu.model.admin.dtos.AdUserDto;
import com.chenxu.model.admin.pojos.AdUser;
import com.chenxu.model.common.dtos.ResponseResult;

public interface AdUserService extends IService<AdUser> {

    /**
     * 登录
     * @param dto
     * @return
     */
    public ResponseResult login(AdUserDto dto);
}
