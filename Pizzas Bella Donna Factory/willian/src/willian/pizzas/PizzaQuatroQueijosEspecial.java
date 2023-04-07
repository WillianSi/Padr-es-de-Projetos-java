package willian.pizzas;

import willian.Ingredientes.Ingrediente;
import willian.factories.IngredienteEspecialFactory;
import willian.factories.IngredienteFactory;

public class PizzaQuatroQueijosEspecial extends Pizza{

	public PizzaQuatroQueijosEspecial() {
		IngredienteFactory ingredientesFactory = new IngredienteEspecialFactory();
		
		this.sabor = "Quatro Queijos especial";
		
		Ingrediente massa = (Ingrediente) ingredientesFactory.criarMassa();
		Ingrediente molho = (Ingrediente) ingredientesFactory.criarMolho();
		Ingrediente mozzarella = (Ingrediente) ingredientesFactory.criarMozzarella();
		Ingrediente provolone = (Ingrediente) ingredientesFactory.criarProvolone();
		Ingrediente gorgonzola = (Ingrediente) ingredientesFactory.criarGorgonzola();
		Ingrediente parmesao = (Ingrediente) ingredientesFactory.criarParmesao();
		Ingrediente catupiry = (Ingrediente) ingredientesFactory.criarCatupiry();
		Ingrediente oregano = (Ingrediente) ingredientesFactory.criaOregano();
		
		this.Ingredientes.add(massa);
		this.Ingredientes.add(molho);
		this.Ingredientes.add(mozzarella);
		this.Ingredientes.add(provolone);
		this.Ingredientes.add(gorgonzola);
		this.Ingredientes.add(parmesao);
		this.Ingredientes.add(catupiry);
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
