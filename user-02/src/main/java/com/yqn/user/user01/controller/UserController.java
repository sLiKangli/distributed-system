package com.yqn.user.user01.controller;

import com.yqn.user.user01.domain.Order;
import com.yqn.user.user01.domain.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName UserController
 * Description TODO
 * Date 2019/11/18 15:23
 * Author   likangli
 */
@RestController
public class UserController {

    @RequestMapping("/getInfo")
    public User getUserInfo(){

        return new User("user-2","18");
    }

    @RequestMapping("/getUserByOrder")
    public User getUserByOrder(@RequestBody Order order){

        System.out.println(order);
        User user = new User("user-2", "18");
        System.out.println(user);
        return user;
    }
}
