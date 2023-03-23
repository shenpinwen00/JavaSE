package com.itheima.d14_lambda;

public class LambdaDemo {
    //简化匿名内部类的代码写法
    public static void main(String[] args) {
        Animal a = () -> {
                System.out.println("乌龟跑的很慢");
        };
        a.run();
    }
}
//abstract class Animal{
//    public abstract void run();
//}
interface Animal{
    void run();
}