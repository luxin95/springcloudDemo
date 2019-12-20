package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author luxin
 * @create 2019-12-12 15:34
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages={"com.microservice"})
public class Deptconsumer80_Feign_APP {
    public static void main(String[] args) {
        SpringApplication.run(Deptconsumer80_Feign_APP.class,args);
    }
}
