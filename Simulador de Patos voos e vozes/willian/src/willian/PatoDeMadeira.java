package willian;

public class PatoDeMadeira extends Pato{

	public PatoDeMadeira() {
		ComportamentoVoo = new SemVoo();
		ComportamentoVoz = new Mudo();
	}
	
	@Override
	public void exibir() {
		System.out.println("Pato de madeira");
		
	}

}
