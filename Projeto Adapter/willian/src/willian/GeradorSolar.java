package willian;

public class GeradorSolar implements Igerador{

	@Override
	public void conectar() {
		System.out.println("Conectado a um gerador solar");
	}

	@Override
	public void gerarEnergia() {
		System.out.println("Grando energia(solar) | n�o h� fio terra isolado");		
	}

	@Override
	public void comsumo() {
		System.out.println("Gerando(n�o a consumo de energia)");
	}
	
	@Override
	public void exibir() {
		conectar();
		gerarEnergia();
		comsumo();
	}
}
