package willian.comandos;

public class ComandoNulo implements Comando{

	@Override
	public void executar() {
		System.out.println("nenhum dispositivo programado");
	}

	@Override
	public void desfazer() {
		System.out.println("nenhum dispositivo programado");	
	}

}
