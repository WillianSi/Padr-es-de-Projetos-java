package willian;

public class SimuladorPatos {

	public static void main(String[] args) {
		Pato domestico = new PatoDomestico();
		Pato real = new PatoReal();
		Pato borracha = new PatoBorracha();
		Pato madeira = new PatoDeMadeira();
		
		domestico.exibir();
		domestico.executarVoo();
		domestico.executarEmitirSom();
		System.out.println("------------------------------------------------");
		real.exibir();
		real.executarVoo();
		real.executarEmitirSom();
		System.out.println("------------------------------------------------");
		borracha.exibir();
		borracha.executarVoo();
		borracha.executarEmitirSom();
		
		
		System.out.println("------------------------------------------------");
		madeira.exibir();
		madeira.executarVoo();
		madeira.executarEmitirSom();
		System.out.println("-----------------------");
		madeira.setComportamentoVoo(new VooFoguete());
		madeira.exibir();
		madeira.executarVoo();
		madeira.executarEmitirSom();
		System.out.println("-----------------------");
		madeira.setComportamentoVoo(new SemVoo());
		madeira.exibir();
		madeira.executarVoo();
		madeira.executarEmitirSom();
	}
}
