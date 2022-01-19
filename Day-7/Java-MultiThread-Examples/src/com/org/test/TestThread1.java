package com.org.test;


import com.org.Thread3;

public class TestThread1 {
	public static void main(String[] args) {
		Thread3 t3 = new Thread3();

		Thread t4 = new Thread(t3, "Thread-0");
		Thread t5 = new Thread(t3, "Thread-1");
		Thread t6 = new Thread(t3, "Thread-2");
		t4.start();
		t5.start();
		t6.start();
		
		System.out.println("main thread ends here========");
		
	}

}
