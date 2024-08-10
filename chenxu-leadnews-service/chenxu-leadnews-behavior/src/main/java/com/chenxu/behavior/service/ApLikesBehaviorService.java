package com.chenxu.behavior.service;

import com.chenxu.model.behavior.dtos.LikesBehaviorDto;
import com.chenxu.model.common.dtos.ResponseResult;

public interface ApLikesBehaviorService {

    /**
     * 存储喜欢数据
     * @param dto
     * @return
     */
    public ResponseResult like(LikesBehaviorDto dto);
}
