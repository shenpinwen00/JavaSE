package com.itheima.assignment;

public class Lesson9 {
    public static void main(String[] args) {
        //第9题：设计一个员工类、教师类、科学家类,继承
        System.out.println("第8题：设计一个电话类Phone,继承====================");
        worker w=new worker("张三\t","工人\t",4000);
        worker s=new worker("李四\t","服务员\t",3500);
        teacher t=new teacher("王五\t","教师\t",5000,100);
        scientist k=new scientist("刘六\t","科学家\t",7000,20000);

        w.stat();
        s.stat();
        t.stat();
        k.stat();
    }
}
class worker{
    String name;
    String job;
    double salary;

    public worker(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    public void stat(){
        System.out.println("姓名："+name+"\t职业："+job+"\t月薪："+salary+"\t年收入："+(salary*12.0));
    }
}
class teacher extends worker{
    double allowance;

    public teacher(String name, String job, double salary, double allowance) {
        super(name, job, salary);
        this.allowance = allowance;
    }
    public void stat(){
        System.out.println("姓名："+name+"\t职业："+job+"\t月薪："+salary+"\t年收入："+(salary*12.0));
    }
}
//科学家类
class scientist extends worker{
    double bonus;//激励奖
    scientist(String name,String job,double salary,double bonus){
        super(name,job,salary);
        this.bonus=bonus;
    }
    public void stat(){
        System.out.println("姓名："+name+"\t职业："+job+"\t月薪："+salary
                +"\t激励奖："+bonus
                +"\t年收入： "+(salary*12.0+bonus*4.0));
    }
}
