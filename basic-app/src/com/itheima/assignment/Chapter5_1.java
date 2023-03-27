package com.itheima.assignment;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Chapter5_1 {
    public static void main(String[] args) {
        LinkedList<String> llist=new LinkedList<String>();
        Scanner sc=new Scanner(System.in);
        String c;
        int flag=0;
        while(true)
        {
            System.out.println("-------------------欢迎来到点歌系统----------------------------------------");
            System.out.println("A:添加歌曲到列表");
            System.out.println("B:将歌曲置顶");
            System.out.println("C:将歌曲前移一位");
            System.out.println("D:退出");
            if(flag==0)
                addMusicList(llist);
            System.out.println("请输入要执行的序号【A-D】:");
            c=sc.next();
            switch(c)
            {
                case "A":{flag=1;addMusic(llist);print(llist);}break;
                case "B":{flag=1;go_top(llist);print(llist);}break;
                case "C":{flag=1;go_ahead(llist);print(llist);}break;
                case "D":{System.out.println("----------------------退出-------------------------------------------");
                    System.out.println("您已退出系统");
                    sc.close();
                    System.exit(0);}
            }
        }
    }

    private static void go_ahead(LinkedList<String> llist) {
        System.out.println("请输入需要向前移动的歌曲序号:");
        int num = new Scanner(System.in).nextInt();
        String name  = llist.get(num);
        llist.remove(num);
        llist.add(num-1,name);
    }

    private static void go_top(LinkedList<String> llist) {
        System.out.println("请输入需要置顶的歌曲序号:");
        int num = new Scanner(System.in).nextInt();
        String name  = llist.get(num);
        llist.addFirst(name);
        llist.remove(num+1);
        System.out.println("已将歌曲"+name+"置顶");
    }

    private static void print(LinkedList<String> llist) {
        System.out.println("当前歌曲列表:");
        Iterator<String> it = llist.iterator();
        int count=0;
        while(it.hasNext()){
            System.out.println((count++)+":"+it.next());
        }
    }

    private static void addMusic(LinkedList<String> llist) {
        System.out.println("请输入要添加的歌曲名:");
        String name=new Scanner(System.in).nextLine();
        llist.add(name);
        System.out.println("已添加歌曲:"+name);
    }

    private static void addMusicList(LinkedList<String> llist)
    {
        System.out.println("初始歌曲集:");
        llist.add("关不上的窗——周传雄");
        llist.add("李白——李荣浩");
        llist.add("安和桥——宋东野");
        llist.add("当你老了——赵照");
        llist.add("父亲写的散文诗——李健");
        llist.add("再度重相逢——孙露");
        llist.add("男孩——梁博");
        llist.add("成都——赵雷");
        Iterator<String> it=llist.iterator();
        int count=0;
        while(it.hasNext())
        {
            System.out.println((count++)+":"+it.next());
        }

    }
}

