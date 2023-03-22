package com.itheima.assignment;
class point1{
    double x,y;
    //方法重构
    point1(double x,double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}

class rectangleClass{
    point1 p1,p2;
    rectangleClass(point1 p1,point1 p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public point1 getP1() {
        return p1;
    }

    public void setP1(point1 p1) {
        this.p1 = p1;
    }

    public point1 getP2() {
        return p2;
    }

    public void setP2(point1 p2) {
        this.p2 = p2;
    }

    void area(){
        System.out.println("矩形的面积="
                +(Math.abs((p1.x-p2.x)*(p1.y-p2.y))));
    }
}
public class Lesson3 {
    public static void main(String[] args) {
        point1 p10=new point1(0,0);
        point1 p11=new point1(8.5,9);

        rectangleClass result = new rectangleClass(p10,p11);
    }


}
