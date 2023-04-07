package willian;

public enum Tamanho {
	P(1.0,"pequeno"), M(1.5,"médio"), G(2.0,"grande");
	
	double valor;
	String fator;
	private Tamanho(double valor, String fator) {
		this.valor = valor;
		this.fator = fator;
	}
}
