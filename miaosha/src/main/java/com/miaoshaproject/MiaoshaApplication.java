package com.miaoshaproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.miaoshaproject"})
@MapperScan("com.miaoshaproject.dao")
public class MiaoshaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiaoshaApplication.class, args);
    }

}
