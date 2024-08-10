package com.chenxu.search.service;

import com.chenxu.model.common.dtos.ResponseResult;
import com.chenxu.model.search.dtos.UserSearchDto;

public interface ApAssociateWordsService {

    /**
     * 搜索联想词
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto);
}
