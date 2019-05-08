package com.soft1841.Thread_demo;

/**
 * 线程的同步
 * author薄荷猫
 */
public class ThreadSafeTest implements Runnable{
    // 设置当前总票数
    int num = 10;
    @Override
    public void run() {
        // 设置无限循环
        while (true){
            if (num > 0){
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "---票数" + num--);
            }
        }
    }

    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
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
