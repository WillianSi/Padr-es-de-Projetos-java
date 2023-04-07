package willian.comandos;

import willan.dispositivos.TV;

public class DesligaTV implements Comando{
	TV tv;
	
	public DesligaTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		tv.desligada();
	}

	@Override
	public void desfazer() {
		tv.ligada();
		
	}
}
