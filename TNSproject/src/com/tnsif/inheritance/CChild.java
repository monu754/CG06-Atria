package com.tnsif.inheritance;

public class CChild extends BChild{
	int c = 30;
	String name3 = "Monu";
	
	void read3() {
		System.out.println("Class C");
	}
	
	public static void main(String[] args) {
		CChild c = new CChild();
		System.out.println(c.a);
		System.out.println(c.b);
		c.read();
		c.read2();
		c.read3();
		
		System.out.println(c.name);
		System.out.println(c.name2);
		System.out.println(c.name3);
	}
}
