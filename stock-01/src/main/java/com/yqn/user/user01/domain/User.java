package com.yqn.user.user01.domain;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.util.Date;

/**
 * ClassName User
 * Description TODO
 * Date 2019/11/19 10:13
 * Author   likangli
 */
@TableName("user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Date addtime;

    public User() {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public void setName(String name) {
        this.name = name;
    }



}
