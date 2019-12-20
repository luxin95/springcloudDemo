package com.microservice.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author luxin
 * @create 2019-12-12 15:37
 */
@Configuration
public class ConfigBean {

//    @RestTemplate
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }


}
