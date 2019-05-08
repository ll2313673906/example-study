package com.soft1841.swing_demo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 创建下拉列表框
 * author薄荷猫
 */
public class JComboBoxTest extends JFrame {
    public JComboBoxTest() {
        setTitle("下拉列表窗口");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        JComboBox<String> comboBox = new JComboBox<String>(); // 创建一个下拉列表框
        comboBox.setBounds(110, 11, 80, 21);
        comboBox.addItem("省份证");
        comboBox.addItem("军人证");
        comboBox.addItem("学生证");
        comboBox.addItem("工作证");
        getContentPane().add(comboBox); // 将下拉列表框组件添加到容器中
        JLabel lblResult = new JLabel(" ");
        lblResult.setBounds(77, 57, 146, 15);
        getContentPane().add(lblResult);
    }

    public static void main(String[] args) {
        new JComboBoxTest();
    }
}
