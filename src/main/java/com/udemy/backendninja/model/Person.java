package com.udemy.backendninja.model;

public class Person {
	private String name;
	private int age;
	//get&Set
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
	//Constructor
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
