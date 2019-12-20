package com.microservice;

import com.microservice.cfgbeans.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author luxin
 * @create 2019-12-12 15:34
 */
@SpringBootApplication
@EnableEurekaClient
//自定义Ribbon的注解@RibbonClient(name="MICROSERVICE-DEPT",configuration = MySelfRule.class)
@RibbonClient(name="MICROSERVICE-DEPT",configuration = MySelfRule.class)
public class Deptconsumer80_APP {
    public static void main(String[] args) {
        SpringApplication.run(Deptconsumer80_APP.class,args);
    }
}
