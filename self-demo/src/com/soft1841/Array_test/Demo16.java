package com.soft1841.Array_test;

/**
 * 多维数组2
 * author薄荷猫
 */
public class Demo16 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[5];
        for (int i = 0 ; i < arr[0].length; i++){
            arr[0][i] = i+ 5;
        }
        for (int i = 0; i < arr[0].length; i++){
            System.out.print(arr[0][i] + "\t");
        }
    }
}
