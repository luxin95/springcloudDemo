package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luxin
 * @create 2019-12-12 19:03
 */
@SpringBootApplication
@EnableEurekaServer     //Eureka标签是服务端的启动类,接受其他服务注册进
public class EurekaServer7001_APP {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_APP.class,args);
    }
}
