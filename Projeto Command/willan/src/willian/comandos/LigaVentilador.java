package willian.comandos;

import willan.dispositivos.Ventilador;

public class LigaVentilador implements Comando{
	Ventilador ventilador;
	
	public LigaVentilador(Ventilador ventilador) {
		this.ventilador = ventilador;
	}

	@Override
	public void executar() {
		ventilador.ligado();
	}

	@Override
	public void desfazer() {
		ventilador.desligado();
	}
}
