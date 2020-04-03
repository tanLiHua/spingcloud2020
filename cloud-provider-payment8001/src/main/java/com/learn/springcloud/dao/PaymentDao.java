package com.learn.springcloud.dao;

import com.learn.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {

    //增加
    int createPayment(Payment payment);

    //查询
    Payment selectById(Long id);

}
