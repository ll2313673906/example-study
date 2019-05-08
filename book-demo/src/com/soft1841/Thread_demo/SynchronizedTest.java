package com.soft1841.Thread_demo;

/**
 * 设置同步块模拟售票系统
 * author薄荷猫
 */
public class SynchronizedTest implements Runnable{
    int num = 10;
    @Override
    public void run() {
     while (true){
         synchronized (this){
             if (num > 0){
                 try {
                     Thread.sleep(100);
                 }catch (Exception e){
                     e.printStackTrace();
                 }
                 System.out.println(Thread.currentThread().getName()+ "--票数" + num--);
             }
         }
     }
    }

    public static void main(String[] args) {
        SynchronizedTest t = new SynchronizedTest();
        Thread tA = new Thread(t,"线程一");
        Thread tB = new Thread(t,"线程二");
        Thread tC = new Thread(t,"线程三");
        Thread tD = new Thread(t,"线程四");
        tA.start();
        tB.start();
        tC.start();
        tD.start();
    }
}
