package com.bbubbush.github.decorator;

public abstract class Beverage {
	String description = "제목 없음";
	String size = TALL;			// 기본 사이즈
	final static String TALL = "T";
	final static String GRANDE = "G";
	final static String VENTI = "V";
	
	public String getDescription () {
		return description;
	}
	
	public abstract double cost();
	
	// size 관련 메서드
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
}
