package com.itheima.d6_abstract_test;

public class GoldCard extends Card{

    @Override
    public void pay(double money) {
        System.out.println("您当前的消费是："+money);
        System.out.println("您卡片当前的余额是："+getMoney());
        double rs = money*0.8;
        System.out.println("您实际支付："+rs);
        setMoney(getMoney()-rs);
        System.out.println("消费后您卡片的余额是："+getMoney());
    }
}