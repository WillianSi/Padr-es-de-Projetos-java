package willian;

public class MenuItem {
	private String prato;
	private String descrico;
	private boolean vegetariano;
	private double preco;
	
	public MenuItem(String prato, String descrico, boolean vegetariano, double preco) {
		this.prato = prato;
		this.descrico = descrico;
		this.vegetariano = vegetariano;
		this.preco = preco;
	}
	
	public String getPrato() {
		return prato;
	}
	
	public String getDescrico() {
		return descrico;
	}
	
	public boolean isVegetariano() {
		return vegetariano;
	}
	
	public double getPreco() {
		return preco;
	}

	public String toString() {
		return "R$ " + preco  + " - " + prato + ": \n" + "(" + descrico + ")";
	}
	
	
}
