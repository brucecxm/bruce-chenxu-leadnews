package com.chenxu.behavior.service;

import com.chenxu.model.behavior.dtos.ReadBehaviorDto;
import com.chenxu.model.common.dtos.ResponseResult;

public interface ApReadBehaviorService {

    /**
     * 保存阅读行为
     * @param dto
     * @return
     */
    public ResponseResult readBehavior(ReadBehaviorDto dto);
}
