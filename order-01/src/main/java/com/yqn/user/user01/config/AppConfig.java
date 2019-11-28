package com.yqn.user.user01.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * ClassName AppConfig
 * Description TODO
 * Date 2019/11/19 9:58
 * Author   likangli
 */
@Configuration
public class AppConfig {

    /**
     * 快速请求模板，可以通过服务名称请求注册到Eureka中的服务
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

    /**
     * ribbon 的负债均衡策略实现
     * 下面几个类是ribbon提供的7中默认策略
     */
    @Bean
    public IRule getRule(){

        return new RoundRobinRule();  // 轮询
        //return new RandomRule();   // 随机
//        new AvailabilityFilteringRule();  // 过滤掉不可用的，从可用的中轮询
//        new WeightedResponseTimeRule();   // 根据响应时间计算权重，权重大的分配更多的请求，一开始权重不清楚先按照轮询规则
//        new RetryRule();  // 先按照轮询策略，获取失败则重试，在失败则放弃
//        new BestAvailableRule(); // 先过滤掉不可用，然后选择并发量最小的提供服务
//        new ZoneAvoidanceRule(); // 根据服务器所在区域的性能和可用性选择服务器
    }
}
