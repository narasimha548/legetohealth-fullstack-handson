package com;

public class Student {

	private Integer studentID;
	private String name;
	private String city;
	private Integer marks1;
	private Integer marks2;
	private Integer marks3;
	private float feePerMonth;
	private boolean isEligibleForScholarship;

	public Student() {

	}
	
	

	public Student(Integer studentID, String name, String city, Integer marks1, Integer marks2, Integer marks3,
			float feePerMonth, boolean isEligibleForScholarship) {
		
		this.studentID = studentID;
		this.name = name;
		this.city = city;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
		this.feePerMonth = feePerMonth;
		this.isEligibleForScholarship = isEligibleForScholarship;
	}



	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getMarks1() {
		return marks1;
	}

	public void setMarks1(Integer marks1) {
		this.marks1 = marks1;
	}

	public Integer getMarks2() {
		return marks2;
	}

	public void setMarks2(Integer marks2) {
		this.marks2 = marks2;
	}

	public Integer getMarks3() {
		return marks3;
	}

	public void setMarks3(Integer marks3) {
		this.marks3 = marks3;
	}

	public float getFeePerMonth() {
		return feePerMonth;
	}

	public void setFeePerMonth(float feePerMonth) {
		this.feePerMonth = feePerMonth;
	}

	public boolean isEligibleForScholarship() {
		return isEligibleForScholarship;
	}

	public void setEligibleForScholarship(boolean isEligibleForScholarship) {
		this.isEligibleForScholarship = isEligibleForScholarship;
	}

	
	public float 	getAnualFee() {
		return this.feePerMonth*12;
	}
	
	public Integer getTotalmarks() {
		return (this.marks1+this.marks2+this.marks3);
	}

	public Integer getAverage() {
	
		return (this.marks1+this.marks2+this.marks3)/3;
	}
	
	public String 	getResult(){
		
		
		if(this.marks1 >60 || this.marks2 >60 || this.marks3 >60) {
		return "pass";
		}else {
			return "fail";
		}
		
	}

	

	
}
