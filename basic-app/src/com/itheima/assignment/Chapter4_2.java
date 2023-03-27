package com.itheima.assignment;

import java.util.Arrays;

public class Chapter4_2 {
    public static void main(String[] args) {
        String s = "23 10 -8 0 3 7 108";
        String[] strings = s.split(" ");
        int[] a = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            a[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
