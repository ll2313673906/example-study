package com.soft1841.Thread_demo;

import javax.swing.*;
import java.awt.*;

public class InterruptedSwing extends JFrame {
    Thread thread;

    public static void main(String[] args) {
        new InterruptedSwing();
    }
    public InterruptedSwing(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100,100);
        setVisible(true);
        // 创建进度条
        final JProgressBar progressBar = new JProgressBar();
        // 将进度条放置在窗体上合适的位置
        getContentPane().add(progressBar, BorderLayout.NORTH);
        // 设置进度条上显示数字
        progressBar.setStringPainted(true);
        // 使用匿名方式内部类方式创建线程对象
        thread = new Thread(){
            int count = 0;
            public void run(){
                while (true){
                    progressBar.setValue(++count);
                    try{
                        if (count == 50){
                            interrupt();//执行线程停止方法

                        }
                        Thread.sleep(100);
                    }catch (InterruptedException e){
                        System.out.println("当前线程被中断");
                        break;
                    }
                }
            }
        };
        thread.start();
    }
}
