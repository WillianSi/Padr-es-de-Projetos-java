package willian.comandos;

import willan.dispositivos.Lampada;

public class ApagaLampada implements Comando{
	Lampada lampada;
	
	public ApagaLampada(Lampada lampada) {
		this.lampada = lampada;
	}

	@Override
	public void executar() {
		lampada.apagar();;	
	}

	@Override
	public void desfazer() {
		lampada.acender();;	
	}
}
