package com.itheima.polymophic;

public class Dog extends Animal {
    public String name = "子类狗";

    @Override
    public void run() {
        System.out.println("狗跑步");
    }

    public void lookdoor() {
        System.out.println("狗在看门");
    }
}
