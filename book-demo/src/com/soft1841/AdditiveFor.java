package com.soft1841;

/**
 * 1到100的累加计算
 * @author liulian
 * 2019.3.21
 */

public class AdditiveFor {
    public static void main(String[] args) {
        int sum = 0;
        int i;
        for (i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println("the result：" + sum);
    }
}
