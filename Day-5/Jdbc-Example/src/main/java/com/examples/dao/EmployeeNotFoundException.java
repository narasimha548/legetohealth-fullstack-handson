package com.examples.dao;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends Exception {
	
	public EmployeeNotFoundException() {
		super();
		
	}

	public EmployeeNotFoundException(String message) {
		super(message);
		
	}
	
}

