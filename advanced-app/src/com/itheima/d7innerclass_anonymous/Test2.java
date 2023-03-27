package com.itheima.d7innerclass_anonymous;

/**
 * 掌握匿名内部类的使用形式
 */
public class Test2 {
    public static void main(String[] args) {
        //Student s = new Student();
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("student  swimming happy");
            }
        };
        go(s);
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("teacher  swimming happy");
            }
        };
        go(s1);

    }
    public static void go(Swimming s){
        System.out.println("start swimming!");
        s.swim();
        System.out.println("end swimming!");
    }
}
//class Student implements Swimming{
//
//    @Override
//    public void swim() {
//        System.out.println("student  swimming happy");
//    }
//}
interface Swimming{
    void swim();
}