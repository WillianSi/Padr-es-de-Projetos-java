package willian;

public class LinhaMontagemCar {
	private boolean roda;
	private boolean motor;
	private boolean portas;
	private boolean banco;
	private boolean chassi;
	private static LinhaMontagemCar instanciaUnica;
//	private static LinhaMontagemCar instanciaUnica = new LinhaMontagemCar();;
//	private static volatile LinhaMontagemCar instanciaUnica ;
	
	private LinhaMontagemCar () {
		chassi = false;
		motor = false;
		roda = false;
		portas = false;
		banco = false;
		
	}

//-------------------------------------------------------------------------------------------------	
	
	public static synchronized LinhaMontagemCar getInstanciaUnica() {
		if (instanciaUnica == null) {
			instanciaUnica = new LinhaMontagemCar();
		}
		return instanciaUnica;
	}

	/*
	public static LinhaMontagemCar getInstanciaUnica() {
		return instanciaUnica;
	}
	
	public static LinhaMontagemCar getInstanciaUnica() {
		if (instanciaUnica == null) {
			synchronized (LinhaMontagemCar.class) {
				if (instanciaUnica == null) {
					instanciaUnica = new LinhaMontagemCar();
				}	
			}
		}
		return instanciaUnica;
	}
*/
	
//-------------------------------------------------------------------------------------------------
	
	public void montarChassi() {
		if (!chassi) {
			chassi = true;
			System.out.println("Chassi montado");
		}
		else {
			System.out.println("Chassi j� est� montado");
		}
	}
	
	public void montarMotor() {
		if (!motor & chassi) {
			motor = true;
			System.out.println("Motor montado no carro");
		}
		else {
			System.out.println("Motor j� foi montado no carro");
		}
	}
	
	public void montarRodas() {
		if (!roda & chassi & motor) {
			roda = true;
			System.out.println("Rodas montadas no carro");
		}
		else {
			System.out.println("Rodas j� foram montadas no carro");
		}
	}
	
	public void montarPortas() {
		if (!portas & chassi & roda & motor) {
			portas = true;
			System.out.println("Portas montadas no carro");
		}
		else {
			System.out.println("Portas j� foram montadas no carro");
		}
	}
	
	public void montarBancos() {
		if (!banco& chassi & roda & motor & portas) {
			banco = true;
			System.out.println("Bancos montados no carro");
		}
		else {
			System.out.println("Bancos j� foram montados no carro");
		}
	}
}

//-------------------------------------------------------------------------------------------------
