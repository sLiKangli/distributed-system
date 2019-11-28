package com.yqn.user.user01.fallback;

import com.yqn.user.user01.common.ResponseMsg;
import com.yqn.user.user01.domain.Order;
import com.yqn.user.user01.producer.UserServiceProducer;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName UserServiceProducerFallbackFactory
 * Description  hystrix 方法降级异常捕获工厂
 * Date 2019/11/19 15:57
 * Author   likangli
 */
@Component
public class UserServiceProducerFallbackFactory implements FallbackFactory<UserServiceProducer> {
    @Override
    public UserServiceProducer create(Throwable cause) {

        return new UserServiceProducer() {
            @Override
            public Object getUserByOrder(Order order) {
                // 自定义出现异常的处理方式
                ResponseMsg responseMsg = new ResponseMsg();
                responseMsg.setMsg(cause.getMessage()); // 异常原因
                return responseMsg;
            }
        };
    }
}
