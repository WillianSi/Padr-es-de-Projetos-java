package willian.pizzas;

import willian.Ingredientes.Ingrediente;
import willian.factories.IngredienteFactory;
import willian.factories.IngredienteTradicionalFactory;

public class PizzaMozzarella extends Pizza{

	public PizzaMozzarella() {
IngredienteFactory ingredientesFactory = new IngredienteTradicionalFactory();
		
		this.sabor = "Mozzarella";
		
		Ingrediente massa = (Ingrediente) ingredientesFactory.criarMassa();
		Ingrediente molho = (Ingrediente) ingredientesFactory.criarMolho();
		Ingrediente mozzarella = (Ingrediente) ingredientesFactory.criarMozzarella();
		Ingrediente tomate = (Ingrediente) ingredientesFactory.criarTomate();
		Ingrediente oregano = (Ingrediente) ingredientesFactory.criaOregano();
		
		this.Ingredientes.add(massa);
		this.Ingredientes.add(molho);
		this.Ingredientes.add(mozzarella);
		this.Ingredientes.add(tomate);
		this.Ingredientes.add(oregano);
		
		
	}

	@Override
	public void preparar() {
		System.out.println("Produzindo pizza " + sabor);
		System.out.println("Adicionando ingredientes:");
		for (Ingrediente ingrediente : Ingredientes) {
			System.out.println(" - " + ingrediente.getDescricao());
		}
	}
}
