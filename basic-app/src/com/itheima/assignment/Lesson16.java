package com.itheima.assignment;

public class Lesson16 {
    public static void main(String[] args) {
        //第16题：接口Shape
        System.out.println("第16题：接口Shape=========================");
        Square s=new Square(2);
        s.show();

        circle2 c3=new circle2(2);
        c3.show();
    }
}

interface Shape{
    double area(double r);
}
class Square implements Shape{
    double r;

    public Square(double r) {
        this.r = r;
    }

    @Override
    public double area(double r) {
        return r*r;
    }
    void show(){
        System.out.println("边长："+r+"的正方形面积："+area(r));
    }
}

class circle2 implements Shape {
    double r;
    final static double PI = 3.14;

    public circle2(double r) {
        this.r = r;
    }

    public double area(double r) {
        return PI * r * r;
    }

    void show() {
        System.out.println("半径：" + r + "的圆面积：" + area(r));
    }
}