package com.soft1841.classes_objects;
class Cat{
   String name;
   int age;
   public String toString(){
       return "我的姓名：" + name+ "\t" + "我的年龄：" + age;
   }
}
public class Demo6 {
    public static void main(String[] args) {
        String name = new String("你好");
        //System.out.println(name.toString());
     Cat one = new Cat();
     one.name = "小明";
     one.age = 12;
     Cat two = new Cat();
     two.age = 16;
     two.name = "小红";
        System.out.println(one);
    }
}
