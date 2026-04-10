package com.tnsif.inheritance;

public class Daughter extends Father{
	String cycle = "Blue";
		
	void read() {
		System.out.println("Python");
	}
	public static void main(String[] args) {
		Daughter d = new Daughter();
		System.out.println(d.money);
		d.drink();
		
		System.out.println(d.car);
		System.out.println(d.cycle);
		d.read();
		
	}
}
