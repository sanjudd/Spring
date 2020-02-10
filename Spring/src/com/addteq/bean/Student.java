package com.addteq.bean;

public class Student {

	private String name;

	public Student() {

		System.out.println("Creating obj using Default Constructor");
	}

	public Student(String name) {

		System.out.println("Creating obj");
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}

}
