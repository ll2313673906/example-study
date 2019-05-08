package com.soft1841.Thread_demo;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class SwingAndThread extends JFrame {
    // 声明JLabel 对象
    private JLabel jl = new JLabel();
    // 声明线程对象
    private static Thread t;
    // 声明可变化的横坐标
    private int x = 0;
    // 声明容器
    private Container container = getContentPane();

    public SwingAndThread(){
        setBounds(300,200,250,100);
        // 使窗体不使用任何布局管理器
        container.setLayout(null);
        try{
            // 获取本类同目录下图片的URL
            URL url = SwingAndThread.class.getResource("2.jpg");
            // 实例化一个Icon
            Icon icon = new ImageIcon(url);
            // 将图片放置在标签中
            jl.setIcon(icon);
        }catch (NullPointerException ex){
            System.out.println("图片不存在，请将图片拷贝到当前目录下");
            // 结束方法
            return;
        }
        jl.setBounds(10,10,200,50);
        // 创建子类Roll类的线程对象
        t = new Thread(new Roll());
        t.start();
        // 将标签添加到容器中
        container.add(jl);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    class Roll implements Runnable{
        public void run(){
            while (x <= 200){
                jl.setBounds(x,10,200,50);
                try{
                    Thread.sleep(500);
                }catch (Exception e){
                    e.printStackTrace();
                }
                x += 4;
                if (x >= 200){
                    x = 10;
                }
            }
        }
    }

    public static void main(String[] args) {
        new SwingAndThread();
    }
}
