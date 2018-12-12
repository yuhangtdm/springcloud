package com.dity.springcloud.order;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 * @author:yuhang
 * @Date:2018/12/11
 */
@Controller
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 消费者 调用提供者的服务
     * @return
     */
    @RequestMapping("consumer")
    @ResponseBody
    @HystrixCommand(fallbackMethod = "handlerMethod")
    public String consumer(){
        return restTemplate.getForEntity("http://USER-SERVICE-PROVIDER/provider",String.class).getBody();
    }

    public String handlerMethod(){
        return "该服务发生故障 联系相关人员解决";
    }
}
