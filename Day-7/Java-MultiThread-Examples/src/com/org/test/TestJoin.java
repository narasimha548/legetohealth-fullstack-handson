package com.org.test;

import com.org.Thread2;

public class TestJoin {
	public static void main(String[] args) {
		
		Thread2 t2=new Thread2();
		
		Thread t4=new Thread(t2, "D");
		Thread t5=new Thread(t2, "E");
		Thread t6=new Thread(t2, "G");
		
		
		
		try {
			t4.start();
			 System.out.println("Current Thread: "
	                  + Thread.currentThread().getName());
			t4.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	
		try {
			t5.start();
			 System.out.println("Current Thread: "
	                  + Thread.currentThread().getName());
			t5.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		t6.start();
	
		/*
		 * try { t6.start(); System.out.println("Current Thread: " +
		 * Thread.currentThread().getName()); //t6.join(); } catch (InterruptedException
		 * e) {
		 * 
		 * e.printStackTrace(); }
		 */
		
	}

}
