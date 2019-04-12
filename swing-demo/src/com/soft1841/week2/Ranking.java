package com.soft1841.bookswing.week2;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * 查询亚足联排名前10 的球队
 * @author 刘恋
 * 2019.3.19
 */

public class Ranking {
    public static void main(String[] args) {
        //将亚足联排名前10的男足国家对存储在数组中
        String[] teams = {"伊朗", "韩国", "日本", "澳大利亚",
                "沙特阿拉伯", "乌兹别克斯坦", "阿拉伯联合酋长国",
                "卡塔尔", "中国", "叙利亚"};
        // 创建键，值类型分别为Integer，String的Map集合对象
        Map<Integer, String> map = new HashMap<Integer, String>();
        // 循环遍历数组teams中的元素
        for (int i = 0; i < teams.length; i++) {
            map.put(i + 1, teams[i]);  // 向Map集合中添加元素
        }
        Scanner scanner = new Scanner(System.in); //创建控制台输入对象
        System.out.println("根据输入的名次查询亚联足排名前十的某一支男足球国家队：");
        try {
            int number = scanner.nextInt(); //控制台输入名次
            if (number > 0 && number <= 10) { //输入的名次在0到10之间
                // 控制台输出与输入名次相匹配的国家
                System.out.println("亚足联排名第" + number + "的男足球国家队是" + map.get(number) + "");
                scanner.close(); //关闭控制台

            } else {
                System.out.println("输入错误！只能输入1到10中的某一个整数。");
            }
        } catch (InputMismatchException e) {
            // 捕捉输入类型不匹配异常
            System.out.println("输入错误！只能输入1到10中的某一个整数");
        }
    }
}