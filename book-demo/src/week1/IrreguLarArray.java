package week2;

/**
 * 输出不规则的二位数组中的所有元素
 */

public class IrreguLarArray {
    public static void main(String[] args) {
        // 创建二维数组，指定行数不指定列数
        int a[][] = new int[3][];
        //  第一行分配6个元素
        a[0] = new int[]{52,64,85,12,3,64};
        // 第二行分配3个元素
        a[1] = new int[]{41,99,2};
        // 第三行分配4个元素
        a[2] = new int[]{285,61,278,2};
        for (int i = 0;i < a.length; i++){
            System.out.print("a[" + i + "]中有" + a[i].length + "个元素分别是：");
          // foreach循环输出数字中的元素
            for (int tmp:a[i]) {
                System.out.print(tmp + " ");
            }
            System.out.println();
        }
    }
}
