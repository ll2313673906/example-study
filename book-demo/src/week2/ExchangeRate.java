package week2;

import java.awt.print.Book;

/**
 * 将美元转化为人民币
 * @author 刘恋
 */

public class ExchangeRate {
    public static void main(String[] args) {
        // 创建RefTest对象
        ExchangeRate rate = new ExchangeRate();
        // 定义一维数组，用来存储纸币面额
        double[] denomination = {1,10,100};
        // 输出面额中三种面值的美钞
        System.out.println("美元：");
        // 使用for循环遍历数组
        for (int i = 0 ; i < denomination.length;i++){
            System.out.println(denomination[i] + "美元");
        }
        // 调用方法改变数组中的值
        rate.change(denomination);
        // 输出三种面值的美钞等值的人民币
        System.out.println("\n 人民币：");
        for (int j = 0;j < denomination.length;j++){
            System.out.println(denomination[j] + "元");
        }
    }
    // 定义一个方法，方法的参数为一维数组
    public void change(double[] i){
        for (int j = 0 ; j < i.length; j++){
            i[j] = i[j] * 6.903;
        }
    }

}