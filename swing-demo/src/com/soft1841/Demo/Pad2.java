package com.soft1841.Demo;

/**
 * 在电脑类中展示图片
 * @author 刘恋
 */

class Computer2{
    void showPicture(){
        System.out.println("鼠标点击");
    }
}
public class Pad2 extends Computer2{
    void showPicture(){
        System.out.println("手指点击触摸屏");
    }

    public static void main(String[] args) {
        Computer2 pc = new Computer2();
        System.out.println("pc打开图片");
        pc.showPicture();
        Pad2 ipad = new Pad2();
        System.out.println("ipad 打开图片");
        ipad.showPicture();
    }
}
