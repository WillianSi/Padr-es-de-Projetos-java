package willian;

public class PatoBorracha extends Pato{

	public PatoBorracha() {
		ComportamentoVoo = new SemVoo();
		ComportamentoVoz = new Rangido();
	}
	
	@Override
	public void exibir() {
		System.out.println("Pato de borracha");
	}
}
