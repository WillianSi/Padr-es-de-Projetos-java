package willian.comandos;

import willan.dispositivos.TV;

public class LigaTV implements Comando{
	TV tv;
	
	public LigaTV(TV tv) {
		this.tv = tv;
	}

	@Override
	public void executar() {
		tv.ligada();
	}

	@Override
	public void desfazer() {
		tv.desligada();
		
	}
}
