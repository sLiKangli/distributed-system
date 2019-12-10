package com.yqn.user.user01.controller;

import com.yqn.user.user01.domain.Order;
import com.yqn.user.user01.domain.User;
import com.yqn.user.user01.producer.UserServiceProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * ClassName UserController
 * Description TODO
 * Date 2019/11/18 15:23
 * Author   likangli
 */
@RestController
public class OrderController {

    @Resource
    private RestTemplate restTemplate;
    @Resource
    private UserServiceProducer userServiceProducer;

    @RequestMapping("/getOrder")
    public String getOrder(){

        return "getOrder1";
    }


    @RequestMapping("/getUserInfo")
    public Object getUserInfo(){

        return restTemplate.getForObject("http://USER/getInfo", Object.class);
    }

    @RequestMapping("/getUser")
    public Object getUser(Order order){
        Object obj = userServiceProducer.getUserByOrder(order);
        System.out.println(obj);
        return obj;
    }


}
