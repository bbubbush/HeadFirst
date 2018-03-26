package com.bbubbush.github.strategy;

public class ModelDuck extends Duck {
	public ModelDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 모형오리임 ㅇㅇ 소리만 난다우");
	}
}
