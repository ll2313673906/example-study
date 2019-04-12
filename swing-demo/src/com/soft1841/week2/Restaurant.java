package com.soft1841.bookswing.week2;

import java.util.Scanner;

/**
 * 饭店座位分配
 * @author liulian
 * 2019.3.21
 */

public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //创建扫描器，获取控制台输入的值
        System.out.println("欢迎光临，请问有多少人用餐");  //输出提示
        int count = scanner.nextInt();                   //记录用户输入的用餐人数
        if (count <= 4){
            System.out.println("客人请到大厅4人桌用餐");

        }else if (count > 4 && count <= 8){
            System.out.println("客人请到大厅8人桌用餐");
        }else if (count > 8 && count <= 16){
            System.out.println("客人请到楼上包厢用餐");
        }else {
            System.out.println("抱歉，我们店暂时没有这么大的包厢");
        }
        scanner.close();

    }
}
