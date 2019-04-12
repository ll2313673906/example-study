package com.soft1841;

/**
 * 提取字符串信息
 * 找出字符串中索引位置是4的字符
 * @author 刘恋
 * 2019.3.24
 */
public class ChatAtTest {
    public static void main(String[] args) {
        // 创建字符串对象str
        String str = "床前明月光，疑是地上霜。";
        // 将字符串str中的索引位置为4的字符赋值给chr
        char chr = str.charAt(4);
        // 输出chr
        System.out.println("字符串中索引位置为4的字符是：" + chr);
    }
}
