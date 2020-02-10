package com.addteq.bean;

public class Person {

	private String name;
	private Date birthdate;

	public Person() {

	}

	public Person(String name, Date birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthdate=" + birthdate + "]";
	}

}
