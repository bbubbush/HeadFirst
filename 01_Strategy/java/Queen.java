package com.bbubbush.github.strategy;

public class Queen extends Character{
	public Queen() {
		// TODO Auto-generated constructor stub
		weapon = new SwordBehavior();
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		weapon.useWeapon();
	}
}
