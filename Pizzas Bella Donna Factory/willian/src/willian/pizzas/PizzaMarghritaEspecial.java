package willian.pizzas;

import willian.Ingredientes.Ingrediente;
import willian.factories.IngredienteEspecialFactory;
import willian.factories.IngredienteFactory;

public class PizzaMarghritaEspecial extends Pizza{
	
	public PizzaMarghritaEspecial() {
		IngredienteFactory ingredientesFactory = new IngredienteEspecialFactory();
		
		this.sabor = "Marghrita especial";
		
		Ingrediente massa = (Ingrediente) ingredientesFactory.criarMassa();
		Ingrediente molho = (Ingrediente) ingredientesFactory.criarMolho();
		Ingrediente mozzarella = (Ingrediente) ingredientesFactory.criarMozzarella();
		Ingrediente tomate = (Ingrediente) ingredientesFactory.criarTomate();
		Ingrediente manjericao = (Ingrediente) ingredientesFactory.criarManjericao();
		
		this.Ingredientes.add(massa);
		this.Ingredientes.add(molho);
		this.Ingredientes.add(mozzarella);
		this.Ingredientes.add(tomate);
		this.Ingredientes.add(manjericao);
		
		
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
