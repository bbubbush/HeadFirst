package com.bbubbush.github.decorator;

public abstract class Beverage {
	String description = "���� ����";
	String size = TALL;			// �⺻ ������
	final static String TALL = "T";
	final static String GRANDE = "G";
	final static String VENTI = "V";
	
	public String getDescription () {
		return description;
	}
	
	public abstract double cost();
	
	// size ���� �޼���
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
