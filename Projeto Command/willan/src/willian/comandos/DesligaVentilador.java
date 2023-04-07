package willian.comandos;

import willan.dispositivos.Ventilador;

public class DesligaVentilador implements Comando{
	Ventilador ventilador;
	
	public DesligaVentilador(Ventilador ventilador) {
		this.ventilador = ventilador;
	}

	@Override
	public void executar() {
		ventilador.desligado();
	}

	@Override
	public void desfazer() {
		ventilador.ligado();
	}
}
