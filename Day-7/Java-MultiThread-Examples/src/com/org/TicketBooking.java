package com.org;

public class TicketBooking  implements Runnable{
	
	static int avaibleTkt=1;
	
	public synchronized void bookTicket() {
		
		String name=Thread.currentThread().getName();
		
		System.out.println("Name = "+name +" Entered");
		
		if(avaibleTkt!=0) {
			System.out.println("Name = "+name +" got the ticket");
			avaibleTkt--;
		}else {
			System.out.println("Name = "+name +" didn't get  the ticket");
		}
		
	}

	@Override
	public void run() {
		bookTicket();
		
	}

}
