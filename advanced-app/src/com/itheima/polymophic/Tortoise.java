package com.itheima.polymophic;

public class Tortoise extends Animal{
    public String name = "子类乌龟";

    @Override
    public void run() {
        System.out.println("乌龟跑步");
    }
    public void layeggs(){
        System.out.println("乌龟在下蛋");
    }
}
