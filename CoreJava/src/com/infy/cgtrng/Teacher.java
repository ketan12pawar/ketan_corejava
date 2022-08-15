package com.infy.cgtrng;

public class Teacher {
	private String teacherName;
	private String subject;
	private double salary;

	Teacher(String teacherName,String subject,double salary){
		this.teacherName=teacherName;
		this.subject=subject;
		this.salary=salary;

	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display() {
		System.out.println("Name: "+getTeacherName()+" "+" Subject:"+getSubject()+" "+"Salary:"+getSalary());

	}



	public static void main(String [] args) {
		Teacher object[] = new Teacher[5];
		object[0] = new Teacher("Alex","Java Fundamental",1200.0);
		object[1] = new Teacher("john","RDBMS",800.0);
		object[2] = new Teacher("Sam","Networking",900.0);
		object[3] = new Teacher("Maria","Python",900.0);


		for( int i = 0; i<4;i++) {
			object[i].display();


		}
	}

}

