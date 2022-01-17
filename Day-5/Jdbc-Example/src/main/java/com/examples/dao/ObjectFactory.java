package com.examples.dao;

public class ObjectFactory {
	public static EmployeeDao getInstance() {
		return new EmployeeDaoImpl();
	}
}