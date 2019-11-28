package com.yqn.user.user01.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yqn.user.user01.domain.User;
import com.yqn.user.user01.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * ClassName UserService
 * Description TODO
 * Date 2019/11/21 10:13
 * Author   likangli
 */
@Service
public class UserService extends ServiceImpl<UserMapper, User> {
}
