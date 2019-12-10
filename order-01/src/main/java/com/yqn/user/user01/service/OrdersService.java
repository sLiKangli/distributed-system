package com.yqn.user.user01.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.yqn.user.user01.common.ResponseMsg;
import com.yqn.user.user01.domain.Orders;
import com.yqn.user.user01.domain.Product;
import com.yqn.user.user01.mapper.OrdersMapper;
import com.yqn.user.user01.mapper.ProductMapper;
import com.yqn.user.user01.producer.ProductServiceProducer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Random;

/**
 * ClassName UserService
 * Description TODO
 * Date 2019/11/21 10:13
 * Author   likangli
 */
@Service
public class OrdersService extends ServiceImpl<OrdersMapper, Orders> {

    @Resource
    OrdersMapper ordersMapper;
    @Resource
    private ProductServiceProducer productServiceProducer;

    @LcnTransaction //分布式事务注解
    @Transactional(rollbackFor = Exception.class)
    public ResponseMsg buyProduct() {

        Orders orders = new Orders();
        orders.setAddtime(new Date());
        orders.setP_id(1);
        orders.setOrder_num(new Date().getTime()+"");
        ordersMapper.insert(orders);

        Random random = new Random();
        if(random.nextInt(100) < 50){
            System.out.println("下单错误");
            throw new RuntimeException("下单错误");
        }

        return productServiceProducer.reduceStock(1);
    }
}
