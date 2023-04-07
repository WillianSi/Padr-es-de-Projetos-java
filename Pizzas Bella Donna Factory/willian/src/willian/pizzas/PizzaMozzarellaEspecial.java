package willian.pizzas;

import willian.Ingredientes.Ingrediente;
import willian.factories.IngredienteEspecialFactory;
import willian.factories.IngredienteFactory;

public class PizzaMozzarellaEspecial extends Pizza{

	public PizzaMozzarellaEspecial() {
		IngredienteFactory ingredientesFactory = new IngredienteEspecialFactory();
		
		this.sabor = "Mozzarella especial";
		
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
