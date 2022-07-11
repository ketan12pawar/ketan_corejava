package com.corejava.chaptr7;

public class Employee {

	private int id;
	private String name;
	private String department;
	private String city;
	private char sex;

	Employee(int id, String name, String department, String city, char sex){
		this.id = id;
		this.name = name;
		this.department = department;
		this.city = city;
		this.sex = sex;


	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}





