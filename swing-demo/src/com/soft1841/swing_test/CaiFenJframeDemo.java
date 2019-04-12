package com.soft1841.swing_test;

import javax.swing.*;

/**
 *拆分窗口的实现
 * @author 刘恋
 */

public class CaiFenJframeDemo extends JFrame{
    JSplitPane jSplitPane;
    JList jList;
    JLabel jLabel;

    public CaiFenJframeDemo(){
        String[] s = {"啤酒","绿茶","红茶","矿泉水"};
        jSplitPane = new JSplitPane();
        jList = new JList(s);
        jLabel = new JLabel(new ImageIcon("resource/img/1.jpg"));
        jSplitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jList,jLabel);
        jSplitPane.setOneTouchExpandable(true);
        this.add(jSplitPane);
        this.setTitle("拆分窗体");
        this.setSize(500,200);
        this.setLocation(500,200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        new CaiFenJframeDemo();
    }



}
