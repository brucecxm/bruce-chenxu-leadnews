package com.chenxu.model.user.dtos;

import com.chenxu.model.common.dtos.PageRequestDto;
import lombok.Data;

@Data
public class AuthDto  extends PageRequestDto {

    /**
     * 状态
     */
    private Short status;

    private Integer id;

    //驳回的信息
    private String msg;
}
