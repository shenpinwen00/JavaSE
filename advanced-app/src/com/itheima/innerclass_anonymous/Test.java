package com.itheima.innerclass_anonymous;

/**
 * 匿名内部类方便创建子类对象。
 * 匿名内部类的对象类型相当于是当前new的那个的类型的子类型
 */
public class Test {
    public static void main(String[] args) {
        Animal a =new Animal() {
            @Override
            public void run() {
                System.out.println("老虎跑的快----");
            }
        };
        a.run();
    }
}
//class Tiger extends Animal{
//
//    @Override
//    public void run() {
//        System.out.println("老虎跑的快----");
//
//    }
//}
abstract class Animal{
    public abstract void run();
}
