package lezione01_statement;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		//Array: sono un contenitore ordinato di elementi simili tra loro (tutti hannno e devono avere lo stesso tipo). Possono contenere tipi primitivi ma anche riferimenti ad oggetti. Sono indicizzati (0-based), hanno un indice posizionale che parte da 0.
		// Vengono indentificati con []
		//in Java gli array sono oggetti, infatti vengono registrati nella memoria heap
		
		// Definisco un array
		String[] colori = new String[5];
		
		//inserisco i singoli colori
		colori[0] = "verde"; // il verde si trova in posizione 0 , il suo indice è 0
		colori[1] = "blu";
		colori[2] = "giallo";
		colori[3] = "viola";
		colori[4] = "rosso";
		// colori [5] = "nero"; //errore, non posso superare del mio array
		
		String[] frutti = {"mela", "pera", "banana", "ananas", "ciliegia"};
		System.out.println(frutti[3]); //ananas
		System.out.println(frutti); //se stampo array di frutti ottengo l'indirizzo alla memoria, questo perchè gli array sono oggetti
		
		// un modo per stampare i singoli frutti in un colpo solo sono i cicli for. il ciclo for permette di leggere un array basandosi sull'indice posizionale
		
		// in questo caso uso un foreach, ottimizzato  proprio per gli array 
		
		for (String frutto : frutti) {
			System.out.println(frutto);
		}
		// voglio creare un array con la dimensione scelta dall'utente
		Scanner input = new Scanner(System.in);
		System.out.println("inserisci la dimensione dell'array");
		int dimArray = input.nextInt();
		int[] mioArray = new int[dimArray];
		 // adesso vado a riempire l'array con dei numer iinseirri sempre dallo user
		
		int indice = 0;
		do {
			System.out.println("inserisci un numeri intero");
			mioArray[indice] = input.nextInt();
			
			indice++;
			} while (mioArray.length > indice);
		
		//leggo l'array con un for
		 for (int num: mioArray) {
			 System.out.println(num); 
		 }
		
	}
}
