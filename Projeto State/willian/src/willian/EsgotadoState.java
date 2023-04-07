package willian;

public class EsgotadoState implements State{
	MaquinaBalas maquinaBalas;

	public EsgotadoState(MaquinaBalas maquinaBalas) {
		this.maquinaBalas = maquinaBalas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Moeda recusada, pois as balas se esgotaram");
	}

	@Override
	public void devolverMoeda() {
		System.out.println("N�o � poss�vel devolver porque n�o h� moedas inseridas");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("Alavanca acionada, por�m as balas se esgotaram");
	}

	@Override
	public void entregarBala() {
		System.out.println("Nenhuma bala entregue");
	}
	
	public String toString() {
		return "balas esgotadas";
	}
}
