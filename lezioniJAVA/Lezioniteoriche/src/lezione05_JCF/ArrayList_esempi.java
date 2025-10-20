package lezione05_JCF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lezione01_statement.for_statement;

public class ArrayList_esempi {

	public static void main(String[] args) {
		
		// la JCF mi permette di manipolare collezione di oggetti 
		// ci fornisce una serie di metodi e proprietà che ci fanno essere più veloci con la programmazione.
	
		/**
		 *  Archiettetura
		
		 	- Collection (interfaccia genitore) [size(), remove(), contains() ...]
		 	- List (interfacce figlie) (definisce collezione ordinata che ammette duplicati) 
		 	- Set
		 	- Queue
		 */
		
		// Implementazioni di List -> 1 Arraylist 2 Linkelist 
		
		// Arraylist (array ridimensionabile)
		
		// notazine: List <Tipo> nomeLista = new Arraylist <>();
		// notazione da evitare: ArrayList<Tipo> nomeLista = new Arraylist<>();
		

		List<String> nomi = new ArrayList<>();
		nomi.add("Dario"); // aggiungne in coda
		nomi.add(1, "Anna"); // aggiunge in uno specifico indice
		System.out.println(nomi);
		System.out.println("Dimensione array: " + nomi.size());
		
		System.out.println("stampo col il for classico");
		//ciclo for classico
		for (int i = 0; i < nomi.size(); i++) {
			System.out.println(nomi.get(i));
		} 
		
		System.out.println("Stampo con il foreach");
		// foreache
		for (String nome : nomi) {
			System.out.println(nome);
		}
		
		System.out.println(nomi.get(1)); // il metodo get(indice) restituisce il valore in quell'esatto indice
		System.out.println(nomi.get(0));
		
		nomi.remove(1);
//	System.out.println(nomi.get(1)); Outofbound poichè sfora la dimensine dell arrayList
		
		nomi.clear();
		System.out.println(nomi);
		
		// creo un altro arraylist per giocare con qualche altro metodo
		
		List<String> cognomi = new ArrayList<>();
		
		cognomi.add("Rossi");
		cognomi.add("Verdi");
		cognomi.add("Gialli");
	
		cognomi.set(1, "Azzurri"); // il metodo set sostuisce in una determinata posizione il valore che passo al metodo
		 System.out.println(cognomi);
		 System.out.println(cognomi.isEmpty()); // stampa true se l'array è vuoto	
	}
}
