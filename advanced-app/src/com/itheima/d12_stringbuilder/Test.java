package com.itheima.d12_stringbuilder;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //支持链式编程
        sb.append("a");
        sb.append("b");
        sb.append(123);
        sb.append(false);
        sb.reverse().append(" morning");
        String s = sb.toString();
        System.out.println(s);

    }
}
