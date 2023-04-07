package willian.pizzas;

import java.util.ArrayList;
import java.util.List;

import willian.Ingredientes.Ingrediente;

public class Pizza {
	protected String sabor;
	protected List<Ingrediente> Ingredientes = new ArrayList<>();
	
	public void preparar() {
		System.out.println("Produzindo pizza " + sabor);
		System.out.println("Adicionando ingredientes:");
		for (Ingrediente ingrediente : Ingredientes) {
			System.out.println(" - " + ingrediente.getDescricao());
		}
	}
	
	public void assar() {
		System.out.println("Assando por 25 minuto à 180°C");
	}
	
	public void cortar() {
		System.out.println("Cortando em fatias");
	}
	
	public void embalar() {
		System.out.println("Embalando em caixa para entrega");
	}
}
