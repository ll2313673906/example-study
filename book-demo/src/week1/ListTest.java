package week2;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合的常用方法
 * @author 刘恋
 * 2019.3.19
 */

public class ListTest {
    public static void main(String[] args) {
        //创建集合对象
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        // 获得0到2 之间的随机数
        int i = (int) (Math.random() * list.size());
        System.out.println("随机获取集合中的元素：" + list.get(i));
        list.remove(2);
        // 将指定索引位置的元素从集合中移除
        System.out.println("将索引是2的元素从集合移除后，集合中的元素是：");
      // 循环遍历集合
        for (int j = 0; j < list.size(); j++){
            //获取指定索引处的位置
            System.out.println(list.get(j));
        }
    }
}
