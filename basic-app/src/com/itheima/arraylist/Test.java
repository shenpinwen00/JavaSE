package com.itheima.arraylist;

import com.itheima.javabeanmovie.Movie;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*ArrayList list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);*/
        Movie m1 = new Movie("肖申克的就是",9.7,"罗宾斯");
        Movie m2= new Movie("霸王别姬",7.7,"张国荣");
        Movie m3 = new Movie("阿甘正传",8.5,"阿甘");
        ArrayList<Movie> list =new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            Movie m=list.get(i);
            System.out.println(m.getName());
            System.out.println(m.getScore());
            System.out.println(m.getActor());

        }

    }
}
