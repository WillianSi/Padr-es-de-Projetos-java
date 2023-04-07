package willian;

public class ChurrassicPobrs {

	public static void main(String[] args) {
		PobrsMenu pobrs = new PobrsMenu();
		ChurrassicMenu churrassic = new ChurrassicMenu();
		
		ServicoMesa servicoMesa = new ServicoMesa(pobrs, churrassic);
		
		servicoMesa.printMenu();
		servicoMesa.printVegetarianoMenu();
	}
}
