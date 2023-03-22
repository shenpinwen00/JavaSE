package com.itheima.polymophic_test;

public class Computer {
    private String name;

    public Computer(String name) {
        this.name = name;
    }
    public void start(){
        System.out.println("computer start!");
    }
    public void installUSB(USB usb){
        usb.connect();
        if(usb instanceof Keyboard){
            Keyboard k = (Keyboard) usb;
            k.keyDown();
        }else if(usb instanceof Mouse){
            Mouse m = (Mouse) usb;
            m.doClick();
        }
        usb.unconnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
