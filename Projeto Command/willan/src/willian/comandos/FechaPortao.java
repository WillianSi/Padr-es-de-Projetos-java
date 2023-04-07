package willian.comandos;

import willan.dispositivos.Portao;

public class FechaPortao implements Comando{
	Portao portao;
	
	public FechaPortao(Portao portao) {
		this.portao = portao;
	}

	@Override
	public void executar() {
		portao.fechar();	
	}

	@Override
	public void desfazer() {
		portao.abrir();	
	}
}
