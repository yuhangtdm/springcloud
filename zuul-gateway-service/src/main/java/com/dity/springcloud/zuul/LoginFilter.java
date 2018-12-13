package com.dity.springcloud.zuul;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author:yuhang
 * @Date:2018/12/13
 */
@Component
public class LoginFilter extends ZuulFilter {

    // //枚举值：pre, routing, post, error
    /**
     * filterType：表示过滤类型。
     * pre表示路由之前， routing表示路由当中， post表示路由之后， error表示路由发生错误。
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * filterOrder： 执行时序， 值是0,1,2....N等自然数。 0的优先级最高，即最先执行。
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * shouldFilter： 是否需要执行run函数。
     * 即该过滤器是否生效
     * false 不生效
     * true 生效
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体过滤的方法
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)){
            // 不转发
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;
    }
}
