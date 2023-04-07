package willian;

public class GeradorSolar implements Igerador{

	@Override
	public void conectar() {
		System.out.println("Conectado a um gerador solar");
	}

	@Override
	public void gerarEnergia() {
		System.out.println("Grando energia(solar) | não há fio terra isolado");		
	}

	@Override
	public void comsumo() {
		System.out.println("Gerando(não a consumo de energia)");
	}
	
	@Override
	public void exibir() {
		conectar();
		gerarEnergia();
		comsumo();
	}
}
