package com.org.dao;

public class EmployeeOrmImpl  implements EmployeeDao{
	
	
	public EmployeeOrmImpl() {
		System.out.println("EmployeeOrmImpl const---");
	}

	public void store() {
		System.out.println("---store() called on EmployeeOrmImpl---");
		
	}

	public void delete() {
		System.out.println("---delete() called on EmployeeOrmImpl----");
		
	}

}
