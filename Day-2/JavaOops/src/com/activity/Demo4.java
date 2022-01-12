package com.activity;

public class Demo4 extends Demo3 implements Demo,Demo2 {
	
	Demo d;

	@Override
	public void m3() {
		System.out.println(" demo2 interface called m3()");
		
	}

	@Override
	public void m4() {
		System.out.println(" demo2 interface called m4()");
		
	}

	@Override
	public void m1() {
		System.out.println(" demo interface  called m1()");
		
	}

	@Override
	public void m2() {
		System.out.println(" demo interface called m2()");
		
	}

}
