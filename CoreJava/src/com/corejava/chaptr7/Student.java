package com.corejava.chaptr7;

public class Student {

	private String name;
	private int rollNo;
	private String branch;
	private String collegeName;
	private int year;
	private float result;
	private char sex;

	Student(String name,int rollNo,String branch,String collegeName,int year,float result,char sex){
		this.name = name;
		this.rollNo = rollNo;
		this.branch = branch;
		this.collegeName = collegeName;
		this.year = year;
		this.result = result;
		this.sex = sex;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
}
