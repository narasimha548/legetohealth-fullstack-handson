package com.user;

@SuppressWarnings("serial")
public class UserNotFoundException  extends Exception{
	
	
	public UserNotFoundException() {
		super("User Not Found Excpetion");
	}
	
	public UserNotFoundException(String message) {
		super(message);
	}
	
	public UserNotFoundException(String message, Throwable th) {
		super(message,th);
	}
	
	
	public UserNotFoundException(Throwable th) {
		
	}
	
	

}
