package willian;

public abstract class BebidaCafeinadaComGancho {
	
	final void prepararReceita() {
		feverAgua();
		infundir();
		servirXicara();
		if(gancho()) {
			adicionarToppings();
		}
	}
	
	abstract void infundir();
	
	abstract void adicionarToppings();
	
	void feverAgua() {
		System.out.println("Fervendo a água");
	}
	
	void servirXicara() {
		System.out.println("Servindo em xícara");
	}
	
	boolean gancho() {
		return true;
	}
}
