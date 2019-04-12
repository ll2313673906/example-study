package com.soft1841.Demo;

/**
 * 类的封装
 * @author 刘恋
 */

public class RestaurantDemo {
    private Cook cook = new Cook();
    public void takeOrder(String dish){
        cook.cooking(dish);
        System.out.println("你的菜好了，请慢用");
    }
    public String saySorry(){
        return "抱歉，餐厅不能提供此项服务。";
    }

    public static void main(String[] args) {
        RestaurantDemo waiter = new RestaurantDemo();
        System.out.println("请让厨师为我做一些香辣肉丝");
        waiter.takeOrder("香辣辣肉丝");
        System.out.println("你们的厨师叫什么名字？");
        System.out.println(waiter.saySorry());
        System.out.println("请让厨师给我切一些葱花");
        System.out.println(waiter.saySorry());

    }
    class Cook{
        private String name;
        public Cook(){
            this.name = "Tom Cruise";
        }
        private void cutOnion(){
            System.out.println(name + "切葱花");
        }
        private void washVegetavles(){
            System.out.println(name + "洗菜名");
        }
        void cooking(String dish){
            washVegetavles();
            cutOnion();
            System.out.println(name + "开始烹饪" + dish);
        }
    }
}
