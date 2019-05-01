package com.soft1841.Array_test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组的排序
 * author薄荷猫
 */
public class Demo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = new String[7];
        for (int i = 0; i < arr.length; i++){
            System.out.println("请输入第" + (i + 1) + " 个字符");
            arr[i] = in.next();

        }
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }
    }
}
