package com.corejava.chaptr7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		name = "moinca";

		Demo obj1 = new Demo();
		obj1.hashCode();
		System.out.println(obj1.hashCode());


		//
		Student student1 = new Student("Ketan Pawar",101,"CSE","Prestige",2,8.9f,'M');
		Student student2 = new Student("Khusi Pawar",102,"CSE","Prestige",2,8.9f,'F');
		Student student3 = new Student("Ajay Pawar",103,"CSE","Prestige",2,8.9f,'M');
		Student student4 = new Student("Sanjay Pawar",104,"CSE","Prestige",2,8.9f,'M');
		Student student5 = new Student("Dheeraj Pawar",105,"CSE","Prestige",2,8.9f,'M');

		//example of List to store object of type Student 
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);  // all five student are now stored in list

		// Now lets try to read the data to make sure they are really stored
		// for each is a specific type of loop to iterate collection
		try {
			for(Student s1 : studentList){
				System.out.println("Read College Name "+ s1.getCollegeName() + " RollNo  " + s1.getRollNo());
				if(101 == s1.getRollNo()){
					studentList.remove(s1);
				}
			}
		}
		catch(Exception varEcep){
			System.out.println(varEcep);
		}




		// Map is used when we have data with and key and value pair and it will always have unique key
		// 101 ketan  10 = Khushi
		// <key Value>
		Map<String,String> studentmap = new HashMap<String, String>();
		studentmap.put("101", "Ketan Pawar");
		studentmap.put("106", "Ketan Pawar");
		studentmap.put("103", "Ketan Pawar");
		studentmap.put("104", "Ketan Pawar");
		studentmap.put("105", "Ketan Pawar");

		Employee employee1 = new Employee(201, "Ketan Pawar ","IT","Delhi",'M');
		Employee employee2 = new Employee (202 ,"Khushi Pawar","IT","Kolkata",'F');
		Employee employee3= new Employee(203,"Ajay Pawar","CSE","Banglore",'M');
		Employee employee4 = new Employee(204,"Sanjay Pawar","CSE","Prestige",'M');
		Employee employee5 = new Employee(205,"Sanjay Pawar","CSE","Prestige",'M');


		//Adding Employee to map  
		Map<Integer,Employee> employeeMap = new HashMap(); 
		employeeMap.put(201,employee4);
		employeeMap.put(202,employee5);
		employeeMap.put(203,employee3);
		employeeMap.put(204,employee2);
		employeeMap.put(205,employee1);

		//Traversing  Employee Map  
		Iterator itr = employeeMap.entrySet().iterator();
		while(itr.hasNext()){  
			//Converting to Map.Entry so that we can get key and value separately  
			Map.Entry entry=(Map.Entry)itr.next();  
			Employee emp = (Employee)entry.getValue();
			System.out.println(entry.getKey()+" "+ emp.getName());  
		}  

	}

}



