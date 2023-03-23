package com.itheima.d13_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class array {
    public static void main(String[] args) {
        int[] arr = {10,2,55,23,24,100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //二分查找必须要在有序数列
        int index = Arrays.binarySearch(arr,55);
        System.out.println(index);
        int index1 = Arrays.binarySearch(arr,555);
        System.out.println(index1);

        Integer[] arr1 = {10,2,55,23,24,100};
        Arrays.sort(arr1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr1));
    }
}
