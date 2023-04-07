package willian.comandos;

import willan.dispositivos.Portao;

public class AbrePortao implements Comando{
	Portao portao;
	
	public AbrePortao(Portao portao) {
		this.portao = portao;
	}

	@Override
	public void executar() {
		portao.abrir();	
	}

	@Override
	public void desfazer() {
		portao.fechar();	
	}
}
