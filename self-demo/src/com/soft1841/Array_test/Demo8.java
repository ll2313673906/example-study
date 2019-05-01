package com.soft1841.Array_test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组的排序
 * author薄荷猫
 */
public class Demo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            System.out.println("请输入第" + (i + 1) + "学生的成绩");
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
