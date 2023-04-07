package willian;

public class GeradorAdapter implements Itomada{
	Igerador gerador;
	
	public GeradorAdapter(Igerador gerador) {
		this.gerador = gerador;
	}
	
	@Override
	public void conectar() {
		gerador.conectar();
	}

	@Override
	public void energia() {
		gerador.gerarEnergia();
	}
	
	@Override
	public void comsumo() {
		gerador.comsumo();	
	}
	
	@Override
	public void exibir() {
		conectar();
		energia();
		comsumo();
	}
}
