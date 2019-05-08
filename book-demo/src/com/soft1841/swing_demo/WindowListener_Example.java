package com.soft1841.swing_demo;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * WindowListener中各个方法的使用
 * author薄荷猫
 */
public class WindowListener_Example extends JFrame {
    public static void main(String[] args) {
        WindowListener_Example frame = new WindowListener_Example();
        frame.setVisible(true);
    }
    public WindowListener_Example(){
        super();
        addWindowListener(new MyWindowListener());
        setTitle("捕获窗体事件");
        setBounds(100,100,500,375);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private class MyWindowListener implements WindowListener{
          // 窗体被激活时触发

        @Override
        public void windowActivated(WindowEvent e) {
            System.out.println("窗口被激活！");
        }
        @Override
        public void windowOpened(WindowEvent e) {
            System.out.println("窗体被打开！");
        }
        @Override
        public void windowIconified(WindowEvent e) {
            System.out.println("窗口被最小化！");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            System.out.println("窗口被非最小化！");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            System.out.println("窗口将要被关闭！");
        }
        @Override
        public void windowDeactivated(WindowEvent e) {
            System.out.println("窗口不在处于激活状态！");
        }

        @Override
        public void windowClosed(WindowEvent e) {
            System.out.println("窗口已经被关闭！");
        }







    }
}
