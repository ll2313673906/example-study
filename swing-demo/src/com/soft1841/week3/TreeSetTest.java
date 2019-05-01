package com.soft1841.week3;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 实现集合元素自然升序
 * @author 薄荷猫
 */

public class TreeSetTest {
    public static void main(String[] args) {

    // 使用TreeSet创建Set集合对象
    Set<Integer> set = new TreeSet<>();
    // 像set中添加元素
    set.add(-5);
    set.add(-7);
    set.add(10);
    set.add(6);
    set.add(3);
    // 创建Iterator迭代器对象
        Iterator<Integer> it = set.iterator();
        System.out.print("set集合中的元素：");
    // 遍历并输出Set集合中的元素
        while (it.hasNext()){
            System.out.print(it.next() + "\t\t");
        }
}
}
