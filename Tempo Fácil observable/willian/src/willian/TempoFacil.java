package willian;

public class TempoFacil {

	public static void main(String[] args) {
		DadoMeteoroligico dadoMeteoroligico = new DadoMeteoroligico();
		
		Pescador pescador1 = new Pescador("João");
		dadoMeteoroligico.inscrever(pescador1);
		
		Pescador pescador2 = new Pescador("Paulo");
		dadoMeteoroligico.inscrever(pescador2);
		
		Pescador pescador3 = new Pescador("Pedro");
		dadoMeteoroligico.inscrever(pescador3);
		
		Distribuidor distribuidor1 = new Distribuidor("Tiago");
		dadoMeteoroligico.inscrever(distribuidor1);
		
		Distribuidor distribuidor2 = new Distribuidor("Tomé");
		dadoMeteoroligico.inscrever(distribuidor2);
		
		Distribuidor distribuidor3 = new Distribuidor("Lucas");
		dadoMeteoroligico.inscrever(distribuidor3);
		
		Trasportador trasportador1 = new Trasportador("Marcos");
		dadoMeteoroligico.inscrever(trasportador1);
		
		Trasportador trasportador2 = new Trasportador("Silvio");
		dadoMeteoroligico.inscrever(trasportador2);
		
		Trasportador trasportador3 = new Trasportador("Ana");
		dadoMeteoroligico.inscrever(trasportador3);
		
		dadoMeteoroligico.atualizar(36, 15, 12, true);
		
		dadoMeteoroligico.desinscrever(pescador2);
		dadoMeteoroligico.desinscrever(distribuidor1);
		dadoMeteoroligico.desinscrever(trasportador3);
		
		dadoMeteoroligico.atualizar(22, 10, 5, false);

		pescador1.exibir();
		pescador2.exibir();
		pescador3.exibir();
		
		distribuidor1.exibir();
		distribuidor2.exibir();
		distribuidor3.exibir();
		
		trasportador1.exibir();
		trasportador2.exibir();
		trasportador3.exibir();
	}

}
