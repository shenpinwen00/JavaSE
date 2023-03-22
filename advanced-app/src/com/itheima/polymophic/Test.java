package com.itheima.polymophic;

public class Test {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.run();//方法调用：编译看左边，运行看右边
        System.out.println(a1.name);//变量调用：编译看左边，运行看左边

        Animal a2 = new Tortoise();
        a2.run();//编译看左边，运行看右边

        go(a1);

    }
    public static void go(Animal a2){
        if(a2 instanceof Tortoise){
            Tortoise t = (Tortoise) a2;
            t.layeggs();
        }else{
            Dog d = (Dog) a2;
            d.lookdoor();
        }
    }
}
