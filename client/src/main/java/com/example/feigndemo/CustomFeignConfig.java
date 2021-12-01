//package com.example.feigndemo;
//
//import feign.Logger;
//import feign.okhttp.OkHttpClient;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author cy
// * @className FeignConfig
// * @description feign日志打印
// * @date 2021/9/14 13:29
// */
//@Configuration
//public class CustomFeignConfig {
//    @Bean
//    public OkHttpClient client() {
//        return new OkHttpClient();
//    }
//    @Bean
//    Logger.Level feignLoggerLevel() {
//        return Logger.Level.FULL;
//    }
//}
