package com.yqn.user.user01.controller;

import com.yqn.user.user01.common.ResponseMsg;
import com.yqn.user.user01.service.ProductService;
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
public class TxProductController {


    @Resource
    private ProductService productService;

    @RequestMapping("/reduceStock")
    public ResponseMsg reduceStock(Integer id){

        return productService.reduceStock(id);
    }
}
