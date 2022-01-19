package com.org;

public class Thread2 implements Runnable{

	public void demo() {
		for(int i=50;i<70;i++) {
			System.out.println("i= "+i +" thread= "+Thread.currentThread().getName());
		}
	}

	@Override
	public void run() {
		
		demo();
	}

}
