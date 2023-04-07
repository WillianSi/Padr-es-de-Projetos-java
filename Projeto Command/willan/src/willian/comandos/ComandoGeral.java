package willian.comandos;

public class ComandoGeral implements Comando{
	Comando[] comandos;
	
	public ComandoGeral(Comando[] comandos) {
		this.comandos = comandos;
	}
	
	@Override
	public void executar() {
		for (int i = 0; i < comandos.length; i++) {
			comandos[i].executar();
		}
	}

	@Override
	public void desfazer() {
		for (int i = 0; i < comandos.length; i++) {
			comandos[i].desfazer();
		}
	}
}
