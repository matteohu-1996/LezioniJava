package lezione04_aggregazione;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		// istanzio dei libri
		Libro l1 =new Libro("Harry Potter", new Autore ("JK", "Rowling"));
		Libro l2 =new Libro("Follia", new Autore("Patrick", "McGrath"));
		Libro l3 = new Libro("Delitto e castigo", new Autore("Fedor", "Dostoevskij"));
		
		Biblioteca biblio1 = new Biblioteca("Centrale");
		
		biblio1.addLibro(l1);
		biblio1.addLibro(l2);
		biblio1.addLibro(l3);
		
		System.out.println(biblio1);
		
		Libro[] ultimeUscite = {
				new Libro("Il destino dei popoli", new Autore ("Dario", "Fabbri")),
				new Libro("Il caffè del venerdì", new Autore("Sawako", "Natori")),
				new Libro("L'epoca felice", new Autore("Cristina", "Commencini"))

		};
		
		biblio1.addLibri(ultimeUscite);
		
		List<Autore> autoriNuovi = new ArrayList<Autore>();
		autoriNuovi.add(new Autore("Aldo", "Baglio"));
		autoriNuovi.add(new Autore("Giovanni", "Storti"));
		
		Libro l6 = new Libro("Titolo multiplo", autoriNuovi);
		biblio1.addLibro(l6);
		
		System.out.println(biblio1);
		
		
		
		
		
		
		
	}

}
