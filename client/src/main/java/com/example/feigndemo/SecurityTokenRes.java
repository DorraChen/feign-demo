package com.example.feigndemo;

import lombok.Getter;
import lombok.Setter;

/**
 * @author dorra
 * @date 2021/6/18 18:07
 * @description 临时访问凭证
 */
@Setter
@Getter
public class SecurityTokenRes {
    /**
     * 临时密钥 accessKeyId
     */
    private String accessKeyId;
    /**
     * 临时密钥 accessKeySecret
     */
    private String accessKeySecret;
    /**
     * 安全令牌 securityToken
     */
    private String securityToken;
    /**
     * 安全令牌过期时间
     */
    private String expiration;
}
