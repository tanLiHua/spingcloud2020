package com.learn.springcloud.controller;

import com.learn.springcloud.entities.CommonResult;
import com.learn.springcloud.entities.Payment;
import com.learn.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;
    /**
     * 端口号 便于观察负载均衡（Order服务Spring的restTemplate上加了@Loadbalance）
     */
    @Value("${server.port}")
    private String servicePort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "payment/create")
    public CommonResult createPayment(@RequestBody Payment payment){

        int result = paymentService.createPayment(payment);
        if(result >0 ){
          return  new CommonResult(200,"新增成功,服务端口："+servicePort,result);
        }else {
          return  new CommonResult(444,"插入数据库失败,服务端口："+ servicePort,null);
        }
    }

    @GetMapping(value="payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        CommonResult commonResult =null;
        Payment payment = paymentService.selectById(id);
        if(null !=payment){
            commonResult = new CommonResult(200,"查询成功,服务端口："+servicePort,payment);
        }else {
            commonResult = new CommonResult(444,"查询失败,没有对应的数据:"+ id +"。服务端口："+servicePort,null);
        }
        return commonResult;
    }

    @GetMapping(value="payment/discovery")
    public Object discoveryClient(){
        List<String> services = discoveryClient.getServices();
        for (String service :services) {

            log.info("*****service:" +service);
        }
        // 一个微服务下的所有实例(CLOUD-PAYMENT-SERVICE这里是集群，所以它的实例有两个)
        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        for(ServiceInstance instance : instances){
            log.info(instance.getInstanceId()+ "\t" + instance.getHost() +"\t"+instance.getServiceId() + "\t" +
                    instance.getPort() +"\t"+instance.getUri());
        }
        return this.discoveryClient;
    }
}
