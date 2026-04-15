package com.tnsif.interfacedemo;


interface Smartdevice{
	void turnOn();
	void tunrOff();
	void getStatus();
}

class Smartlight implements Smartdevice{

	@Override
	public void turnOn() {
		System.out.println("Smart light On");
		
	}

	@Override
	public void tunrOff() {
		System.out.println("Smart Light Off");
		
	}

	@Override
	public void getStatus() {
		System.out.println("Smart Light is on StandBy");
		
	}
	
}
public class interfacedemo {
	public static void main(String[] args) {
		Smartlight s = new Smartlight();
		s.tunrOff();
		s.turnOn();
		s.getStatus();
	}
}
