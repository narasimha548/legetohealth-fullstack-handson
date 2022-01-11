package com.inheritance;

public class Employee  extends Person{
	
	private int employeeId;
	private double salary;
	
	public Employee(int employeeId, String name, String gender, double salary) {
		super(name, gender); // it  calls to super class Person(String, String) contructor
		this.employeeId = employeeId;
		this.salary = salary;
		System.out.println("Employee(int, String, String, double) constructor");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	@Override
	public void display() {
		
		super.display();
		System.out.println("Id = "+employeeId+", Salary = "+salary);
	}
	

}
