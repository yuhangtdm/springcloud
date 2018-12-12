package com.dity.springcloud.order;

import org.springframework.stereotype.Component;

/**
 * @author:yuhang
 * @Date:2018/12/12
 */
@Component
public class FallBackClient implements UserClient {
    @Override
    public String provider() {
        return "出错啦..寻找管理员";
    }
}
