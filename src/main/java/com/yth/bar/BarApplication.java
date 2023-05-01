package com.yth.bar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yth.bar.mapper")
public class BarApplication {

    public static void main(String[] args) {
        SpringApplication.run(BarApplication.class, args);
    }

}
