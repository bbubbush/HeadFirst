package com.bbubbush.github.command;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	int speed;
	String location;
	
	public CeilingFan(String location) {
		// TODO Auto-generated constructor stub
		this.location = location;
		speed = OFF;
	}
	public void high() {
		speed = HIGH;
		System.out.println(location + " is " + "high");
	}
	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " is " + "medium");
	}
	public void low() {
		speed = LOW;
		System.out.println(location + " is " + "low");
	}
	public void off() {
		speed = OFF;
		System.out.println(location + " is " + "off");
	}
	public int getSpeed() {
		return speed;
	}
}
