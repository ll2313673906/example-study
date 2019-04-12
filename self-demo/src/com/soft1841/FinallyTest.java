package com.soft1841;

import java.util.Scanner;

/**
 * Finally语句起到异常处理出口的作用
 * 用在try..catch语句飞人最后
 */

public class FinallyTest {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = a % b;
            System.out.println("余数为" + c);

        }catch (Exception e){
            System.out.println("输入有误");
        }
        finally {
            System.out.println("程序顺利进行中");
        }
        }

    }

