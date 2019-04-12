package com.soft1841;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * try..catch捕获异常
 * @author 薄荷猫
 *
 */

public class Demo1 {
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
        System.out.println("程序顺利进行中");
    }
}
