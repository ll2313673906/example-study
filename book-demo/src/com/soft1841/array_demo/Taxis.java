package com.soft1841.array_demo;

import java.util.Arrays;

/**
 * 对数组进行排序
 *author薄荷猫
 */
public class Taxis {
    public static void main(String[] args) {
        int arr[] = new int[] {23,42,12,8};
        Arrays.sort(arr);//将数组进行排序
       // 循环遍历排序后的数组
        for (int i= 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
