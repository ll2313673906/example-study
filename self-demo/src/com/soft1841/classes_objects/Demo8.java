package com.soft1841.classes_objects;

/**
 * 方法的重载
 * author薄荷猫
 */
class Person1{
    public void max(int a,int b){
        System.out.println(a > b ? a:b);
    }
    //比较三个数
    public void max(double a,double b ,double c){
       double max = a > b? a : b;
        System.out.println(max > c ? max :c);

    }
}
public class Demo8 {
    public static void main(String[] args) {
        Person1 one = new Person1();
        one.max(7.3,4.4,6.4);
        // 如果是小数就强制转换
       // one.max((int)7.4,(int)4.3);

    }
}
