package willian;

import java.util.Iterator;

public class ItemMenu extends ComponenteMenu{

	String nome;
	String descricao;
	boolean vegetariano;
	double preco;
	
	public ItemMenu(String nome, String descricao, boolean vegetariano, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		this.vegetariano = vegetariano;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public boolean isVegetariano() {
		return vegetariano;
	}

	public double getPreco() {
		return preco;
	}

	@Override
	public Iterator createIterator() {
		return new IteratorNulo();
	}
	
	public void print() {
		System.out.print("  " + getNome());
		if (isVegetariano()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPreco());
		System.out.println("  -- " + getDescricao());
	}

}
