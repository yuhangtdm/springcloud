package com.dity.springcloud.order;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author:yuhang
 * @Date:2018/12/11
 */
@Configuration
public class RestConfig {

    // @LoadBalanced 负载均衡机制
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
