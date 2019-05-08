package com.soft1841.canvas_demo;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import static sun.management.jmxremote.ConnectorBootstrap.initialize;

/**
 * 在窗体中绘制几何图形
 * author薄荷猫
 */
public class DrawTest extends JFrame {
    public DrawTest(){
        super();
        initialize();
    }
    private void initialize(){
        this.setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new CanvasTest());
        this.setTitle("绘制几何图形");
    }

    public static void main(String[] args) {
        new DrawTest().setVisible(true);
    }
    // 创建画布
    class CanvasTest extends Canvas{
        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            g2.drawOval(5,5,100,100);
            g2.fillRect(15,15,80,80);
            Shape[] shapes = new Shape[2];
            shapes[0] = new Rectangle2D.Double(110,5,100,100);
            shapes[1] = new Ellipse2D.Double(120,15,80,80);
            for (Shape shape: shapes) {
                Rectangle2D bounds = shape.getBounds2D();
                if (bounds.getWidth() == 80)
                    g2.fill(shape);
                else
                    g2.draw(shape);

            }
        }
    }
}
