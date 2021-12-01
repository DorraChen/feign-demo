package com.example.feigndemo;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import feign.Response;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author dorra
 * @date 2021/11/30 16:08
 * @description 推荐使用test2中的, Feign 调用使用对象接收, 如果用 Response 接收业务端还要解析,不妥
 */
@RestController
@Slf4j
public class ClientController {
    @Autowired
    private FeignRequest feignRequest;
    JsonParser parser = new JsonParser();
    Gson gson = new Gson();

    @PostMapping(value = "test1")
    public void test1() throws IOException {
        Response response = feignRequest.getServer1();
        int status = 200;
        if (response != null && response.status() == status) {
            JSONObject jsonObject = JSONObject.parseObject(IOUtils.toString(response.body().asInputStream()));
            log.info("===========response: "+gson.toJson(jsonObject));
            /*//下面这样解析是不对的
            JsonElement jsonElement = parser.parse(response.body().toString());
            ResponseVo responseVo = gson.fromJson(jsonElement, ResponseVo.class);*/
        }

    }

    @PostMapping(value = "test2")
    public ResponseVo test2() {
        ResponseVo response = feignRequest.getServer2();
        log.info("===========response: "+gson.toJson(response));
        return response;
    }
}
