package com.bbubbush.github.template;

public class Coffee extends CaffeineBeverage{
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("설탕과 우유를 추가하는 중");
	}
	
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("필터를 통해서 커피를 우려내는 중");
	}
}
