package com.soft1841.Thread_demo;

/**
 * 继承Thread类创建并启动线程
 * author薄荷猫
 */
public class ThreadTest extends Thread{
    private int count = 10;
    // 重写run（）方法
    public void run(){
        while (true){
            System.out.print(count + " "); // 打印count变量
            if (--count == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 创建线程对象
        ThreadTest test = new ThreadTest();
        // 启动线程
        test.start();
    }
}
