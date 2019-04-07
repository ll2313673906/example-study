package week2;

/**
 * 输出不同板式的故事
 */
public class Poetry {
    public static void main(String[] args) {
        char arr[][] = new char[4][];// 创建一个4行的二维数组
        arr[0] = new char[]{'春','眠','不','觉','晓'};
        arr[1] = new char[]{'处','处','闻','啼','鸟'};
       arr[2] = new char[]{'夜','来','风','吹','雨'};
       arr[3] = new char[]{'花','落','知','多','少'};
        System.out.println("----横版----");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 5; j++){
                System.out.print(arr[i][j]);
            }
            if (i % 2 == 0){
                System.out.println("，");
            }else {
                System.out.println("。");
            }
        }
        System.out.println("\n ----竖版输出----");
        for (int j = 0; j < 5; j++){
            for (int i = 3;i >= 0; i--){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("。，。，");
    }
}
