package com.yqn.user.user01.domain;

/**
 * ClassName User
 * Description TODO
 * Date 2019/11/19 10:13
 * Author   likangli
 */
public class User {

    private String name;

    private String age;

    public String getName() {
        return name;
    }

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
