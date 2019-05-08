package com.soft1841.io_demo;

import java.io.*;

/**
 * 以行为单位进行输出输入
 * author薄荷猫
 */
public class BufferedTest {
    public static void main(String[] args) {
        // 定义字符串数组
        String content[] = {"你不喜欢我，","我一点都不介意，",
        "因为我活下来，","不是为了取悦你"};
        // 创建文件对象
        File file = new File("word.txt");
        try {
            FileWriter fw  = new FileWriter(file);
            BufferedWriter bufw = new BufferedWriter(fw);
            for (int k = 0; k < content.length; k++){
                bufw.write(content[k]);
                bufw.newLine();
            }
            bufw.close();
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileReader fr = new FileReader(file);
            BufferedReader bufr = new BufferedReader(fr);
            String s = null;
            int i = 0;
            while ((s = bufr.readLine()) != null){
                i++;
                System.out.println("第" + i + "行：" + s);
            }
            bufr.close();
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
