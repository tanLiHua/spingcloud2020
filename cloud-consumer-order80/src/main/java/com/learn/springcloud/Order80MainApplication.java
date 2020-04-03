package com.learn.springcloud;

import com.learn.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author tlh
 * @description
 * @date 2020/3/28
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "CLOUD-PAYMENT-SERVICE", configuration = MySelfRule.class)  // name:调用的服务名
public class Order80MainApplication {

    public static void main(String[] args) {

        SpringApplication.run(Order80MainApplication.class, args);
    }
}
