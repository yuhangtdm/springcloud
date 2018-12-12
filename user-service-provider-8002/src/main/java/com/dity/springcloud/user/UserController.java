package com.dity.springcloud.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:yuhang
 * @Date:2018/12/11
 */
@Controller
public class UserController {

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/provider")
    @ResponseBody
    public String provider(){
        System.out.println("我是提供者2");
        return "hello i am provider2";
    }
}
