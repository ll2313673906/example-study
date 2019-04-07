package week2;

/**
 * 双循环嵌套遍历数组
 * @author 刘恋
 * 2019.3.24
 */

public class Trap {
    public static void main(String[] args) {
        // 定义二维数组
        int b[][] = new int[][]{{1},{2,3},{4,5,6}};
        // 循环遍历数组中的第一个索引
        for (int k = 0; k < b.length;k++){
            // 循环遍历数组中的第二个索引
            for (int c = 0; c < b[k].length; c++){
                // 将数组中的元素输出
                System.out.print(b[k][c]);
            }
            System.out.println();

        }
    }
}
