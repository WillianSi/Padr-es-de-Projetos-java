package willian;

public class Acai extends Produto{
	public Acai(Tamanho tamanho) {
		this.tamanho = tamanho;
		descricao = "A�ai " + tamanho.fator + " ";
		preco = 10.0 * tamanho.valor;
	}
	
	@Override
	public double getPreco() {
		return preco;
	}
}
