package com.xiaochun.test.design.singleton;

/**
 * 当一个线程还没有实例化Singleton时另一个线程执行到if(instance==null)这个判断语句时就会进入if语句，虽然加了锁，但是等到第一个线程执行完instance=new Singleton()跳出这个锁时，另一个进入if语句的线程同样会实例化另外一个Singleton对象，线程不安全的原理跟4.3类似。因此这种改进方式并不可行，经过大神们一步一步的探索，写出了懒汉式的双重校验锁。
 * ————————————————
 * <p>
 * 版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
 * <p>
 * 原文链接：https://blog.csdn.net/dmk877/article/details/50311791
 */
public class Singleton3 {

    private static Singleton3 instance = null;

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                instance = new Singleton3();
            }
        }
        return instance;
    }
}