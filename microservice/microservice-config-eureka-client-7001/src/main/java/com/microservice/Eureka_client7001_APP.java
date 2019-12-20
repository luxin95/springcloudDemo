package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author luxin
 * @create 2019-12-20 10:21
 */
@SpringBootApplication
@EnableEurekaServer
public class Eureka_client7001_APP {
    public static void main(String[] args) {
        SpringApplication.run(Eureka_client7001_APP.class,args);
    }
}
