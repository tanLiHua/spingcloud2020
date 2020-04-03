package com.learn.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author tlh
 * @description
 * @date 2020/4/2
 */
public interface LoadBalancer {
    /**
     * 获取存活的服务实例列表
     *
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
