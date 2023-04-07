package willian;

public class RapidoAcai {

	public static void main(String[] args) {
		Produto produto = new Acai(Tamanho.P);
		
		produto = new LeiteCondensado(produto);
		produto = new KitKat(produto);
		produto = new Banana(produto);
		
		System.out.println(produto.getDescricao() + " - R$ " + produto.getPreco());
		
		System.out.println("----------------------------------------------------");
		
		Produto produto2 = new LeiteCondensado(new Banana(new KitKat(new Acai(Tamanho.M))));
		System.out.println(produto2.getDescricao() + " - R$ " + produto2.getPreco());
		
System.out.println("----------------------------------------------------");
		
		Produto produto3 = new LeiteCondensado(new Banana(new KitKat(new Acai(Tamanho.G))));
		System.out.println(produto3.getDescricao() + " - R$ " + produto3.getPreco());
	}

}
