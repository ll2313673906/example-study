package com.soft1841.canvas_demo;

import javax.swing.*;
import java.awt.*;

/**
 * 在窗体中绘制出红色的线条
 * author薄荷猫
 */
public class ColorTest extends JFrame {
    public ColorTest(){
        super();
        initialize();
    }
    private void initialize(){
        this.setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CanvasTest());
        this.setTitle("设置颜色");
    }

    public static void main(String[] args) {
        new ColorTest().setVisible(true);
    }
    class CanvasTest extends Canvas{
        public void paint(Graphics g){
            super.paint(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setColor(Color.RED);
                g2.drawLine(5,30,100,30);
        }
    }
}
