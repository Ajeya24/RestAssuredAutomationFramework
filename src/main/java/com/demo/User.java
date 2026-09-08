package com.demo;

public class User {
	
	private String name;
	private int age;
	
	
	// Constructor is only used to initialise the member functions of a class
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//Default Constructor for Jackson library as it does not read the parameterised constructor
	public User() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	

}