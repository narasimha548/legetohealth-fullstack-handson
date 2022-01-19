package com.org.test;

public class Shared implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();

		System.out.println("Name = " + name + " Entered");

		for (int i = 0; i <= 10; i++) {

			try {
				System.out.println("Name = " + name+"   Entered===" + i );
				Thread.sleep(1000);

				if (name.equals("A") && i == 5) {
					wait();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		notifyAll();

		System.out.println(name + " Exits from the run() ==========");

	}

}
