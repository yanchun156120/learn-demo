package com.xiaochun.test.design.适配器模式;
 
public class Test
{
	public static void main(String[] args)
	{
		Mobile mobile = new Mobile();
		V5Power v5Power = new V5PowerAdapter(new V220Power()) ; 
		mobile.inputPower(v5Power);
	}
}