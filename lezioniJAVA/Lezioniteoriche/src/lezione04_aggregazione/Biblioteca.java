package lezione04_aggregazione;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	String nome;
	List<Libro> libri; // queste sono le liste, fanno parte JCF (java collectin framework)
	
	public Biblioteca(String nome){
		this.nome = nome;
		this.libri = new ArrayList<Libro>(); // Array in grado di scalare (non avere un numero fisso di posizioni, slot, per poter inserire dati
		
	}
	
	public void addLibro (Libro libro) {
		libri.add(libro);
	}
	
	public void addLibri(Libro[] libri) {
		for (Libro libro : libri) {
			this.libri.add(libro); // aggiungo un libro alla volta nel mio arraylist
			
		}
	}

	@Override
	public String toString() {
		return "Biblioteca [nome=" + nome + ", libri=" + libri + "]";
	}
	

}
