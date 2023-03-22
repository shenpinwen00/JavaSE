package com.itheima.assignment;

public class Lesson13 {
    public static void main(String[] args) {
        System.out.println("第13题：抽象类Student=========================");
        Undergraduate ug1=new Undergraduate("张三",20,"本科","计算机科学");
        Undergraduate ug2=new Undergraduate("李四",21,"本科","物联网");
        Graduate g1=new Graduate("王五",25,"硕士","软件工程");
        Graduate g2=new Graduate("刘六",36,"博士","通信工程");

        ug1.show();
        ug2.show();
        g1.show();
        g2.show();
    }
}
//抽象类
abstract class Student{
    String name;
    int age;
    String degree;

    Student(String name,int age,String degree){
        this.name=name;
        this.age=age;
        this.degree=degree;
    }
    abstract void show();
}
//本科类
class Undergraduate extends Student{
    String specialty;

    Undergraduate(String name,int age,String degree,String specialty){
        super(name,age,degree);
        this.specialty=specialty;
    }
    void show(){
        System.out.println(name+"\t"+age+"\t"+degree+"\t"+specialty);
    }

}

class Graduate extends Student{
    String direction;

    Graduate(String name,int age,String degree,String direction){
        super(name,age,degree);
        this.direction=direction;
    }
    void show(){
        System.out.println(name+"\t"+age+"\t"+degree+"\t"+direction);
    }
}