package com.soft1841.Array_test;

import java.util.Scanner;

/**
 * 数组求最大值
 * author刘恋
 */
public class Demo7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.println("请输入第" + (i + 1) + "个学生的成绩");
            arr[i] = in.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("最大值为：" + max);
    }
}
