package com.soft1841.week1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 创建功能不同，外观不同的按钮
 * @author 刘恋
 */

public class JButtonTest extends JFrame {
    public JButtonTest(){
        // 获取图片文件
        Icon icon = new ImageIcon("/img/13_副本.jpg");
        //设置网格布局管理器
        setLayout(new GridLayout(3,2,5,5));
        // 创建容器
        Container container = getContentPane();
        // 创建按钮组件
        JButton btn[] = new JButton[6];
        for (int i = 0; i < btn.length; i++){
            // 实例化数组中的对象
            btn[i] = new JButton();
            // 将按钮添加到容器中
            container.add(btn[i]);
        }
        // 设置其中一些按钮不可用
        btn[0].setText("不可用");
        btn[0].setEnabled(false);
        btn[1].setText("有背景色");
        btn[1].setBackground(Color.YELLOW);
        btn[2].setText("有边框");
        // 添加红色线性边框
        btn[3].setBorder(BorderFactory.createLineBorder(Color.RED));
        // 为按钮设置图标
        btn[4].setIcon(icon);
        // 设置鼠悬停时提示的文字
        btn[4].setToolTipText("图标按钮");
        btn[5].setText("可点击");
        btn[5].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //弹出确认对话框
                JOptionPane.showMessageDialog(JButtonTest.this,"点击按钮");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("创建不同样式的按钮");
        setBounds(100,100,400,200);
    }

    public static void main(String[] args) {
        new JButtonTest();
    }
}