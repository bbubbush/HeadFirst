package com.bbubbush.github.decorator;

public class DarkRoast extends Beverage{
	public DarkRoast() {
		// TODO Auto-generated constructor stub
		description = "��ũ �ν�Ʈ";
	}
	public DarkRoast(String size) {
		// TODO Auto-generated constructor stub
		this();
		setSize(size);
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .99;
	}
	
	 
}
