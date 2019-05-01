package com.soft1841.week3;

import java.util.*;

/**
 * List集合的常用方法
 * @author 薄荷猫
 */

public class ListTest {
    public static void main(String[] args) {


    // 创建集合对象
   List<String> list = new ArrayList<>();
   // 向集合中添加元素
   list.add("a");
   list.add("b");
   list.add("c");
   // 获取0到2之间的随机数
   int i = (int) (Math.random() * list.size());
        System.out.println("随机获取集合中的元素：" + list.get(i));
   // 将制定索引位置的元素从集合中移除
        list.remove(2);
        System.out.println("将索引是2的元素从集合移除后，集合中的元素是：");
    // 循环遍历集合
        for (int j = 0; j < list.size(); j++){
            // 获取指定索引处的值
            System.out.println(list.get(j));
        }
}
}
