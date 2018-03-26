package com.bbubbush.github.strategy;

public abstract class Character {
	WeaponBehavior weapon;
	
	abstract public void fight();
	
	public void setWeapon(WeaponBehavior wb) {
		this.weapon = wb;
	}
}
