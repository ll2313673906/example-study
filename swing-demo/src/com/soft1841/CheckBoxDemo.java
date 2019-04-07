package com.soft1841;

import javax.swing.*;
import java.awt.*;

/**
 * 单选框和复选按钮实例
 * @author liulian
 *
 */

public class CheckBoxDemo extends JFrame {
    JPanel mianban1,mianban2,mianban3;
    JLabel bq1,bq2;
    JButton btn1,btn2;
    JCheckBox checkBox1,checkBox2,checkBox3;
    JRadioButton jRadioButton1,jRadioButton2;
    // 实现只能选一个功能
    ButtonGroup buttonGroup;

    public CheckBoxDemo(){
        mianban1 =new JPanel();
        mianban2 = new JPanel();
        mianban3 = new JPanel();

        bq1 = new JLabel("特长");
        bq2 = new JLabel("性别");

        btn1 = new JButton("注册");
        btn2 = new JButton("取消");

        checkBox1 = new JCheckBox("音乐");
        checkBox2 = new JCheckBox("体育");
        checkBox3 = new JCheckBox("文艺");

        jRadioButton1 = new JRadioButton("男");
        jRadioButton2 = new JRadioButton("女");

        buttonGroup = new ButtonGroup();

        buttonGroup.add(jRadioButton1);
        buttonGroup.add(jRadioButton2);
        mianban1.add(bq1);
        mianban1.add(checkBox1);
        mianban1.add(checkBox2);
        mianban1.add(checkBox3);
        mianban2.add(bq2);
        mianban2.add(jRadioButton1);
        mianban2.add(jRadioButton2);
        mianban3.add(btn1);
        mianban3.add(btn2);

        this.setLayout(new GridLayout(3,1));
        this.add(mianban1);
        this.add(mianban2);
        this.add(mianban3);




        setTitle("单选框复选框实例窗口");
        setResizable(false);
        setSize(500,300);
        setLocation(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}
