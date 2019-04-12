package com.soft1841.Demo;



/**
 * 使用继承表现Pad和Computer的关系
 * @author刘恋
 */

class Computer{
    String screen = "液晶显示屏";
    void startup(){
        System.out.println("电脑正在开机，请等待。。。");
    }

}
public class Pad extends Computer{
    String battery = "5000毫安电池";

    public static void main(String[] args) {
        Computer pc = new Computer();
        System.out.println("Computer的屏幕是：" + pc.screen);
        pc.startup();
        Pad ipad = new Pad();
        System.out.println("pad的屏幕是：" + ipad.screen);
        System.out.println("pad的电池是：" + ipad.battery);
        ipad.startup();
    }
}
