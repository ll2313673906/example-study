package com.soft1841.Array_test.Management_system;

import java.util.Scanner;

/**
 * 学生管理系统
 * author薄荷猫
 */
public class Student_System1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入学生的人数：");
        int renshu = in.nextInt();
        System.out.println("请输入课程的数目：");
        int courseNum = in.nextInt();
        String[] name = new String[renshu];// 声明一个String数组用来存储学生的
        String[] course = new String[courseNum];// 声明一个String数组用来存储课程的名称
       int[][] number = new int[renshu][courseNum];
       int[] sum = new int[renshu];
       int[] avg = new int[renshu];
       String[] str = new String[renshu];
        /**
         * 用来循环的存储课程的名称
         *
         */
        for (int i = 0; i < course.length; i++){
            System.out.println("请定义第" + (i + 1) + " 门课程的名字");
            course[i] = in.next();
        }
        /**
         * 用来录入学生的各科成绩
         */
        for (int i= 0; i < renshu; i++){
            int S = 0;
            System.out.println("请输入学生的姓名：");
            name[i] = in.next();
            String str1 = "";
            for (int j = 0; j < courseNum; j++){
                System.out.println("请输入学生" + name[i] + course[j] + "的成绩：");
                number[i][j] = in.nextInt();// 用来存储特定学生的特定成绩
               S += number[i][j];
               str1 += number[i][j] + "\t\t\t";

            }
            sum[i] = S;
            avg[i] = S/courseNum;
            str[i] = name[i] + "\t\t\t" + str1 + sum[i] + "\t\t\t" + avg[i] ;
        }
        for (int i = 0; i < sum.length - 1; i++){
            for (int j = 0; j < sum.length - 1; j++){
                if (sum[j] < sum[j + 1]){
                    int t1 = sum[j];
                    String t2 = str[j];
                    sum[j] = sum[j + 1];
                    str[j] = str[j + 1];
                    sum[j + 1] = t1;
                    str[j + 1] = t2;
                }
            }
        }
        System.out.print("学生");
        for (int i = 0; i < course.length;i++) {
            System.out.print("\t\t\t" + course[i]);
        }
        System.out.print("\t\t\t总分\t\t\t平均分\t\t\t排行榜");
                System.out.println();
                for (int i = 0; i < renshu; i++){

                    for (int j = 0; j < courseNum; j++){

                    }

                    System.out.println(str[i] + "\t\t\t第" + (i + 1)+ "名");
                }
    }
}
