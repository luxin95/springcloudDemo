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
    @LoadBalanced //打开Ribbon的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

//    改变Ribbon负载均衡算法
    @Bean
    public IRule myRule(){
        //用我们选择的随机算法
        return new RandomRule();
    }
}
