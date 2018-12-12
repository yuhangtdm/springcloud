package com.dity.springcloud.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:yuhang
 * @Date:2018/12/12
 */
@Controller
public class OrderController {
    @Autowired
    private UserClient userClient;

    @RequestMapping("consumer")
    @ResponseBody
    public String consumer(){
        return "收到:"+userClient.provider();
    }

}
