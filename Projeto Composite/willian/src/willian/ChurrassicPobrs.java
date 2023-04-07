package willian;

public class ChurrassicPobrs {

	public static void main(String[] args) {
		
		ComponenteMenu panquecas = new Menu("Menu Panquecas","Panquecas deliciosas");
		ComponenteMenu refeicoes = new Menu("Menu Refeicoes","Pratos típicos no fogão a lenha");
		ComponenteMenu cafeMatinal = new Menu("Menu Café da Manhã","Super desjejum");
		ComponenteMenu sobremesas = new Menu("Menu Sobremesas","A sobremesa da sua vida");
		
		ComponenteMenu todosMenus = new Menu("Menus","Todos os Menus Disponiveis");
		
		todosMenus.add(panquecas);
		todosMenus.add(refeicoes);
		todosMenus.add(cafeMatinal);
		
		panquecas.add(new ItemMenu("Bauru", "Panquecas com presunto, queijo, maionese e tomate", false, 18.95));
		panquecas.add(new ItemMenu("Frutos do Mar", "Panquecas com camarão, vongole, lula, puxados ao catupiri com cebola", false, 27.40));
		panquecas.add(new ItemMenu("Jardineira", "Panquecas com legumes, palmito e azeitonas", true, 17.25));
		panquecas.add(new ItemMenu("Nesfit", "Panquecas com leite, ovos e cereal matinal", true, 14.35));

		refeicoes.add(new ItemMenu("Feijoada",
				"feijão preto, diversos cortes de carnes suínas e bovinas, cebola e alho, arroz, couve refogada, farofa, torresmo, laranja e vinagrete", false, 32.99));
		refeicoes.add(new ItemMenu("Virado à Paulista",
				"Feijão, carne seca, toucinho, farinha de milho, arroz, bisteca de porco, couve, banana frita e ovo frito.", false, 32.99));
		refeicoes.add(new ItemMenu("Baião de Dois",
				"Mistura de arroz, feijão, toucinho, carne seca, queijo coalho, coentro e cebolinha.", false, 33.29));
		refeicoes.add(new ItemMenu("Ratatouille",
				"Tomates, abobrinhas, berinjelas, cebola, alho, orégano, azeite, cominho, alecrim, tomilho fresco, azeite", true, 29.05));
		refeicoes.add(new ItemMenu("Guacamole",
				"Abacate, tomates, cebola, coentro, limão, azeite", true, 23.99)); 
		refeicoes.add(new ItemMenu("Risoto",
				"Arroz, manteiga, limão, cebola, vinho branco", true, 27.89));	
		
		refeicoes.add(sobremesas);
 
		sobremesas.add(new ItemMenu("Petit Gateau", 
				"Bolo de chocolate quente com sorvete de creme", true, 11.59));
		sobremesas.add(new ItemMenu("Torta Holandesa de Alpino", 
				"Biscoito Calypso, licor de cacau, creme e cobertura de chocolate Alpino", true, 11.99));
		sobremesas.add(new ItemMenu("Brownie", 
				"Bolo de chocolate molhadinho com pedacinhos de nozes servido quente com sorvete de creme e uma intensa e deliciosa ganache", true, 11.89));

		cafeMatinal.add(new ItemMenu("Waffles", "Waffles com morangos ou mirtilos", true, 15.59));
		cafeMatinal.add(new ItemMenu("Bolinho de chuva", "Bolinho frito de trigo e ovo, salpicados com açucar e canela", true, 5.69));
		cafeMatinal.add(new ItemMenu("Pão de queijo mineiro", "Bolinho assado de polvilho e muito queijo minas", true, 5.35));

		ServicoMesa servicoMesa = new ServicoMesa(todosMenus);
		
		//servicoMesa.printMenuVegetariano();
		//servicoMesa.printMenu();
		refeicoes.print();
	}

}
