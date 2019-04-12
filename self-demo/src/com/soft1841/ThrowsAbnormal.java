package com.soft1841;

import java.util.Scanner;
import java.util.TimerTask;

import static javax.print.attribute.standard.MediaSizeName.A;

/**
 * 用throws处理异常
 * @author 薄荷猫
 *
 */

public class ThrowsAbnormal {
    public static void main(String[] args) {
        A aa = new A();
        try {
            aa.a();
        }catch (Exception e){
            System.out.println("输入错误");
        }
        System.out.println("顺利进行中...");
    }
}
class A{

    void a() throws Exception{
        int a,b,c;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = a % b;
        System.out.println("余数为" + c);


    }
}
