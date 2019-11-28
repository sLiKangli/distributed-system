package com.yqn.user.user01.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.yqn.user.user01.common.ResponseMsg;
import com.yqn.user.user01.domain.User;
import com.yqn.user.user01.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * ClassName TestUserController
 * Description TODO
 * Date 2019/11/21 10:13
 * Author   likangli
 */
@RestController
public class TestUserController {

    @Resource
    private UserService userService;

    @RequestMapping("/post")
    public ResponseMsg post(User user){

        userService.insert(user);
        return new ResponseMsg();
    }

    @RequestMapping("/getList")
    public ResponseMsg getList(){

        List<User> userList = userService.selectList(new EntityWrapper<>());
        ResponseMsg msg = new ResponseMsg();
        msg.setSuccessObject(userList);
        return msg;
    }


}
