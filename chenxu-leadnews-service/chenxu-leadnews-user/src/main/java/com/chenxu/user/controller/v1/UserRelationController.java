package com.chenxu.user.controller.v1;

import com.chenxu.model.common.dtos.ResponseResult;
import com.chenxu.model.user.dtos.UserRelationDto;
import com.chenxu.user.service.ApUserRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserRelationController {

    @Autowired
    private ApUserRelationService apUserRelationService;
  
    @PostMapping("/user_follow")
    public ResponseResult follow(@RequestBody UserRelationDto dto){
        return apUserRelationService.follow(dto);
    }
}