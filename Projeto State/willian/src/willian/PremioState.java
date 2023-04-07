package willian;

public class PremioState implements State{
	MaquinaBalas maquinaBalas;

	public PremioState(MaquinaBalas maquinaBalas) {
		this.maquinaBalas = maquinaBalas;
	}

	@Override
	public void inserirMoeda() {
		System.out.println("Espere um momento por favor, já estamos liberando sua bala");
	}

	@Override
	public void devolverMoeda() {
		System.out.println("Espere um momento por favor, já estamos liberando sua bala");
	}

	@Override
	public void acionarAlavanca() {
		System.out.println("A alavanca é acionada uma única vez por cada moeda");
	}

	@Override
	public void entregarBala() {
		System.out.println("VOCÊ É O GANHADOR DA PROMOÇÃO! Você receberá duas balas por uma única moeda");
		maquinaBalas.entregarBala();
		if (maquinaBalas.getCount() == 0) {
			maquinaBalas.setState(maquinaBalas.getEsgotadoState());
		} else {
			maquinaBalas.entregarBala();
			if (maquinaBalas.getCount() > 0) {
				maquinaBalas.setState(maquinaBalas.getSemMoedaState());
			} else {
				System.out.println("Infelizmente as balas se esgotaram");
				maquinaBalas.setState(maquinaBalas.getEsgotadoState());
			}
		}
	}

	public String toString() {
		return "entregando duas balas proque (VOCÊ É O GANHADOR DA PROMOÇÃO!)";
	}
}
