package com.itheima.d15_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Consumer;

public class CollectionDemo {
    public static void main(String[] args) {
        //有序 重复 可索引
        Collection list = new ArrayList();
        list.add("java");
        list.add("Java");
        list.add("JAva");
        list.add("JAVa");
        list.add(123);
        list.add(23);
        list.add(false);
        System.out.println(list);

        Iterator  it = list.iterator();
        while(it.hasNext()){
            Object sle = it.next();
            System.out.println(sle);
        }
        System.out.println("-----增强for--------");
        for(Object sle:list){
            System.out.println(sle);
        }
        System.out.println("-----lambda方法--------");
        list.forEach(new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        });
        //无序 不重复 无索引
//        Collection list1 = new HashSet();
//        list1.add("java");
//        list1.add("Java");
//        list1.add("JAva");
//        list1.add("JAVa");
//        list1.add(123);
//        list1.add(23);
//        list1.add(false);
//        System.out.println(list1);


    }
}
