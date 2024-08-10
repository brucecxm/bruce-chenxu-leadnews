package com.chenxu.user.service;


import com.chenxu.model.common.dtos.ResponseResult;
import com.chenxu.model.user.dtos.UserRelationDto;


public interface ApUserRelationService {
    /**
     * 用户关注/取消关注
     * @param dto
     * @return
     */
    public ResponseResult follow(UserRelationDto dto);
}