package willian;

public class KitKat extends Acompanhamento{
protected Produto produto;
	
	public KitKat(Produto produto) {
		this.produto = produto;
		produto.preco = produto.getPreco() + 2.5;
		produto.descricao = produto.getDescricao() + ", kitkat";
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
