package com.dity.springcloud.order;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author:yuhang
 * @Date:2018/12/12
 */
@FeignClient(value ="user-service-provider",fallback = FallBackClient.class)
public interface UserClient {

    @RequestMapping("/provider")
     String provider();
}
