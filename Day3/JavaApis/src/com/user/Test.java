package com.user;

import java.util.Scanner;

public class Test {

	private static User[] addUser;


	public static void main(String[] args) {

		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id:: ");
		int id=sc.nextInt();
		try {
			addUser = UserArr.addUser();
			User searchId = UserArr.searchId(id);
			if(searchId!=null)
				System.out.println("User deatils :: "+searchId);
				
			else
				throw new UserNotFoundException("User not Found");
				
		} catch (UserNotFoundException e) {
			System.err.println(e.getMessage());
		}finally {
			sc.close();
		}
	}
	
	
		

}
