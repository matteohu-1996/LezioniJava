package esercizi_lezione01;

import java.util.Scanner;

public class esercizi_lezione01 {
	public static void main(String[] args) {

		/*
		 * Esercizio4 Scrivi un programma che prenda in input il numero del mese (1-12)
		 * e stampi la stagione corrispondente:
		 * 
		 * Dicembre, Gennaio, Febbraio: "Inverno" Marzo, Aprile, Maggio: "Primavera"
		 * Giugno, Luglio, Agosto: "Estate" Settembre, Ottobre, Novembre: "Autunno"
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		int numMese;

		do { // ciclo indefinito fino a case 100
			System.out.println(
					"inserisci un numero del mese ti risponderò con la stagione. Per chiudere il programma digita 100");
			numMese = scan.nextInt();

			switch (numMese) {
			case 12:
			case 1:
			case 2:
				System.out.println("sei in inverno");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("sei in primavera");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("sei in estate");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("sei in autunno");
				break;
			case 100:
				System.out.println("stai chiudendo il programma");
				break;
			default:
				System.out.println("hai inserito Numero mese errato");
				break;
			}

		} while (numMese != 100);

		// Esercizio5 Scrivi tutti i numeri da 1 a 100. Per tutti i multipli di 3 stampa
		// "Zoom", per tutti i multipli di 5 stampa "Boom". Per tutti i multipli di 3 e
		// 5 stampa "Zoom Boom"

		int limiteMax = 100;

		for (int i = 1; i <= limiteMax; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " ZOOM BOOM");
			} else if (i % 3 == 0) {
				System.out.println(i + " ZOOM");
			} else if (i % 5 == 0) {
				System.out.println(i + " BOOM");
			} else {
				System.out.println(i);
			}
		}

		/*
		 * Esercizio6 Crea una calcolatrice che continui a chiedere all'utente:
		 * 
		 * Due numeri Un'operazione (+, -, *, /) Usa switch per gestire le operazioni e
		 * while per ripetere finché l'utente non digita "fine".
		 */
		String uscita = "";

		while (!uscita.equalsIgnoreCase("fine")) {
			System.out.println(
					"Benvenuto nella calcolatrice, vuoi calcolare qualcosa (digita OK) o vuoi uscire (per uscire digita 'fine')");

			uscita = scan.nextLine();

			if (uscita.equalsIgnoreCase("fine")) {
				System.out.println("sei uscito dal programma");
				break;
			}

			System.out.println("inserisci il primo numero");
			double n1 = scan.nextDouble();

			System.out.println("inserisci il secondo numero");
			double n2 = scan.nextDouble();
			System.out.println("inserisci un operazione da svolgere: +-*/");
			String op = scan.next();

			switch (op) {
			case "+":
				double somma = n1 + n2;
				System.out.println("la somma vale: " + somma);
				break;
			case "-":
				double sottrazione = n1 - n2;
				System.out.println("la sottrazione vale " + sottrazione);
				break;
			case "*":
				double moltiplicazione = n1 * n2;
				System.out.println("la moltiplicazione vale " + moltiplicazione);
				break;
			case "/":
				double divisione = n1 / n2;
				System.out.println("la divisione vale " + divisione);
				break;
			default:
				System.out.println("operazione non consentita");
				break;
			}

			String line = scan.nextLine();
		}

		/**
		 * Esercizio7 Scrivi un programma che mostri un menu con le seguenti opzioni:
		 * Saluta Mostra data Esci Il programma deve continuare a mostrare il menu
		 * finché l'utente non sceglie l'opzione 3. Usa un ciclo do-while
		 *
		 */
		int scelta;
		do {
			System.out.println("Seleziona una voce del menu");
			System.out.println("---MENU---");
			System.out.println("1- Data di oggi");
			System.out.println("2. Saluta");
			System.out.println("3. Esci");
			System.out.println("----------");

			 scelta = scan.nextInt();
			System.out.println("Hai scelto la voce di menù scelta " + scelta);

			switch (scelta) {
			case 1:
				System.out.println("La data di oggi è 09-10-2025");
				break;
			case 2:
				System.out.println("Ciao utente");
				break;
			case 3:
				System.out.println("Hai chiuso il programma");
				break;
			default:
				System.out.println("Scelta non valida");
				break;

			}
		} while (scelta != 3); // do while non ti fa uscire dal programma e puoi andare all'infinito
		// !=3 stai chiudendo il programma
	
		
/**
 * Esercizio8 Scrivi un programma che chieda all'utente il voto di tre esami (da 0 a 30). Calcola la media e stampa:
"Promosso con lode" se la media è maggiore o uguale a 28
"Promosso" se la media è maggiore o uguale a 18
"Bocciato" se la media è minore di 18
 */
		
	int[] voti = new int [3];
	
	double media = 0;
	
	for(int i = 0; i < voti.length; i++) {
	
		
		System.out.println("Inserisci il voto dell'esame" + (i+1) + ", il voto va da 0 a 30" );
	
		voti[i] = scan.nextInt();
		if (voti[i] >= 0 && voti[i] <= 30) {
			media += voti[i];
		
		}else {
			System.out.println("Hai inserito voto non valido , Riprova");
			i--; 
			// i-- Torna indietro e riprova
		}
		
		media += voti[i];
		}
	
	// calcolo la media
	media = Math.round(media / voti.length); 
	// arrontadamento
	
	System.out.println("La media dei voti è: " + media);
	
	if(media < 18 && media > 0) {
		System.out.println("Bocciato");
		
	}else if (media <= 28 && media >= 18) {
		System.out.println("Promosso");
	}else {
		System.out.println("Promosso con Lode");
		
	}
		
		
		
		
		
		
		
		
	}

}
