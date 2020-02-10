package com.addteq.bean;

public class Employee {

	private int id;
	private String name;
	private String dept;
	private Address address;

	public Employee() {

	}

	public Employee(int id, String name, String dept, Address address) {

		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", address=" + address + "]";
	}

}
