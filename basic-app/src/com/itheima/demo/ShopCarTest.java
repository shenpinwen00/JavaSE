package com.itheima.demo;

import java.util.Scanner;

public class ShopCarTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[100];
        while (true) {
            System.out.println("请您选择如下命令进行操作：");
            System.out.println("添加商品到购物车：add");
            System.out.println("查询商品到购物车：query");
            System.out.println("修改商品购买数量：update");
            System.out.println("结算购买商品的金额：pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入命令：");
            String command = sc.next();
            switch (command){
                case "add":
                    addGoods(shopCar,sc);
                    break;
                case "query":
                    queryGoods(shopCar);
                    break;
                case "update":
                    updateGoods(shopCar,sc);
                    break;
                case "pay":
                    payGoods(shopCar);
                    break;
                default:
                    System.out.println("没有该功能！");
            }
        }
    }

    public static void payGoods(Goods[] shopCar) {
        double sum=0;
        for (int i = 0; i < shopCar.length; i++) {
            if(shopCar[i]!=null)
                sum += shopCar[i].price*shopCar[i].buyNumber;
        }
        System.out.println("商品的总金额为："+ sum);
    }

    public static void updateGoods(Goods[] shopCar,Scanner sc) {

        while (true) {
            System.out.println("===========更新商品信息===========");
            System.out.println("请输入商品名称：");
            int id = sc.nextInt();
            Goods g = getGoodsId(shopCar,id);
            if(g==null)
                System.out.println("没有该商品");
            else{
                System.out.println("请您输入："+g.name+"商品的最新购买数量：");
                int buyNumber = sc.nextInt();
                g.buyNumber = buyNumber;
                System.out.println("修改完成");
                queryGoods(shopCar);
                break;
            }
        }


    }
    public static Goods getGoodsId(Goods[] shopCar,int id){
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g!=null){
                if(id == g.id)
                    return g;
            }else {
                return  null;
            }
        }
        return null;
    }

    public static void queryGoods(Goods[] shopCar) {
        System.out.println("===========查询的购物车信息如下===========");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if(g!=null){
                System.out.println(g.id+"\t\t"+g.name+"\t\t"+g.price+"\t\t"+g.buyNumber);
            }else{
                break;
            }

        }
    }

    public static void addGoods(Goods[] shopCar,Scanner sc) {
        System.out.println("请输入购买商品的编号：");
        int id = sc.nextInt();
        System.out.println("请输入购买商品的名称");
        String name = sc.next();
        System.out.println("请输入购买商品的数量：");
        int buyNumber = sc.nextInt();
        System.out.println("请输入购买商品的价格：");
        double price = sc.nextDouble();

        Goods g = new Goods();
        g.id = id;
        g.name =name;
        g.price = price;
        g.buyNumber = buyNumber;

        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null){
                shopCar[i]=g;
                break;
            }
        }
        System.out.println("您的商品："+g.name+"添加到购物车完成");
    }
}
