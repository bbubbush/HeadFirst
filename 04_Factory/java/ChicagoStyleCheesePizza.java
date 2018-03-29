package com.bbubbush.github.factory;

public class ChicagoStyleCheesePizza extends Pizza{
	public ChicagoStyleCheesePizza() {
		// TODO Auto-generated constructor stub
		name = "Chicago Style Deep Dish Cheese Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
		
		toppings.add("Shredded Mozzarella Cheese");
	}
	
	@Override
	void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting the pizza into square slices");
	}
}
