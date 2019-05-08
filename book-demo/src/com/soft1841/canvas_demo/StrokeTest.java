package com.soft1841.canvas_demo;
/**
 * 绘制不同粗细，不同修饰的直线
 * author薄荷猫
 */

import javax.swing.*;
import java.awt.*;

public class StrokeTest extends JFrame {
    public StrokeTest(){
     super();
     initialize();
    }
    private void initialize(){
         this.setSize(300,200);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         add(new CanvasTest());
         this.setTitle("设置画笔");
    }

    public static void main(String[] args) {
        new StrokeTest().setVisible(true);
    }
    class CanvasTest extends Canvas{
        // 重写paint（）方法
        public void paint(Graphics g){
            super.paint(g);
            Graphics2D g2 = (Graphics2D) g;
            // 创建画笔，宽度为8
            Stroke stroke = new BasicStroke(8);
            // 设置画笔
            g2.setStroke(stroke);
            // 调用从Graphics类继承的deawLine（）方法绘制直线
            g2.drawLine(20,30,120,30);
            // 创建画笔，宽度为12，线端点的装饰为CAP_ROUND,应用在路径线段交汇处的装饰为JOIN_BEVEL
            Stroke roundStroke = new BasicStroke(12,BasicStroke.CAP_ROUND,BasicStroke.JOIN_BEVEL);
            g2.setStroke(roundStroke);
            g2.drawLine(20,50,120,50);
        }

    }
}
