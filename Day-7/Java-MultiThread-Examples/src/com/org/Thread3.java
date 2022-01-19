package com.org;

public class Thread3 implements Runnable {
	
	public void demo() {
		for(int i=100;i<130;i++) {
			System.out.println("i= "+i +" thread= "+Thread.currentThread().getName());
		}
	}

	@Override
	public void run() {
		demo();

	}

}
