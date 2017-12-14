package com.ycit;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring boot 启动文件
 *
 * @author xlch
 * @Date 2017-12-14 9:57
 */
@SpringBootApplication
@MapperScan("com.ycit.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
