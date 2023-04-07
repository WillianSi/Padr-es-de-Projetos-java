package willian;

public class ChurrassicMenu implements IMenu{
	private static final int MAX_ITENS = 6;
	private int quantidadeItens = 0;
	private MenuItem[] menuItems;
	
	public ChurrassicMenu() {
		menuItems = new MenuItem[MAX_ITENS];
		
		addItem("Feijoada","feij�o preto, diversos cortes de carnes su�nas e bovinas, cebola e alho, arroz, couve refogada, farofa, torresmo, laranja e vinagrete", false, 32.99);
		addItem("Virado � Paulista","Feij�o, carne seca, toucinho, farinha de milho, arroz, bisteca de porco, couve, banana frita e ovo frito.", false, 2.99);
		addItem("Bai�o de Dois","Mistura de arroz, feij�o, toucinho, carne seca, queijo coalho, coentro e cebolinha.", false, 33.29);
		addItem("Ratatouille","Tomates, abobrinhas, berinjelas, cebola, alho, or�gano, azeite, cominho, alecrim, tomilho fresco, azeite", true, 29.05);
		addItem("Guacamole","Abacate, tomates, cebola, coentro, lim�o, azeite", true, 23.99);
		addItem("Risoto","Arroz, manteiga, lim�o, cebola, vinho branco",true, 27.89);	
	}
	
	public void addItem(String prato, String descricao, boolean vegetariano, double preco) {
		MenuItem menuItem = new MenuItem(prato, descricao, vegetariano, preco);
		if (quantidadeItens >= MAX_ITENS) {
			System.err.println("Menu completo! N�o � possivel adicionar outro prato");
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
