package com.bbubbush.github.template;

public abstract class CaffeineBeverage {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("�� ���̴� ��");
	}
	
	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("�ſ� ������ ��");
	}

	abstract void brew();
	abstract void addCondiments();
}
