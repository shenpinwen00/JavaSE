package com.itheima.assignment;
class point2{
    double x,y;
    public static int number =0;
    //构造方法
    point2(){

    }
    point2(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void getInstance(point2 a,point2 b){
        System.out.println("两点的距离："+Math.sqrt(Math.pow(a.x-b.x,2)+Math.pow(a.y-b.y,2)));
    }
    public void getJizuobiao(){
        point2 p = new point2();
        p.x = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
        p.y = Math.atan(1.0*this.y/this.x)/Math.PI*180;
        System.out.println("极坐标的位置："+p.x+","+p.y);
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
public class Lesson4 {
    public static void main(String[] args) {
        point2 p1 =new point2(3,4);
        point2.number++;
        point2 p2 =new point2(0,0);
        point2.number++;
        System.out.println(p1.getX());
        System.out.println(p1.getY());
        System.out.println(point2.number);
        p1.getInstance(p1, p2);
        p1.getJizuobiao();

    }
}
