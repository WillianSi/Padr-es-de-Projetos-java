package willian;

public class LeiteCondensado extends Acompanhamento{
	protected Produto produto;
	
	public LeiteCondensado(Produto produto) {
		this.produto = produto;
		produto.preco = produto.getPreco() + 1.5;
		produto.descricao = produto.getDescricao() + ", leite condensado";
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
