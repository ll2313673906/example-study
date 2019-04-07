package com.soft1841;

import javax.swing.*;
import java.awt.*;

/**
 * 文本标签实例
 * 登录界面
 * @author liulian
 *
 */

public class TextFiledDemo extends JFrame {
    JPanel mianban1,mianban2,mianban3;
    JButton btn1,btn2;
    JLabel bq1,bq2;
    JTextField textField;
    JPasswordField passwordField;




    public TextFiledDemo(){

        mianban1 = new JPanel();
        mianban2 = new JPanel();
        mianban3 = new JPanel();

        btn1 = new JButton("登录");
        btn2 = new JButton("取消");

        bq1 = new JLabel("用户名");
        bq2 = new JLabel("密   码");

        textField = new JTextField(10);
        passwordField = new JPasswordField(10);

        mianban1.add(bq1);
        mianban1.add(textField);
        mianban2.add(bq2);
        mianban2.add(passwordField);
        mianban3.add(btn1);
        mianban3.add(btn2);

        this.setLayout(new GridLayout(3,1));

        this.add(mianban1, BorderLayout.NORTH);
        this.add(mianban2);
        this.add(mianban3,BorderLayout.SOUTH);

        this.setTitle("文本标签实现登录界面");
        this.setResizable(false);
        this.setSize(230,150);
        this.setLocation(400,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }

    public static void main(String[] args) {
        new TextFiledDemo();
    }
}
