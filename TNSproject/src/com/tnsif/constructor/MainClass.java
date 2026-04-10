package com.tnsif.constructor;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		Student st = new Student();
		st.setAge(age);
		st.setName(name);
		
		System.out.println("After Entering the value: ");
		System.out.println(st);
	}
}
