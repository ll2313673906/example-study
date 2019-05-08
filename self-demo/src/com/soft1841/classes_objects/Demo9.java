package com.soft1841.classes_objects;

import java.util.concurrent.Callable;

/**
 * 构造方法
 * 使用new+构造方法创建一个新的对象
 * aothor薄荷猫
 */
class Cat1{
    private String name;
    private int age;
    Cat1(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("姓名：" + this.name + "\t" + "年龄：" + this.age);
    }
    void get(){
        System.out.println("我是一个普通方法");
    }
}
public class Demo9 {
    public static void main(String[] args) {
       Cat1 cat1 = new Cat1("小红",23);
       cat1.get();


    }
}
