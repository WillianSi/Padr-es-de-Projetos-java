package willian.factories;

import willian.pizzas.Pizza;

public abstract class PizzaFactory {
	protected abstract Pizza montarPizza(String sabor);
	
	public Pizza produzirPizza(String sabor) {
		Pizza pizza = montarPizza(sabor);
		
		pizza.preparar();
		pizza.assar();
		pizza.cortar();
		pizza.embalar();
		
		return pizza;
	}
}
