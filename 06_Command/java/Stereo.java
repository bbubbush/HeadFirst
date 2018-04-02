package com.bbubbush.github.command;

public class Stereo {
	String place;
	int volume;
	public Stereo(String place) {
		// TODO Auto-generated constructor stub
		this.place = place;
	}
	public void on() {
		System.out.println(place + " stereo is on");
	}
	
	public void off() {
		System.out.println(place + " stereo is off");
	}
	
	public void setCd() {
		System.out.println(place + " stereo is set for CD input");
	}
	
	public void setDvd() {
		System.out.println(place + " stereo is set for DVD input");
		
	}
	public void setRadio() {
		System.out.println(place + " stereo is set for Radio input");
	}
	public void setVolume(int volume) {
		System.out.println(place + " stereo volume set to " + volume);
		this.volume = volume;
	}
}
