package com.org.test;

public class TestInterCommunciation {
	public static void main(String[] args) {
		
		Shared s=new Shared();
		
		Thread t4 = new Thread(s, "A");
		Thread t5 = new Thread(s, "B");
		Thread t6 = new Thread(s, "C");
		t4.start();
		t5.start();
		t6.start();
		
		System.out.println("main thread ends here========");
	}

}
