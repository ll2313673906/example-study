package week2;

/**
 * 在主方法中使用try-catch代码块将可能出现的异常语句进行异常处理
 * @author 刘恋
 */

public class Tomato {
    public static void main(String[] args) {
        try {
            String message = "西红柿：2.99元/500克";
            String[] strArr = message.split(":");
            String unitPriceStr = strArr[2].substring(0,4);
            double weight = 650;
            double unitPriceDou = Double.parseDouble(unitPriceStr);
            System.out.println(message + "，顾客买了" + weight + "克的西红柿，需支付"
            + (float)(weight/500*unitPriceDou) + "元");

        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("程序执行完毕");
    }
}
