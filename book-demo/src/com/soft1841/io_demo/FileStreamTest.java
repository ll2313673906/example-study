package com.soft1841.io_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 以字节为单位保存，读取名人名言
 * author薄荷猫
 */
public class FileStreamTest {
    public static void main(String[] args) {
        // 创建文件对象
        File file = new File("word.txt");
        // 捕捉异常
        try{
            // 创建FileOutputStream对象，用来向文件夹中写入数据
            FileOutputStream out = new FileOutputStream(file);
            // 定义字符串，用来存储要写入文件的内容
            String content = "你见过洛杉矶凌晨4点的样子么？";
            // 创建byte型数组。将要写入文件的内容转换为字节数组
            byte buy[] = content.getBytes();
            // 将数组中的信息写入到文件中
            out.write(buy);
            // 将流关闭
            out.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            // 创建FileInputStream 对象，用来读取文件内容
            FileInputStream in = new FileInputStream(file);
            // 创建bute数组，用来存储读取到的内容
            byte byt[] = new byte[1024];
            // 从文件中读取信息，并存入字节数组中
            int len = in.read(byt);
            // 将文件中的信息输出
            System.out.println("文件中的信息是：" + new String(byt,0,len));
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
