package bookswing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 单击按钮弹出对话框窗体
 * @author 刘恋
 */

class MyJDialog extends JDialog{
    public MyJDialog(MyFrame frame){
        //实例化一个JDialog类对象，指定对话框的父窗体，标题标题和类型
        super(frame, "第一个JDialog窗体",true);
        // 创建一个容器
        Container container = getContentPane();
        // 在容器中添加标签
        container.add(new JLabel("这是一个对话框"));
        // 设置对话框窗体在桌面显示的坐标和大小
        setBounds(120,120,100,100);
    }
}
public class MyFrame extends JFrame{
    public MyFrame(){
        //获取窗体容器
        Container container = getContentPane();
        // 容器使用null布局
        container.setLayout(null);
        // 定义一个按钮
        JButton b1 = new JButton("弹出对话框");
        // 定义按钮在容器中的坐标和大小
        b1.setBounds(10,10,100,21);
        //为按钮添加点击事件
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 创建JDialog对话框
                MyJDialog dialog = new MyJDialog(MyFrame.this);
                dialog.setVisible(true);
            }
        });
        container.add(b1);
        container.setBackground(Color.white);
        setSize(200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setLocation(200,300);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
