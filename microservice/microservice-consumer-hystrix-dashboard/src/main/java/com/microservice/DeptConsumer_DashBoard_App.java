package com.microservice;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

/**
 * @author luxin
 * @create 2019-12-17 16:09
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_DashBoard_App.class,args);
    }

}
