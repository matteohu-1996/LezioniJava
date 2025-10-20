package lezione05_JCF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lezione04_aggregazione.Autore;

public class ArrayList_TO_Array {
	public static void main(String[] args) {
		
		List<Autore> autori = new ArrayList<Autore>();
		autori.add(new Autore("Don", "De lillo"));
		autori.add(new Autore ("Aldo", "Baglio"));
		autori.add(new Autore ("Giovanni", "Storti"));
		autori.add(new Autore ("Giacomo", "Poretti"));
		autori.add(new Autore ("J.K:", "Rowling"));
		
		// voglio partire dalla lista di Autori e trasformarla in un Array vero e proprio
		
		Autore[] autori_array = new Autore[autori.size()];
		for (int i = 0; i < autori.size(); i++) {
			autori_array[i] = (Autore) autori.get(i);
		}
		for (Autore autore : autori_array) {
			System.out.println(autore);
		}
		
		
		
		
	
		
	}

}
