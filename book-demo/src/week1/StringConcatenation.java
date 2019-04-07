package week1;

/**
 * 字符串的连接
 * 李狗蛋的自我介绍
 * @author 刘恋
 * 2019.3.24
 */

public class StringConcatenation {
    public static void main(String[] args) {
        // 要拼接的第一个字符串
        String a = "我叫李狗蛋";
        // 要拼接的第二个字符串
        String b = "今年19岁";
        // 使用+拼接字符串
        String c = a + "," + b;
        // 要拼接的第三个字符串
        String d = "我来做个自我介绍：";
        // 使用“+=”拼接字符串
        d += c;
        // 输出字符串a
        System.out.println("a =" + a);
        // 输出字符串b
        System.out.println("b =" + b);
        // 输出字符串c
        System.out.println("c =" + c);
        // 输出字符春d
        System.out.println("d =" + d);
    }
}
