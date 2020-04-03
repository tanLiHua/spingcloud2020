package com.learn.springcloud.service;

import com.learn.springcloud.entities.Payment;

public interface PaymentService {

    //增加
    int createPayment(Payment payment);

    //查询
    Payment selectById(Long id);
}
