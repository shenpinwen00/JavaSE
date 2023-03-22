package com.itheima;

import com.sun.source.tree.Tree;

import javax.swing.plaf.basic.BasicBorders;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class TypeDemo1 {
    public static String yanzhengma(){
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random r = new Random();
        String str = "";
        for (int i = 0; i < 5 ; i++) {
            int ind = r.nextInt(data.length());
            str = str+data.charAt(ind);
        }
        return str;
    }
    public static void login(){
        String okusername = "admin";
        String okpassword = "123456";
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String logname = sc.next();
            System.out.println("请输入登陆密码：");
            String logpassword = sc.next();

            if(okusername.equals(logname)){
                if(okpassword.equals(logpassword)){
                    System.out.println("登陆成功～！");
                    break;
                }
                else{
                    System.out.println("密码错误～！，还剩余"+(2-i)+"次机会");
                }
            }
            else{
                System.out.println("登陆名错误"+(2-i)+"次机会");
            }

        }

    }
    public static void main(String[] args) {
        login();
        String s = yanzhengma();
        System.out.println(s);

    }
}
