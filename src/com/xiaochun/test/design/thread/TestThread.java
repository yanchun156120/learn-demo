package com.xiaochun.test.design.thread;

public class TestThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("hello world"));
        thread.start();


        Thread thread1 = new Thread() {
            @Override
            public void run() {
                super.run();
            }
        };
        thread1.start();

    }
}
