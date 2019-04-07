package com.soft1841;

import javax.swing.*;
import java.awt.*;

/**
 * 流式布局管理器
 * @author 薄荷猫
 */

public class FlowLayoutDemo extends JFrame {   // 1,继承JFrame
    JButton[] fl = {null,null,null,null,null,null,null,null};  // 2.定义组件

    public static void main(String[] args) {
        // 7，在主函数中创建窗体
        FlowLayoutDemo flowLayoutDemo = new FlowLayoutDemo();

    }
    public FlowLayoutDemo(){
        fl[0] = new JButton("话梅"); // 3，创建组件
        fl[1] = new JButton("果脯");
        fl[2] = new JButton("薯片");
        fl[3] = new JButton("饼干");
        fl[4] = new JButton("巧克力");
        fl[5] = new JButton("腰果");
        fl[6] = new JButton("锅巴");
        fl[7] = new JButton("开心果");

        this.setLayout(new FlowLayout()); //添加布局管理器
       // this.setLayout(new FlowLayout(FlowLayout.LEFT)); //组件向左靠齐
       // this.setLayout(new FlowLayout(FlowLayout.RIGHT)); // 组件向右对齐


        this.add(fl[0]);   // 4.添加组件
        this.add(fl[1]);
        this.add(fl[2]);
        this.add(fl[3]);
        this.add(fl[4]);
        this.add(fl[5]);
        this.add(fl[6]);
        this.add(fl[7]);

        // 5，设置窗体的属性
        this.setTitle("流式布局FlowLayout");
        this.setSize(380,240);
        this.setLocation(300,400);
        this.setResizable(false); // 窗体不可拉伸
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //6. 窗体可见

        this.setVisible(true);

    }
}
