package com.soft1841.Array_test;

/**
 * 数组的复制算法
 * author薄荷猫
 */
public class Demo10 {
    public static void main(String[] args) {
        int[] arrA = {1,2,3,4,5,6,7,8};
        int[] arrB = new int[arrA.length];
        for (int i = 0; i < arrA.length; i++){
            arrB[i] = arrA[i];
        }
        for (int i = 0; i < arrA.length; i++){
            System.out.print(arrB[i]);
        }
    }
}
