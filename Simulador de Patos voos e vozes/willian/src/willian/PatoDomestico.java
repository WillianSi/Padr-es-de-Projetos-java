package willian;

public class PatoDomestico extends Pato{

	public PatoDomestico() {
		ComportamentoVoo = new VooAsas();
		ComportamentoVoz = new Grasno();
	}
	
	@Override
	public void exibir() {
		System.out.println("Pato domestico");
	}
}
