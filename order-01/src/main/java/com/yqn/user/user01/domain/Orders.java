package com.yqn.user.user01.domain;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.util.Date;

/**
 * ClassName Orders
 * Description TODO
 * Date 2019/12/10 9:55
 * Author   likangli
 */
@Data
@TableName("orders")
public class Orders {

    private Integer p_id;

    private String order_num;

    private Date addtime;
}
