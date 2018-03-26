package com.bbubbush.github.strategy;

public class MallardDuck extends Duck{
	public MallardDuck() {
		// TODO Auto-generated constructor stub
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("저는 물오리임 ㅇㅇ");
	}
}
