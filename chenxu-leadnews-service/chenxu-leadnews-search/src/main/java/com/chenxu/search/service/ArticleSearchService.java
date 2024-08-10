package com.chenxu.search.service;

import com.chenxu.model.common.dtos.ResponseResult;
import com.chenxu.model.search.dtos.UserSearchDto;

import java.io.IOException;

public interface ArticleSearchService {

    /**
     * es文章分页检索
     * @param dto
     * @return
     */
    public ResponseResult search(UserSearchDto dto) throws IOException;
}
