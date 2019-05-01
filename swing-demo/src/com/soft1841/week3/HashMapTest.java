package com.soft1841.week3;

import java.util.*;

/**
 * Map接口的实现类
 * @author 薄荷猫
 */
public class HashMapTest {
    public static void main(String[] args) {
        // 创建Map集合对象
        Map<String,String> map = new HashMap<>();
        // 像Map集合中添加元素
        map.put("ISBN 987-7-5677-8742-1","Android项目开发实战入门");
        map.put("ISBN 987-7-5677-8741-4","C语言项目开发实战入门");
        map.put("ISBN 987-7-5677-9097-1","PHP项目开发实战入门");
        map.put("ISBN 987-7-5677-8740-7","Java项目开发实战入门");


        // 构建Map集合中所有key的Set集合
        Set<String> set = map.keySet();
        // 创建Iterator迭代器
        Iterator<String> it = set.iterator();
        System.out.println("key值");
        while (it.hasNext()){
            // 遍历并输出Map集合中的key值
            System.out.println(it.next() + "  ");
        }

        // 构建Map集合中所有value值的集合
        Collection<String> coll = map.values();
        it = coll.iterator();
        System.out.println("\nvalue值：");
        while (it.hasNext()){
        // 遍历并输出Map集合中的value值
            System.out.println( it.next() + " ");
    } }
}
