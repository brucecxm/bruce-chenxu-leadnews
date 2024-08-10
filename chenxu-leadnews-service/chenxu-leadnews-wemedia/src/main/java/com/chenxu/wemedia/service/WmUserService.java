package com.chenxu.wemedia.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenxu.model.common.dtos.ResponseResult;
import com.chenxu.model.wemedia.dtos.WmLoginDto;
import com.chenxu.model.wemedia.pojos.WmUser;

public interface WmUserService extends IService<WmUser> {

    /**
     * 自媒体端登录
     * @param dto
     * @return
     */
    public ResponseResult login(WmLoginDto dto);

}