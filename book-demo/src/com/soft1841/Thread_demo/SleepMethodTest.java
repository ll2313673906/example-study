package com.soft1841.Thread_demo;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * 在窗体中自动绘制彩色线段
 * author薄荷猫
 */
public class SleepMethodTest extends JFrame {
    private static final long serialVersionUTD = 1L;
    private Thread t;
    // 定义颜色数组
    private static Color[] color = {
            Color.BLACK,Color.BLUE,Color.CYAN,
            Color.GREEN,Color.ORANGE,Color.YELLOW,
            Color.RED,Color.PINK,Color.LIGHT_GRAY
    };
    // 创建随机对象
    private static final Random rand = new Random();
    // 获取随机颜色值得方法

    private static Color getC(){
        // 随机产生一个color数组长度范围内的数字，以此为索引获取颜色
        return color[rand.nextInt(color.length)];
    }
    // 创建匿名线程对象
    public SleepMethodTest(){
        t = new Thread(new Draw());
        t.start();
    }
    class Draw implements Runnable{
        int x = 30;
        int y = 50;
        public void run(){
            while (true){
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                Graphics graphics = getGraphics();
                graphics.setColor(getC());
                graphics.drawLine(x,y,100,y++);
                if (y >= 80){
                    y = 50;
                }
            }
        }
    }

    public static void main(String[] args) {
        init(new SleepMethodTest(),100,100);
    }
    public static void init(JFrame frame,int width,int height){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setVisible(true);
    }
}
