package com.itheima.assignment;
class Bank{
    String userName;
    String account;
    double balance;

    public Bank() {
        userName = "银行测试账户";
        account = "100000";
        balance = 1000;
    }

    public Bank(String userName, String account, double balance) {
        this.userName = userName;
        this.account = account;
        this.balance = balance;
    }
    void query()
    {
        System.out.println("用户名："+userName+"\n"
                +"账号："+account+"\n"
                +"余额："+balance);
    }
    void deposit(double numb)
    {
        balance +=numb;
        System.out.println("存款成功");
    }

    void withdraw(double numb)
    {
        if(balance<numb)
            System.out.println("账上余额不足，操作失败！");
        else{
            balance -=numb;
            System.out.println("取款成功");
        }

    }
}
public class Lesson6 {
    public static void main(String[] args) {
        Bank bank  = new Bank();
        bank.query();
        bank.deposit(100);
    }
}
