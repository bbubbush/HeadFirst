package com.bbubbush.github.factory;

public abstract class PizzaStore {
	SimplePizzaFactory factory;
	
//	public PizzaStore(SimplePizzaFactory factory) {
//		// TODO Auto-generated constructor stub
//		this.factory = factory;
//	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	abstract protected Pizza createPizza(String type);
}
