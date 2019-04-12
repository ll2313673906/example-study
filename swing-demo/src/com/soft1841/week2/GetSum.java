package com.soft1841.bookswing.week2;


/**
 * 对1到10进行相加计算
 * @author liulian
 * 2019.3.21
 */

public class GetSum {
    public static void main(String[] args) {
        int x = 1;
        int sum = 0;
        while (x <= 10){
            sum = sum + x;
            x++;
        }
        System.out.println("sum = "+ sum);
    }

}
