package com.soft1841.week3;

/**
 * 传统常量与枚举类型常量的区别
 * @author 薄荷猫
 */

interface Constants{
    // 将常量放置在接口中
    public static final int Constants_A = 1;
    public static final int Constants_B = 12;
}
public class ConstantsTest {
    // 将常量放置在枚举类型中
    enum Constants2{
        Constants_A,
        Constants_B
    }

    // 使用接口定义常量
    public static void doit(int c){
        // 定义一个方法，这里的参数为int型
        switch (c){
            case Constants.Constants_A:
                System.out.println(Constants.Constants_A);
                break;
            case Constants.Constants_B:
                System.out.println(Constants.Constants_B);
                break;
        }

    }

    // 定义一个参数对象是枚举类型的方法
    public static void doit2(Constants2 c){
        // 根剧枚举类型对象做不同的操作
        switch (c){
            case Constants_A:
                System.out.println(Constants2.Constants_A);
                break;
            case Constants_B:
                System.out.println(Constants2.Constants_B);
                break;
        }
    }

    public static void main(String[] args) {
        // 使用接口中定义的常量
        ConstantsTest.doit(Constants.Constants_A);
        ConstantsTest.doit(Constants.Constants_B);
        // 使用枚举中定义的常量
        ConstantsTest.doit2(Constants2.Constants_A);
        ConstantsTest.doit2(Constants2.Constants_B);
        ConstantsTest.doit(3);

    }

}

