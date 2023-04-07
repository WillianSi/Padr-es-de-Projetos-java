package willian;

public class ServicoMesa {
	private PobrsMenu pobrsMenu;
	private ChurrassicMenu churrassicMenu;
	
	public ServicoMesa(PobrsMenu pobrsMenu, ChurrassicMenu churrassicMenu) {
		this.pobrsMenu = pobrsMenu;
		this.churrassicMenu = churrassicMenu;
	}
	
	public void printMenu() {
		IIterator pobrsIterator = pobrsMenu.createIterator();
		IIterator churrassicIterator = churrassicMenu.createIterator();
		
		System.out.println("ChurrassicPobrs MENU");
		System.out.println("---------------------------------------------");
		printMenu(pobrsIterator);
		printMenu(churrassicIterator);
	}
	
	private void printMenu(IIterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			System.out.println(menuItem);
		}
	}
	
	public void printVegetarianoMenu() {
		printVegetarianoMenu(pobrsMenu.createIterator());
		printVegetarianoMenu(churrassicMenu.createIterator());
	}
	
	public boolean isItemVegetariano(String prato) {
		IIterator pobIIterator = pobrsMenu.createIterator();
		if (isVegetariano(prato, pobIIterator)) {
			return true;
		}
		IIterator churrassicIterator = churrassicMenu.createIterator();
		if (isVegetariano(prato, churrassicIterator)) {
			return true;
		}
		return false;
	}
	
	private void printVegetarianoMenu(IIterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.isVegetariano()) {
				System.out.println(menuItem);
			}
		}
	}
	
	public boolean isVegetariano(String prato, IIterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = (MenuItem)iterator.next();
			if (menuItem.getPrato().equals(prato)) {
				if (menuItem.isVegetariano()) {
					return true;
				}
			}
		}
		return false;
	}
}
