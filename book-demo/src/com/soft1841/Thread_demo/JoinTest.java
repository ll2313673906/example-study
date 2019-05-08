package com.soft1841.Thread_demo;

import javax.swing.*;
import java.awt.*;

/**
 * 使用join（）方法控制进度条的滚动
 * author薄荷猫
 */
public class JoinTest extends JFrame {
    private static final long setialVersionUTD = 1L;
    // 定义两个线程
    private Thread threadA;
    private Thread threadB;
    // 定义两个进度条组件
    final JProgressBar progressBar = new JProgressBar();
    final JProgressBar progressBar2 = new JProgressBar();
    int count = 0;

    public static void main(String[] args) {
        new JoinTest();
    }
    public JoinTest(){
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
        // 将进度条设置在窗体最北面
        getContentPane().add(progressBar, BorderLayout.NORTH);
        // 将进度条设置在窗体的最南面
        getContentPane().add(progressBar2,BorderLayout.SOUTH);
        // 设置进度条显示数字字符
        progressBar.setStringPainted(true);
        progressBar2.setStringPainted(true);
        // 使用匿名内部类形式初始化Thread实例
        threadA = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true){
                    progressBar.setValue(++count);
                    try{
                        Thread.sleep(100);
                        if (count == 20){
                            threadB.join();
                        }
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        threadA.start();
        threadB = new Thread(new Runnable() {
            int count = 0;
            @Override
            public void run() {
                while (true){
                    progressBar2.setValue(++count);
                    try{
                        Thread.sleep(100);
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                    if (count == 100)
                        break;
                }
            }
        });
        threadB.start();
    }
}
