package willians;

import willian.factories.PizzaEspecialFactory;
import willian.factories.PizzaFactory;
import willian.factories.PizzaTradicionalFactory;

public class BellaDonna {

	public static void main(String[] args) {
		
		PizzaFactory tradicional = new PizzaTradicionalFactory();
		PizzaFactory especial = new PizzaEspecialFactory();
		
		tradicional.produzirPizza("margherita");
		System.out.println("-------------------------------------------------------------");
		
		especial.produzirPizza("margherita");
		System.out.println("-------------------------------------------------------------");
		
		tradicional.produzirPizza("mozzarella");
		System.out.println("-------------------------------------------------------------");
		
		especial.produzirPizza("mozzarella");
		System.out.println("-------------------------------------------------------------");
		
		tradicional.produzirPizza("quatroqueijos");
		System.out.println("-------------------------------------------------------------");
		
		especial.produzirPizza("quatroqueijos");
		
	}

}
