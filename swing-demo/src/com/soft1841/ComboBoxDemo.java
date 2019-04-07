package com.soft1841;

import javax.swing.*;
import java.awt.*;

/**
 *下拉框实例
 * @author liulian
 *
 */

public class ComboBoxDemo extends JFrame {
    JPanel mianban1,mianban2;
    JLabel bq1,bq2;
    JComboBox jComboBox;
    JList jList;
    JScrollPane jScrollPane;

    public ComboBoxDemo(){

        mianban1 = new JPanel();
        mianban2 = new JPanel();
        bq1 = new JLabel("籍贯");
        bq2 = new JLabel("学历");

        String[] jiguan = {"北京","上海","天津","贵州"};
        jComboBox = new JComboBox(jiguan);
        String[] xueli = {"高中","硕士","大学","博士"};
        jList = new JList(xueli);
        jList.setVisibleRowCount(3);
        jScrollPane = new JScrollPane();

        jScrollPane.add(jList);
        mianban1.add(bq1);
        mianban1.add(jComboBox);
        mianban2.add(bq2);
        mianban2.add(jList);

        this.setLayout(new GridLayout(2,1));

        this.add(mianban1);
        this.add(mianban2);



        setTitle("下拉框实现实例");
        setResizable(true);
        setLocation(300,300);
        setVisible(true);
        setSize(300,400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}
