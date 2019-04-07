package week1;

/**
 * 为字符串赋值
 * @author 刘恋
 * 2019.3.24
 */

public class CreateString {
    public static void main(String[] args) {
        // 直接引用字符串常量
        String a = "时间就是金钱，我的朋友";
        System.out.println("a = " + a);
        // 利用构造方法实例化
        String b = new String("我爱清汤小肥羊");
        // 使用已有字符串常量实例化
        String c = new String(b);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        char[] charArray = {'t','i','m','e'};
        // 利用字符数组实例化
        String d = new String(charArray);
        System.out.println("d = "+ d );
        char[] charArray2 = {'时','间','就','是','金','钱'};
        // 提取字符数组部分内容，从下标为4的元素开始，截取两个字符
        String e = new String(charArray2,4,2);
        System.out.println("e = " + e);
    }
}
