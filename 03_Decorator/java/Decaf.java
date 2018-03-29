package com.bbubbush.github.decorator;

public class Decaf extends Beverage{
	public Decaf() {
		// TODO Auto-generated constructor stub
		description = "디 카페인";
	}
	
	public Decaf(String size) {
		// TODO Auto-generated constructor stub
		this();
		setSize(size);
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}
}
