package com.soft1841.bookswing.week2;

import java.util.Scanner;

/**
 * 判断手机号码是否存在
 * @author 刘恋
 * 2019.3.21
 */

public class TakePhone {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);  //创建Scanner对象 ，用于进行输入
        System.out.println("请输入要拨打的电话号码");  //输出提示
        int phoneNumber = in.nextInt();          //创建变量，保存电话号码
        if (phoneNumber != 393298920){           //判断此电话号码是否是393298920
            System.out.println("对不起你拨打的电话不存在");
        }

    }
}