package com.itheima.assignment;

public class Chapter4_1 {
    public static void main(String[] args) {
        String s = "asfasfnabaasdfnbasdnbasnbasdnbadfasdf";
        String z = "nba";
        int count = 0;
        int start = 0;
        while (s.indexOf(z, start)>=0 &&start<s.length()){
            count++;
            start = s.indexOf(z, start)+z.length();
        }
        System.out.println(count);
    }
}
