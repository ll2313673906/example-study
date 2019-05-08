package com.soft1841.swing_demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 展示JList列表框中选中的项
 */
public class JListTest extends JFrame {
    public JListTest(){
        Container cp = getContentPane();
        cp.setLayout(null);
        // 创建字符串数组，保存列表中的数据
        String[] contents = {"列表1","列表2","列表3","列表4","列表5","列表6"};
        JList<String> j1 = new JList<>(contents);//创建列表，并将数据作为构造参数
        JScrollPane js = new JScrollPane(j1); // 将列表放入滚动面板
        js.setBounds(10,10,100,109);
        cp.add(js);
        JTextArea area = new JTextArea(); // 创建文本域
        JScrollPane scrollPane = new JScrollPane(area); // 将文本域放入滚动面板
        scrollPane.setBounds(118,10,73,80);
        cp.add(scrollPane);
        JButton btnNewButton = new JButton("确认");
        btnNewButton.setBounds(120,96,71,23);
        cp.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 获取列表中选中的元素，返回java.util.List类型
                java.util.List<String> valus = j1.getSelectedValuesList();
                area.setText("");// 清空文本域
                for (String value: valus) {
                    area.append(value + "\t");// 在文本域循环追加List中的元素值

                }
            }
        });
       setTitle("在这个窗体中使用了列表框");
       setSize(400,300);
       setVisible(true);
       setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JListTest();
    }
}
