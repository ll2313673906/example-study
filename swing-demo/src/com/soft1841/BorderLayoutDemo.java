package com.soft1841;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.awt.*;
import javax.swing.*;

/**
 * 边界布局管理器
 * @author 薄荷猫
 */

public class BorderLayoutDemo extends JFrame { // 1，继承JFrame类
    JButton an1,an2,an3,an4,an5;  // 2,定义组件

    public static void main(String[] args) {
        BorderLayoutDemo bd = new BorderLayoutDemo(); // 7，主函数中常见对象
    }
    public BorderLayoutDemo(){
        an1 = new JButton("东方"); // 3，在构造方法中创建组件
        an2 = new JButton("西方");
        an3 = new JButton("南方");
        an4 = new JButton("北方");
        an5 = new JButton("中部");

        this.add(an1,BorderLayout.EAST); //4，在构造方法中添加组件
        this.add(an2,BorderLayout.WEST);
        this.add(an3,BorderLayout.SOUTH);
        this.add(an4,BorderLayout.NORTH);
        this.add(an5,BorderLayout.CENTER);

        this.setTitle("边界布局BorderLayout");
        this.setSize(380,320); // 5，设置窗体的属性
        this.setLocation(400,300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true); // 6，显示窗体

    }
}
