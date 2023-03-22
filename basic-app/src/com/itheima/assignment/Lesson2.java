package com.itheima.assignment;
class point{
    double x;
    double y;
    public  point(){
    }
    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class circleClass{
    private static double PI=3.14;
    point p1,p2;
    public  circleClass(){
    }
    public circleClass(point p1, point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    void area(){
        System.out.println("圆的面积="
                +(PI*(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2))));
    }
}
public class Lesson2 {
    public static void main(String[] args) {
        point p10,p11,p20,p21;
        circleClass circle1,circle2;

        p10 = new point(0,0);
        p11= new point(8.5,9);

        p20= new point(2,3.5);
        p21= new point(9,6);

        circle1=new circleClass(p10,p11);
        circle2=new circleClass(p20,p21);
        circle1.area();
    }
}
