package com.itheima.assignment;

public class Lesson15 {
    public static void main(String[] args) {
        //第15题：设计一个接口circleInterface
        System.out.println("第15题：设计一个接口circleInterface=========================");
        circleClass1 c1=new circleClass1(3.5);
        c1.circleArea();
        c1.show();

        circleClass1 c2=new circleClass1(5.0);
        c2.circleArea();
        c2.show();
    }
}
class circleClass1 implements circleInterface{
    double r;
    double s;

    public circleClass1(double r) {
        this.r = r;
    }

    @Override
    public void circleArea() {
        s = PI*r*r;
    }
    void show(){
        System.out.println("半径："+r+"的圆面积："+s);
    }
}
interface circleInterface{
    double PI=3.14;
    void circleArea();111
}