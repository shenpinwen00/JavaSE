package com.itheima.polymophic_test;

public class Keyboard implements USB{
    private String name;

    public Keyboard(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name+"成功接入电脑");
    }
    public void keyDown(){
        System.out.println(name+"敲击了～～～～～");
    }
    @Override
    public void unconnect() {
        System.out.println(name+"从电脑中拔出");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
