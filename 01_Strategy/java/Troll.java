package com.bbubbush.github.strategy;

public class Troll extends Character {
	public Troll() {
		// TODO Auto-generated constructor stub
		weapon = new BowAndArrowBehavior();
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		weapon.useWeapon();
	}
}
