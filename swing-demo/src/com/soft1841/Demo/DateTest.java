package com.soft1841.Demo;

import java.util.Date;

/**
 * 获取基准时间到本地当前时间的毫秒数
 * @author 薄荷猫
 *
 */

public class DateTest {
    public static void main(String[] args) {
        // 创建现在的日期
        Date date = new Date();
        // 获得毫秒数
        long value = date.getTime();
        System.out.println("当前日期，时间：" + date);
        System.out.println("从基准时间到当地时间所经过的毫秒数为：" +value);
    }
}
