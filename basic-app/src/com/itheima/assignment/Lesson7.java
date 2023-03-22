package com.itheima.assignment;

public class Lesson7 {
    public static void main(String[] args) {
        System.out.println("第7题：设计一个学生类Student==============");
        Undergraduate u1=new Undergraduate("张三",20,"学士","通信工程");
        Undergraduate u2=new Undergraduate("李四",21,"学士","电子工程");
        Graduate g1=new Graduate("王五",25,"硕士","软件工程");
        Graduate g2=new Graduate("刘六",36,"博士","人机工程");
        u1.show();
        u2.show();
        g1.show();
        g2.show();
    }
}
//class Student{
//    private String name;
//    private int age;
//    private String degree;
//
//    public Student(String name, int age, String degree) {
//        this.name = name;
//        this.age = age;
//        this.degree = degree;
//    }
//    public void show(){
//        System.out.print("姓名："+this.name+"\t 年龄："+this.age+"\t 学位："+this.degree);
//    }
//}
////本科生子类
//class Undergraduate extends Student{
//    private String specialty;
//    public Undergraduate(String name, int age, String degree,String specialty) {
//        super(name, age, degree);
//        this.specialty = specialty;
//    }
//    public void show(){
//        super.show();
//        System.out.println("\t专业："+specialty);
//    }
//}
//
////研究生类子类
//class Graduate extends Student{
//    private String direction;
//    Graduate(String name,int age,String degree,String direction){
//        super(name,age,degree);
//        this.direction=direction;
//    }
//    public void show(){
//        super.show();
//        System.out.println("\t研究方向："+direction);
//    }
//}