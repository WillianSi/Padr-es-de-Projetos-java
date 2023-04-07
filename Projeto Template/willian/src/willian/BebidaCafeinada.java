package willian;

public abstract class BebidaCafeinada {
	
	final void prepararReceita() {
		feverAgua();
		infundir();
		servirXicara();
		adicionarToppings();
	}
	
	abstract void infundir();
	
	abstract void adicionarToppings();
	
	void feverAgua() {
		System.out.println("Fervendo a água");
	}
	
	void servirXicara() {
		System.out.println("Servindo em xícara");
	}
}
