package com.ycit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * spring boot 启动类
 *
 * @author xlch
 * @Date 2017-12-25 9:49
 */
@EnableAspectJAutoProxy(exposeProxy = true)
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
