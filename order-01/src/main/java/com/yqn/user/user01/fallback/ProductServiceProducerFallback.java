package com.yqn.user.user01.fallback;

import com.yqn.user.user01.common.ResponseMsg;
import com.yqn.user.user01.domain.Order;
import com.yqn.user.user01.producer.ProductServiceProducer;
import com.yqn.user.user01.producer.UserServiceProducer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ClassName UserServiceProducerFallack
 * Description 用户服务生产者容错处理
 * Date 2019/11/19 14:32
 * Author   likangli
 */
@Component
public class ProductServiceProducerFallback implements ProductServiceProducer {


    @Override
    public ResponseMsg reduceStock(Integer id) {
        ResponseMsg responseMsg = new ResponseMsg();
        responseMsg.setMsg("业务异常，降级处理");
        return responseMsg;
    }
}
