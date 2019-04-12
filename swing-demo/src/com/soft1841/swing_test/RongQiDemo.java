package com.soft1841.swing_test;
import javax.swing.*;

public class RongQiDemo extends JFrame{
    JButton an1 = null;
    public static void main(String[] args) {
        RongQiDemo aa = new RongQiDemo();
    }

    public RongQiDemo(){



      // 设置标题
        this.setTitle("界面");
        JButton an1 = new JButton("一个按钮");
        // 设置大小像素（点与点之间的距离）
        this.setSize(350,180);
        //初始窗体跳出的位置
        this.setLocation(600,360);
        this.add(an1);
           //关闭窗体，很重要
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      // 显示窗体
      this.setVisible(true);

    }
}
