package willian;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends ComponenteMenu{
	ArrayList componetesMenu = new ArrayList();
	String nome;
	String descricao;
	
	public Menu(String nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}
	
	public void add(ComponenteMenu menuComponente) {
		componetesMenu.add(menuComponente);
	}
	
	public void remove(ComponenteMenu menuComponente) {
		componetesMenu.remove(menuComponente);
	}
	
	public ComponenteMenu getChild(int i) {
		return (ComponenteMenu)componetesMenu.get(i);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public Iterator createIterator() {
		return new CompositeIterator(componetesMenu.iterator());
	}
	
	public void print() {
		System.out.println("\n" + getNome());
		System.out.println("(" + getDescricao() + ")");
		System.out.println("------------------------------------------------------------");
		
		Iterator iterator = componetesMenu.iterator();
		while (iterator.hasNext()) {
			ComponenteMenu menuComponente = (ComponenteMenu)iterator.next();
			menuComponente.print();
		}
	}
}
