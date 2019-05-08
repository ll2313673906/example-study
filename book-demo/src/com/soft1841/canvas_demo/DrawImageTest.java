package com.soft1841.canvas_demo;

import javax.swing.*;
import java.awt.*;

/**
 * 在窗体中绘制图像
 * author薄荷猫
 */
public class DrawImageTest extends JFrame {
    public DrawImageTest(){
        this.setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CanvasTest());
        this.setTitle("绘制图案");

    }

    public static void main(String[] args) {
        new DrawImageTest().setVisible(true);
    }
    class CanvasTest extends Canvas{
        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            Image img = new ImageIcon("src/img.jpg").getImage();
            g2.drawImage(img,0,0,this);
        }
    }
}
