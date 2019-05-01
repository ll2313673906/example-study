package com.soft1841.Array_test;

/**
 * author薄荷猫
 *不同的数组，没有赋值时，系统默认输出
 */

public class Demo4 {
    public static void main(String[] args) {
        String[] arr = new String[5];
        System.out.println(arr[1]);
        if (arr[0] == null) {
            System.out.println("这个数组1小标里没有数据");
        }

    }
}
