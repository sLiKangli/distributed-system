package com.yqn.user.user01.controller;

import com.yqn.user.user01.common.ResponseMsg;
import com.yqn.user.user01.service.OrdersService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * ClassName TxOrderController
 * Description 测试分布式事务
 * Date 2019/12/10 10:05
 * Author   likangli
 */
@RestController
public class TxOrderController {

    @Resource
    private OrdersService ordersService;

    @RequestMapping("/buyProduct")
    public ResponseMsg buyProduct(){


        return ordersService.buyProduct();

    }
}
