package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author tlh
 * @description
 * @date 2020/3/28
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka7001MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(Eureka7001MainApplication.class, args);
    }
}
