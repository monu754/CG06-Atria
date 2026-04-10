package com.tnsif.inheritance;

public class Child extends Father {
	String cycle = "pink";
	int money = 10000;
	
	void drink () {
		super.drink();
		System.out.println("Harleen drinks coffee");
	}
	
	void read() {
		System.out.println("Java");
		System.out.println(super.money);
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		
		System.out.println(c.money);
		c.drink();
		System.out.println(c.car);
		System.out.println(c.cycle);
		c.read();
		
	}

}