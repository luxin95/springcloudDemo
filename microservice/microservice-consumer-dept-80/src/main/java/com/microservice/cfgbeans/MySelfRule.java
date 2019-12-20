package com.microservice.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luxin
 * @create 2019-12-16 14:22
 */
@Configuration
public class MySelfRule
{
    @Bean
    public IRule myRule()
    {
//        return new RandomRule();//Ribbon默认是轮询，我自定义为随机
        return new MyRandomRule();
    }
}
