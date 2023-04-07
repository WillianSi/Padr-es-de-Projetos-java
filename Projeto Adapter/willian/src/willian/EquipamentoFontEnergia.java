package willian;

public class EquipamentoFontEnergia {

	public static void main(String[] args) {
		
		Itomada tomada1 = new TomadaTresPinos();
		Itomada tomada2 = new TomadaDoisPinos();
		
		GeradorCombustivel geradorCombustivel = new GeradorCombustivel();
		Itomada gerador1 = new GeradorAdapter(geradorCombustivel);
		
		GeradorSolar geradorSolar = new GeradorSolar();
		Itomada gerador2 = new GeradorAdapter(geradorSolar);
		
		tomada1.exibir();
		System.out.println("----------------------------------------");
		tomada2.exibir();
		System.out.println("----------------------------------------");
		gerador1.exibir();
		System.out.println("----------------------------------------");
		gerador2.exibir();
	}

}
