package com.user;

public class User {
	private int userId;
	private String name;
	private String age;
	
	
	public User() {
		super();
	}


	public User(int userId, String name, String age) {
		
		this.userId = userId;
		this.name = name;
		this.age = age;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	

}
