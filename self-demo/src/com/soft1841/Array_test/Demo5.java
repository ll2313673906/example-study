package com.soft1841.Array_test;

import java.util.Scanner;

/**
 * 动态的从键盘录入信息并赋值
 * author薄荷猫
 */

public class Demo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0;i<5; i++){
            System.out.println("请输入第" + (i+1)+"个学生");
            arr[i] = in.nextInt();
            sum += arr[i];
        }
        System.out.println("五个学生的平均分为"+ sum/5);
    }
}
