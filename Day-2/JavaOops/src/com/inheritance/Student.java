package com.inheritance;

public class Student extends Person {
	
	private String rollNo;
	private String grade;
	
	public Student(String rollNo, String name, String gender, String grade) {
		super(name, gender); // it  calls to super class Person(String, String) contructor
		this.rollNo = rollNo;
		this.grade = grade;
		System.out.println("Student(String, String, String, String) constructor");
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("rollNo = "+rollNo+", grade = "+grade);
	}
}
