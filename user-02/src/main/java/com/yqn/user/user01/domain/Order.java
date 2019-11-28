package com.yqn.user.user01.domain;

/**
 * ClassName Order
 * Description TODO
 * Date 2019/11/19 10:40
 * Author   likangli
 */
public class Order {

    private String orderNum;

    private Float cash;

    public Order(String orderNum, Float cash) {
        this.orderNum = orderNum;
        this.cash = cash;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public Float getCash() {
        return cash;
    }

    public void setCash(Float cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNum='" + orderNum + '\'' +
                ", cash=" + cash +
                '}';
    }
}
