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
		System.out.println("물 끓이는 중");
	}
	
	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("컵에 따르는 중");
	}

	abstract void brew();
	abstract void addCondiments();
}
