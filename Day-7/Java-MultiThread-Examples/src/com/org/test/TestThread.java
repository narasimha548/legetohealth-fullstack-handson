package com.org.test;

import com.org.Thread1;


public class TestThread {
	
	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		//Thread2 t2=new Thread2();
		//Thread3 t3=new Thread3();
		
		
		Thread t4=new Thread(t1, "A");
		Thread t5=new Thread(t1, "B");
		Thread t6=new Thread(t1, "C");
		
		t4.setDaemon(true);
		t4.start();
		
		t5.setDaemon(true);
		t5.start();
		
		t6.setDaemon(true);
		t6.start();
		
		
	}

}
