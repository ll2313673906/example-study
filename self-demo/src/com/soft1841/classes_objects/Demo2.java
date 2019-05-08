package com.soft1841.classes_objects;

/**
 * 同一个类的每个对象有不同的成员变量的存储空间
 * author薄荷猫
 */
public class Demo2 {
    public static void main(String[] args) {
        Person One = new Person();
        //访问对象
        System.out.println(One.age);
        // 创建对象
        Person two = new Person();
        two.age = 23;
        // 访问对象
        System.out.println(two.age);
        //同一个类可以访问不同的方法
        One.eat();
        two.eat();

    }
}
