package com.soft1841.week1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 模拟选择邮件的发送方式
 * @author 刘恋
 */

public class RadioButtonTest extends JFrame {
    public RadioButtonTest(){
        JRadioButton rbtnNormal = new JRadioButton("普通发送");
        // 设置选中状态
        rbtnNormal.setSelected(true);


        // 设置字体
        rbtnNormal.setFont(new Font("宋体",Font.PLAIN,12));
        // 设置组件坐标和大小
        rbtnNormal.setBounds(20,30,75,22);
        rbtnNormal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (rbtnNormal.isSelected())
                    //判断普通发送单选按钮是否选中
                    JOptionPane.showMessageDialog(null,
                            "你选择的是：" +rbtnNormal.getText(),"提醒",
                            JOptionPane.INFORMATION_MESSAGE);
            }
        });
        // 获取窗体容器对象，并直接添加单选按钮
        getContentPane().add(rbtnNormal);
        JRadioButton rbtnPwd = new JRadioButton("加密发送");
        rbtnPwd.setFont(new Font("宋体",Font.PLAIN,12));
        rbtnPwd.setBounds(100,30,75,22);
        rbtnPwd.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                if (rbtnPwd.isSelected())
                    JOptionPane.showMessageDialog(null,
                            "你的选择是："+rbtnPwd.getText(),"提醒",JOptionPane.INFORMATION_MESSAGE);

            }
        });
        getContentPane().add(rbtnPwd);
        ButtonGroup group = new ButtonGroup();
        group.add(rbtnNormal);
        group.add(rbtnPwd);
    }

    public static void main(String[] args) {
        RadioButtonTest frame = new RadioButtonTest();
        frame.setVisible(true);
    }
}
