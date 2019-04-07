package week2;


import java.util.Arrays;

/**
 * 将空数组填满数组
 * @author 刘恋
 * 2019.3.24
 */

public class Swap {
    public static void main(String[] args) {
        // 创建int型数组
        int arr[] = new int[5];
        // 使用同一个值对数组进行填充
       Arrays.fill(arr,8);
       // 循环遍历数组中的元素
        for (int i= 0; i < arr.length;i++){
            // 将数组中的元素依次输出
            System.out.println("第" + i + "个元素是：" + arr[i]);
        }
    }
}
