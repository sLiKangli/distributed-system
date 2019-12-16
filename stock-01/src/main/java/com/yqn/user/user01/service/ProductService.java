package com.yqn.user.user01.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.yqn.user.user01.common.ResponseMsg;
import com.yqn.user.user01.domain.Product;
import com.yqn.user.user01.mapper.ProductMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Random;

/**
 * ClassName UserService
 * Description TODO
 * Date 2019/11/21 10:13
 * Author   likangli
 */
@Service
public class ProductService extends ServiceImpl<ProductMapper, Product> {

    @Resource
    ProductMapper productMapper;

    // @LcnTransaction
    @Transactional(rollbackFor = Exception.class)
    public ResponseMsg reduceStock(Integer id){

        Product product = productMapper.selectById(id);
        product.setStock(product.getStock() - 1);
        productMapper.updateById(product);

        Random random = new Random();
        if(random.nextInt(100) < 50){
            System.out.println("库存不足");
            throw new RuntimeException("库存不足");
        }

        return new ResponseMsg().setSuccessObject(product);
    }
}
