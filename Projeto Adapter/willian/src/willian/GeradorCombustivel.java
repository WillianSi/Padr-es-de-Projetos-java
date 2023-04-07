package willian;

public class GeradorCombustivel implements Igerador{

	@Override
	public void conectar() {
		System.out.println("Conectado a um gerador a combustão");
	}

	@Override
	public void gerarEnergia() {
		System.out.println("Grando energia(com gasolina) | fio terra isolado");		
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
