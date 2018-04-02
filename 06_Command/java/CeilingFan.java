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
	}
	public void high() {
		System.out.println(location + "ceiling fan is on high");
	}
	public void medium() {
		System.out.println(location + "ceiling fan is on medium");
	}
	public void low() {
		System.out.println(location + "ceiling fan is on low");
	}
	public void off() {
		speed = OFF;
		System.out.println(location + "ceiling fan is off");
	}
	public int getSpeed() {
		return speed;
	}
}
