package com.chenxu.apis.article.fallback;

import com.chenxu.apis.article.IArticleClient;
import com.chenxu.model.article.dtos.ArticleDto;
import com.chenxu.model.common.dtos.ResponseResult;
import com.chenxu.model.common.enums.AppHttpCodeEnum;
import org.springframework.stereotype.Component;

@Component
public class IArticleClientFallback implements IArticleClient {
    @Override
    public ResponseResult saveArticle(ArticleDto dto) {
        return ResponseResult.errorResult(AppHttpCodeEnum.SERVER_ERROR,"获取数据失败");
    }
}
