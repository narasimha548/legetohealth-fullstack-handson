package com.org.test;


import com.org.TicketBooking;

public class TestTicketBook {
	public static void main(String[] args) {
		
		TicketBooking target=new TicketBooking();

		Thread t4 = new Thread(target, "Thread-0");
		Thread t5 = new Thread(target, "Thread-1");
		Thread t6 = new Thread(target, "Thread-2");
		
		
		t4.start();
		t5.start();
		t6.start();
		
		System.out.println("Main thread ends======");
		
	}

}
