package com.dity.springcloud.order;

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
    public String consumer(){
        return restTemplate.getForEntity("http://user-service-provider/provider",String.class).getBody();
    }

}
