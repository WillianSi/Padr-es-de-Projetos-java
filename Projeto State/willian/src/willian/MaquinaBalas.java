package willian;

public class MaquinaBalas {
	private State comMoedaState;
	private State semMoedaState;
	private State vendaState;
	private State esgotadoState;
	private State premioState;
	
	private State state = esgotadoState;
	int count = 0;
	
	public MaquinaBalas(int quantidadeBalas) {

		comMoedaState = new ComMoedaState(this);
		semMoedaState = new SemMoedaState(this);
		vendaState = new VendaState(this);
		esgotadoState = new EsgotadoState(this);
		premioState = new PremioState(this);
		
		this.count = quantidadeBalas;
		if (count > 0) {
			state = semMoedaState;
		}
	}
	
	public void inserirMoeda() {
		state.inserirMoeda();
	}

	public void devolverMoeda() {
		state.devolverMoeda();
	}

	public void acionarAlavanca() {
		state.acionarAlavanca();
		state.entregarBala();
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void entregarBala() {
		System.out.println("Pode retirar sua bala");
		if (count != 0) {
			count -= 1;
		}
	}

	public int getCount() {
		return count;
	}
	
	public void reporBalas(int quantidadeBalas) {
		this.count = quantidadeBalas;
		state = semMoedaState;
	}
	
	public State getState() {
		return state;
	}

	public State getComMoedaState() {
		return comMoedaState;
	}

	public State getSemMoedaState() {
		return semMoedaState;
	}

	public State getVendaState() {
		return vendaState;
	}

	public State getEsgotadoState() {
		return esgotadoState;
	}

	public State getPremioState() {
		return premioState;
	}

	@Override
	public String toString() {
		StringBuffer resultado = new StringBuffer();
		resultado.append("\n-------------------------------------");
		//resultado.append("\nBala na Agulha Ltda");
		resultado.append("\nMáquina de Balas Java Modelo #2021\n");
		resultado.append("Estoque: " + count + " bala");
		if (count != 1) {
			resultado.append("s");
		}
		resultado.append("\nEstado: " + state);
		resultado.append("\n-------------------------------------\n");
		return resultado.toString();
	}
}
