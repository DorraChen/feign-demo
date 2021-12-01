package com.example.feigndemo;

import lombok.Data;

/**
 * FileName: ResponseVo
 *
 * @author :   JJ
 * @date: 2021/9/23 10:51
 * @description: TODO
 * @version: 1.0
 */
@Data
public class ResponseVo {
    private String msg;
    private Boolean success;
    private Object data;
    private Integer code;

}
