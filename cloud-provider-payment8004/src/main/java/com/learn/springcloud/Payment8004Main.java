package com.learn.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tlh
 * @description
 * @date 2020/3/30
 */
@SpringBootApplication
@EnableDiscoveryClient  //服务发现，开启将服务注册到注册中心的功能。注册中心是Eureka就用@EnableEurekaClient,其他注册中心使用@EnableDiscoveryClient
public class Payment8004Main {

    public static void main(String[] args) {
        SpringApplication.run(Payment8004Main.class, args);
    }
}
