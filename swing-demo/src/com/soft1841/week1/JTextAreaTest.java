package com.soft1841.week1;

import javax.swing.*;
import java.awt.*;

/**
 * 创建自动换行的文本域组件
 * @author 刘恋
 */
public class JTextAreaTest extends JFrame {
    public JTextAreaTest(){
        setSize(200,100);
        setTitle("定义自动换行的文本域");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        // 获取窗体容器
        Container cp = getContentPane();
        // 创建6行6列默认值为“文本域”的文本域组件
        JTextArea jt = new JTextArea("文本域",6,6);
        // 可以自动换行
        jt.setLineWrap(true);
        cp.add(jt);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextAreaTest();
    }

}
