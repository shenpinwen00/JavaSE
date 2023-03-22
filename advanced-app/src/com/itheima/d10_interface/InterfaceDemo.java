package com.itheima.d10_interface;

/**
 * 声明一个接口：体现一种规范，规范一定是公开的
 */
public interface InterfaceDemo {
    //接口中只能有抽象方法和常量

    //1。常量
    //public static final String SCHOOL_NAME  = "工商";
    String SCHOOL_NAME  = "工商";

    //2。抽象方法
    void run();
    //public abstract void run();

    void eat();
    //public abstract void eat();
}
