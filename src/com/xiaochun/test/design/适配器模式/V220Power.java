package com.xiaochun.test.design.适配器模式;
 
/**
 * 家用220V交流电
 * @author zhy
 *
 */
public class V220Power
{
	/**
	 * 提供220V电压
	 * @return
	 */
	public int provideV220Power()
	{
		System.out.println("我提供220V交流电压。");
		return 220 ; 
	}
}