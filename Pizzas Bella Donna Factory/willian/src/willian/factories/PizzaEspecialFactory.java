package willian.factories;

import willian.pizzas.Pizza;
import willian.pizzas.PizzaMarghritaEspecial;
import willian.pizzas.PizzaMozzarellaEspecial;
import willian.pizzas.PizzaQuatroQueijosEspecial;

public class PizzaEspecialFactory extends PizzaFactory{

	@Override
	protected Pizza montarPizza(String sabor) {
		
		Pizza pizza = null;
		if(sabor.equals("margherita")) {
			pizza = new PizzaMarghritaEspecial();
		}
		else if (sabor.equals("mozzarella")) {
			pizza = new PizzaMozzarellaEspecial();
		}
		else if (sabor.equals("quatroqueijos")) {
			pizza = new PizzaQuatroQueijosEspecial();
		}
		return pizza;
	}
	
}
