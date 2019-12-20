package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author luxin
 * @create 2019-12-12 14:46
 */
@SpringBootApplication
@EnableEurekaClient  //本服务开启后会注册进服务中心
@EnableDiscoveryClient//启动服务发现
public class DeptProvide8003_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvide8003_APP.class,args);
    }
}
