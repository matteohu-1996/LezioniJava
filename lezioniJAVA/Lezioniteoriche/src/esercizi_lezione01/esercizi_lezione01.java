package esercizi_lezione01;

public class esercizi_lezione01 {
	public static void main(String[] args) {
		
		/*Esercizio4 Scrivi un programma che prenda in input il numero del mese (1-12) e stampi la stagione corrispondente:

			Dicembre, Gennaio, Febbraio: "Inverno"
			Marzo, Aprile, Maggio: "Primavera"
			Giugno, Luglio, Agosto: "Estate"
			Settembre, Ottobre, Novembre: "Autunno"
			
		*/
		
		String[] mesi = {"gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio", "agosto", "settembre", "ottobre", "novembre", "dicembre"};
		String stagione = "";
		for (int i = 0; i < mesi.length; i++) {
			int numeroMese = i + 1;
		
		if (numeroMese == 12 || numeroMese == 1 || numeroMese == 2) {
			stagione = "inverno";
		}else if (numeroMese >= 3 && numeroMese <= 5) {
			stagione = "primavera";
		}else if (numeroMese >= 6 && numeroMese <=8) {
			stagione = "estate";
		}else {
			stagione = "autunno";
			}
		
		System.out.println(numeroMese + " " + mesi[i] + " - " + stagione);
		
		}
		
		
		// Esercizio5 Scrivi tutti i numeri da 1 a 100. Per tutti i multipli di 3 stampa "Zoom", per tutti i multipli di 5 stampa "Boom". Per tutti i multipli di 3 e 5 stampa "Zoom Boom"
		
		int limiteMax = 100; 
		
		for (int i = 1; i <= limiteMax; i++) 
			if (i % 3 == 0) {
				System.out.println(i + " zoom");
			}
		for (int )
		
		
		}
		
		
	}


