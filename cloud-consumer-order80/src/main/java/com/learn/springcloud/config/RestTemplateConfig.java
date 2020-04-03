package com.learn.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author tlh
 * @description Spring提供的远程服务调用
 * @date 2020/3/28
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    /// 使用自定义负载均衡规则 @LoadBalanced @LoadBalanced  //赋予RestTemplate负载均衡的能力
    public RestTemplate restTemplate(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

}
