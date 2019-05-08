package com.soft1841.array_demo;

import java.util.Arrays;

/**
 * 复制数组
 * author薄荷猫
 */
public class Repeat {
    public static void main(String[] args) {
        int arr[] = new int[] {23,42,12,84,10};
        // 复制数组
        int newarr[] = Arrays.copyOfRange(arr,0,5);
        for ( int i = 0; i < newarr.length; i++){
            System.out.println(newarr[i]);
        }
    }
}
