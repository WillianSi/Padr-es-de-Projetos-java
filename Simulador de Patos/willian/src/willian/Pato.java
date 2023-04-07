package willian;

public abstract class Pato {
	
	protected float peso;
	protected String cor;
	
	public void nadar(){
		System.out.println("Pato nadando");
	}
	
	public void grasnar(){
		System.out.println("Pato grasnando");
	}
	
	public abstract void exibir();
}
