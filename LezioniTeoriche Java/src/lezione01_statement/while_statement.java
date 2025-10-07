package lezione01_statement;

import java.util.Scanner;

public class while_statement {
	public static void main(String[] args) {
		
		// While fa parte della famiglia dei loop indefiniti
		// non so a priori quando si fermera o quanti giri fara
		
		/**
		 * SINTASSI:
		 * while (condizione) {
		 * 	...esegui fin quando la condizione E True
		 * }
		 */
		
		// Posso replicare un ciclo for usando While
		
		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		// do-while: questo costrutto prima di eseguire qualcosa e poi controlla
		//almeno una volta, la prima, viene eseguito il codice
		
		int m = 1;
		do {
			int risultato = m * 5;
			System.out.println("5 x " + m + " = " + risultato); 
			m++;
		}while (m <= 10);
		
		
		// esempio con scanner
		// l'utente non entra fino a quando la PASS non e corretta
		
		Scanner scann = new Scanner(System.in);
		System.out.println("inserisci la parola d'ordine");
		
		String pass = scann.nextLine();
		int tentativi = 1;
		boolean indovinato = true;
		
		while(!pass.equals("ciaoCciaoiccio")) {
			tentativi++;
			if (tentativi < 4 ) {
			System.out.println("parola d'ordine errata");
			System.out.println("riprova");
			pass = scann.nextLine();
			}else {
			System.out.println("mi spiace non puoi entrare"); 
			indovinato = false;
			break; 
			}
		}
		if ( indovinato) {
		System.out.println("bravo hai indovinato al " + tentativi + " tentativo");
		}
				
	}

}
