package willian;

public class VendaState implements State{
	MaquinaBalas maquinaBalas;

	public VendaState(MaquinaBalas maquinaBalas) {
		this.maquinaBalas = maquinaBalas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Por favor, aguarde sua bala");
	}

	@Override
	public void devolverMoeda() {
		System.out.println("N�o � poss�vel devolu��o da moeda ap�s o acionamento da alavanca");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("A alavanca � acionada uma �nica vez por moeda");
	}

	@Override
	public void entregarBala() {
		maquinaBalas.entregarBala();
		if (maquinaBalas.getCount() > 0) {
			maquinaBalas.setState(maquinaBalas.getSemMoedaState());
		} else {
			System.out.println("Infelizmente as balas se esgotaram");
			maquinaBalas.setState(maquinaBalas.getEsgotadoState());
		}
	}
	
	public String toString() {
		return "entregando a bala";
	}
}
