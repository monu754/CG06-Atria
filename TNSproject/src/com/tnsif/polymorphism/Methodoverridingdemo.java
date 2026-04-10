package com.tnsif.polymorphism;

class Father{
	int a = 9;
	
	void drink() {
		System.out.println("tea");
	}
}
class son extends Father{
	@Override
	void drink() {
		System.out.println("Red Label");
	}
}


public class Methodoverridingdemo {
	public static void main(String[] ags) {
		son s = new son();
		s.drink();
	}
}
