package com.bbubbush.github.decorator;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", ¸ðÄ«";
	}
	
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double tempCost = 0.0;
		if ( getSize() == Beverage.TALL ) {
			tempCost = .2;
		}else if ( getSize() == Beverage.GRANDE ) {
			tempCost = .3;
		}else if ( getSize() == Beverage.VENTI ) {
			tempCost = .4;
		}
		return tempCost + beverage.cost();
	}
}
