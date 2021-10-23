package com.association.java;

public class Honda extends Car {
	
	public void hondaEngine() {
		CarEngine c=new CarEngine();
		c.engineStarts();
	}

	public void hondaMusic() {
		MusicPlayer m=new MusicPlayer();
		m.carMusicPlayer();
	}
}
