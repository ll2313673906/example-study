package com.soft1841.Demo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.jar.JarFile;

public class LableTest extends JFrame {

        Label l;
        Panel p;
        int x=10,y=10;
        public LableTest(){
            super("标签走动的演示");
            p=new Panel();
            l=new Label("标签");
            l.setBackground(Color.red);
            l.setBounds(x,y,100,50);
            p.add(l);
            this.add("Center",p);
            this.addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent ex){
                    System.exit(0);
                }});
            p.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e){
                    x=e.getX();y=e.getY();
                    l.setLocation(x,y);
                }});
            this.setSize(400,400);
            this.setVisible(true);
        }
        public static void main(String args[]){
            new LableTest();
        }
    }

