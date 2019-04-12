package com.soft1841;

import java.util.concurrent.Callable;

/**
 * equals方法
 */

public class EqualsTest {
    public static void main(String[] args) {
        B b1 = new B(20);
        B b2 = new B(20);
        System.out.println(b1.equals(b2));

    }

} class B{
        private int i;
        B(int i){
            this.i = i;
        }
        public boolean equals(B b2){
            if (this.i == b2.i)
                return true;
            else return false;
        }

    }

