package com.bbubbush.github.decorator;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		// TODO Auto-generated constructor stub
		description = "�Ͽ콺 ���� Ŀ��";
	}
	public HouseBlend(String size) {
		// TODO Auto-generated constructor stub
		this();
		setSize(size);
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .89;
	}
}
