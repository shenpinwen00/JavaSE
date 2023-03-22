package com.itheima.ATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("10000000","admin","123456",2000));
        accounts.add(new Account("10000001","abc","123456",2000));
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("===========ATM系统=============");
            System.out.println("1、账户登陆");
            System.out.println("2、账户开户");

            System.out.println("请选择您的操作：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //账户登陆
                    login(accounts,sc);
                    break;
                case 2:
                    //账户开户
                    register(accounts,sc);
                    break;
                default:
                    System.out.println("您输入的操作命令不存在～～～");
            }
        }
    }

    private static void login(ArrayList<Account> accounts, Scanner sc) {
        System.out.println("系统登陆操作=======");
        if(accounts.size()==0){
            System.out.println("对不起，当前系统中无任何账户");
            return;
        }

        while (true) {
            System.out.println("请输入登陆卡号：");
            String cardId = sc.next();
            Account account= getAccountCardId(accounts,cardId);
            if(account!=null){
                //卡号存在的
                while (true) {
                    System.out.println("请您输入登陆密码：");
                    String password =sc.next();
                    if(password.equals(account.getPassWord())){
                        System.out.println("登陆成功，您的卡号是："+account.getCarId());
                        //展示登陆后的操作页
                        showUserCommand(account,sc,accounts);
                        return;
                    }else{
                        System.out.println("密码错误");
                    }
                }
            }else{
                System.out.println("对不起，系统中不存在该账户卡号");
            }
        }


    }

    /**
     * 展示登陆后的操作页
     */
    private static void showUserCommand(Account account,Scanner sc,ArrayList<Account> accounts) {

        while (true) {
            System.out.println("===============用户操作页=================");
            System.out.println("1.查询账户");
            System.out.println("2.存款");
            System.out.println("3.取款");
            System.out.println("4.转账");
            System.out.println("5.修改密码");
            System.out.println("6.退出");
            System.out.println("7.注销账户");
            System.out.println("请选择：");
            int command = sc.nextInt();
            switch (command){
                case 1:
                    //查询账户
                    showAccount(account);
                    break;
                case 2:
                    //存款
                    depositMoney(account,sc);
                    break;
                case 3:
                    //取款
                    drawMoney(account,sc);
                    break;
                case 4:
                    //转账
                    transferMoney(account,sc,accounts);
                    break;
                case 5:
                    //修改密码
                    updatePassword(account,sc);
                    return;
                case 6:
                    //退出
                    System.out.println("退出成功");
                    return;
                case 7:
                    //注销账户
                    delateAccount(account,sc,accounts);

                    break;
                default:
                    System.out.println("输入的指令不正确～～");
            }
        }

    }

    private static void delateAccount(Account account, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("=====销户操作======");
        System.out.println("您真的要销户y/n");
        String rs = sc.next();
        switch (rs){
            case "y":
                if (account.getMoney()>0){
                    System.out.println("账户还有钱，无法销户");
                }else{
                    accounts.remove(account);
                    System.out.println("销户success!!");
                    break;
                }
            default:
                System.out.println("当前账户数据保留！");
        }
    }

    private static void updatePassword(Account account, Scanner sc) {
        System.out.println("========用户修改密码操作===========");
        while (true){
            System.out.println("请输入当前密码：");
            String password = sc.next();
            if(password.equals(account.getPassWord())){

                while (true) {
                    System.out.println("请输入新密码：");
                    String newpassword = sc.next();

                    System.out.println("请输入新密码：");
                    String okpassword = sc.next();
                    if(newpassword.equals(okpassword)){
                        System.out.println("success！");
                        return;
                    }
                    else{
                        System.out.println("failed!!!");
                    }
                }
            }else {
                System.out.println("输入密码不正确！！！");
            }
        }

    }

    private static void transferMoney(Account account, Scanner sc, ArrayList<Account> accounts) {
        System.out.println("========用户转账操作===========");
        if(accounts.size()<2){
            System.out.println("当前系统中不足两个账户");
            return;
        }
        if(account.getMoney()==0){
            System.out.println("自己都没钱就别转了");
            return;
        }
        while (true) {
            System.out.println("输入对方的卡号：");
            String cardId = sc.next();
            if(cardId.equals(account.getCarId())){
                System.out.println("不能输入自己的ID");
                continue;
            }
            Account a= getAccountCardId(accounts,cardId);
            if(a == null){
                System.out.println("输入账户不存在");
            }else{
                String username = a.getUserName(); //黑马之恶
                String tip = "*"+ username.substring(1);
                System.out.println("请您输入"+tip+"的姓氏");
                String preName = sc.next();
                if(username.startsWith(preName)){
                    System.out.println("请输入转账金额");
                    double money = sc.nextDouble();
                    if(money>account.getMoney()){
                        System.out.println("余额不足");
                    }else{
                        account.setMoney(account.getMoney()-money);
                        a.setMoney(a.getMoney()+money);
                        System.out.println("转账成功，余额："+account.getMoney());
                        return;
                    }
                }else{
                    System.out.println("您输入信息有错误");
                }
            }
        }

    }

    private static void drawMoney(Account account, Scanner sc) {
        while (true) {
            System.out.println("========用户取钱操作===========");
            System.out.println("取钱金额：");
            double money = sc.nextDouble();
            if(money> account.getMoney()){
                System.out.println("取款失败，超出的原有金额");
            }else{
                if (money >account.getQuotaMoney()){
                    System.out.println("超过每次限额");
                }
                else{
                    account.setMoney(account.getMoney()-money);
                    System.out.println("取款成功");
                    showAccount(account);
                    return;
                }
            }
        }


    }

    private static void depositMoney(Account account, Scanner sc) {
        System.out.println("========用户存钱操作===========");
        System.out.println("存钱金额：");
        double money = sc.nextDouble();
        account.setMoney(money+account.getMoney());
        showAccount(account);
    }

    private static void showAccount(Account account) {
        System.out.println("卡号："+account.getCarId());
        System.out.println("户主："+account.getUserName());
        System.out.println("余额："+account.getMoney());
        System.out.println("限额："+account.getQuotaMoney());
    }

    public static void register(ArrayList<Account> accounts,Scanner sc){
        System.out.println("用户开户操作=======");
        Account account = new Account();
        System.out.println("请输入账户用户名：");
        String username = sc.next();
        account.setUserName(username);

        while (true) {
            System.out.println("请输入账户密码：");
            String password = sc.next();
            System.out.println("请输入确认密码：");
            String okpassword = sc.next();
            if(password.equals(okpassword)){
                account.setPassWord(password);
                break;
            }else {
                System.out.println("对不起，两次密码不一致，请重新输入");
            }
        }
        System.out.println("请您输入账户当次限额:");
        double quotaMoney = sc.nextDouble();
        account.setQuotaMoney(quotaMoney);

        //随机一个8位且不重复的号码
        String carId = getRandomCarId(accounts);
        account.setCarId(carId);

        accounts.add(account);
        System.out.println("恭喜你，"+account.getUserName()+" 开户成功！！！！！");
    }

    private static String getRandomCarId(ArrayList<Account> accounts) {
        while (true) {
            String s = "";
            Random r = new Random();
            for (int i = 0; i < 8; i++) {
                s += r.nextInt(10);
            }
            Account acc = getAccountCardId(accounts,s);
            if(acc == null){
                return s;
            }
        }

    }

    private static Account getAccountCardId(ArrayList<Account> accounts, String s) {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            if(a.getCarId().equals(s)){
                return  a;
            }
        }
        return null;

    }
}
