package com.soft1841;

/**
 * 输出数字中的第一个偶数
 * @author 刘恋
 * 2019.3.24
 */
public class BreakTest {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++){ // i的值从1循环至19
            if (1 % 2 == 0) {       //如果i是偶数
                System.out.println(i);
                break;
            }
            }
            System.out.println("---end---");
        }
    }

