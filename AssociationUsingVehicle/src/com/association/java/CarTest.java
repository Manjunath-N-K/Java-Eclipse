package com.association.java;

public class CarTest {

	public static void main(String[] args) {
		Honda h=new Honda();
		h.setColor("Black");
		h.setSpeed(180);
		h.carDetails();
		h.hondaEngine();
		h.hondaMusic();
		
		Honda h1=new Honda();
		h1.setColor("WHite");
		h1.setSpeed(80);
		h1.carDetails();
		h1.hondaEngine();
		h1.hondaMusic();
	}
}
