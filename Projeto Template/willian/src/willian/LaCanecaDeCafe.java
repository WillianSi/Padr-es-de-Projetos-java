package willian;

public class LaCanecaDeCafe {

	public static void main(String[] args) {
		Cha cha = new Cha();
		Cafe cafe = new Cafe();
		
		System.out.println("\nPreparando ch�....");
		cha.prepararReceita();
		
		System.out.println("\nPreparando caf�....");
		cafe.prepararReceita();
		
		System.out.println("\n------------------------------------");
		
		ChaComGancho chaComGancho = new ChaComGancho();
		CafeComGancho cafeComGancho = new CafeComGancho();
		
		System.out.println("\nPreparando ch�....");
		chaComGancho.prepararReceita();
		
		System.out.println("\nPreparando caf�....");
		cafeComGancho.prepararReceita();
	}

}
