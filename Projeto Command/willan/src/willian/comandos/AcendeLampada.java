package willian.comandos;

import willan.dispositivos.Lampada;

public class AcendeLampada implements Comando{
	Lampada lampada;
	
	public AcendeLampada(Lampada lampada) {
		this.lampada = lampada;
	}

	@Override
	public void executar() {
		lampada.acender();	
	}

	@Override
	public void desfazer() {
		lampada.apagar();	
	}
	
}
