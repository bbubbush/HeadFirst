package com.bbubbush.github.decorator;

public class Espresso extends Beverage{
	
	public Espresso() {
		// TODO Auto-generated constructor stub
		description = "에스프레소";
	}
	public Espresso(String size) {
		// TODO Auto-generated constructor stub
		this();
		setSize(size);
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}
}
