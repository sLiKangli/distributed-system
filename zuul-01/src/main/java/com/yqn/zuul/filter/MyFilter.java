package com.yqn.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName MyFilter
 * Description Zuul 提供的过滤器扩展
 * Date 2019/11/19 17:59
 * Author   likangli
 */
public class MyFilter extends ZuulFilter {

    /**
     *  zuul中定义了4种标准过滤器类型，这 些过滤器类型对应于请求的典型生命周期。
     *  PRE：这种过滤器在请求被路由之前调用。可利用这种过滤器实现身份 验证、在 集群中选择请求的微服务、记录调试信息等。
     *  ROUTING：这种过滤器将请求路由到微服务。这种过滤器 用于构建发送给微服务的请求，并使用 Apache HttpCIient或 Netﬁlx Ribbon请求微服务
     *  POST: 这种过滤器在路由到微服务以后执行。这种过滤器可用来为响应添加标准 的 HTTP Header、收集统计信息和指标、将响应从微服务 发送给客户端等。
     *  ERROR：在其他阶段发生错误时执行该过滤器。
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     *  返回一个 int值来指定过滤器的执行顺序，不同的过滤器允许返回相同的数
     */
    @Override
    public int filterOrder() {
        return 1;
    }

    /**
     *：返回一个 boolean值来判断该过滤器是否要执行， true表示执行， false表示不执行。
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑。
     */
    @Override
    public Object run() throws ZuulException {
      RequestContext currentContext = RequestContext.getCurrentContext();
      HttpServletRequest request = currentContext.getRequest();
      String remoteAddr = request.getRemoteAddr();
      System.out.println("访问者IP："+remoteAddr+"访问地址:"+request.getRequestURI());

      // currentContext.setSendZuulResponse(false); 停止向下转发，仅pre过滤器支持
      return null;
    }
}
