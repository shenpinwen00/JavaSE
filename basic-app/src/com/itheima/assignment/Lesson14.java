package com.itheima.assignment;

public class Lesson14 {
    public static void main(String[] args) {
        //第14题：抽象类Graphics
        System.out.println("第14题：抽象类Graphics=========================");
        rectange r=new rectange("长方形",3,2);
        r.parameter();
        r.area();

        Circle c=new Circle("圆形","红色",4);
        c.parameter();
        c.area();
    }
}
//14题

abstract class Graphics{
    String name;
    Graphics(String name){
        this.name=name;
    }
    abstract void parameter();
    abstract void area();
}

class rectange extends Graphics{
    int height,weigth;
    rectange(String name,int height,int weigth){
        super(name);
        this.height=height;
        this.weigth=weigth;
    }
    void parameter(){
        System.out.println(name+"\t长："+height+",宽："+weigth);
    }

    void area(){
        System.out.println("面积："+(height*weigth));
    }

}

class Circle extends Graphics{
    String color;
    double r;
    final static double PI=3.14;

    Circle(String name,String color,double r){
        super(name);
        this.color=color;
        this.r=r;
    }

    void parameter(){
        System.out.println(name+"\t颜色："+color+",半径："+r);
    }

    void area(){
        System.out.println("面积："+(PI*r*r));
    }
}
