package week2;

/**
 * 使用位移运算符对密码加密
 * @author 刘恋
 * 2019.3.21
 */

public class BitwiseOperator {
    public static void main(String[] args) {
        int password = 543022;   // 原密码
        int key = 7;   //加密参数
        System.out.println("原密码：" + password);  //输出结果
        password = password << key;                 //将原密码左移。生成新数字
        System.out.println("经过左移运算加密后的结果：" + password); //输出结果
        password = password >> key;                 //将新数字右移，还原回原来的密码
        System.out.println("经过又移运算还原的结果：" + password);  //输出结果
    }
}
