package willian;

public abstract class Produto {
	protected String descricao;
	protected double preco;
	protected Tamanho tamanho;
	
	public String getDescricao() {
		return descricao;
	}
	
	public abstract double getPreco();
}
