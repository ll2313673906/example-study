package com.soft1841.swing_test;

import javax.swing.*;
import java.awt.*;

/**
 * 面板的实例
 * @author liulian
 */

public class JpanelDemo extends JFrame {
    JPanel mianban1,mianban2;
    JButton anniu1,anniu2,anniu3,anniu4,anniu5;
    public JpanelDemo(){
        mianban1 = new JPanel();
        mianban2 = new JPanel();

        anniu1 = new JButton("可乐");
        anniu2 = new JButton("汽水");
        anniu3 = new JButton("冰红茶");
        anniu4 = new JButton("啤酒");
        anniu5 = new JButton("红茶");

        mianban1.add(anniu1);
        mianban2.add(anniu3);
        mianban1.add(anniu2);
        mianban2.add(anniu4);

        this.add(mianban1, BorderLayout.NORTH);
        this.add(mianban2,BorderLayout.SOUTH);
        // 边界布局被添加在中建的组件可以不用写第二个组件
        this.add(anniu5);


        setTitle("面板窗口");
        setResizable(false);
        setLocation(400,300);
        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JpanelDemo();
    }
}
