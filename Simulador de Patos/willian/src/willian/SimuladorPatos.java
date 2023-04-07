package willian;

public class SimuladorPatos {

	public static void main(String[] args) {
		Pato real = new PatoReal();
		Pato borracha = new PatoBorracha();
		
		real.exibir();
		real.grasnar();
		
		borracha.exibir();
		borracha.nadar();
	}
}
