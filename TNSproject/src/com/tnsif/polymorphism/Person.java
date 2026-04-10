package com.tnsif.polymorphism;

class Human{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void display() {
		System.out.println("Name: "+name);
	}
}
public class Person {

	public static void main(String[] args) {
		Human h = new Human();
		h.setName("Manotosh");
		h.getName();
		h.display();
	}
}
