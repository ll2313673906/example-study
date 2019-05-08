package com.soft1841.array_demo;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 数组查询
 * author薄荷猫
 */
public class Rakel {
    public static void main(String[] args) {
        String str[] = new String[]{"ab","cd","ef","yz"};
        // 将数组进行排序
        Arrays.sort(str);
        // 在指定的范围内搜索元素“cd”的索引位置
        int index = Arrays.binarySearch(str,0,2,"cd");
        System.out.println("cd的索引位置是：" + index);
    }
}
