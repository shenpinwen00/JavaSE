package com.itheima.d11_interface_implement;

public class PingPangMan implements SportMan,Law{
    private String name;

    public PingPangMan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"yaopaobu");
    }

    @Override
    public void competition() {
        System.out.println(name+"yaobisai");
    }

    @Override
    public void rule() {
        System.out.println(name+"learning law");
    }
}
