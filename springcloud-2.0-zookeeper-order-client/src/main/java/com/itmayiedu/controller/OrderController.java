package com.itmayiedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Description:
 * @author: ChenRuiQing.
 * Create Time:  2019-01-21 上午 11:50
 */
@RestController
public class OrderController {
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    private RestTemplate restTemplate;

    // springcloud 中使用那些技术实现调用服务接口 feign 或者rest
    @RequestMapping("/orderToMember")
    public String orderToMember() {
        String memberUrl = "http://zk-member/getMember";
        return "我是Order订单服务，我要掉的会员服务说：>>"+restTemplate.getForObject(memberUrl, String.class);
    }

    @RequestMapping("/discoveryClientMember")
    public List<ServiceInstance> discoveryClientMember() {
        List<ServiceInstance> instances = discoveryClient.getInstances("zk-member");
        for (ServiceInstance serviceInstance : instances) {
            System.out.println("url:" + serviceInstance.getUri());
        }
        return instances;

    }

}
