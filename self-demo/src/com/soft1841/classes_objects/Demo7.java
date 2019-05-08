package com.soft1841.classes_objects;

/**
 * 封装属性，
 * author薄荷猫
 */
class Student{
    // 封装属性private为私有public为公有
   private String name;
   private int age;
   private char gender;
   public void setGender(char gender){
       // 进行控制
       if (gender == '男'||gender == '女'){
           this.gender = gender;
       }else {
           System.out.println("请输入正确的性别");
       }

   }
   public char getGender(){
       return this.gender;
   }

}
public class Demo7 {
    public static void main(String[] args) {
 Student one = new Student();
 one.setGender('女');
        System.out.println(one.getGender());
    }
}
