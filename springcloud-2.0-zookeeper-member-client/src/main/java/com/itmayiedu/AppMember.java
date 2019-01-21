package com.itmayiedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @version 1.0
 * @Description: 如果一个服务使用consul、zookeeper做注册中心，则使用@EnableDiscoveryClient注解向注册中心注册服务
 * @author: ChenRuiQing.
 * Create Time:  2019-01-21 上午 11:43
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AppMember {
    public static void main(String[] args) {
        SpringApplication.run(AppMember.class,args);
    }
}
