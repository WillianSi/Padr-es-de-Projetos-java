package willian;

public abstract class Pato {
	
	protected float peso;
	protected String cor;
	protected IComportamentoVoo ComportamentoVoo;
	protected IComportamentoVoz ComportamentoVoz;
	
	public void setComportamentoVoo(IComportamentoVoo comportamentoVoo) {
		ComportamentoVoo = comportamentoVoo;
	}
	
	public abstract void exibir();
	
	public void nadar(){
		System.out.println("Pato nadando");
	}
	
	public void executarVoo(){
		ComportamentoVoo.voar();
	}
	
	public void executarEmitirSom(){
		ComportamentoVoz.emitirSom();
	}
	
	
}
