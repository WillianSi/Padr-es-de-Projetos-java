package willian;

public class BalaNaAgulha {

	public static void main(String[] args) {
		MaquinaBalas maquinaBalas = new MaquinaBalas(5);

		System.out.println(maquinaBalas);

		maquinaBalas.inserirMoeda();
		maquinaBalas.acionarAlavanca();

		System.out.println(maquinaBalas);

		maquinaBalas.inserirMoeda();
		maquinaBalas.devolverMoeda();
		maquinaBalas.acionarAlavanca();

		System.out.println(maquinaBalas);

		maquinaBalas.inserirMoeda();
		maquinaBalas.acionarAlavanca();
		maquinaBalas.inserirMoeda();
		maquinaBalas.acionarAlavanca();
		maquinaBalas.devolverMoeda();

		System.out.println(maquinaBalas);

		maquinaBalas.inserirMoeda();
		maquinaBalas.inserirMoeda();
		maquinaBalas.acionarAlavanca();
		maquinaBalas.inserirMoeda();
		maquinaBalas.acionarAlavanca();
		maquinaBalas.inserirMoeda();
		maquinaBalas.acionarAlavanca();

		System.out.println(maquinaBalas);
	}

}
