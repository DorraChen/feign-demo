package com.example.feigndemo;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import feign.Response;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dorra
 * @date 2021/11/30 16:08
 * @description
 */
@RestController
@Slf4j
public class ServerController {
    Gson gson = new Gson();

    @PostMapping(value = "server")
    public Map<String, Object> test1() {
        Map<String, Object> map = new HashMap<>(16);
        map.put("success", true);
        map.put("code", 10000);
        map.put("msg", "request success!");
        map.put("data", "");
        log.info("===========server response: ", gson.toJson(map));
        return map;
    }
}
