package com.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author luxin
 * @create 2019-12-18 14:13
 */
@SpringBootApplication
@EnableZuulProxy
public class Zuul_9528_StartSpringCloudApp {
    public static void main(String[] args) {
        SpringApplication.run(Zuul_9528_StartSpringCloudApp.class,args);
    }
}
