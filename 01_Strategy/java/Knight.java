package com.bbubbush.github.strategy;

public class Knight extends Character {
	public Knight() {
		// TODO Auto-generated constructor stub
		weapon = new KnifeBehavior();
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		weapon.useWeapon();
	}
}
