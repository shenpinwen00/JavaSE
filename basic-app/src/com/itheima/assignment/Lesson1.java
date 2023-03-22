package com.itheima.assignment;
class Complex {
    int realPart;
    int imagPart;

    public Complex() {
    }
    public Complex(int realPart, int imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }
    public void add(Complex c1,Complex c2){
        this.realPart = c1.realPart + c2.realPart;
        this.imagPart = c1.imagPart + c2.imagPart;
    }
    public void sub(Complex c1,Complex c2){
        this.realPart = c1.realPart - c2.realPart;
        this.imagPart = c1.imagPart - c2.imagPart;
    }
    void printResult()
    {
        if(realPart==0 && imagPart==0)
            System.out.println("运算结果= 0");
        else if(realPart==0)
            System.out.println("运算结果= "+imagPart+"i");
        else if(imagPart==0)
            System.out.println("运算结果= "+realPart);
        else if(imagPart<0)
            System.out.println("运算结果= "+realPart+imagPart+"i");
        else
            System.out.println("运算结果= "+realPart+"+"+imagPart+"i");
    }
}
public class Lesson1 {
    public static void main(String[] args) {
        Complex c = new Complex();
        Complex c1 = new Complex(18,2);
        Complex c2 = new Complex(19,-13);
        c.add(c1,c2);
        c.printResult();
        c.sub(c1,c2);
        c.printResult();
    }
}
