package com.org.dao;

public class EmployeeJdbcImpl implements EmployeeDao {
	
	
	public EmployeeJdbcImpl() {
		System.out.println("EmployeeJdbcImpl const");
	}
	
	public void store() {
		System.out.println("---store() called on EmployeeJdbcImpl---");
	}

	public void delete() {
		System.out.println("---delete() called on EmployeeJdbcImpl----");
	}


	

}
