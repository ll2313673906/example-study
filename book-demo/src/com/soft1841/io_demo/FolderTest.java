package com.soft1841.io_demo;

import java.io.File;

/**
 * 创建文件夹并在该文件夹下创建10个子文件夹
 * author薄荷猫
 */
public class FolderTest {
    public static void main(String[] args) {
        String path = "F:/Test"; // 声明文件夹Test所在的目录
        for (int i = 1; i <= 10; i++) {// 循环获得i值，并用i命名新的文件夹
            File folder = new File(path + "/" + i);// 根据新的目录创建File对象
            if (!folder.exists()) {// 文件夹不存在
              folder.mkdirs(); // 创建新的文件夹（包括不存在的父文件夹）

            }
        }
        System.out.println("文件夹创建成功，请打开F盘查看！\n\nF盘文件及文件夹列表如下：");
        File file = new File("F:/"); // 根据路径名创建File对象
        File[] files = file.listFiles(); // 获得F盘的所有文件和文件夹
        for ( File folder: files) { // 遍历files数组
            if (folder.isFile()) // 判断是否为文件
                System.out.println(folder.getName() + "文件"); // 输出F盘下所有文件的名称
               else if (folder.isDirectory()) // 判断是否为文件夹
                   // 输出F盘下所有文件夹的名称
                System.out.println(folder.getName() + "文件夹");
        }

        }
    }

