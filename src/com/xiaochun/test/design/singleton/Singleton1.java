package com.xiaochun.test.design.singleton;

/**
 * 这种方式是在调用getInstance方法的时候才创建对象的，所以它比较懒因此被称为懒汉式。
 * 在上述两种写法中懒汉式其实是存在线程安全问题的，喜欢刨根问题的同学可能会问，
 * 存在怎样的线程安全问题？怎样导致这种问题的？好，我们来说一下什么情况下这种写法会有问题。
 * 在运行过程中可能存在这么一种情况：有多个线程去调用getInstance方法来获取Singleton的实例，
 * 那么就有可能发生这样一种情况当第一个线程在执行if(instance==null)这个语句时，
 *此时instance是为null的进入语句。在还没有执行instance=new Singleton()时(此时instance是为null的)第二个线程也进入if(instance==null)这个语句，
 * 因为之前进入这个语句的线程中还没有执行instance=new Singleton()，所以它会执行instance=new Singleton()来实例化Singleton对象，
 * 因为第二个线程也进入了if语句所以它也会实例化Singleton对象。这样就导致了实例化了两个Singleton对象。所以单例模式的懒汉式是存在线程安全问题的，
 * 既然它存在问题，那么可能有解决这个问题的方法，那么究竟怎么解决呢？对这种问题可能很多人会想到加锁于是出现了下面这种写法。
 * <p>
 * ————————————————
 * <p>
 * 版权声明：本文为博主原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接和本声明。
 * <p>
 * 原文链接：https://blog.csdn.net/dmk877/article/details/50311791
 *
 * 单例模式的懒汉式[线程不安全，不可用]
 */
public class Singleton1 {

    private static Singleton1 instance = null;

    private Singleton1() {
    }

    ;

    public static Singleton1 getInstance() {

        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}