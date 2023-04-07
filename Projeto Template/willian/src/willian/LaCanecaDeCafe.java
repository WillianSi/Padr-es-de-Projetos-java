package willian;

public class LaCanecaDeCafe {

	public static void main(String[] args) {
		Cha cha = new Cha();
		Cafe cafe = new Cafe();
		
		System.out.println("\nPreparando chá....");
		cha.prepararReceita();
		
		System.out.println("\nPreparando café....");
		cafe.prepararReceita();
		
		System.out.println("\n------------------------------------");
		
		ChaComGancho chaComGancho = new ChaComGancho();
		CafeComGancho cafeComGancho = new CafeComGancho();
		
		System.out.println("\nPreparando chá....");
		chaComGancho.prepararReceita();
		
		System.out.println("\nPreparando café....");
		cafeComGancho.prepararReceita();
	}

}
