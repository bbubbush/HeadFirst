package com.bbubbush.github.strategy;

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void sim() {
		System.out.println("모든 오리는 수영을 함. 가짜 오리도 수영함 ㅇㅇ");
	}
	
	public void setFlyBehavior (FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	public void setQuackBehavior (QuackBehavior qb) {
		this.quackBehavior = qb;
	}
}


