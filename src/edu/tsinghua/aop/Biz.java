package edu.tsinghua.aop;

public class Biz implements IBiz{

	@Override
	public void buy(double price, int num) {
		System.out.println("1----------");
		System.out.println("price*num="+(num*price));
		System.out.println("2----------");
		
	}

}
