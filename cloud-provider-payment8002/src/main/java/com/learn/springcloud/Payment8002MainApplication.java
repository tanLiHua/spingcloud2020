package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author tlh
 * @description
 * @date 2020/3/28
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(Payment8002MainApplication.class,  args);
    }
}
