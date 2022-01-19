package com.org;

public class Thread1 implements Runnable {
	
	public void demo() {
		for(int i=0;i<50;i++) {
			System.out.println("i= "+i +" thread= "+Thread.currentThread().getName());
		}
	}

	@Override
	public void run() {
		
		demo();
	}

}
