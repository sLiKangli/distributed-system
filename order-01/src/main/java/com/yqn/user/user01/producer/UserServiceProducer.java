package com.yqn.user.user01.producer;

import com.yqn.user.user01.domain.Order;
import com.yqn.user.user01.fallback.UserServiceProducerFallback;
import com.yqn.user.user01.fallback.UserServiceProducerFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName UserServiceProducer
 * Description 用户服务提供者
 * Date 2019/11/19 10:38
 * Author   likangli
 */

/**
 * value : 提供服务的应用在Eureka的服务名称
 * fallback : 整合hystrix, 该服务提供者出错时的容错方案
 * fallbackFactory：方法降级捕获工厂，和fallback同时出现此设置无效，可以得到方法降级原因
 *
 */
@FeignClient(value = "USER",  fallback = UserServiceProducerFallback.class, fallbackFactory = UserServiceProducerFallbackFactory.class)
public interface UserServiceProducer {

    /**
     * 服务提供者的接口，接参要用注解：@RequestBody
     */
    @RequestMapping("/getUserByOrder")
    Object getUserByOrder(Order order);
}
