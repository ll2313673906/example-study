package com.soft1841.io_demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 创建并获取文件的基本信息
 * author薄荷猫
 */
public class FileTest {
    public static void main(String[] args) {
        // 创建文件对象
        File file = new File("test.txt");
        // 文件不存在(程序第一次运行时，执行的语句块)
        if (!file.exists()){
            System.out.println("未在指定目录下找到文件名为test的文本文件！正在创建。。。");
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            System.out.println("文件创建成功");
        }else {
            // 文件存在
            System.out.println("找到文件名为test的文本文件");
            if (file.isFile() && file.canRead()){
                // 该文本文件是一个标准文件且该文件可读
                System.out.println("文件可读！正在读取文件信息。。。");
                String fileName = file.getName();// 获得文件名
                String filePath = file.getAbsolutePath();// 获得文件的绝对路径
                // 获得改文件是否被隐藏
                boolean hidden = file.isHidden();
                // 获取该文件中的字节数
                long len = file.length();
                // 获取改文件最后的修改时间
                long tempTime = file.lastModified();
                // 创建SimpleDateFormat对象，指定目标格式
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                // 使用文件最后修改时间创建Date对象
                Date date = new Date(tempTime);
                // 格式化文件最后的修改时间
                String time = sdf.format(date);

                // 输出文件名
                System.out.println("文件名：" + fileName);
                // 输出文件的绝对路径
                System.out.println("文件名的绝对路径：" + filePath);
                // 输出文件是否被隐藏
                System.out.println("文件是否是隐藏文件：" + hidden);
                // 输出改文件中的字节数
                System.out.println("文件中的字节数：" + len);
                // 输出改文件最后的修改时间
                System.out.println("文件最后的修改时间：" + time);
                file.delete();//查完改文件信息后，删除文件
                System.out.println("这个文件的使命结束了！已经被删除了。");
            }else {
                System.out.println("文件不可读");
            }
        }
    }
}
