package willian.factories;

import willian.pizzas.Pizza;
import willian.pizzas.PizzaMarghrita;
import willian.pizzas.PizzaMozzarella;
import willian.pizzas.PizzaQuatroQueijos;

public class PizzaTradicionalFactory extends PizzaFactory{

	@Override
	protected Pizza montarPizza(String sabor) {
		
		Pizza pizza = null;
		if(sabor.equals("margherita")) {
			pizza = new PizzaMarghrita();
		}
		else if (sabor.equals("mozzarella")) {
			pizza = new PizzaMozzarella();
		}
		else if (sabor.equals("quatroqueijos")) {
			pizza = new PizzaQuatroQueijos();
		}
		return pizza;
	}
	
}
