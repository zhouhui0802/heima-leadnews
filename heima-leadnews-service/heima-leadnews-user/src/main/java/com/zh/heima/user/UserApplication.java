package com.zh.heima.user;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/1/5 17:09
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.zh.heima.user.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
