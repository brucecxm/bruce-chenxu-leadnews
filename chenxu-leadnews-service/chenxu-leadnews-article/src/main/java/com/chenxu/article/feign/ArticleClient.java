package com.chenxu.article.feign;

import com.chenxu.apis.article.IArticleClient;
import com.chenxu.article.service.ApArticleService;
import com.chenxu.model.article.dtos.ArticleDto;
import com.chenxu.model.common.dtos.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class ArticleClient implements IArticleClient {

    @Autowired
    private ApArticleService apArticleService;

    @Override
    @PostMapping("/api/v1/article/save")
    public ResponseResult saveArticle(@RequestBody ArticleDto dto) {
        return apArticleService.saveArticle(dto);
    }

}