package com.soft1841.array_demo;

import java.util.Arrays;

/**
 * 数组查询
 * author薄荷猫
 */
public class Example {
    public static void main(String[] args) {
        int ia[] = new int[]{1,8,9,4,5};
        //将数组进行排序
        Arrays.sort(ia);
        //查找数组ia中元素4的索引位置
        int index = Arrays.binarySearch(ia,4);
        // 将索引输出
        System.out.println("4的索引位置是：" + index);
    }
}
