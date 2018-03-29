package com.bbubbush.github.factory;

public class NYPizzaStore extends PizzaStore{
	
	@Override
	protected Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new NYStyleCheesePizza();
		} 
//		else if (type.equals("pepperoni")) {
//			pizza = new NYStylePepperoniPizza();
//		} else if (type.equals("clam")) {
//			pizza = new NYStyleClamPizza();
//		} else if (type.equals("veggie")) {
//			pizza = new NYStyleVeggiePizza();
//		}
		return pizza;
	}
}
