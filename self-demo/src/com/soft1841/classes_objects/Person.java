package com.soft1841.classes_objects;

/**
 * 类和对象
 * author薄荷猫
 */
public class Person {
    // 定义三个属性
    String name = "小明";
    String gender;
    int age = 20;

    // 无参无返回类方法
    public void eat(){
        //行为
        System.out.println("我在吃饭");
    }
    // 有参无返回方法
    public void sleep(String A){
        System.out.println("我在"+A+"睡觉");
    }
    // 有参又返回的方法
    public int getAge(int a){
        //返回值
        return a;
    }
}
