package com.itheima.javabean;

public class Test {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setName("张三");
        u1.setHeight(180);
        u1.setSalary(2000);

        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());
    }
}
