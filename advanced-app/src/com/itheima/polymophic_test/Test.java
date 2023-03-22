package com.itheima.polymophic_test;

public class Test {
    public static void main(String[] args) {
        Computer c = new Computer("MacBook");
        c.start();

        USB k = new Keyboard("机械键盘");
        c.installUSB(k);

    }

}
