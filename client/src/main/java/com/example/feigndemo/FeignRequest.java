package com.example.feigndemo;

import feign.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author dorra
 * @date 2021/11/30 16:11
 * @description
 */
@FeignClient(name = "server", url = "http://localhost:8071/server", configuration = FeignConfig.class)
public interface FeignRequest {
    @PostMapping(value = "/server")
    Response getServer1();
    @PostMapping(value = "/server")
    ResponseVo getServer2();
}
