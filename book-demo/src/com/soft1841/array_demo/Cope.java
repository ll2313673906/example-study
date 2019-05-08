package com.soft1841.array_demo;

import java.util.Arrays;

/**
 * 复制数组
 * author薄荷猫
 */
public class Cope {
    public static void main(String[] args) {
        int arr[] = new int[] {23,42,12};
        int newarr[] = Arrays.copyOf(arr,5);// 复制数组
        // 循环变量复制后的新数组
        for (int i = 0; i < newarr.length; i++){
            System.out.println(newarr[i]);
        }
    }
}
