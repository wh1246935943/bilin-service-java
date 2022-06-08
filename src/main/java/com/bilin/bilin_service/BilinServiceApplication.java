package com.bilin.bilin_service;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bilin.bilin_service.dao")
public class BilinServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BilinServiceApplication.class, args);
    }

}
