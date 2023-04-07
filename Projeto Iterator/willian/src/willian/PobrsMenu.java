package willian;

import java.util.ArrayList;

public class PobrsMenu implements IMenu{
	private ArrayList<MenuItem> menuItens;
	
	public PobrsMenu() {
		menuItens = new ArrayList<MenuItem>();
		addItem("Bauru", "Panquecas com presunto, queijo, maionese e tomate", false, 18.95);
		addItem("Frutos do Mar", "Panquecas com camarão, vongole, lula, puxados ao catupiri com cebola", false, 27.40);
		addItem("Jardineira", "Panquecas com legumes, palmito e azeitonas", true, 17.25);
		addItem("Waffles", "Waffles com morangos ou mirtilos", true, 15.59);
	}
	
	public void addItem(String prato, String descricao, boolean vegetariano, double preco) {
		MenuItem menuItem = new MenuItem(prato, descricao, vegetariano, preco);
		menuItens.add(menuItem);
	}

	public ArrayList<MenuItem> getMenuItens() {
		return menuItens;
	}
	
	public IIterator createIterator() {
		return new PobrsMenuIterator(menuItens);
	}
	
	public String toString() {
		return "MENU Lanchonete Pobr's";
	}
}
