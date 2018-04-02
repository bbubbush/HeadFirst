package com.bbubbush.github.command;

public class GarageDoor {
	String place;
	
	public GarageDoor(String place) {
		// TODO Auto-generated constructor stub
		this.place = place;
	}
	
	public void up() {
		System.out.println(place + "차고문 업업");
	}
	public void down() {
		System.out.println(place + "차고문 다운다운");
	}
	public void stop() {
		
	}
	public void lightOn() {
		
	}
	public void lightOff() {
		
	}
}
