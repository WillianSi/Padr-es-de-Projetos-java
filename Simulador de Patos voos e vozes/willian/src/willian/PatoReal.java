package willian;

public class PatoReal extends Pato{

	public PatoReal() {
		ComportamentoVoo = new VooAsas();
		ComportamentoVoz = new Grasno();
	}
	
	@Override
	public void exibir() {
		System.out.println("Pato real");
	}
}
