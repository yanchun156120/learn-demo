package com.xiaochun.test.design.singleton;

/**
 * 我们进行了两次if (instance== null)检查，这样就可以保    证线程安全了。这样，实例化代码只用执行一次，后面再次访问时，判断if (instance== null)，直接return实例化对象。
 *
 * 优点：线程安全；延迟加载；效率较高。
 */
public class Singleton {
	/**
	 * 懒汉式变种，属于懒汉式中最好的写法，保证了：延迟加载和线程安全
	 */
	private static Singleton instance=null;
	
	private Singleton() {};
	
	public static Singleton getInstance(){
		 if (instance == null) {  
	          synchronized (Singleton.class) {  
	              if (instance == null) {  
	            	  instance = new Singleton();  
	              }  
	          }  
	      }  
	      return instance;  
	}
}