package com.itheima.constructor;

public class Car {
    String name;
    double price;

    public Car(){
        System.out.println("无参数构造");
    }
    public Car(String n,double p){
        System.out.println("有参数被构造了");
        name=n;
        price = p;
    }
}
