package willian;

import java.util.Random;

public class ComMoedaState implements State{
	Random randomPremio = new Random(System.currentTimeMillis());
	MaquinaBalas maquinaBalas;
	
	public ComMoedaState(MaquinaBalas maquinaBalas) {
		this.maquinaBalas = maquinaBalas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Já existe uma moeda inserida");
	}

	@Override
	public void devolverMoeda() {
		System.out.println("Moeda devolvida");
		maquinaBalas.setState(maquinaBalas.getSemMoedaState());
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Alavanca acionada");
		int premio = randomPremio.nextInt(10);
		if ((premio == 0) && (maquinaBalas.getCount() > 1)) {
			maquinaBalas.setState(maquinaBalas.getPremioState());
		} else {
			maquinaBalas.setState(maquinaBalas.getVendaState());
		}
	}

	@Override
	public void entregarBala() {
		System.out.println("Nenhuma bala entregue");
	}
	
	public String toString() {
		return "aguardando acionamento da alavanca";
	}
}
