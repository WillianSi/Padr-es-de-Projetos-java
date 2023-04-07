package willian;

public class Cafe extends BebidaCafeinada{

	@Override
	void infundir() {
		System.out.println("Coando café");
	}

	@Override
	void adicionarToppings() {
		System.out.println("Adicinando açúcar e leite");
	}
}
