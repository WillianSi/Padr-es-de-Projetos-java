package willian;

import java.util.Iterator;

public class ServicoMesa {
	ComponenteMenu todosMenus;

	public ServicoMesa(ComponenteMenu todosMenus) {
		this.todosMenus = todosMenus;
	}
	
	public void printMenu() {
		todosMenus.print();
	}
	
	public void printMenuVegetariano() {
		Iterator iterator = todosMenus.createIterator();
		
		System.out.println("\n MENU VEGETARIANO\n----");
		while (iterator.hasNext()) {
			ComponenteMenu menuComponente = (ComponenteMenu)iterator.next();
			try {
				if (menuComponente.isVegetariano()) {
					menuComponente.print();
				}
				
			} catch (UnsupportedOperationException e) {
				
			}
		}
	}
}
