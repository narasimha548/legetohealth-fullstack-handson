package com.legatohealth.exceptions;

@SuppressWarnings("serial")
public class UserNotFoundEception  extends Exception{

	public UserNotFoundEception() {
		super();
	}
	
	public UserNotFoundEception(String message) {
		super(message);
	}
}
