package com.tnsif.constructor;

public class ConExample {
	ConExample(){
		System.out.println("Default constructor");
	}
	ConExample(int a, String b){
		System.out.println("2 parameters");
	}
	ConExample(int r){
		System.out.println("1 Parameter");
	}
	ConExample(int s, int b, int d){
		System.out.println("3 Parameters");
	}
	public static void main(String[] args) {
		ConExample c = new ConExample();
		ConExample c1 = new ConExample(21, "Manotosh");
		ConExample c2 = new ConExample(85);
		ConExample c3 = new ConExample(90, 85, 80);
	}
}
