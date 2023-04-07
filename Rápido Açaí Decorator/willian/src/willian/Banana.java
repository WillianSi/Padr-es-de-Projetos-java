package willian;

public class Banana extends Acompanhamento{
protected Produto produto;
	
	public Banana(Produto produto) {
		this.produto = produto;
		produto.preco = produto.getPreco() + 1.0;
		produto.descricao = produto.getDescricao() + ", banana";
	}

	@Override
	public String getDescricao() {
		return produto.descricao;
	}

	@Override
	public double getPreco() {
		return produto.preco;
	}
}
