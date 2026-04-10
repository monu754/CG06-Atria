package com.tnsif.statickeyworddemo;

class student{
	String name;
	int id;
	static String collegeName = "Atria";
	public student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	void showdetails() {
		System.out.println("Student: "+name+"\t id: "+id+"\t College Name: "+collegeName);
	}
}

public class Staticvariabledemo {
	public static void main(String[] args ) {
	
		student s1 = new student("Guru",1);
		student s2 = new student("Prajwal",2);
		student s3 = new student("Rahul",3);
		student s4 = new student("Harry",4);
		s1.showdetails();
		s2.showdetails();
		s3.showdetails();
		s4.showdetails();
		
	}		
}
