package com.bbubbush.github.strategy;

public class King extends Character{
	public King() {
		// TODO Auto-generated constructor stub
		weapon = new AxeBehavior();
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		weapon.useWeapon();
	}
}
