package week2;

/**
 * 使用break语句跳出指定的循环
 * @author 刘恋
 * 2019.3.24
 */

public class BreakOutsideNested {
    public static void main(String[] args) {
        for (int i= 0; i < 3; i++){
            for (int j = 0; j < 6; j++){
                if (j == 4){
                    break ;
                }
                System.out.println("i= " + i + "j = " + j);
            }
        }
    }
}
