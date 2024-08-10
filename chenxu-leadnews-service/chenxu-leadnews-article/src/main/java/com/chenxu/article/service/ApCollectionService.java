package com.chenxu.article.service;

import com.chenxu.model.article.dtos.CollectionBehaviorDto;
import com.chenxu.model.common.dtos.ResponseResult;

public interface ApCollectionService {

    /**
     * 收藏
     * @param dto
     * @return
     */
    public ResponseResult collection(CollectionBehaviorDto dto);
}
