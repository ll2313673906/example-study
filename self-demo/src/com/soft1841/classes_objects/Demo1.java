package com.soft1841.classes_objects;

import java.util.Scanner;

/**
 * 这是一个主程序
 * author薄荷猫
 */
public class Demo1 {
    public static void main(String[] args) {
        // 使用new创建一个对象
        Person myPerson = new Person();
        myPerson.name = "小明放学了";
        // 使用对象属性（对象名.成员变量）
        System.out.println(myPerson.name);
        // 访问对象的方法（对象名.方法）
        myPerson.eat();
    }
}
