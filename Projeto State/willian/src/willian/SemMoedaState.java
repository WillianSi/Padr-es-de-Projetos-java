package willian;

public class SemMoedaState implements State{
	MaquinaBalas maquinaBalas;

	public SemMoedaState(MaquinaBalas maquinaBalas) {
		this.maquinaBalas = maquinaBalas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Moeda inserida");
		maquinaBalas.setState(maquinaBalas.getComMoedaState());
	}

	@Override
	public void devolverMoeda() {
		System.out.println("Nenhuma moeda inserida para ser devolvida");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Insira uma moeda pra acionar a alavanca");
	}

	@Override
	public void entregarBala() {
		System.out.println("Primeiro insira uma moeda");
	}
	
	public String toString() {
		return "aguardando inserção da moeda";
	}
}
