package com.learn.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author tlh
 * @description
 * @date 2020/3/30
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "payment/consul")
    public String paymentConsul() {
        return "SpringCloud with consul:" + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
