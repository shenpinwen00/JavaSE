package com.itheima.assignment;

public class Lesson8 {
    public static void main(String[] args) {
        //第8题：设计一个电话类Phone,继承
        System.out.println("第8题：设计一个电话类Phone,继承====================");
        fixPhone fp=new fixPhone();
        mobilePhone mp=new mobilePhone();
        cordlessPhone cp=new cordlessPhone();

        fp.setNumber(new char[]{'0','5','7','4','8','8','2','2','2','0','9','6'});
        fp.getNumber();
        fp.dail();
        fp.answer();

        mp.setNumber(new char[]{'1','5','7','8','8','2','2','2','0','9','6'});
        mp.getNumber();
        mp.dail();
        mp.answer();

        cp.setNumber(new char[]{'2','0','9','6'});
        cp.getNumber();
        cp.dail();
        cp.answer();
        cp.move();
    }

}
class phone{
    char[] number=new char[12];//字符数组，长度为12
    //设置电话号码方法
    void setNumber(char[] number){
        this.number=number;
    }
    //显示电话号码
    void getNumber(){
        System.out.print("本机号码：");
        for(int i=0;i<number.length;i++) {
            System.out.print(number[i]);
        }
        System.out.println();
    }
    //拨打电话方法
    void dail(){
        System.out.println("正在拨打电话....");
    }
    //接听电话方法
    void answer(){
        System.out.println("正在接听电话....");
    }
}
//移动电话类子类继承电话类
class mobilePhone extends phone{
    @Override
    void dail(){
        System.out.println("正在通过移动网络拨打电话....");
    }
    @Override
    void answer(){
        System.out.println("正在通过移动网络接听电话....");
    }
}
//固定电话类子类继承电话类
class fixPhone extends phone{
    @Override
    void dail(){
        System.out.println("正在通过电信固网拨打电话....");
    }
    @Override
    void answer(){
        System.out.println("正在通过电信固网接听电话....");
    }
}
//无线电话类子类继承固定电话类
class cordlessPhone extends fixPhone{
    void move(){
        System.out.println("正在移动通话....");
    }
}
