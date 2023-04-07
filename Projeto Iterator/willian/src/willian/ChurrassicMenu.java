package willian;

public class ChurrassicMenu implements IMenu{
	private static final int MAX_ITENS = 6;
	private int quantidadeItens = 0;
	private MenuItem[] menuItems;
	
	public ChurrassicMenu() {
		menuItems = new MenuItem[MAX_ITENS];
		
		addItem("Feijoada","feijão preto, diversos cortes de carnes suínas e bovinas, cebola e alho, arroz, couve refogada, farofa, torresmo, laranja e vinagrete", false, 32.99);
		addItem("Virado à Paulista","Feijão, carne seca, toucinho, farinha de milho, arroz, bisteca de porco, couve, banana frita e ovo frito.", false, 2.99);
		addItem("Baião de Dois","Mistura de arroz, feijão, toucinho, carne seca, queijo coalho, coentro e cebolinha.", false, 33.29);
		addItem("Ratatouille","Tomates, abobrinhas, berinjelas, cebola, alho, orégano, azeite, cominho, alecrim, tomilho fresco, azeite", true, 29.05);
		addItem("Guacamole","Abacate, tomates, cebola, coentro, limão, azeite", true, 23.99);
		addItem("Risoto","Arroz, manteiga, limão, cebola, vinho branco",true, 27.89);	
	}
	
	public void addItem(String prato, String descricao, boolean vegetariano, double preco) {
		MenuItem menuItem = new MenuItem(prato, descricao, vegetariano, preco);
		if (quantidadeItens >= MAX_ITENS) {
			System.err.println("Menu completo! Não é possivel adicionar outro prato");
		} else {
			menuItems[quantidadeItens] = menuItem;
			quantidadeItens = quantidadeItens + 1;
		}
	}

	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public IIterator createIterator() {
		return new ChurrassicMenuIterator(menuItems);
	}
	
	public String toString() {
		return "MENU Retaurante Churrassic Park";
	}


}
