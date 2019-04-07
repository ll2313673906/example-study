package week2;

/**
 * 打印一年中个月的天数
 *
 */

public class GetDay {
    public static void main(String[] args) {
        //创建并初始化一维数组
        int day[] = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0 ; i< 12; i++){
            System.out.println((i + 1) + "月有" + day[i] + "天");
        }
    }
}
