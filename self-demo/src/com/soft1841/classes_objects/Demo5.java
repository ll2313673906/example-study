package com.soft1841.classes_objects;
class Dog {
    String name;

    public String print(String n) {
        System.out.println(n);
        return n;
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Dog A = new Dog();
        A.print("小明");
    }
}
