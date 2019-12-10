package com.yqn.user.user01.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * ClassName Product
 * Description TODO
 * Date 2019/12/10 9:57
 * Author   likangli
 */
@Data
@TableName("product")
public class Product {

    @TableId
    private Integer id;

    private String name;

    private Integer stock;
}
