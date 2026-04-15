package com.tnsif.interfacedemo;

interface Camera{
	void takephoto();
}

interface Musicplayer{
	void playmusic();
}

class Smartphone implements Camera, Musicplayer{

	@Override
	public void playmusic() {
		System.out.println("Listening Music using Smartphone ");
		
	}

	@Override
	public void takephoto() {
		System.out.println("Take a photo with the Smart phone");
		
	}
	
}
public class MultipleInterface {
	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		s.playmusic();
		s.takephoto();
	}
}
