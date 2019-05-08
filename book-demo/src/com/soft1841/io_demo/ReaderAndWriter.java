package com.soft1841.io_demo;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 项文件中写入并读取控制台输入的内容
 * author薄荷猫
 */
public class ReaderAndWriter {
    public static void main(String[] args) {
        //设置无线循环，实现控制台的多次输入
        while (true){
            try{
                // 在当前目录下创建名为”word.txt"的文本文件
                File file = new File("word.txt");
                // 如果文件不存在时创建新的文件
                if (!file.exists()) {
                    file.createNewFile();
                }
                    System.out.println("请输入要执行的操作序号：（1，写入文件；2，读取文件");
                    // 控制台输入
                    Scanner sc = new Scanner(System.in);
                    // 获得要执行的操作序号
                    int choice = sc.nextInt();
                    // 以操作序号为关键字的多分支语句
                    switch (choice){
                        // 控制台输入1
                        case 1:
                            System.out.println("请输入要写入文件的内容");
                            // 获得控制台上要写入文件的内容
                            String tempStr = sc.next();
                            // 声明字符输出流
                            FileWriter fw = null;
                            try {
                                // 创建可扩展的字符输出流，项文件中写入新数据时不覆盖已存在的数据
                                fw = new FileWriter(file,true);
                                // 吧控制台上的文本内容写入到word.txt中
                                fw.write(tempStr + "\r\n");
                            }catch (IOException e){
                                e.printStackTrace();
                            }finally {
                                fw.close();
                            }
                            System.out.println("上述内容已写入到文本文件中！");
                            break;
                        case 2:
                            FileReader fr = null;
                            if (file.length() == 0){
                                System.out.println("文本中的字符数为0");
                            }else {
                                try {
                                    // 创建用来读取word.txt中的字符输入流
                                    fr = new FileReader(file);
                                    // 创建可容纳1024个字符的数组用来储存读取的字符数的缓冲区
                                    char[] cbuf = new char[1024];
                                    int hasread = -1;
                                    while ((hasread = fr.read(cbuf)) != -1){
                                        System.out.println("文件word.txt中的内容：\n" + new String(cbuf,0,hasread));

                                    }

                                }catch (IOException e){
                                    e.printStackTrace();
                                }finally {
                                    fr.close();
                                }
                            }
                            break;
                            default:
                                System.out.println("请输入符合要求的有效数字");
                                break;
                    }

            }catch (InputMismatchException imexc){
                System.out.println("输入的文本格式不正确，请重新输入。。。");
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
