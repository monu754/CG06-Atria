package com.tnsif.scannerclassdemo;

import java.util.Scanner;

public class Scannerdemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id : ");
		int id = sc.nextInt();
		
		System.out.print("Enter the name : ");
		String name = sc.next();
	}
}	
