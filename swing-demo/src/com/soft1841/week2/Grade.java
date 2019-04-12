package com.soft1841.bookswing.week2;

import java.util.Scanner;

/**
 * 根据考试成绩判断等级
 * @author liulian
 * 2019.3.21
 */

public class Grade {
    public static void main(String[] args) {
        Scanner de = new Scanner(System.in);//创建扫描器，接收控制台输入的内容
        System.out.println("请输入成绩");
        int grade = de.nextInt();  //获取控制台输入的数字
        switch (grade){                  //使用switch判断数字
            case 10:
            case 9:
                System.out.println("成绩为优");
                break;
            case 8:
                System.out.println("成绩为良");
                break;
            case 7:
            case 6:
                System.out.println("成绩为中");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("成绩为差");
                break;
                default:
                    System.out.println("成绩无效");
        }
        de.close();                            //关闭扫描器
    }
}
